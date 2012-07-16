
public class StringClean {
    
    public String sustituir(String cadena, String quitar, String poner, int veces){
                String resultado = cadena;
                if (veces < 1 && veces != -1) return cadena;

                if (cadena == null || quitar == null || poner == null) return resultado;
                
                if (!cadena.equals("") && !quitar.equals("")){

                    int posicion = cadena.indexOf(quitar);
                    
                    if (posicion!=-1){
                        int tamanio = quitar.length();
                        String resto = cadena.substring(posicion+tamanio);

                        if (veces==-1){
                            resultado = cadena.substring(0,posicion) + poner + sustituir(resto,quitar,poner,-1);
                        }
                        else{
                            resultado = cadena.substring(0,posicion) + poner + sustituir(resto,quitar,poner,veces-1);
                        }
                    }
                }
                return resultado;
    }

}
