package PrimerTrimestre.Examenes.Practica1;

import java.util.Scanner;

public class Pregunta2 {
    
    /*
     * Realizar un programa en PHP que calcule el índice Masa Muscular = peso/(altura^2) y saque por pantalla 
     * el estado en el que se encuentra la persona. (El peso deberá ir en Kg y la altura en metros):
     * 
     * IMC menor a 18,5: Bajo peso
     * IMC entre 18,5 y 24,9: Normopeso
     * IMC entre 25 y 26,9: Sobrepeso grado I
     * IMC entre 27 y 29,9: Sobrepeso grado II
     * IMC entre 30 y 34,9: Obesidad de tipo I
     * IMC entre 35 y 39,9: Obesidad de tipo II
     * IMC entre 40 y 49,9: Obesidad de tipo III (mórbida)
     * IMC mayor a 50: Obesidad de tipo IV (extrema)
     */
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double kg = 0;
        double metros = 0.0;
        double indiceMasaCorporal = 0;
        String situacion = "";


        System.out.println("Introduce la altura en metros");
        metros=input.nextDouble();

        System.out.println("Introduce el peso en kilogramos");
        kg=input.nextDouble();

        indiceMasaCorporal = kg / (metros*metros);

        if(indiceMasaCorporal < 18.5) {
            situacion="bajo peso";
        } else if(indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            situacion="normopeso";
        } else if(indiceMasaCorporal >= 25 && indiceMasaCorporal < 27) {
            situacion="sobrepeso grado I";
        } else if(indiceMasaCorporal >= 27 && indiceMasaCorporal < 30) {
            situacion="sobrepeso grado II";
        } else if(indiceMasaCorporal >= 30 && indiceMasaCorporal < 35) {
            situacion="obesidad de tipo I";
        } else if(indiceMasaCorporal >= 35 && indiceMasaCorporal < 40) {
            situacion="obesidad de tipo II";
        } else if(indiceMasaCorporal >= 40 && indiceMasaCorporal < 50) {
            situacion="obesidad de tipo III (mórbida)";
        } else {
            situacion="obesidad de tipo IV (extrema)";
        }

        System.out.println("Tu IMC es de "+ indiceMasaCorporal + " y estás en una situación de " + situacion);

        input.close();
    }
}
