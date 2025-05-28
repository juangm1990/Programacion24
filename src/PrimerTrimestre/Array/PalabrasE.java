package PrimerTrimestre.Array;

import java.util.Scanner;

public class PalabrasE {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorConE = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la palabra " + i + ": ");
            String palabra = input.nextLine();

            boolean tieneE = false;

            for (int j = 0; j < palabra.length(); j++) {
                char letra = palabra.charAt(j);
                if (letra == 'e' || letra == 'E') {
                    tieneE = true;
                }
            }

            if (tieneE) {
                contadorConE = contadorConE + 1;
            }
        }

        System.out.println("Número de palabras que contienen la letra 'e': " + contadorConE);
        input.close();
    }
}
