package PrimerTrimestre.Examenes.Practica2;

import java.util.Scanner;

public class Pregunta4 {
    
    /*
     * Realizar un programa que pida números (se pedirá por teclado la cantidad de números a introducir). 
     * El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
     * 
     * Ejemplo de salida:
     * Introduzca una cantidad de números: 4
     * Introduce el número 1: 5
     * Introduce el número 2: 0
     * Introduce el número 3: -1
     * Introduce el número 4: 10
     * Se han introducido 2 números mayores a 0, un número igual a 0 y un número menor a 0.
     */

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
              
        int numero = 0;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        System.out.print("Introduce la cantidad de números que quieras evaluar: ");
        contador = input.nextInt();

        do {
            if (contador <= 0) {
                System.out.println("El número introducido debe ser positivo y mayor que 0.");
                contador = input.nextInt();
            }
        } while (contador <= 0);

        while (contador > 0) {
            System.out.print("Introduce un número: ");
            numero = input.nextInt();

            contador = contador - 1;

            if (numero > 0) {
                mayor++;
            } else if (numero == 0) {
                igual++;
            } else {
                menor++;
            }
        }

        System.out.println("En los números que has introducido hay: " + mayor + " mayores que 0; " + igual + " iguales que 0; " + menor + " menores que 0");

        input.close();
    }
}
