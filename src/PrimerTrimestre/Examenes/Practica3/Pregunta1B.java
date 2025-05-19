package PrimerTrimestre.Examenes.Practica3;

import java.util.Scanner;

public class Pregunta1B {

    /*
     * Programa que lea 10 números enteros por teclado y los guarde en un array. 
     * Calcula y muestra la media de los números que estén en las posiciones pares del array.
     * Considera la primera posición del arraya (posición 0) como par.
     */
    
        public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

        int [] numeros = new int[10];
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce 10 números: ");
        
        for (int i = 0; i < numeros.length;i++){
            numeros [i] = input.nextInt();

            if (i % 2 == 0) {
                suma += numeros [i];
                contador++;
            }


        }

        double media = (double) suma / contador;
        System.out.println("La media de los numeros en las posiciones pares es: " + media);

        input.close();

    }
}
