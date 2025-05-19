package PrimerTrimestre.Array;

import java.util.Scanner;

public class Ejercicio4B {
    
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

        char[] array = new char[26];
        int numero = 0;
        boolean seguir = true;

        for (int i = 65, j = 0; i <= 90; i++, j++) {
            array[j] = (char)i;
        }

        do {
            System.out.print("Qué número quieres? ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                for (int j = 0; j < array.length; j++) {
                    if (numero == j) {
                        System.out.println(array[j]);
                    } else {

                    }
                }
            } else if (numero > 25 || numero < -1) {
                System.out.println("Error, inserte otro número");
            } else {
                seguir = false;
            }

        } while (seguir == true);

        input.close();
    }
}
