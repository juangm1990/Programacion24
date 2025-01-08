package PrimerTrimestre.Examenes.Recuperacion2;

import java.util.Scanner;

public class Pregunta2 {

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = -1;
        double mediaImpares = 0;

        while (numero >= 0) {
            System.out.print("Introduce un número (número negativo para terminar): ");
            numero = input.nextInt();
            
            if (numero >= 0) { // Solo procesar números no negativos
                contador++;
                
                if (numero % 2 != 0) { // Número impar
                    sumaImpares += numero;
                    cantidadImpares++;
                } else { // Número par
                    if (numero > mayorPar) {
                        mayorPar = numero;
                    }
                }
            }
        }
        
        if (contador == 0) {
            System.out.println("No se han introducido números.");
        } else {
            System.out.println("Cantidad de números introducidos: " + contador);
            
            if (cantidadImpares > 0) {
                mediaImpares = sumaImpares / cantidadImpares;
                System.out.println("La media de los números impares es: " + mediaImpares);
            } else {
                System.out.println("No se han introducido números impares.");
            }
            
            if (mayorPar >= 0) {
                System.out.println("El mayor de los números pares es: " + mayorPar);
            } else {
                System.out.println("No se han introducido números pares.");
            }
        }
        
        input.close();
    }
}
