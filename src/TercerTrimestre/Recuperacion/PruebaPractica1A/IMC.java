package TercerTrimestre.Recuperacion.PruebaPractica1A;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) throws Exception{
        
        double peso = 0;
        double altura = 0;
        double imc = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el peso en Kg");
        peso = input.nextDouble();

        System.out.println("Introduzca la altura");
        altura = input.nextDouble();

        
        imc = peso/ (altura * altura);
        System.out.println("El índice de masa corporal (IMC) es: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normopeso");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso grado I");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Sobrepeso grado II");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidad tipo I");
        } else if (imc >= 40 && imc <= 44.9) {
            System.out.println("Obesidad tipo II");
        } else if (imc >= 45 && imc <= 49.9) {
            System.out.println("Obesidad tipo III (Mórbida)");
        } else {
            System.out.println("Obesidad tipo IV (Extrema)");
        }
        
    }
}