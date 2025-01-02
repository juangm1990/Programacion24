package PrimerTrimestre.Examenes.Practica3;

public class Pregunta2B {
    
    public static void main(String[] args) throws Exception {

        /*
         * Tabla multiplicar del 4
         */

        int[] numeros = { 1, 2, 3, 4 };

        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero);

            for (int i = 1; i <= 10; i++) {

                System.out.println(numero + " x " + i + " = " + (numero * i));

            }

            System.out.println("-------------------");
        }
    }
}
