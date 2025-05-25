package TercerTrimestre.Recuperacion.Array.OrdenarMayorMenor.Scanner;

import java.util.Scanner;

public class ArrayMayorMenor {
    
       public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere introducir
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

        // Ordenamos de mayor a menor con bubble sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiamos los valores
                    int valorGuardado = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = valorGuardado;
                }
            }
        }

        // Mostramos el array ordenado de mayor a menor
        System.out.print("Ordenado de mayor a menor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        input.close(); // cerramos el Scanner
    }
}
