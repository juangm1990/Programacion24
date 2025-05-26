package TercerTrimestre.Recuperacion.Array.ArraySimples;

import java.util.Scanner;

public class EntradaCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la edad del cliente:");
        int edad = input.nextInt();

        if (edad < 4) {
            System.out.println("Entrada GRATIS.");
        } else if (edad <= 18) {
            System.out.println("Entrada: 5 euros.");
        } else {
            System.out.println("Entrada: 10 euros.");
        }

        input.close();
    }
}

