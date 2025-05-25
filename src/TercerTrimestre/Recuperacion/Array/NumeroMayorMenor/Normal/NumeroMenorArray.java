package TercerTrimestre.Recuperacion.Array.NumeroMayorMenor.Normal;

public class NumeroMenorArray {

    public static void main(String[] args) {

        // Array de ejemplo con algunos números
        int[] numeros = {34, 7, 22, 99, 13, 5, 80};

        // Suponemos que el primer número es el menor
        int menor = numeros[0];

        // Recorremos el resto del array
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostramos el resultado
        System.out.println("El número menor es: " + menor);
    }
}
