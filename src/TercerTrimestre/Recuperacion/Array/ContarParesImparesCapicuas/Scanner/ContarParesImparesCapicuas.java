package TercerTrimestre.Recuperacion.Array.ContarParesImparesCapicuas.Scanner;

import java.util.Scanner;

public class ContarParesImparesCapicuas {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos cuántos números va a introducir
        System.out.print("¿Cuántos números quieres meter? ");
        int cantidad = input.nextInt();

        // Creamos el array
        int[] numeros = new int[cantidad];

        // Pedimos los números
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Contadores
        int pares = 0;
        int impares = 0;
        int capicuas = 0;

        // Recorremos y comprobamos
        for (int i = 0; i < cantidad; i++) {

            // Pares o impares
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            // Capicúa
            int original = numeros[i];
            int invertido = 0;
            int numero = original;

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            if (original == invertido) {
                capicuas++;
            }
        }

        // Mostramos resultados
        System.out.println("Resultados:");
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Cantidad de capicúas: " + capicuas);

        input.close();
    }
}
