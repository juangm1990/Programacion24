package PrimerTrimestre.Array;

import java.util.Scanner;

public class Contarvocalesfrase {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = input.nextLine();

        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'A' ||
                letra == 'e' || letra == 'E' ||
                letra == 'i' || letra == 'I' ||
                letra == 'o' || letra == 'O' ||
                letra == 'u' || letra == 'U') {
                contadorVocales = contadorVocales + 1;
            }
        }

        System.out.println("Número total de vocales: " + contadorVocales);
        input.close();
    }
}
