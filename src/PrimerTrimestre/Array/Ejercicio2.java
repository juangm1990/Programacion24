package PrimerTrimestre.Array;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        /*
         * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los almacene en un array.
         * El programa debe crear un nuevo array con los números primos que haya entre esos 20 números. Luego debe mostrar los dos arrays.
         */

        Scanner input = new Scanner(System.in);

        int[] array = new int[20];
        int[] arrayTransicion = new int[array.length];
        int contador = 0;
        int contador2 = 0;
        int longitud = 0;
        boolean primo = true;

        System.out.println("Generando 20 números aleatorios entre 0 y 99");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        System.out.println("---------------");

        for (int j = 0; j < arrayTransicion.length; j++) {
            contador = array[j];
            primo = true;
            for (int k = 2; k < contador && primo == true; k++) {
                if (contador % k == 0) {
                    primo = false;
                } else {
                    primo = true;
                }
            }
            if (primo == true) {
                arrayTransicion[j] = contador;
                longitud++;
            } else {
                
            }
            System.out.println(arrayTransicion[j]);
        }

        System.out.println("--------------------");

        int[] arrayPrimos = new int[longitud];

        for (int l = 0; l < arrayTransicion.length; l++) {
            if (arrayTransicion[l] != 0) {
                arrayPrimos[contador2] = arrayTransicion[l];
                System.out.println(arrayPrimos[contador2]);
                contador2++;
            }
        }

        input.close();
    }
}
