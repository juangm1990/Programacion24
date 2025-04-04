package TercerTrimestre.EjerciciosClase.EjemplosColecciones.TreeSet.TreeSetOrdenNatural;

import java.util.TreeSet;

public class TreeSetOrdenNatural {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(15);
        numeros.add(3);
        numeros.add(9);
        numeros.add(1);
        numeros.add(9); // Duplicado, no se añade

        System.out.println("Números ordenados (orden natural):");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}