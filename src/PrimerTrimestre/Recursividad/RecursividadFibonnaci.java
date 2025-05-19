package PrimerTrimestre.Recursividad;

public class RecursividadFibonnaci {
    
    public static void main(String[] args) {

        System.out.println(numeroFibonacci(1));
    }

    public static int numeroFibonacci(int n) {
        if (n == 0) {
            return 0; // Caso base: Fibonacci de 0 es 0
        } else if (n == 1) {
            return 1; // Caso base: Fibonacci de 1 es 1
        } else {
            return numeroFibonacci(n - 1) + numeroFibonacci(n - 2); // Llamada recursiva
        }

    }
}
