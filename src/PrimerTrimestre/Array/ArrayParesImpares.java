package PrimerTrimestre.Array;


import java.util.Scanner;

public class ArrayParesImpares {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int longitud = 0;

        System.out.print("De cuántos números quieres que sea el array? ");
        longitud = input.nextInt();

        int[] array = new int[longitud];

        System.out.print("Introduce los números en el array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("---------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---------------------");

        input.close();
    }

    public static int[] arrayParImpar (int[] x) {

        int[] arrayTransicionPar = new int[x.length];
        int[] arrayTransicionImpar = new int[x.length];

        int longitudPar = 0;
        int longitudImpar = 0;

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < x.length; i++) {
            
            if (x[i] % 2 == 0) {
                arrayTransicionPar[i] = x[i];
                longitudPar++;
            } else {
                arrayTransicionImpar[i] = x[i];
                longitudImpar++;
            }
        }

        int[] arrayPar = new int[longitudPar];
        int[] arrayImpar = new int[longitudImpar];

        for (int i = 0; i < arrayTransicionPar.length; i++) {

            if (arrayTransicionPar[i] != 0) {
                arrayPar[contadorPar] = arrayTransicionPar[i];
                contadorPar++;
            }
        }

        for (int i = 0; i < arrayTransicionImpar.length; i++) {

            if (arrayTransicionImpar[i] != 0) {
                arrayImpar[contadorImpar] = arrayTransicionImpar[i];
                contadorImpar++;
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arrayPar.length; j++) {
                
            }
        }

        return arrayPar;
    }
}
