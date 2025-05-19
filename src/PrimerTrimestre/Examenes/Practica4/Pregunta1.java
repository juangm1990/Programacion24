package PrimerTrimestre.Examenes.Practica4;


import java.util.Scanner;

public class Pregunta1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int opcion;
        int fila;
        int columna;
        
        int[][] cine = {{0, 0, 0, 0, 0, 0},
                        {0, 2, 2, 0, 0, 0},
                        {2, 0, 0, 0, 2, 0},
                        {1, 1, 1, 1, 1, 1,}};

        System.out.println("Bienvenido al cine");

        do {

            System.out.println("1 - Mostrar la sala");
            System.out.println("2 - Reservar asiento");
            System.out.println("3 - Cancelar asiento");
            System.out.println("4 - Buscar asiento disponible aleatorio");
            System.out.println("5 - Contar asientos ocupados");
            System.out.println("0 - Terminar");
            System.out.print("Elige una opción (Pulsa el botón que corresponda): ");
            opcion = input.nextInt();

            switch (opcion) {

                case 0:

                    System.out.println("Gracias por usar el programa");
                    break;

                case 1:

                    for (int i = 0; i < mostrarSala(cine).length; i++) {
                        for (int j = 0; j < mostrarSala(cine)[i].length; j++) {
                            System.out.print(mostrarSala(cine)[i][j] + " ");
                        }

                        System.out.println();
                    }

                    System.out.print("Introduzca un número para continuar: ");
                    input.nextInt();
                        
                    break;
                
                case 2:

                    do {

                        System.out.println("Ingrese la fila: ");
                        fila = input.nextInt();
                        System.out.println("Ingrese la columna: ");
                        columna = input.nextInt();

                        if (fila > cine.length || columna > cine[0].length) {
                            System.out.println("Asiento no encontrado, pruebe otro");
                        }

                    } while (fila > cine.length || columna > cine[0].length);

                    if (cine[fila][columna] == 0) {
                        cine[fila][columna] = 2;
                        System.out.println("Asiento reservado");
                    } else {
                        System.out.println("El asiento no está disponible, no se puede reservar");
                    }

                    System.out.print("Introduzca un número para continuar: ");
                    input.nextInt();

                    break;
                
                case 3:

                    do {

                        System.out.println("Ingrese la fila: ");
                        fila = input.nextInt();
                        System.out.println("Ingrese la columna: ");
                        columna = input.nextInt();

                        if (fila > cine.length || columna > cine[0].length) {
                            System.out.println("Asiento no encontrado, pruebe otro");
                        }

                    } while (fila > cine.length || columna > cine[0].length);

                    if (cine[fila][columna] == 2) {
                        cine[fila][columna] = 0;
                    } else {
                        System.out.println("Este asiento no está reservado, no se puede cancelar");
                    }

                    System.out.print("Introduzca un número para continuar: ");
                    input.nextInt();

                    break;

                case 4:

                int[] buscar = {0, 0};

                    do {
                        buscar[0] = (int)Math.floor(Math.random() * cine.length);
                        buscar[1] = (int)Math.floor(Math.random() * cine[0].length);

                        if (cine[buscar[0]][buscar[1]] == 0) {
                            System.out.println("Un asiento disponible estaría en la fila " + buscar[0] + ", columna " + buscar[1]);
                        }

                    } while (cine[buscar[0]][buscar[1]] != 0);

                    System.out.print("Introduzca un número para continuar: ");
                    input.nextInt();
                    
                    break;

                case 5:

                    int contador = 0;

                    for (int i = 0; i < cine.length; i++) {
                        for (int j = 0; j < cine[i].length; j++) {
                            if (cine[i][j] == 1) {
                                contador++;
                            }
                        }
                    }

                    System.out.println("Hay " + contador + " asientos ocupados");

                    System.out.print("Introduzca un número para continuar: ");
                    input.nextInt();

                    break;

                default:
                    System.out.println("El número es incorrecto, pruebe otra vez");
                    System.out.println("Introduzca un número para continuar: ");
                    input.nextInt();
                    break;
            }

        } while (opcion != 0);
        
        input.close();
    }

    public static String[][] mostrarSala(int[][] matriz) {

        String[][] cambioMatriz = new String[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    cambioMatriz[i][j] = ".";
                } else if (matriz[i][j] == 1) {
                    cambioMatriz[i][j] = "X";
                }else {
                    cambioMatriz[i][j] = "R";
                }
            }
        }

        return cambioMatriz;
    }
    
}
