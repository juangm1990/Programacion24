package TercerTrimestre.Recuperacion.Recuperacion3;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int letraA = 0;
        int letraO = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Escribe una palabra o frase (" + i + " de 7):");
            String texto = input.nextLine();

            boolean tieneLetraA = false;
            boolean tieneLetraO = false;

            for (int j = 0; j < texto.length(); j++) {
                char letra = texto.charAt(j);

                if (letra == 'a' || letra == 'A') {
                    tieneLetraA = true;
                }
                if (letra == 'o' || letra == 'O') {
                    tieneLetraO = true;
                }
            }

            if (tieneLetraA) {
                letraA = letraA + 1;
            }
            if (tieneLetraO) {
                letraO = letraO + 1;
            }
        }

        System.out.println("Número de cadenas que contienen la letra 'a': " + letraA);
        System.out.println("Número de cadenas que contienen la letra 'o': " + letraO);

        input.close();
    }
}
