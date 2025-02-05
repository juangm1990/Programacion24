package SegundoTrimestre.EjerciciosClase.Tema12_Ficheros.Ficheros;

import java.io.FileReader;

public class TryCatch {
    
    public static void main(String[] args) {

        // FICHERO DE TEXTO - CARÁCTER A CARÁCTER
        
        try{
            FileReader fr = new FileReader("archivo.txt");

            int dato = fr.read();

            //Lectura del archivo

            while (dato != 0) {
                System.out.println((char)dato);
                dato = fr.read();
                
            }
            fr.close();
        }
        // Recoge el error del 'try' y lanza el siguiente código, luego sigue el programa
        catch (Exception e){
            e.printStackTrace(); // Te muestra el error completo con la cola
            System.out.println("Se ha producido un error");
        }

        System.out.println("Tengo más lineas de codigo más a ejecutar en el flujo de mi programa");
    }
}
