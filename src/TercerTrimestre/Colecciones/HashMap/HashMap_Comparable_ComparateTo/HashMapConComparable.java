package TercerTrimestre.Colecciones.HashMap.HashMap_Comparable_ComparateTo;

import java.util.HashMap;
import java.util.Map;

public class HashMapConComparable {
    public static void main(String[] args) {
        HashMap<Persona, Integer> personas = new HashMap<>();

        personas.put(new Persona("Carlos"), 30);
        personas.put(new Persona("Ana"), 25);
        personas.put(new Persona("Beatriz"), 28);
        personas.put(new Persona("Luis"), 35);
        personas.put(new Persona("Ana"), 27); // Sobrescribe por equals/hashCode

        System.out.println("Personas (HashMap, sin orden):");
        for (Map.Entry<Persona, Integer> entrada : personas.entrySet()) {
            System.out.println("Persona: " + entrada.getKey() + " - Edad: " + entrada.getValue());
        }
    }
}
