package PrimerTrimestre.Array;

public class PalabrasENormal {
    
     public static void main(String[] args) {
        String[] palabras = {"Manzana", "Perro", "Casa", "Libro", "Mesa"};

        int contadorConE = 0;

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

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
    }
}
