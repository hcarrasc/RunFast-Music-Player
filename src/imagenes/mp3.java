package imagenes;

import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import java.util.Timer;
import javax.swing.*;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;


public class mp3{
//el player
public Player mediaPlayer;
//animacion
private Timer tiempo ;
private TimerTask task;
private int speed = 1000;//velocidad
private int frame=0;
//control
boolean run = false;
boolean todo_ok = false;
//archivo
URL mediaURL=null;
String file="";
//otros
String t=null;
//filtro
private static FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo MP3","mp3","mp3");

//el constructor vacio
    public mp3() {}
   /* controles de reproduccion */
public String STOP(){
//comprueba que el reproductor tenga un archivo
    if (todo_ok){
        mediaPlayer.stop();
        this.todo_ok=false;
        this.run=false;
        this.file="";
        this.stopAnimation();
    }
    return "";
}

/* Reproduce un archivo mp3, si no encuentra ninguno devuelve
 un string vacio */
public String PLAY(JSlider b, JLabel et){
    t ="No existe ningun archivo...";
    if (todo_ok){
        if(!run){//si ya se esta reproduciendo
            mediaPlayer.start();
            this.run=true;
            t="Reproduciendo";
            this.startAnimation(b, et);
        }
    }
    return t;
}

 //para la animacion
public void startAnimation(final JSlider b, final JLabel et) {
   
        tiempo = new Timer();
        task = new TimerTask() {
            public void run(){
                //calculamos el tiempo de la animacion por 100%
                frame = (int) Math.round((mediaPlayer.getMediaTime().getSeconds() * 100)/mediaPlayer.getDuration().getSeconds());

                et.setText("Tiempo: " + (int) mediaPlayer.getMediaTime().getSeconds());


                //cuando ambos sean iguales quiere decir que el video a alcanzado el final de la reproduccion
                if(mediaPlayer.getMediaTime().getSeconds() == mediaPlayer.getDuration().getSeconds()){
                    frame=100; // 100%
                    STOP();//SE DETIENE Y DESTRUYE EL MEDIA PLAYER
                }
                else // sino
                {
                    // se actualiza el nuevo valor del Slider
                    b.setValue(frame);
                    //Porcentaja de reproduccion
                     System.out.println("Tiempo de reproduccion: " + frame + "% de 100%");
                }
               }
        };
        //se inicia la animacion
        tiempo.schedule(task,0,speed);
    
}

//detiene la animacion
public void stopAnimation() {
    tiempo.cancel();
    task.cancel();
}

/* Metod que muestra una ventana de dialgo para añadir "archivos" al reproductor
* hace uso del metodo anterior "setvideo"
*/
public String Abrir_mp3(){
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(filter);
    int result = fileChooser.showOpenDialog(null);
    if ( result == JFileChooser.APPROVE_OPTION ){
        try {
            //si se esta reproduciendo un mp3, se detiene
            if(todo_ok){this.STOP();}
            //se asigna a mediaURL el archivo de video seleccionado
            URL url = fileChooser.getSelectedFile().toURL();
            //se coloca el nombre de la cancion en la variable file
            this.file= fileChooser.getSelectedFile().getName();
            //se asigna el mp3 al reproductor
            mediaPlayer = Manager.createRealizedPlayer( url );
            //se coloca a true
            this.todo_ok=true;
         }
         catch (NoPlayerException ex) {
            Logger.getLogger(mp3.class.getName()).log(Level.SEVERE, null, ex);
         } catch (CannotRealizeException ex) {
            Logger.getLogger(mp3.class.getName()).log(Level.SEVERE, null, ex);
         }            catch (IOException ex) {
            Logger.getLogger(mp3.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        return "Escuchas -> " + this.file;
    }
}