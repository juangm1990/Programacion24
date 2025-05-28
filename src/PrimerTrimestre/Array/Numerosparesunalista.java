package PrimerTrimestre.Array;

import java.util.Scanner;

public class Numerosparesunalista {
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Números pares introducidos:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        input.close();
    }
}
