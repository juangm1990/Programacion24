package PrimerTrimestre.Array;

import java.util.Scanner;

public class FactorialNumero {
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número entero para calcular su factorial: ");
        int numero = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        input.close();
    }
}
