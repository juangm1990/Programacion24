package TercerTrimestre.Recuperacion.Recuperacion3;

public class Pregunta2A {
    public static void main(String[] args) {
        // Números predefinidos (puedes cambiar los valores)
        int[] numeros = {12, 7, 9, 4, 15};

        int numerosPares = 0;
        int numerosImpares = 0;

        // Mostrar los pares
        System.out.println("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                numerosPares = numerosPares + 1;
            }
        }

        if (numerosPares == 0) {
            System.out.println("No hay números pares.");
        }

        // Mostrar los impares
        System.out.println("Números impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                numerosImpares = numerosImpares + 1;
            }
        }

        if (numerosImpares == 0) {
            System.out.println("No hay números impares.");
        }
    }
}
