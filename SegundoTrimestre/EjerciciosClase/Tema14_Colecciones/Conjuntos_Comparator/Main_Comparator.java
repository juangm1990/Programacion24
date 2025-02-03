package SegundoTrimestre.EjerciciosClase.Tema14_Colecciones.Conjuntos_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main_Comparator {
    
        /*
     * Crear un Hashset de personas
     * Instanciar varias personas y guardarlas en un Hashset
     * Mostrar la lista (Itereator)
     */

    public static void main(String[] args) throws Exception{
        
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona p1 = new Persona(1, "Paco", "Pepe", 30);
        Persona p2 = new Persona(2, "Jesus", "Mancha", 22);


        personas.add(p1);
        personas.add(p2);

        
        for (Persona persona : personas) {
            System.out.println(persona.getId()+1);
            
        }
        
        Collections.sort(personas);
        for (Persona persona : personas){
            System.out.println(persona);
        }
        
    }
}
