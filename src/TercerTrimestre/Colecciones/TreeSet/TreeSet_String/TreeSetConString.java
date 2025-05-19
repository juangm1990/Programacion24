package TercerTrimestre.Colecciones.TreeSet.TreeSet_String;

import java.util.TreeSet;

public class TreeSetConString {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Bea");
        nombres.add("Ana"); // Duplicado, no se añade

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
