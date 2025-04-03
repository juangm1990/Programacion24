package TercerTrimestre.EjerciciosClase.EjemploColecciones.TreeSet.TreeSet_Comparable_ComparateTo;

import java.util.TreeSet;

public class TreeSetConComparable {
    public static void main(String[] args) {
        TreeSet<Fruta> frutas = new TreeSet<>();

        frutas.add(new Fruta("Pera"));
        frutas.add(new Fruta("Manzana"));
        frutas.add(new Fruta("Banana"));
        frutas.add(new Fruta("Kiwi"));
        frutas.add(new Fruta("Banana")); // Duplicado, no se añade

        System.out.println("Frutas ordenadas (TreeSet con Comparable):");
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
