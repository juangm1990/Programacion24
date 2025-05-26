package PrimerTrimestre.Array;

public class ContarCaracter {
    public static void main(String[] args) {
        String frase = "Hola";
        char buscar = 'a';
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == buscar) {
                contador++;
            }
        }

        System.out.println("El carácter '" + buscar + "' aparece " + contador + " veces.");
    }
}