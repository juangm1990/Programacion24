package PrimerTrimestre.Array;

public class LetraContarNormal {
    
    public static void main(String[] args) {
        String frase = "Aprender Java es divertido";
        char letraBuscar = 'a';

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == letraBuscar || letra == Character.toUpperCase(letraBuscar) || letra == Character.toLowerCase(letraBuscar)) {
                contador = contador + 1;
            }
        }

        System.out.println("La letra '" + letraBuscar + "' aparece " + contador + " veces en la frase.");
    }
}
