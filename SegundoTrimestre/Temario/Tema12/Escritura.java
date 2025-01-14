package SegundoTrimestre.Temario.Tema12;

import java.io.FileWriter;
import java.util.ArrayList;

public class Escritura {
    
        public static void main(String[] args) throws Exception { 

        // CONSTRUCTOR
        Persona p1 = new Persona("Juan", "Galisteo");
        Persona p2 = new Persona("Inmaculada", "Galisteo");
        Persona p3 = new Persona("Juanma", "Casado");
        Persona p4 = new Persona("Carlos", "Garcia");
        Persona p5 = new Persona("Paco", "Vasquez");

        // CREAR ARRAYLIST PARA ALMACENAR LAS PERSONAS 
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        // VARIABLE FILEWRITE PARA ESCRIBIR UN ARCHIVO
        FileWriter fw = null;

        // CREAR FILEWRITER 
        fw = new FileWriter("personas.txt");

        
        for (int i = 0; i < personas.size(); i++) {
            fw.write(personas.get(i).toString()); // ESCRIBIR EL ARCHIVO
        }

        fw.close();
    }
}
