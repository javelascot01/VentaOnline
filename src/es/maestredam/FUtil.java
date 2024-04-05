package es.maestredam;

import java.io.File;
public class FUtil {
    /**
     *  Método que comprueba si existe un archivo con el nombre pasado
     * @param filename String que se desea saber si se encuentra en el sistema
     * @return True si existe false si no
     * @throws IllegalArgumentException lanza excepcion al pasarle el parametro vacio o con espacios
     */
    public static boolean existe(String filename)throws IllegalArgumentException {
        if (filename.isBlank()){
            throw new IllegalArgumentException("La cadena no puede estar vacia");
        }
        File file = new File(filename);
        if (file.exists()) {
            return true;
        }
        return false;
    }
}
