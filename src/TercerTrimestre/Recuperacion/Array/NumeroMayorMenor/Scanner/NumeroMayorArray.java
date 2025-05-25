package TercerTrimestre.Recuperacion.Array.NumeroMayorMenor.Scanner;

import java.util.Scanner;

public class NumeroMayorArray {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere meter
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Buscamos el número mayor
        int mayor = numeros[0]; // suponemos que el primero es el mayor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Mostramos el resultado
        System.out.println("El número mayor es: " + mayor);

        input.close(); // cerramos el scanner
    }
}
