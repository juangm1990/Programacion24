package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class MedAritmetica {
    
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double media = 0;

        System.out.println("Introduce el primer número:");
        numero1 = input.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = input.nextInt();
        System.out.println("Introduce el tercer número:");
        numero3 = input.nextInt();


        media = (numero1 + numero2 + numero3) / 3.0;
        System.out.println(media);

        input.close();
        
    }
}
