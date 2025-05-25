package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta1.Scanner;

import java.util.Scanner;

public class MediaPares {
    
       public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántos números va a meter
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array con esa cantidad
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostramos los pares encontrados y calculamos su suma
        int suma = 0;
        int contador = 0;

        System.out.print("Números pares encontrados: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // si el número es par
                System.out.print(numeros[i] + " ");
                suma += numeros[i];
                contador++;
            }
        }

        System.out.println(); // salto de línea

        // Calculamos y mostramos la media
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números pares es: " + media);
        } else {
            System.out.println("No has introducido ningún número par.");
        }

        input.close(); // cerramos el scanner
    }
}
