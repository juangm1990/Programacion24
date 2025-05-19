package PrimerTrimestre.Array;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        /*
         * Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9,
         *  al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
         *  Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar),
         *  para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
         */

        Scanner input = new Scanner(System.in);

        int longitud = 0;
        int suma = 0;

        System.out.print("Introduce el número de elementos del array: ");
        longitud = input.nextInt();

        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int j = 0; j < array.length; j++) {
            suma = suma + array[j];
            System.out.println(array[j]);
        }

        System.out.println("--------------------------");

        System.out.println("La suma de todos los números es: " + suma);

        input.close();
    }
}
