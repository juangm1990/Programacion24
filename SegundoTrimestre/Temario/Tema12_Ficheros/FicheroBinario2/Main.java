package SegundoTrimestre.Temario.Tema12_Ficheros.FicheroBinario2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i< 5; i++){
            Persona p = new Persona(i, "Nombre"+i, "Apellidos"+i, 18+i);
            personas.add(p);
        }
        FileWriter fw = new FileWriter("personas.txt");
        BufferedWriter br = new BufferedWriter(fw);

        for (int i = 0; i< personas.size(); i++){
            br.write(personas.get(i).toString());
            br.newLine();

        }

        br.close();
        fw.close();


        // Leer y mostrar personas que tengan más de 20 años

        FileReader fr = new FileReader("personas.txt");
        BufferedReader br2 = new BufferedReader(fr);

        String linea = "";

        while ((linea = br2.readLine())!=null){
            System.out.println(linea);

            
        }


    }
}