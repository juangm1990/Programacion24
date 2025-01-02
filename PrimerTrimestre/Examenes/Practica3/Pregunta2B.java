package PrimerTrimestre.Examenes.Practica3;

public class Pregunta2B {
    
    /*
     * Crea un programa que dibuje por consola las tablas de multiplicar del siguiente array:
     * [4, 5, 10, 2, 3]
     */

    public static void main(String[] args) throws Exception {

        int[] numeros = { 4, 5, 10, 2, 3 };

        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero);

            for (int i = 1; i <= 10; i++) {

                System.out.println(numero + " x " + i + " = " + (numero * i));

            }

            System.out.println("-------------------");
        }
    }
}
