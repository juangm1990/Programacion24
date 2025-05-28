package TercerTrimestre.Recuperacion.Recuperacion3;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorA = 0;
        int contadorO = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Introduce una palabra o frase (" + i + "/7): ");
            String texto = input.nextLine();

            // Variables para saber si contiene 'a' o 'o'
            boolean tieneA = false;
            boolean tieneO = false;

            // Recorremos letra a letra
            for (int j = 0; j < texto.length(); j++) {
                char letra = texto.charAt(j);

                if (letra == 'a' || letra == 'A') {
                    tieneA = true;
                }

                if (letra == 'o' || letra == 'O') {
                    tieneO = true;
                }
            }

            if (tieneA) {
                contadorA++;
            }

            if (tieneO) {
                contadorO++;
            }
        }

        System.out.println("Cadenas que tienen la letra 'a': " + contadorA);
        System.out.println("Cadenas que tienen la letra 'o': " + contadorO);

        input.close();
    }
}
