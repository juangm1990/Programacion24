package TercerTrimestre.Colecciones.HashMap.HashSet.HashSet_String;

import java.util.HashSet;

public class HashSetConString {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Bea");
        nombres.add("Ana"); // Duplicado, no se añade

        System.out.println("Nombres introducidos (sin orden y sin duplicados):");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}