package TercerTrimestre.Colecciones.HashMap.HashMap_String;

import java.util.HashMap;
import java.util.Map;

public class HashMapConString {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Carlos", 7);
        notas.put("Ana", 9);
        notas.put("Beatriz", 6);
        notas.put("Luis", 8);
        notas.put("Ana", 10); // Sobrescribe el valor anterior

        System.out.println("Notas de alumnos (sin orden):");
        for (Map.Entry<String, Integer> entrada : notas.entrySet()) {
            System.out.println("Alumno: " + entrada.getKey() + " - Nota: " + entrada.getValue());
        }
    }
}
