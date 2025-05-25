package TercerTrimestre.Recuperacion.PruebaPractica3B.Pregunta3;

import java.util.Scanner;

public class ConversorMonedas {

     public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        double euros;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1| Convertir euros a dólares");
            System.out.println("2| Convertir euros a libras");
            System.out.println("3| Convertir euros a yenes");
            System.out.println("4| Convertir euros a todas las monedas");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + (euros * 0.98) + " dólares");
                    break;

                case 2:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + (euros * 0.87) + " libras");
                    break;

                case 3:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + (euros * 144.73) + " yenes");
                    break;

                case 4:
                    System.out.print("Introduce la cantidad de euros: ");
                    euros = input.nextDouble();
                    System.out.println(euros + " euros = " + (euros * 0.98) + " dólares");
                    System.out.println(euros + " euros = " + (euros * 0.87) + " libras");
                    System.out.println(euros + " euros = " + (euros * 144.73) + " yenes");
                    break;

                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");
                    break;

                default:
                    System.out.println("Ha ocurrido un error en el programa.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
