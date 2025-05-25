package TercerTrimestre.Recuperacion.Array.PosicionParesImpares.Scanner;

import java.util.Scanner;

public class SepararParesImpares {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere introducir
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

        // Mostramos los pares primero
        System.out.print("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(); // salto de línea

        // Mostramos los impares después
        System.out.print("Números impares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        input.close(); // cerramos el scanner
    }
}
