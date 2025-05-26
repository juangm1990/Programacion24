package PrimerTrimestre.Array;

import java.util.Scanner;

public class RecorrerEdad {
    
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = input.nextInt();

        System.out.println("Has vivido estos años:");
        for (int i = 1; i <= edad; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
