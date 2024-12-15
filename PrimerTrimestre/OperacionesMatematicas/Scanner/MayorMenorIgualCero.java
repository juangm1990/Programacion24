package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class MayorMenorIgualCero {
    
    /*
     * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
     * números a introducir). El programa debe informar de cuántos números introducidos
     * son mayores que 0, cuantos números son menores que 0 y cuántos son iguales a 0.
     */

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numero = 0;
        int contador;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        System.out.println("Introduce la cantidad de números que quieras evaluar");
        contador = input.nextInt();

        do {
            if (contador <= 0) {
                System.out.println("El número introducido debe ser mayor o igual que cero");
                contador = input.nextInt();
            }
        } while (contador <= 0);

        while (contador > 0) {
            System.out.println("Introduce un número");
            numero = input.nextInt();
            contador = contador - 1;
            if (numero > 0) {
                mayor++;
            } else if (numero < 0) {
                menor++;
            } else {
                igual++;
            }
        }

        System.out.println("En los números que has introducido: " + mayor + "--> Son mayores a 0, " + menor
                + "--> Son menores a 0, " + igual + "--> Son iguales a 0 ");

        input.close();
    }
}
