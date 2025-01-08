package SegundoTrimestre.Ficheros;

import java.io.FileWriter;

public class EscribirFileWriter {
    
    public static void main(String[] args) throws Exception{
        
        FileWriter fw = null;

            fw = new FileWriter("archivo.txt");
            for (int i = 65; i < 91; i++){
                fw.write((char)i);
            }


        fw.close();
    }
}
