package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class PotenciaNumerica {
    
    /*
     * Escribe un programa que dados dos números, uno real (base) y un entero
     * positivo (exponente). Además hay que sacar saque por pantalla el resultado 
     * de la potencia. No se puede utilizar el operador de potencia.
     */

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double base;
        int exponente;
        double resultado;

        System.out.println("Introduce una base");
        base = input.nextDouble();

        do {
            System.out.println("Introduce el exponente");
            exponente = input.nextInt();

            if (exponente <= 0) {
                System.out.println("Error, el exponente tiene que ser positivo");
            }
        } while (exponente <= 0);
        resultado = base;

        for (int i = 1; i < exponente; i++) {
            resultado = (resultado * base);
        }

        System.out.println("El resultado de la potencia es: " + resultado);

        input.close();
    }
}
