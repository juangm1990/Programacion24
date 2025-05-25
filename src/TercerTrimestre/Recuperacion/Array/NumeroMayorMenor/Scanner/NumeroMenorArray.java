package TercerTrimestre.Recuperacion.Array.NumeroMayorMenor.Scanner;

import java.util.Scanner;

public class NumeroMenorArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere meter
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Buscamos el número menor
        int menor = numeros[0]; // suponemos que el primero es el menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostramos el resultado
        System.out.println("El número menor es: " + menor);

        input.close(); // cerramos el scanner
    }
}
