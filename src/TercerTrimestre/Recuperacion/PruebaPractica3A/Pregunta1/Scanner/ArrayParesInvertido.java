package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta1.Scanner;

import java.util.Scanner;

public class ArrayParesInvertido {
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números va a introducir
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array con esa cantidad
        int[] numeros = new int[cantidad];

        // Pedimos los números uno a uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostramos pares en orden normal
        System.out.print("Pares en orden normal: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // si es par
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(); // salto de línea

        // Mostramos pares en orden invertido
        System.out.print("Pares en orden invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (numeros[i] % 2 == 0) { // si es par
                System.out.print(numeros[i] + " ");
            }
        }

        input.close(); // cerramos el scanner
    }
}
