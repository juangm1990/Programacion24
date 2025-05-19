package TercerTrimestre.Colecciones.HashMap.TreeMap.TreeMap_Comparable_ComparateTo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConComparable {
    public static void main(String[] args) {
        // Clave: Persona (ordenada por nombre), Valor: edad
        TreeMap<Persona, Integer> personas = new TreeMap<>();

        personas.put(new Persona("Carlos"), 30);
        personas.put(new Persona("Ana"), 25);
        personas.put(new Persona("Beatriz"), 28);
        personas.put(new Persona("Luis"), 35);
        personas.put(new Persona("Ana"), 27); // Sobrescribe porque compara por nombre

        System.out.println("Personas y edades (orden alfabético):");
        for (Map.Entry<Persona, Integer> entrada : personas.entrySet()) {
            System.out.println("Persona: " + entrada.getKey() + " - Edad: " + entrada.getValue());
        }
    }
}