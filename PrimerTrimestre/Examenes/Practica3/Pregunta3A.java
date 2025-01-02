package PrimerTrimestre.Examenes.Practica3;

import java.util.Scanner;

public class Pregunta3A {

    // Constantes de conversión
    public static final double EURO_A_DOLAR = 0.98;
    public static final double EURO_A_LIBRA = 0.87;
    public static final double EURO_A_YEN = 144.73;

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int opcion;
        double euros;
        do {
            // Menú de opciones
            System.out.println("Elige una opción:");
            System.out.println("1 - Convertir euros a dólares");
            System.out.println("2 - Convertir euros a libras");
            System.out.println("3 - Convertir euros a yenes");
            System.out.println("4 - Convertir euros a todas las monedas");
            System.out.println("0 - Salir");
            opcion = input.nextInt();
            // Salir si la opción es 0
            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }
            // Introducir la cantidad de euros
            System.out.print("Introduce la cantidad de euros: ");
            euros = input.nextDouble();
            switch (opcion) {
                case 1:
                    System.out.println(euros + " euros = " + convertirEurosADolares(euros) + " dólares");
                    break;
                case 2:
                    System.out.println(euros + " euros = " + convertirEurosALibras(euros) + " libras");
                    break;
                case 3:
                    System.out.println(euros + " euros = " + convertirEurosAYenes(euros) + " yenes");
                    break;
                case 4:
                    System.out.println(euros + " euros = " + convertirEurosADolares(euros) + " dólares");
                    System.out.println(euros + " euros = " + convertirEurosALibras(euros) + " libras");
                    System.out.println(euros + " euros = " + convertirEurosAYenes(euros) + " yenes");
                    break;
                default:
                    System.out.println("Opción incorrecta. Vuelve a intentarlo.");
            }
        } while (opcion != 0);
        input.close();
    }

    // Funciones para las conversiones
    public static double convertirEurosADolares(double euros) {
        return euros * EURO_A_DOLAR;
    }

    public static double convertirEurosALibras(double euros) {
        return euros * EURO_A_LIBRA;
    }

    public static double convertirEurosAYenes(double euros) {
        return euros * EURO_A_YEN;
    }
}
