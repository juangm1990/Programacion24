package PrimerTrimestre.Examenes.Practica2;

import java.util.Scanner;

public class Pregunta3 {
    
    /*
     * Implementa en Java un programa que calcule el factorial de un número introducido por el usuario:
     * 
     * Ejemplo de salida:
     * Introduzca un número: 5
     * El factorial de 5 es 120 
     */ 
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int num = 0;
        int factorial = 1;

        System.out.print("Introduce un número: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

        input.close();
    }
}
