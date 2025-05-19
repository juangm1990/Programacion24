package PrimerTrimestre.Array;

import java.util.Scanner;

public class Ejercicio4A {
    
     public static void main(String[] args) throws Exception {
        
        /*
         * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
         * Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
         * Por ejemplo, si escribo los siguientes numeros
         * 0 //Añadira la ‘A’
         * 5 //Añadira la ‘F’
         * 25 //Añadira la ‘Z’
         * 50 //Error, inserte otro numero
         * -1 //fin
         * Cadena resultante: AFZ
         */

        Scanner input = new Scanner(System.in);

       char[] caracteres = new char[26];
       int numero = 0;
       String letras = "";

       for (int i = 65, j = 0; i <= 90; i++, j++) {
            
        caracteres[j] = (char)i;
       }

       do {
        
        System.out.print("Elige un número para añadir un carácter: ");

        numero = input.nextInt();

        if (numero >= 0 && numero <= 25) {

            for (int i = 0; i < caracteres.length; i++) {

                if (numero == i) {
                    letras += caracteres[i];
                }
            }
        } else if (numero < -1 || numero > 25) {

            System.out.println("Error, inserte otro número");

        }else {

        }
        } while (numero != -1);

        System.out.println("Cadena resultante: " + letras);

        input.close();
    }
}
