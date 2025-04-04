package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashMap.HashMapOrdenNatural;

import java.util.HashMap;
import java.util.Map;

public class HashMapOrdenNatural {
    public static void main(String[] args) {
        // Clave: Integer (como si fuera un ID), Valor: String (nombre)
        HashMap<Integer, String> alumnos = new HashMap<>();

        alumnos.put(3, "Carlos");
        alumnos.put(1, "Ana");
        alumnos.put(4, "Luis");
        alumnos.put(2, "Beatriz");
        alumnos.put(1, "Andrea"); // Sobrescribe el valor de clave 1

        System.out.println("Listado de alumnos (HashMap sin orden):");
        for (Map.Entry<Integer, String> entrada : alumnos.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " - Nombre: " + entrada.getValue());
        }
    }
}
