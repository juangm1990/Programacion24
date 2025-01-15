package PrimerTrimestre.Temario.Tema1_Operaciones.Scanner;

import java.util.Scanner;

public class GradosTemperatura {
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);

        double centigrados = 0;
        double fahrenheit = 0;

        System.out.println("Introduce los grados centigrados");
        centigrados = imput.nextInt();

        fahrenheit = 32+((9*centigrados)/5.0);
        System.out.println(centigrados + " grados centígrados son " + fahrenheit+" grados Fahrenheit");

        imput.close();
        
    }
}
