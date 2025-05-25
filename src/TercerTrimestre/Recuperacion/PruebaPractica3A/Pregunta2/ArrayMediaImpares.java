package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta2;

import java.util.Scanner;

public class ArrayMediaImpares {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Creamos el array con 10 posiciones
        int[] numeros = new int[10];

        // Pedimos al usuario que introduzca 10 números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Variables para sumar y contar los que están en posiciones impares
        int suma = 0;
        int contador = 0;

        // Recorremos el array desde la posición 1 en adelante, de 2 en 2
        for (int i = 1; i < numeros.length; i += 2) {
            suma = suma + numeros[i];
            contador++;
        }

        // Calculamos la media
        double media = (double) suma / contador;

        // Mostramos el resultado
        System.out.println("La media de los números en posiciones impares es: " + media);

        input.close(); // cerramos el scanner
    }
}
