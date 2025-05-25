package TercerTrimestre.Recuperacion.PruebaPractica3B.Pregunta3;

import java.util.Scanner;

public class ConversorMonedasFuncion {

    // Constantes de conversión
    public static final double DOLAR = 0.98;
    public static final double LIBRA = 0.87;
    public static final double YEN = 144.73;

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        double euros;

        do {
            // Menú bonito personalizado (tu estilo)
            System.out.println("0| Salir del programa");
            System.out.println("1| Convertir euros a dólares");
            System.out.println("2| Convertir euros a libras");
            System.out.println("3| Convertir euros a yenes");
            System.out.println("4| Convertir euros a todas las monedas");
            System.out.println("-----------------------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("-----------------------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + convertirEurosADolares(euros) + " dólares");
                    break;

                case 2:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + convertirEurosALibras(euros) + " libras");
                    break;

                case 3:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + convertirEurosAYenes(euros) + " yenes");
                    break;

                case 4:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + convertirEurosADolares(euros) + " dólares");
                    System.out.println(euros + " euros = " + convertirEurosALibras(euros) + " libras");
                    System.out.println(euros + " euros = " + convertirEurosAYenes(euros) + " yenes");
                    break;

                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");
                    break;

                default:
                    System.out.println("Ha ocurrido un error. Opción incorrecta.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }

    // Funciones para cada conversión
    public static double convertirEurosADolares(double euros) {
        return euros * DOLAR;
    }

    public static double convertirEurosALibras(double euros) {
        return euros * LIBRA;
    }

    public static double convertirEurosAYenes(double euros) {
        return euros * YEN;
    }
}
