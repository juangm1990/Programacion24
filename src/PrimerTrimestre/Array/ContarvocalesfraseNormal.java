package PrimerTrimestre.Array;

public class ContarvocalesfraseNormal {
    
       public static void main(String[] args) {
        String frase = "Esto es una frase para contar vocales";

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
    }
}
