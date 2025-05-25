package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta3.Scanner;

import java.util.Scanner;

public class ArrayCapicua {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos cuántos números va a introducir el usuario
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos un array con esa cantidad
        int[] numeros = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostramos los capicúas encontrados
        System.out.print("Números capicúa encontrados: ");
        for (int i = 0; i < numeros.length; i++) {
            int original = numeros[i];
            int numero = original;
            int invertido = 0;

            // Invertimos el número
            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            // Si es capicúa, lo mostramos
            if (original == invertido) {
                System.out.print(original + " ");
            }
        }

        input.close(); // cerramos el scanner
    }
}
