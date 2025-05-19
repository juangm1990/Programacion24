package PrimerTrimestre.Array;


import java.util.Scanner;

public class ArrayDuplicadosEliminados {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int longitud = 0;

        System.out.print("¿Cuántos números quieres en el array? ");
        longitud = input.nextInt();

        int[] array = new int[longitud];

        System.out.print("Introduce los números del array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("--------------------------");

        for (int j = 0; j < arrayDuplicados(array).length; j++) {
            System.out.println(arrayDuplicados(array)[j]);
        }
        input.close();
    }

    public static int[] arrayDuplicados (int[] x) {

        int[] arrayTransicion = new int[x.length];
        int longitud2 = 0;
        int contador = 0;
        boolean repetido = false;

        for (int i = 0; i < x.length; i++) {

            repetido = false;

            for (int j = 0; j < arrayTransicion.length; j++) {

                if (x[i] == arrayTransicion[j]) {
                    repetido = true;
                } else {
                }
            }

            if (repetido == false) {
                arrayTransicion[i] = x[i];
                longitud2++;
            } else {

            }
        }

        int[] arrayDuplicados = new int[longitud2];

        for (int k = 0; k < arrayTransicion.length; k++) {

            if (arrayTransicion[k] == 0) {

            } else {
                arrayDuplicados[contador] = arrayTransicion[k];
                contador++;
            }

        }

        return arrayDuplicados;
    }
}
