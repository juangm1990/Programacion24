package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class TotalFinanciacionProducto {

    /*
     * Una persona adquirió un producto a pagar en 20 meses.
     * El primer mes pagó 10€, el segundo 20€, el tercero 40 euros; y así sucesivamente.
     * Implementa en Java un programa para determinar cuanto debe pagar mensualmente
     * y el total de lo que pagará 20 meses después.
     * 
     * El programa debe servir para calcular otras compras de productos en diferentes plazos.
     * 
     * Introduce la primera cuota a pagar 10€
     * Introduce el número de meses de financiación: 20 meses
     * El precio total pagado por el producto es 10485760€
     */

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pago;
        int mensualidades;
        int pagoFinal = 0;

        System.out.println("Introduce el primer pago");
        pago = input.nextInt();

        System.out.println("Introduce el número de mensualidades");
        mensualidades = input.nextInt();

        for (int i = 1; i <= mensualidades; i++) {
            System.out.println("Pago: " + i + "=" + pago);
            pagoFinal = pagoFinal + pago;
            pago = pago * 2;
        }

        System.out.println("Total pagado: " + pagoFinal);

        input.close();
    }
}
