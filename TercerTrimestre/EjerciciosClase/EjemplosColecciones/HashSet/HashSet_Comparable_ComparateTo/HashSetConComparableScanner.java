package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashSet.HashSet_Comparable_ComparateTo;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetConComparableScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Fruta> frutas = new HashSet<>();

        System.out.println("Introduce nombres de frutas (escribe '1' para terminar):");

        while (true) {
            System.out.print("Fruta: ");
            String nombre = sc.nextLine();

            if (nombre.equals("1")) {
                break;
            }

            boolean añadido = frutas.add(new Fruta(nombre));

            if (!añadido) {
                System.out.println("Esa fruta ya fue introducida. No se permiten duplicados.");
            }
        }

        sc.close();

        System.out.println("Frutas introducidas (sin duplicados):");
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
