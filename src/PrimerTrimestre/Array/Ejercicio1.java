package PrimerTrimestre.Array;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        // Escribe un programa que pida 10 números por teclado, los almacene en un array y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan en el array.

        Scanner input = new Scanner(System.in);



        int[] array = new int[10];
        int min = 0;
        int max = 0;
        int posicionMin = 0;
        int posicionMax = 0;

        System.out.print("Introduce 10 números: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        min = array[0];
        max = array[0];
        posicionMin = 0;
        posicionMax = 0;

        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                posicionMin = j;
            }
            if (max < array[j]) {
                max = array[j];
                posicionMax = j;
            } 
        }

        System.out.println("El valor mínimo es: " + min + " y su posición es la " + posicionMin);
        System.out.println("El valor máximo es: " + max + " y su posición es la " + posicionMax);

        input.close();
    }
}
