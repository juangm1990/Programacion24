package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashSet.HashSetOrdenNatural;

import java.util.HashSet;

public class HashSetOrdenNatural {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(15);
        numeros.add(3);
        numeros.add(9);
        numeros.add(1);
        numeros.add(9); // Duplicado, no se añade

        System.out.println("Números introducidos (sin orden y sin duplicados):");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
