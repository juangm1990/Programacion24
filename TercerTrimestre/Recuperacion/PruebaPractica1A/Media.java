package TercerTrimestre.Recuperacion.PruebaPractica1A;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int media = 0;

        System.out.println("Introduzca el primer número");
        numero1 = input.nextInt();
        System.out.println("Introduzca el segundo número");
        numero2 = input.nextInt();
        System.out.println("Introduzca el tercer número");
        numero3 = input.nextInt();

        System.out.println("El resultado es:");
        media = (numero1 + numero2 + numero3) / 3;
        System.out.println(media);
        
    }
}
