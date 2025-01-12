package PrimerTrimestre.Temario.Tema1.Scanner;

import java.util.Scanner;

public class NumeroPar {
    
    public static void main(String[] args) throws Exception {

        Scanner imput = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce el número:");
        numero = imput.nextInt();

        if (numero % 2 != 0) {
            System.out.println("El número " + numero + " es impar");
            
        } else {
            System.out.println("El número " + numero + " no es impar");
        }

        imput.close();
        
    }
}
