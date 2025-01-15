package SegundoTrimestre.Temario.Tema12_Ficheros.Opcion1;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaLinea {
    
        public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\Users\\JuanGM\\Desktop\\DAW\\2 Trimestre\\JuanGalisteo_TareaTema12-1\\personas.txt");

        BufferedReader br = new BufferedReader(fr);

        String lineadetexto;

        // WHILE PARA LEER EL ARCHIVO DE TEXTO

        while ((lineadetexto = br.readLine()) != null) {

            System.out.println(lineadetexto);
        }

        br.close();

    }
}
