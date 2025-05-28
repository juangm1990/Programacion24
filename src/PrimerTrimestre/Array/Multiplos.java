package PrimerTrimestre.Array;

import java.util.Scanner;

public class Multiplos {
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número límite (por ejemplo, 100): ");
        int limite = input.nextInt();

        System.out.print("Introduce el número para buscar múltiplos (por ejemplo, 3): ");
        int multiplo = input.nextInt();

        System.out.println("Múltiplos de " + multiplo + " entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % multiplo == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
