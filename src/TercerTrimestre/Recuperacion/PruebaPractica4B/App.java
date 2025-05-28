package TercerTrimestre.Recuperacion.PruebaPractica4B;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int asientos[][] = new int[5][10];

        do {

            System.out.println("1 - Crear Matriz y Mostrar sala :  ");
            System.out.println("2 - Reservar Asiento : ");
            System.out.println("3 - Cancelar Reserva : ");
            System.out.println("4 - Opción 4");
            System.out.println("5 - Buscar asiento disponible aleatorio :  ");
            System.out.println("6 - Numero de asientos ocupados : ");

            opcion = input.nextInt();

            switch (opcion) {

                case 1:

                    int contandor = 1;

                    for (int i = 0; i < 5; i++) {

                        for (int j = 0; j < 10; j++) {
                            asientos[0][0] = 1; // asiento ocupado
                            asientos[2][5] = 2; // asiento reservado
                            asientos[4][9] = 1; // otro ocupado

                            if (asientos[i][j] == 0) {
                                System.out.print(". ");

                            } else if (asientos[i][j] == 1) {
                                System.out.print("X ");

                            } else if (asientos[i][j] == 2) {
                                System.out.print("R ");
                            }

                        }
                        System.out.println();

                    }

                    break;

                case 2:
                    System.out.println("Introduce la Fila ");
                    int fila = sc.nextInt();

                    System.out.println("Introduce la columna");
                    int columna = sc.nextInt();

                    if (fila >= 0 && fila < 5 && columna >= 0 && columna < 10) {
                        if (asientos[fila][columna] == 0) {
                            asientos[fila][columna] = 2;
                            System.out.println("Reserva realizada con exito ");

                        }

                    }

                    break;

                case 3:

                    System.out.println("Introduce la Fila ");
                    int fila1 = sc.nextInt();

                    System.out.println("Introduce la columna");
                    int columna1 = sc.nextInt();

                    if (fila1 >= 0 && fila1 < 5 && columna1 >= 0 && columna1 < 10) {
                        if (asientos[fila1][columna1] == 2) {
                            asientos[fila1][columna1] = 0;
                            System.out.println("Reserva cancelada con exito ");
                        } else if (asientos[fila1][columna1] == 1) {
                            System.out.println("ERROR: No se puede cancelar un asiento ocupado.");
                        } else {
                            System.out.println("Ese asiento ya está disponible.");
                        }
                    } else {
                        System.out.println("ERROR: Fila o columna fuera de rango.");

                    }

                    break;

                case 4:

                    break;

                case 5:
                    ArrayList<int[]> disponibles = new ArrayList<>();

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (asientos[i][j] == 0) {
                                disponibles.add(new int[] { i, j });
                            }
                        }
                    }

                    if (disponibles.size() > 0) {
                        Random rand = new Random();
                        int[] asiento = disponibles.get(rand.nextInt(disponibles.size()));
                        System.out
                                .println("Asiento disponible sugerido: Fila " + asiento[0] + ", Columna " + asiento[1]);
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }

                    break;

                case 6:
                    int ocupados = 0;

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (asientos[i][j] == 1) {
                                ocupados++;
                            }
                        }
                    }

                    System.out.println("Número total de asientos ocupados: " + ocupados);

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
