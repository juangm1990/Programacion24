package PrimerTrimestre.Bucles;

import java.util.Scanner;

public class Mensualidad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
         * 10 €,el segundo 20 €, el tercero 40 € y así sucesivamente.
         * Realizar un programa para determinar cuánto debe pagar mensualmente y el
         * total de lo que pagará después de los 20 meses.
         * Este programa puede servir para calcular otras compras y con diferentes
         * plazos.
         */

        int pago;
        int mensualidades;
        int pagoFinal = 0;

        System.out.println("En este ejercicio lo que nos pide es averiguar la cuota y el resultado final a pagar");
        System.out.println("Introduce el primer pago");
        pago = input.nextInt();

        System.out.println("Introduce el número de mensualidades");
        mensualidades = input.nextInt();

        for (int dinero=1; dinero<=mensualidades; dinero++){
            System.out.println("Pago: " +dinero +"=" + pago);
            pagoFinal = pagoFinal+pago;
            pago = pago*2;
        }

        System.out.println("Total pagado: " +pagoFinal);

        input.close();
    }
}