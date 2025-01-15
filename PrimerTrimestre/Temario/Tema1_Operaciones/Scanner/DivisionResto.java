package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class DivisionResto {
    
    public static void main(String[] args) throws Exception {

        Scanner imput = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int divisionResto = 0;

        System.out.println("Introduce el primer número:");
        numero1 = imput.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = imput.nextInt();

        divisionResto = numero1 % numero2;
        System.out.println("El resto de la división es " + divisionResto);

        imput.close();
        
    }
}
