package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class IntervaloEntreNumerosParImpar {
    
    /*
     * Escribe un programa que pida un intervalo de dos números y muestre por pantalla
     * todos los números pares e impares entre los dos números que introduzca el usuario.
     */

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        int minimo;
        int maximo;

        System.out.println("Introduce el primer número");
        num1 = input.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = input.nextInt();

        if (num1 < num2) {
            minimo = num1;
            maximo = num2;
        } else {
            minimo = num2;
            maximo = num1;
        }

        System.out.println("Los números pares que se encuentran entre el intervalo son los siguientes:");

        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Los números impares que se encuentran entre el intervalo son los siguientes:");

        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
