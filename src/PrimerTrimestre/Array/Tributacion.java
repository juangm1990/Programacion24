package PrimerTrimestre.Array;

import java.util.Scanner;

public class Tributacion {
    
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = input.nextInt();
        
        System.out.println("Introduce el dinero");
        double ingresos = input.nextDouble();

        if (edad >= 16 && ingresos >= 1000) {
            System.out.println("Debes tributar");
        } else {
            System.out.println("No tienes que tributar");
        }

        input.close();
    }
}
