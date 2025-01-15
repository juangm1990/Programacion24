package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class CambioSigno {
    
    public static void main(String[] args) throws Exception{
        
        Scanner imput = new Scanner(System.in);

        int numero1 = 0;
        int cambioSigno = 0;

        System.out.println("Introduce un número");
        numero1 = imput.nextInt();

        cambioSigno = numero1 * (-1);
        System.out.println("El número cambiado de signo es = " + cambioSigno);

        imput.close();
    }
}
