package TercerTrimestre.Recuperacion.Recuperacion3;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5]; // Puedes cambiar a 10 si el examen lo pide
        int numerosPares = 0;
        int numerosImpares = 0;

        // Pedimos los 5 números
        System.out.println("Introduce 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostrar los números pares
        System.out.println("Números pares:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                numerosPares = numerosPares + 1;
            }
        }

        if (numerosPares == 0) {
            System.out.println("No hay números pares.");
        }

        // Mostrar los números impares
        System.out.println("Números impares:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                numerosImpares = numerosImpares + 1;
            }
        }

        if (numerosImpares == 0) {
            System.out.println("No hay números impares.");
        }

        input.close();
    }
}
