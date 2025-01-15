package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) throws Exception{
        
            
    Scanner input = new Scanner(System.in);

    int numero1 = 0;
    int numero2 = 0;
    int suma = 0;

    System.out.println("Introduce el primer número:");
    numero1 = input.nextInt();
    System.out.println("Introduce el segundo número:");
    numero2 = input.nextInt();

    suma = numero1 + numero2;
    System.out.println("El resultado de la suma = " + suma);

    input.close();

    }
}
