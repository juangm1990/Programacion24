package TercerTrimestre.Recuperacion.Array.PosicionParesImpares.Normal;

public class SepararParesImpares {

    public static void main(String[] args) {

        // Array con algunos números de ejemplo
        int[] numeros = {12, 7, 4, 9, 18, 3, 10, 5};

        // Mostramos los pares primero
        System.out.print("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(); // salto de línea

        // Mostramos los impares después
        System.out.print("Números impares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}

