package TercerTrimestre.EjerciciosClase.EjemploColecciones.TreeMap.TreeMap_String;


import java.util.Map;
import java.util.TreeMap;

public class TreeMap_String {
    public static void main(String[] args) {
        // Creamos un TreeMap con clave String (nombre de alumno) y valor Integer (nota)
        TreeMap<String, Integer> notas = new TreeMap<>();

        // Añadimos entradas
        notas.put("Carlos", 7);
        notas.put("Ana", 9);
        notas.put("Beatriz", 6);
        notas.put("Luis", 8);
        notas.put("Ana", 10); // Sobrescribe el valor anterior de Ana

        // Mostramos los pares clave-valor ordenados por nombre (orden natural)
        System.out.println("Notas de alumnos (orden alfabético):");
        for (Map.Entry<String, Integer> entrada : notas.entrySet()) {
            System.out.println("Alumno: " + entrada.getKey() + " - Nota: " + entrada.getValue());
        }
    }
}