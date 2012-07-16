
import java.io.File;

public class Directorios {
    
    static int contador = -1;
    
    
    /* Llamado a funcion listarDirectorios, se recibe un string de rutas
       correspondientes a todos los archivos que existen en el directorio
       seleccionado en el jFileChooser ademas de sus respectivas subcarpetas 
    */
    
    public static String[] listarDirectorio(File f, String separador, String[] grupo, int c){

                File[] ficheros = f.listFiles();
           
                for (int x=0;x<ficheros.length;x++){
                        //System.out.println(separador + ficheros[x].getPath());                     
                        contador++;
                        grupo[contador] = ficheros[x].getPath();
                        

                        if (ficheros[x].isDirectory()){              
                                String nuevo_separador;
                                nuevo_separador = separador + " ";
                                listarDirectorio(ficheros[x],nuevo_separador, grupo,c);
                        }
                }                
                return grupo;
        }
    
 
    
    public  String[] filtro ( String[] grupo, String[] total, int c){
       
         // Se reinicia el contador estatico de la clase
        Directorios.contador = -1;

       /* Ciclo iterativo que chequea la cantidad exacta de rutas a archivos que
          se han guardado en el String total */
        for(int i=0; i<grupo.length ;i++){
            if(total[i]==null) break;
            c = i;
        }
        // array que contendra las rutas a archivos
        String[]totalaux = new String[c+1];
       
        for(int i=0; i<c+1 ;i++){
            // Ahora totalaux tiene un array String de las rutas de todos los archivos de los Directorios listas para ser procesadas!
            totalaux[i] = total[i];
        }
       
        int bandera = 0;
        for(int i=0; i<totalaux.length ;i++){
            if (totalaux[i]==null)break;
            if (totalaux[i].endsWith(".mp3")){
               ++bandera;
            }  
        }
        
        String[] totalMusica = new String[bandera];
        bandera = -1;
        for(int i=0; i<totalaux.length ;i++){
            if (totalaux[i].endsWith(".mp3")){
               totalMusica[++bandera] = totalaux[i];
            }
        }
        
       return totalMusica;
    }   
    
    public String[] borrarPath(String[] array){
        File aux = new File("");
        for(int i=0; i<array.length; i++){
            aux = new File(array[i]);
            array[i] = aux.getName();
            aux.deleteOnExit();
        }
        return array;
    }
}
