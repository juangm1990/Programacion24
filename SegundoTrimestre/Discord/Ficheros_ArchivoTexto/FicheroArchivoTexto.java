package SegundoTrimestre.Discord.Ficheros_ArchivoTexto;

import java.io.FileReader;
import java.util.ArrayList;

public class FicheroArchivoTexto {
    public static void main(String[] args) throws Exception {

        // Se declara el objeto FileReader para leer el archivo.
        FileReader fr = null;

        try {
            // Intentamos abrir el archivo "Tema12_Fichero_Discord.txt" para lectura.
            fr = new FileReader("Tema12_Fichero_Discord.txt");

            // Creamos una lista de palabras para almacenar las que leemos del archivo.
            ArrayList<String> palabras = new ArrayList<String>();

            // Variable para almacenar cada palabra mientras la leemos.
            String palabra = "";
            
            // Leemos el primer carácter del archivo.
            int caracter = fr.read();

            // Recorremos el archivo hasta el final.
            while (caracter != -1) {
                // Si encontramos un espacio o salto de línea, significa que hemos llegado al final de una palabra.
                if (((char)caracter) == ' ' || ((char)caracter) == '\n') {
                    
                    // Verificamos si la palabra ya está en la lista de palabras.
                    // Si no está, la agregamos a la lista de palabras.
                    if (palabras.contains(palabra)) {
                        // Si ya está en la lista, no hacemos nada.
                    } else {
                        palabras.add(palabra);
                    }

                    // Reiniciamos la variable 'palabra' para comenzar a leer la siguiente palabra.
                    palabra = "";
                }
                else {
                    // Si no es un espacio ni salto de línea, agregamos el carácter a la palabra.
                    palabra += (char)caracter;

                    // Convertimos la palabra a minúsculas para evitar duplicados por mayúsculas/minúsculas.
                    palabra = palabra.toLowerCase();
                }

                // Leemos el siguiente carácter del archivo.
                caracter = fr.read();
            }
            
            // Imprimimos el contenido de la lista de palabras y su frecuencia.
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println("La palabra " + "'" + palabras.get(i) + "'" + " se repite " + contarPalabra(palabras.get(i)) + " veces.");
            }
        }
        catch (Exception e) {
            // Si ocurre un error, lo imprimimos en consola.
            System.out.println(e.getMessage());
        }
        finally {
            // En el bloque finally nos aseguramos de cerrar el archivo si se abrió correctamente.
            try {
                fr.close();
            }
            catch (Exception e) {
                // Si ocurre un error al cerrar el archivo, lo imprimimos en consola.
                System.out.println(e.getMessage());
            }  
        }
    }

    // Método que cuenta cuántas veces aparece una palabra en el archivo.
    public static int contarPalabra(String pal) {
        
        // Se declara el objeto FileReader para leer el archivo.
        FileReader fr = null;
        
        // Contador que llevará el registro de cuántas veces aparece la palabra.
        int contador = 0;

        try {
            // Intentamos abrir el archivo "Tema12_Fichero_Discord.txt" para lectura.
            fr = new FileReader("Tema12_Fichero_Discord.txt");
            
            // Leemos el primer carácter del archivo.
            int caracter = fr.read();
    
            // Variable para almacenar cada palabra mientras la leemos.
            String palabra = "";
            String palabraABuscar = pal; // La palabra que vamos a buscar en el archivo.
            
            // Recorremos el archivo hasta el final.
            while (caracter != -1) {
                // Si encontramos un espacio o salto de línea, significa que hemos llegado al final de una palabra.
                if (((char)caracter) == ' ' || ((char)caracter) == '\n') {
                    // Si la palabra leída coincide con la palabra que estamos buscando, incrementamos el contador.
                    if (palabra.equals(palabraABuscar)) {
                        contador++;
                    }
                    // Reiniciamos la variable 'palabra' para comenzar a leer la siguiente palabra.
                    palabra = "";
                }
                else {
                    // Si no es un espacio ni salto de línea, agregamos el carácter a la palabra.
                    palabra += (char)caracter;

                    // Convertimos la palabra a minúsculas para evitar duplicados por mayúsculas/minúsculas.
                    palabra = palabra.toLowerCase();
                }
                
                // Leemos el siguiente carácter del archivo.
                caracter = fr.read();
            }
        }
        catch (Exception e) {
            // Si ocurre un error, lo imprimimos en consola.
            System.out.println(e.getMessage());
        }
        finally {
            // En el bloque finally nos aseguramos de cerrar el archivo si se abrió correctamente.
            try {
                fr.close();
            }
            catch (Exception e) {
                // Si ocurre un error al cerrar el archivo, lo imprimimos en consola.
                System.out.println(e.getMessage());
            }
        }

        // Devolvemos el contador que indica cuántas veces se encontró la palabra.
        return contador;
    }
}
