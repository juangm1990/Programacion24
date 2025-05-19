package PrimerTrimestre.Array;


import java.util.Scanner;

public class CantidadPrimos {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int longitud = 0;
        int contador = 0;

        System.out.print("¿Cuántos números quieres en el array? ");
        longitud = input.nextInt();

        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
            
        System.out.println("-------------------------------");

        for (int i = 0; i < numeros.length; i++) {

            if (esPrimo(numeros[i])) {
                contador++;
            }
        }
        System.out.println("Hay  " + contador + " números primos");
        
        input.close();
    }

    public static boolean esPrimo(int numero) {

        int contador = 0;
        boolean esPrimo = false;

        for (int i = numero; i > 0; i--) {
            
            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            esPrimo = true;
        }

        return esPrimo;
    }
}
