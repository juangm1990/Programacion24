package TercerTrimestre.Recuperacion.Array.OrdenarMayorMenor.Scanner;

import java.util.Scanner;

public class ArrayMenorMayor {
    
     public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números va a introducir
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array con ese tamaño
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Ordenamos de menor a mayor usando bubble sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiamos los valores
                    int valorGuardado = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = valorGuardado;
                }
            }
        }

        // Mostramos el array ordenado
        System.out.print("Ordenado de menor a mayor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        input.close(); // cerramos el Scanner
    }
}
