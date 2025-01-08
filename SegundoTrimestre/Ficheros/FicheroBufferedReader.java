package SegundoTrimestre.Ficheros;

import java.io.FileReader;
import java.io.BufferedReader;

public class FicheroBufferedReader {
    
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("archivo.txt");


        BufferedReader br = new BufferedReader(fr);

        String linea;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }

        br.close();
        
    }
}
