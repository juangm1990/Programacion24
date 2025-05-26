package PrimerTrimestre.Array;

public class InvertirPalabra {
    public static void main(String[] args) {
        String palabra = "HOLA";

        System.out.print("Palabra invertida: ");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}
