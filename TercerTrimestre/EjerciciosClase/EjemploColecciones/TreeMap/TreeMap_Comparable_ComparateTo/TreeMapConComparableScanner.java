package TercerTrimestre.EjerciciosClase.EjemploColecciones.TreeMap.TreeMap_Comparable_ComparateTo;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapConComparableScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Persona, Integer> personas = new TreeMap<>();

        System.out.println("Introduce personas (nombre y edad). Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
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

        System.out.println("\nListado de personas ordenadas por nombre:");
        for (Map.Entry<Persona, Integer> entrada : personas.entrySet()) {
            System.out.println("Persona: " + entrada.getKey() + " - Edad: " + entrada.getValue());
        }
    }
}