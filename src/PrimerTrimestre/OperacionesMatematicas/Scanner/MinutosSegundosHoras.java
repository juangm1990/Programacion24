package PrimerTrimestre.OperacionesMatematicas.Scanner;

import java.util.Scanner;

public class MinutosSegundosHoras {
    
    public static void main(String[] args) throws Exception {

        Scanner imput = new Scanner(System.in);

        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int totalSegundos = 0;

        System.out.println("Introduce las horas:");
        horas = imput.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = imput.nextInt();
        System.out.println("Introduce los segundos:");
        segundos = imput.nextInt();

        totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("El total en segundos es = " + totalSegundos);

        imput.close();
        
    }
}
