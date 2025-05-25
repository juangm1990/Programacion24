package TercerTrimestre.Recuperacion.Array.NumeroMayorMenorMedia.Scanner;

import java.util.Scanner;

public class MenorQueMedia {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos cuántos números va a introducir el usuario
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array
        int[] numeros = new int[cantidad];

        // Introducción de números por teclado
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Calcular la suma
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / cantidad;

        // Mostrar los menores que la media
        int contador = 0;
        System.out.println("La media es: " + media);
        System.out.print("Números menores que la media: ");
        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] < media) {
                System.out.print(numeros[i] + " ");
                contador++;
            }
        }

        System.out.println();
        System.out.println("Hay " + contador + " números menores que la media.");

        input.close(); // cerramos el scanner
    }
}
