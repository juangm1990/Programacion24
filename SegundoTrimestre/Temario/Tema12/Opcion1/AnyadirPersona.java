package SegundoTrimestre.Temario.Tema12.Opcion1;

import java.io.FileWriter;
import java.util.ArrayList;

public class AnyadirPersona {
    
        public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Alejandro", "Caballero");
        Persona p2 = new Persona("Fali", "De la Fuente");
    

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(p1);
        personas.add(p2);
      

        FileWriter fw = null;

        fw = new FileWriter("personas.txt", true);

        for (int i = 0; i < personas.size(); i++) {

            fw.append(personas.get(i).toString());
        }
        fw.close();

        
        
    }
}
