package PrimerTrimestre.Array;

import java.util.Scanner;

public class EsPrimo {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = input.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        input.close();
    }
}