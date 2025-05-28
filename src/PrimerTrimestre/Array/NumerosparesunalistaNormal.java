package PrimerTrimestre.Array;

public class NumerosparesunalistaNormal {
    
    public static void main(String[] args) {
        int[] numeros = {3, 4, 7, 8, 10, 13, 16, 21, 22, 25};

        System.out.println("Números pares introducidos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("\nNúmeros impares introducidos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
