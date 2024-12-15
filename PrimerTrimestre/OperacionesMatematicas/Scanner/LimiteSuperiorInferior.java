package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class LimiteSuperiorInferior {
    
    /*
     * Escribe un programa que pida el limite inferior y superior de un intervalo.
     * Si el límite es inferior es mayor que el superior lo tiene que volver a pedir.
     * A continuación se van introduciendo números hasta que introduzcamos el 0.
     * Implementa en Java un programa para determinar cuanto debe pagar mensualmente 
     * y el total de lo que pagará 20 meses después. 
     * 
     * El programa debe servir para calcular otras compras de productos en diferentes plazos.
     * 
     * Tiene que mostrar las siguientes informaciones:
     * 
     * 1./ La suma de los números que están dentro del intervalo.
     * 2./Cantidad de números que están fuera del intervalo.     * 
     */
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int inferior = 0;
        int superior = 0;

        do {
            System.out.println("Introduce el límite inferior");
            inferior = input.nextInt();
            System.out.println("Introduce el límite superior");
            superior = input.nextInt();

        } while (superior < inferior);

        int suma = 0;
        int cantidad = 0;

        System.out.println("Introduzca numeros (Número 0: el programa se detendrá)");
        int numeros = input.nextInt();

        while (numeros !=0) {
            if (numeros <= superior && numeros >= inferior) {
                suma = suma + numeros;
            }
            else {
                cantidad++;
            }
            numeros =input.nextInt();
        }

        System.out.println("La suma de los números que están dentro del intervalo es: " + suma);
        System.out.println("La cantidad de números que están fuera del intervalo son: " + cantidad);

        input.close();

    } 
}
