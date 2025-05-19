package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class Hipotenusa {
    
    public static void main(String[] args) throws Exception{

        Scanner imput = new Scanner(System.in);

        double cateto1 = 0;
        double cateto2 = 0;
        double hipotenusa = 0;

        System.out.println("Introduce el primer cateto;");
        cateto1 = imput.nextInt();
        System.out.println("Introduce el segundo cateto:");
        cateto2 = imput.nextInt();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La hipotenusa de los dos catetos es = " + hipotenusa);

        imput.close();
        
    }
}
