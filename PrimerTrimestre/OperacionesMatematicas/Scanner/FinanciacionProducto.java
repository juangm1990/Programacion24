package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class FinanciacionProducto {
    
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
     * 
     */

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer mes pagado");
        int cuotaInicial = input.nextInt();

        System.out.println("Introduce el numero de meses de financiación");
        int meses = input.nextInt();

        for (int i = 0; i <= meses; i++ ){
            System.out.println("Mes " + i + " : " + cuotaInicial + "euros");
            cuotaInicial = cuotaInicial * 2;
        }

        input.close();
    }
}
