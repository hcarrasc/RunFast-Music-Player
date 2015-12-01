package cl.hcarrasco.RunFastMusicPlayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class Configs {

    public void registrarArchivo(String dato, String nombreArchivo){
        
        try{
        // Se crea el archivo con el nombre del usuario, agregandole la extension .txt
        FileWriter fw = new FileWriter(nombreArchivo);
        // Se crea el bueffer de flujo
        BufferedWriter bw = new BufferedWriter(fw);
        // Se escribira en el archivo especificado con que buffer bw
        PrintWriter salida = new PrintWriter(bw);
        salida.println(dato);

        // Cierro el archivo para guardar correctamente los cambios
        salida.close();
        }

        /*  Al producirse un error en tiempo de ejecucion, este se "atrapa"
         con :   catch(java.io.IOException ioex) {}, imprimiendo un mensaje en la consola*/

        catch(java.io.IOException ioex) {
            System.out.println("No se pudo guardar el archivo");
        }   
    }
    
    public String cargarCarpeta( String nombreArchivo ) throws FileNotFoundException{
        
        String path = System.getProperty("user.dir")+nombreArchivo;
        String rutaRetorno = new String();
        
        File carpeta = new File(path);
        FileReader fr = new FileReader(carpeta);
        BufferedReader br = new BufferedReader(fr);
        
        // Se intenta leer la ruta que esta escrita en el archivo
        try {
            rutaRetorno = br.readLine();
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo");
        }
        // Se intenta cerrar el archivo para no producir
        // errores al continuar trabajandp mas tarde con el mismo
        
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("No se pudo cerrar el archivo");
        }
        return rutaRetorno;


    }
    
    public void setTemaDefault(JList<?> lista,JLabel eTitulo,JLabel eTiempo, JLabel fondo, JSlider barra){
        
        String numeroTema = "1";
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg")));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lista.setBackground(new java.awt.Color(102, 0, 153));
        lista.setForeground(new java.awt.Color(204, 204, 255));
        barra.setBackground(new java.awt.Color(0, 0, 0));
        barra.setForeground(new java.awt.Color(51, 51, 51));
        registrarArchivo(numeroTema,"ConfigTema.txt");
        
        
    }
    
    public void setTema2(JList<?> lista,JLabel eTitulo,JLabel eTiempo, JLabel fondo, JSlider barra){
        
        String numeroTema = "2";
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg")));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lista.setBackground(new java.awt.Color(51, 51, 51));
        lista.setForeground(new java.awt.Color(102, 102, 255));
        barra.setBackground(new java.awt.Color(47, 43, 107));
        barra.setForeground(new java.awt.Color(51, 51, 51));
        registrarArchivo(numeroTema,"ConfigTema.txt");
        
        
    }
    
    public void setTema3(JList<?> lista,JLabel eTitulo,JLabel eTiempo, JLabel fondo, JSlider barra){
        
        String numeroTema = "3";
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg")));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lista.setBackground(new java.awt.Color(161, 60, 136));
        lista.setForeground(new java.awt.Color(204, 204, 204));
        barra.setBackground(new java.awt.Color(136, 67, 120));
        barra.setForeground(new java.awt.Color(105, 52, 92));
        registrarArchivo(numeroTema,"ConfigTema.txt");
        
    }
    
    public void setTema4(JList<?> lista,JLabel eTitulo,JLabel eTiempo, JLabel fondo, JSlider barra){
        
        String numeroTema = "4";
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg")));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lista.setBackground(new java.awt.Color(161, 60, 136));
        lista.setForeground(new java.awt.Color(204, 204, 204));
        barra.setBackground(new java.awt.Color(136, 67, 120));
        barra.setForeground(new java.awt.Color(105, 52, 92));
        registrarArchivo(numeroTema,"ConfigTema.txt");
       
    }
    
    public void setTema5(JList<?> lista,JLabel eTitulo,JLabel eTiempo, JLabel fondo, JSlider barra){
        
        String numeroTema = "5";
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo5.jpg")));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lista.setBackground(new java.awt.Color(51, 51, 51));
        lista.setForeground(new java.awt.Color(204, 204, 204));
        barra.setBackground(new java.awt.Color(51, 51, 51));
        barra.setForeground(new java.awt.Color(51, 51, 51));
        registrarArchivo(numeroTema,"ConfigTema.txt");
        
    }

    public void setIdioma1(
                             JRadioButton jRadioButton1,
                             JRadioButton jRadioButton2,
                             JRadioButton jRadioButton3,
                             JRadioButton jRadioButton4,
                             JRadioButton jRadioButton5,
                             JRadioButton jRadioButton6,
                             JRadioButton jRadioButton7,
                             JRadioButton jRadioButton8,
                             JLabel eOpciones,
                             JLabel eSalir,
                             JLayeredPane jLayeredPane2,
                             JLayeredPane jLayeredPane3
                             ){

            jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "Temas Visuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));
            jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "Idioma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));

            eOpciones.setText("Opciones");
            eSalir.setText("Aceptar");
            jRadioButton1.setText("Defecto");
            jRadioButton2.setText("Saturno");
            jRadioButton3.setText("Giannella");
            jRadioButton4.setText("Flush");
            jRadioButton5.setText("Auroras");
            jRadioButton6.setText("Español");
            jRadioButton7.setText("Ingles");
            jRadioButton8.setText("Ruso");

            registrarArchivo("1","configIdioma.txt");
    }
    public void setIdioma2(
                             JRadioButton jRadioButton1,
                             JRadioButton jRadioButton2,
                             JRadioButton jRadioButton3,
                             JRadioButton jRadioButton4,
                             JRadioButton jRadioButton5,
                             JRadioButton jRadioButton6,
                             JRadioButton jRadioButton7,
                             JRadioButton jRadioButton8,
                             JLabel eOpciones,
                             JLabel eSalir,
                             JLayeredPane jLayeredPane2,
                             JLayeredPane jLayeredPane3
                             ){

            jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "Visual Themes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));
            jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "Lenguaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));

            eOpciones.setText("Options");
            eSalir.setText("Accept");
            jRadioButton1.setText("Default");
            jRadioButton2.setText("Saturn");
            jRadioButton3.setText("Giannella");
            jRadioButton4.setText("Flush");
            jRadioButton5.setText("Dawn");
            jRadioButton6.setText("Spanish");
            jRadioButton7.setText("English");
            jRadioButton8.setText("Russian");

            registrarArchivo("2","configIdioma.txt");

    }
    public void setIdioma3(
                             JRadioButton jRadioButton1,
                             JRadioButton jRadioButton2,
                             JRadioButton jRadioButton3,
                             JRadioButton jRadioButton4,
                             JRadioButton jRadioButton5,
                             JRadioButton jRadioButton6,
                             JRadioButton jRadioButton7,
                             JRadioButton jRadioButton8,
                             JLabel eOpciones,
                             JLabel eSalir,
                             JLayeredPane jLayeredPane2,
                             JLayeredPane jLayeredPane3
                             ){

            jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "Visual Темы", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));
            jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (null, "язык", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                    ("Tahoma", 0, 12), new java.awt.Color(204, 204, 204)));

            eOpciones.setText("опции");
            eSalir.setText("принимать");
            jRadioButton1.setText("умолчание");
            jRadioButton2.setText("Сатурн");
            jRadioButton3.setText("Giannella");
            jRadioButton4.setText("заподлицо");
            jRadioButton5.setText("рассвет");
            jRadioButton6.setText("Испанский");
            jRadioButton7.setText("Английский");
            jRadioButton8.setText("Русский");

            registrarArchivo("3","configIdioma.txt");
    }

    public void escribiHistorial(String dato){

        String path = System.getProperty("user.dir")+"/ConfigHistorial.txt";
        // reliaza la consulta si el archivo que esta descrito en path existe
        if(!existearchivo(path))
        // si el archivo no exite, lo crea, llamando al metodo creararchivo
        creararchivo(path);
            // abre el archivo en modo "append" y registra los datos
            try{
                // Se crea el archivo con el nombre del usuario, agregandole la extension .txt
                FileWriter fw = new FileWriter("ConfigHistorial.txt",true);
                // Se crea el bueffer de flujo
                BufferedWriter bw = new BufferedWriter(fw);
                // Se escribira en el archivo especificado con que buffer bw
                PrintWriter salida = new PrintWriter(bw);
                salida.println(dato);

                // Cierro el archivo para guardar correctamente los cambios
                salida.close();
            }
            catch(java.io.IOException ioex) {
                System.out.println("No se pudo guardar al archivo");
            }
        }

    public String[] leerHistorial() throws FileNotFoundException{

        String[] historial = new String[2000];
        // obtiene la ruta del archivo donde se encuentra registrado el historial
        String path = System.getProperty("user.dir")+"/ConfigHistorial.txt";

        File archivoHistorial = new File(path);
        FileReader fr = new FileReader(archivoHistorial);
        BufferedReader br = new BufferedReader(fr);
        int i=-1;
        boolean exit = false;

        while(exit==false){
            try {
                historial[++i] = br.readLine();
                // cada linea del archivo lo guarda en la posicion i del vector historial
                if(historial[i]==null)exit = true;

            } catch (IOException ex) {
                System.out.println("error: en lectura del historial ");
            }
        }

        try {
            br.close();
            } catch (IOException ex) {
                System.out.println("No se pudo cerrar el archivo");
            }

        return historial;
    }

    public boolean existearchivo(String path){
      File archivo = new File(path);
      if(archivo.exists())
         return true;
      else
         return false;
   }

    public void creararchivo(String path){
      try {
         FileWriter archivo = new FileWriter(path);
         archivo.close();
      } catch (IOException e) {
         System.out.println("Error al crear archivo: "
                 + e.getMessage());
      }
   }
}
