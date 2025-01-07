package PrimerTrimestre.Examenes.BolaExtra3;

import java.util.Scanner;

public class Pregunta3 {

    /*
     * Programa que lea 10 números enteros por teclado y los guarde en un array.
     * Calcula y muestra la media de los números que estén en las posiciones impares
     * del array. Considera la primera posición del array (posición 0) como par.
     */

     public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int suma = 0;
        int contador = 0;

        // Leer 10 números por teclado y guardarlos en el array
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Calcular la suma de los números en las posiciones impares
        for (int i = 1; i < numeros.length; i += 2) {
            suma += numeros[i];
            contador++;
        }

        // Calcular la media
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números en las posiciones impares es: " + media);
        } else {
            System.out.println("No hay números en posiciones impares.");
        }

        input.close();
    }


}
