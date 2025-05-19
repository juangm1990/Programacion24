package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class TablaMultiplicar {
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce el número de la tabla de multiplicar:");
        numero = imput.nextInt();
        System.out.println("Tabla de multiplicar:");

        for (int i = 0; i <=10 ; i++){
            System.out.println(i * numero);
        }
        
        imput.close();
    }
}
