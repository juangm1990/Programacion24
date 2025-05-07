package TercerTrimestre.Recuperacion.PruebaPractica1A;

import java.util.Scanner;

public class Dados {
    
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduzca el número");
        numero = input.nextInt();

        if (numero == 1) {
            System.out.println("Seis");
        } else if (numero == 2) {
            System.out.println("Cinco");
        } else if (numero == 3) {
            System.out.println("Cuatro");
        } else if (numero == 4) {
            System.out.println("Tres");
        } else if (numero == 5) {
            System.out.println("Dos");
        } else if (numero == 6) {
            System.out.println("Uno");
        } else {
            System.out.println("Número incorrecto");
        }

        input.close();
        
    }
}
