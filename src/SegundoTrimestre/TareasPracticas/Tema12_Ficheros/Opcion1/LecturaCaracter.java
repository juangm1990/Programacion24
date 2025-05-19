package SegundoTrimestre.TareasPracticas.Tema12_Ficheros.Opcion1;

import java.io.FileReader;

public class LecturaCaracter {
    
        public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("personas.txt");

        int datotexto = fr.read();
        
        // WHILE PARA LEER EL ARCHIVO DE TEXTO

        while(datotexto != -1){
            System.out.print((char)datotexto);
            datotexto = fr.read();
        }

        fr.close();
    }
}
