package PrimerTrimestre.Array;

import java.util.Scanner;

public class LetraContar {
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = input.nextLine();

        System.out.print("Introduce la letra que quieres contar: ");
        char letraBuscar = input.nextLine().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == letraBuscar || letra == Character.toUpperCase(letraBuscar) || letra == Character.toLowerCase(letraBuscar)) {
                contador = contador + 1;
            }
        }

        System.out.println("La letra '" + letraBuscar + "' aparece " + contador + " veces en la frase.");

        input.close();
    }
}
