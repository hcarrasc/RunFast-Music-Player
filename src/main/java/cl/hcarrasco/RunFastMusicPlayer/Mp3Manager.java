package cl.hcarrasco.RunFastMusicPlayer;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.Time;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Mp3Manager {
    // <editor-fold defaultstate="collapsed" desc="Declaracion de atributos">
    //private static FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo MP3", "mp3", "mp3"); 
    //public String mediaFile = "X:\\Music\\Eminem\\Eminem - Loose Your Self.mp3";
    //public File f = new File(mediaFile);

    public Mp3Manager(MainAppView athis){
        pnt = athis;
    }

    public Player p;
    public Timer temporizador;
    public TimerTask tarea;
    // Inicio del contador en la interfaz del reproductor
    public int minutos  = 0;
    public int segundos = 0;
    // Inicio de variables relativas a la hora de reproduccion
    public Calendar calendario1 = Calendar.getInstance();
    public int horaT, minutosT, segundosT;
    public int porcentaje;
    MainAppView pnt;
    
    // </editor-fold>

    void reloj(){
        // imprime la hora
        horaT     = calendario1.get(Calendar.HOUR_OF_DAY);
        minutosT  = calendario1.get(Calendar.MINUTE);
        segundosT = calendario1.get(Calendar.SECOND);
        System.out.println(horaT+" : "+minutosT+" : "+segundosT+"");
    }

    Time pausar(String ruta, Time pausa,boolean run){

        if (run==true){
            pausa = p.getMediaTime();
            detener();
        }
        else{
            cargar(ruta,run);
            correr(pausa);
        }        
        return pausa;
    }
    
    void detener(){
        // Se detiene y cierra el reproductor
        temporizador.cancel();
        p.stop();
        p.close();
    }

    void correr(Time t){

        p.setMediaTime(t);
        p.setRate(1);
        reloj();
        p.start();
        
    }

    public void tiempoTotal(JLabel total){

        int time;
        int min;
        int seg;

        time = (int) p.getDuration().getSeconds();
        min  = time/60;
        seg = time - (min*60);

        if(min<10 && seg<10){
            total.setText("0"+min+ " : "+"0"+seg);
        }
        else{
            if(min<10){
                total.setText("0"+min+ " : "+seg);
            }
            else{
                if(seg<10){
                    total.setText(min+ " : "+"0"+seg);
                }
            }
        }
        //total.setText(min+ ":" +seg);
    }

    int transformaMinutos( JLabel etiqueta, float contadorTiempo,int segundos, int minutos){
        String representacion="";
        if(p.getMediaTime().getSeconds()<60.0){
            
            if(segundos<10){
                representacion = "00 : 0"+segundos;
                segundos++;
                etiqueta.setText(representacion);
            }
            else{
                representacion = "00 : "+segundos;
                segundos++;
                etiqueta.setText(representacion);
            }
        }

        if(p.getMediaTime().getSeconds()>60.0){
            
            if(minutos<10){
                if(segundos<10){
                    representacion = "0"+minutos+" : 0"+segundos;
                    segundos++;
                    etiqueta.setText(representacion);
                }
                else{
                    representacion = "0"+minutos+" : "+segundos;
                    segundos++;
                    etiqueta.setText(representacion);
                }                
            }
            else{
                if(segundos<10.0){
                    representacion = ""+(minutos+1)+" : 0"+(segundos);
                    segundos++;
                    etiqueta.setText(representacion);
                }
                else{
                    representacion = ""+minutos+" : "+segundos;
                    segundos++;
                    etiqueta.setText(representacion);
                }
            }
        }
        return segundos;
    }
    
    void slider( final JSlider slider, final JLabel etiqueta){
        slider.setValue(0);
        p.getGainControl().setLevel((float) 0.9);

        temporizador = new Timer();
        tarea = new TimerTask(){
        boolean reset = true;
            public void run(){


                porcentaje = (int) Math.round((p.getMediaTime().getSeconds() * 100)/p.getDuration().getSeconds());
                float contadorTiempo = (float) p.getMediaTime().getSeconds();
                segundos = transformaMinutos(etiqueta,contadorTiempo,segundos,minutos);

                // fixed error de tiempo inicial :)
                if (!reset){
                    if(etiqueta.getText().equals("00 : 00")){
                        etiqueta.setText("01 : 00");
                    }
                }
                reset = false;
                
                if(segundos==60){
                    segundos = 0;
                    minutos+=1;
                }
                
                if(p.getMediaTime().getSeconds() == p.getDuration().getSeconds()
                        ||p.getMediaTime().getSeconds() == p.getDuration().getSeconds()+1
                            ||p.getMediaTime().getSeconds()+1 == p.getDuration().getSeconds()){

                    porcentaje = 100;
                    // Se detiene el reproductor
                    p.stop();
                    // Se cierra el reproductor
                    p.close();
                    // Se setea para la etiqueta el contador en cero
                    segundos = 0;
                    minutos = 0;
                    etiqueta.setText("00 : 00");
                    // Se establece el valor de slider en cero
                    slider.setValue(0);
    
                    if(pnt.repiteTrack == true){
                        pnt.cuandoRepite();
                    }
                }
                else{
                    slider.setValue(porcentaje);
                }
            }
        };
        temporizador.schedule(tarea,0,1000);
    }
   

    @SuppressWarnings("deprecation")
	boolean cargar(String ruta, boolean run){

    if(run==true){
        detener();
        segundos = 0;
        minutos = 0;
        
    }
    
    File file = new File(ruta);
    
    try {
            /* Se asigna al objeto Player un administrador de contenidos multimedia 
               y un archivo de tipo mp3 para su procesamiento y reproduccion.
             */
            p = Manager.createRealizedPlayer(file.toURL());

    // Se atrapan las posibles exceptions o escepciones
    }catch (NoPlayerException ex) {
            Logger.getLogger(Mp3Manager.class.getName()).log(Level.SEVERE, null, ex);
         } catch (CannotRealizeException ex) {
            Logger.getLogger(Mp3Manager.class.getName()).log(Level.SEVERE, null, ex);
         }            catch (IOException ex) {
            Logger.getLogger(Mp3Manager.class.getName()).log(Level.SEVERE, null, ex);
         }
    // retorna un true, explificando que se comenzo un reproduccion
    return run = true;
    }
}