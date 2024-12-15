package PrimerTrimestre.OperacionesMatematicas.Normal;

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
     */

     public static void main(String[] args) {

        int cuotaInicial = 10;
        int meses = 20;

        for (int i = 0; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + cuotaInicial + " euros");
            cuotaInicial = cuotaInicial * 2;
        }
    }
}
