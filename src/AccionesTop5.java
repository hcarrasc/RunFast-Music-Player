
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccionesTop5 {

        configuracion cfg = new configuracion();

        void regArrayTop5(File[] nombreTrack){

            FileWriter fw = null;
            try {
                fw = new FileWriter("top5.txt");
            } catch (IOException ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Se crea el bueffer de flujo
            BufferedWriter bw = new BufferedWriter(fw);
            // Se escribira en el archivo especificado con que buffer bw
            PrintWriter salida = new PrintWriter(bw);
            salida.print("");
            salida.flush();
            }

        File[] contTop5(File[] nombreTrack){
            File[] retorno = new File[5];
            int pos1 = 0;
            int pos2 = 0;
            int pos3 = 0;
            int pos4 = 0;
            int pos5 = 0;
            int aux  = 0;

            for(int i=0; i<200; i++ ){

                if(nombreTrack[i]==null) break;
                for(int j=0;j<200;j++){

                    if(nombreTrack[j]==null) break;
                    if(nombreTrack[i]==nombreTrack[j]) aux++;
                }
            }

            if((aux>pos1)&&(aux>pos2)&&(aux>pos3)&&(aux>pos4)&&(aux>pos5)){
                pos5 = aux;
            }
            if((aux>pos1)&&(aux>pos2)&&(aux>pos3)&&(aux>pos4)){
                pos4 = aux;
            }
            if((aux>pos1)&&(aux>pos2)&&(aux>pos3)){
                pos3 = aux;
            }
            if((aux>pos1)&&(aux>pos2)){
                pos2 = aux;
            }
            if(aux>pos1){
                pos1 = aux;
            }

            retorno[0] = nombreTrack[pos1];
            retorno[1] = nombreTrack[pos2];
            retorno[2] = nombreTrack[pos3];
            retorno[3] = nombreTrack[pos4];
            retorno[4] = nombreTrack[pos5];

            return retorno;
        }

    }




