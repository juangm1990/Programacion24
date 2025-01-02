package PrimerTrimestre.Examenes.Recuperación1;

import java.util.Scanner;

public class Pregunta2 {
    
    /*
     * Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
     * 
     * Introduzca una cadena: "desarrollo de aplicaciones web"
     * Introduzca un carácter: 'e'
     * El carácter 'e' aparece 4 veces
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario la cadena
        System.out.print("Introduzca una cadena: ");
        String cadena = input.nextLine();

        // Solicitar al usuario el carácter
        System.out.print("Introduzca un carácter: ");
        char caracter = input.next().charAt(0);

        // Contar las veces que aparece el carácter en la cadena
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces.");

        input.close();
    }

}
