package PrimerTrimestre.Examenes.Recuperacion2;

import java.util.Scanner;

public class Pregunta2 {

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int contador1 = 0;
        int contador2 = 0;

        int sumaNumerosImpares = 0;
        int numeroMayorPar = 0;
        double media = 0;

        while (numero >= 0) {
            System.out.println("Para terminar introduce un número negativo");
            System.out.println("Introduce todos los números:");
            numero = input.nextInt();
            
            if (numero >= 0) { 
                contador1++;
                
                if (numero % 2 != 0) { 
                    sumaNumerosImpares = sumaNumerosImpares + numero;
                    contador2++;
                } else { 
                    if (numero > numeroMayorPar) {
                        numeroMayorPar = numero;
                    }
                }
            }
        }
        
        if (contador1 == 0) {
            System.out.println("Error, no hay números");
        } else {
            System.out.println("Números introducidos totales = " + contador1);
            
            if (contador2 > 0) {
                media = sumaNumerosImpares / contador2;
                System.out.println("La media de los números impares es: " + media);
            } else {
                System.out.println("No hay números impares");
            }
            
            if (numeroMayorPar >= 0) {
                System.out.println("El numero mayor par es: " + numeroMayorPar);
            } else {
                System.out.println("No hay números pares");
            }
        }
        
        input.close();

    }
}
