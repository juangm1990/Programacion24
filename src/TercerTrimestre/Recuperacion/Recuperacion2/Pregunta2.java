package TercerTrimestre.Recuperacion.Recuperacion2;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        int numero;
        int sumaPositivos = 0;
        int cantidadNegativos = 0;
        int numeroMenor;

        System.out.print("Introduce números enteros (el primero no puede ser 0): ");
        numero = input.nextInt();

        // Si el primer número es 0, no seguimos
        if (numero == 0) {
            System.out.println("No se introdujeron números.");
            input.close();
            return;
        }

        // Primer número válido, lo usamos como referencia
        numeroMenor = numero;

        // Procesar ese primer número
        if (numero > 0) {
            sumaPositivos += numero;
        } else {
            cantidadNegativos++;
        }

        // Ahora pedimos el resto
        while (true) {
            System.out.print("Introduce otro número (0 para terminar): ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                sumaPositivos += numero;
            } else {
                cantidadNegativos++;
            }

            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        System.out.println("RESULTADOS:");
        System.out.println("Suma de números positivos: " + sumaPositivos);
        System.out.println("Cantidad de números negativos: " + cantidadNegativos);
        System.out.println("El número menor introducido fue: " + numeroMenor);

        input.close();
    }
}
