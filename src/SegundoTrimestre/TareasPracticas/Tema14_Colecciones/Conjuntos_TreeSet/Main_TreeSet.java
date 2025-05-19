package SegundoTrimestre.TareasPracticas.Tema14_Colecciones.Conjuntos_TreeSet;


import java.util.TreeSet;

public class Main_TreeSet {
    
    /*
     * Crear un Hashset de personas
     * Instanciar varias personas y guardarlas en un Hashset
     * Mostrar la lista (Itereator)
     */

    public static void main(String[] args) throws Exception{
        
        TreeSet<Persona> personas = new TreeSet<Persona>();

        Persona p1 = new Persona(1, "Paco", "Pepe", 30);
        Persona p2 = new Persona(2, "Jesus", "Mancha", 22);
        Persona p3 = new Persona(2, "asasdasd", "Mancha", 22);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println(personas);

        for (Persona persona : personas) {
            System.out.println(persona.getId()+1);
            
        }

        System.out.println(personas);
    }
}
