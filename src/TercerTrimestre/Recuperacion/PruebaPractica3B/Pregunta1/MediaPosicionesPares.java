package TercerTrimestre.Recuperacion.PruebaPractica3B.Pregunta1;

import java.util.Scanner;

public class MediaPosicionesPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            if (i % 2 == 0) { // posición par
                suma = suma + numeros[i];
                contador++;
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de los números en posiciones pares es: " + media);

        input.close();
    }
}
