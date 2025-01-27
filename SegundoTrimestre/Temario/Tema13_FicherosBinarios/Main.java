package SegundoTrimestre.Temario.Tema13_FicherosBinarios;

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1| Pedir frase al usuario:");
            System.out.println("2| Pedir Clave Numérica 2:");
            System.out.println("3| Crear fichero de exto cifrado.txt:");
            System.out.println("4| Cifrar frase con ayuda de la clave y escribir la frase citada en el fichero anteriormente:");
            System.out.println("5| Selección 5:");
            System.out.println("6| Selección 6:");
            System.out.println("7| Selección 7:");
            System.out.println("8| Selección 8:");
            System.out.println("9| Selección 9:");
            System.out.println("10| Selección 10:");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 0:

                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");

                    break;

                default:

                    System.out.println("Ha ocurrido un error en el programa");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }

}
