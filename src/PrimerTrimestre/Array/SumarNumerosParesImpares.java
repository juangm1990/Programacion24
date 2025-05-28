package PrimerTrimestre.Array;

import java.util.Scanner;

public class SumarNumerosParesImpares {
   
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                sumaPares = sumaPares + numero;
            } else {
                sumaImpares = sumaImpares + numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);

        input.close();
    }
}
