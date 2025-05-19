package PrimerTrimestre.Array;


import java.util.Scanner;

public class Ascendente {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int longitud = 0;

        System.out.print("¿Cuántos números quieres en el array? ");
        longitud = input.nextInt();

        int[] desordenado = new int[longitud];

        System.out.println("Introduce los números en el array:");

        for (int i = 0; i < desordenado.length; i++) {
            desordenado[i] = input.nextInt();
        }
        
        for (int i = 0; i < desordenado.length; i++) {
            System.out.println(ascendente(desordenado)[i]);
        }

        input.close();
    }

    public static int[] ascendente(int[] array) {

        int cambio = 0;
        
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    cambio = array[j];
                    array[j] = array[i];
                    array[i] = cambio;
                }
            }
        }

        return array;
    }
}
