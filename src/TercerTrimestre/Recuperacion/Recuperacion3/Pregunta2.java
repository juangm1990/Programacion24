package TercerTrimestre.Recuperacion.Recuperacion3;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5]; // Puedes cambiar a 10 si el examen lo pide
        int cantidadPares = 0;
        int cantidadImpares = 0;

        // Pedimos los 5 números
        System.out.println("Introduce 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Mostrar los pares
        System.out.println("Números pares:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                cantidadPares++;
            }
        }

        if (cantidadPares == 0) {
            System.out.println("No hay números pares.");
        }

        // Mostrar los impares
        System.out.println("Números impares:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                cantidadImpares++;
            }
        }

        if (cantidadImpares == 0) {
            System.out.println("No hay números impares.");
        }

        teclado.close();
    }
}
