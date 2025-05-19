package PrimerTrimestre.Examenes.Practica3;

import java.util.Scanner;

/*
 * Crear una aplicación en Java que realice la conversión de una cantidad de euros a otra moneda, 
 * indicada por el usuario a través de un menú de opciones. El menú de opciones será mostrado al usuario 
 * hasta que introduzca un 0 para salir. Si introduce un número diferente a las opciones disponibles en el menú, 
 * saldrá el mensaje "Opción incorrecta. Vuelva a intentarlo de nuevo."
 * 
 * 1 - Convertir euros a dólares
 * 2 - Convertir euros a libras
 * 3 - Convertir euros a yenes
 * 4 - Convertir euros a todas las monedas
 * 0 - Salir
 * 
 * Habrá un main donde aparecerá ese menú de opciones, se obtendrá la cantidad en euros y recogerá la moneda a 
 * convertir dependiendo de la opción indicada por el usuario. Posteriormente llamará a una función que realizará 
 * la conversión, obteniendo el resultado de la conversión de todas las monedas. Posteriormente desde el main 
 * mostrará únicamente por pantalla la opción seleccionada.
 * 
 * El siguiente resultado se mostrará en el caso de introducir la opción 1: 5 euros = 0.98 dólares
 * 
 * La función se llamará "convertirEurosAMonedas" que recibirá como parámetro la cantidad de euros, 
 * y devolverá el resultado de todas las conversiones de la moneda. 
 * 
 * Cambios de moneda (utilizar constantes)
 * 1 euro = 0.98 dólares 
 * 1 euro = 0.87 libras 
 * 1 euro = 144.73 yenes
 */

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
