package TercerTrimestre.EjerciciosClase.EjemplosColecciones.TreeSet.TreeSet_Comparable_ComparateTo;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetConComparableScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Fruta> frutas = new TreeSet<>();

        System.out.println("Introduce nombres de frutas (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Fruta: ");
            String nombre = sc.nextLine();

            if (nombre.equals("fin")) {
                break;
            }

            boolean añadido = frutas.add(new Fruta(nombre));

            if (!añadido) {
                System.out.println("Ya has introducido esa fruta. No se permiten duplicados.");
            }
        }

        sc.close();

        System.out.println("Frutas ordenadas:");
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
