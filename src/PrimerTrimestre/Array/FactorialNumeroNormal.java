package PrimerTrimestre.Array;

public class FactorialNumeroNormal {
    
        public static void main(String[] args) {
        int numero = 5; // Cambia este valor para probar otros factoriales
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
