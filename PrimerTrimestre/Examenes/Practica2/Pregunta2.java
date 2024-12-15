package PrimerTrimestre.Examenes.Practica2;

import java.util.Scanner;

public class Pregunta2 {
    
    /*
     * Implementa en Java un programa que calcule el sumatorio de un número introducido por el usuario:
     * 
     * Ejemplo de salida:
     * Introduzca un número: 5
     * El sumatorio de 5 es 15
     */

     public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int num = 0;
        int sumatorio = 0;

        System.out.print("Introduce un número: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            sumatorio = sumatorio + i;
        }

        System.out.println("El sumatorio de " + num + " es: " + sumatorio);

        input.close();
    }
}
