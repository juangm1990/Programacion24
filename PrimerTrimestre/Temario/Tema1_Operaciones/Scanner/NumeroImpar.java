package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class NumeroImpar {
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce el número:");
        numero = imput.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else{
            System.out.println("El número" + numero + " no es par");
        }

        imput.close();
    }
}
