import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1| Opción 1");
            System.out.println("2| Opción 2");
            System.out.println("3| Opción 3");
            System.out.println("4| Opción 4");
            System.out.println("5| Opción 5");
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
