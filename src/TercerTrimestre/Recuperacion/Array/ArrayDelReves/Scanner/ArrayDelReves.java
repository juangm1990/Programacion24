package TercerTrimestre.Recuperacion.Array.ArrayDelReves.Scanner;

import java.util.Scanner;

public class ArrayDelReves {
    
       public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere meter
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array con esa cantidad
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostramos el array del revés
        System.out.print("Array del revés: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        input.close(); // cerramos el Scanner
    }
}
