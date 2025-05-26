package PrimerTrimestre.Array;

import java.util.Scanner;

public class ClienteEdad {
    
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce edad");
        int edad = input.nextInt();

        if (edad < 4 ) {
            System.out.println("Gratis");
        } else if (edad <= 18){
            System.out.println("5 euros");
        } else {
            System.out.println("10 euros");
        }     
        
        input.close();
    }
}
