package TercerTrimestre.Recuperacion.Array.NumeroMayorMenorMedia.Scanner;

import java.util.Scanner;

public class MayoresQueMedia {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos cuántos números va a introducir
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array
        int[] numeros = new int[cantidad];

        // Pedimos los números uno a uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Calcular la suma total
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / cantidad;

        // Contar cuántos son mayores que la media y mostrarlos
        int contador = 0;
        System.out.println("La media es: " + media);
        System.out.print("Números mayores que la media: ");

        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] > media) {
                System.out.print(numeros[i] + " ");
                contador++;
            }
        }

        System.out.println(); // salto de línea
        System.out.println("Hay " + contador + " números mayores que la media.");

        input.close(); // cerramos el Scanner
    }
}
