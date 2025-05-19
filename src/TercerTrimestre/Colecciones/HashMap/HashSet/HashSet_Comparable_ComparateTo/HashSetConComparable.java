package TercerTrimestre.Colecciones.HashMap.HashSet.HashSet_Comparable_ComparateTo;

import java.util.HashSet;

public class HashSetConComparable {
    public static void main(String[] args) {
        HashSet<Fruta> frutas = new HashSet<>();

        frutas.add(new Fruta("Pera"));
        frutas.add(new Fruta("Manzana"));
        frutas.add(new Fruta("Kiwi"));
        frutas.add(new Fruta("Banana"));
        frutas.add(new Fruta("Banana")); // No se añade (duplicado)

        System.out.println("Frutas introducidas (sin orden y sin duplicados):");
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
    }
}