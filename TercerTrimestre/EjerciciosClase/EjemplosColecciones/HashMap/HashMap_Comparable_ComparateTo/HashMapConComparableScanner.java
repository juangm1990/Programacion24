package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashMap.HashMap_Comparable_ComparateTo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapConComparableScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Persona, Integer> personas = new HashMap<>();

        System.out.println("Introduce personas (nombre y edad). Escribe '1' para terminar.");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            if (nombre.equals("1")) {
                break;
            }

            System.out.print("Edad: ");
            int edad;

            try {
                edad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Edad inválida. Inténtalo de nuevo.");
                continue;
            }

            personas.put(new Persona(nombre), edad);
        }

        sc.close();

        System.out.println("\nListado de personas (HashMap, sin orden):");
        for (Map.Entry<Persona, Integer> entrada : personas.entrySet()) {
            System.out.println("Persona: " + entrada.getKey() + " - Edad: " + entrada.getValue());
        }
    }
}
