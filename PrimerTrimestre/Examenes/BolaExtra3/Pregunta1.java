package PrimerTrimestre.Examenes.BolaExtra3;

import java.util.Random;
import java.util.Scanner;

public class Pregunta1 {
    
    /*
     * Imagina que estás desarrollando un juego de mesa simple. 
     * El tablero de juego se representa como una matriz bidimensional. 
     * Cada celda de la matriz puede contener diferentes elementos como:
     * 
     * 0: Celda vacía
     * 1: Jugador 1
     * 2: Jugador 2
     * 3: Obstáculo
     * 4: Objetivo
     * 
     * Al iniciar el juego, se debe crear una matriz bidimensional que represente el tablero de juego. 
     * El usuario deberá ingresar las dimensiones y posteriormente deberá rellenar el tablero. 
     * Habrá que comprobar que solamente habrá un jugador1, un jugador2 y un objetivo, siendo las posiciones 
     * restantes las celdas vacías y los obstáculos.
     * 
     * Se realizará un menú de opciones con las siguientes acciones a realizar:
     * 
     * Mostrar tablero: Implementa el código para mostrar el tablero de juego en la consola, representando 
     * los valores de cada celda como sigue: '0' para vacío, '1' para jugador 1, '2' para jugador 2, 
     * '3' para obstáculo, '4' para objetivo. 
     * 
     * Mover un jugador: Implementa el código para mover a un jugador a una nueva posición. 
     * El usuario debe indicar el jugador y la dirección (arriba, abajo, izquierda, derecha) 
     * y el programa deberá verificar si el movimiento es válido (es decir, si la nueva posición está dentro del tablero).
     * 
     * Detectar colisiones: Implementa el código para detectar si un jugador ha chocado con otro jugador u obstáculo. 
     * En este caso, el jugador no cambia de posición y se muestra por consola dicho mensaje.
     * 
     * Verificar si se ha alcanzado el objetivo: Implementa el código para verificar si un jugador ha llegado a la 
     * celda objetivo. En este caso el programa termina indicando que el jugador ha ganado. 
     * 
     * Generar nuevo tablero aleatorio: Implementa el código para generar un tablero de juego con una distribución 
     * aleatoria de elementos.
     * 
     * Salir: Si el usuario introduce un cero, se saldrá del juego.
     */

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        int opcion = 0;
        Random tableroAleatorio = new Random(); // Generar números aleatorios

        int[][] tablero = {
            {0, 1, 0},
            {2, 0, 3},
            {0, 0, 4}
        };

        do {
    
            System.out.println("0| Salir del programa");
            System.out.println("1| Mostrar tablero");
            System.out.println("2| Mover un jugador");
            System.out.println("3| Verificar si se ha alcanzado el objetivo");
            System.out.println("4| Generar nuevo tablero aleatorio");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();
    
            switch (opcion) {
    
                case 1:
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        // Usando if-else en lugar de switch
                        if (tablero[i][j] == 0) {
                            System.out.print("0 ");  
                        } else if (tablero[i][j] == 1) {
                            System.out.print("1 ");  
                        } else if (tablero[i][j] == 2) {
                            System.out.print("2 ");  
                        } else if (tablero[i][j] == 3) {
                            System.out.print("3 ");  
                        } else if (tablero[i][j] == 4) {
                            System.out.print("4 ");  
                        } else {
                            System.out.print("? ");  
                        }
                    }
                    System.out.println();  
                }
                break;
    
                case 2:
                // Mover un jugador
                System.out.println("¿Qué jugador quieres mover? (1 o 2):");
                int jugador = input.nextInt();
                System.out.println("¿En qué dirección quieres mover al jugador?");
                System.out.println("1: Arriba");
                System.out.println("2: Abajo");
                System.out.println("3: Izquierda");
                System.out.println("4: Derecha");
                int direccion = input.nextInt();

                // Buscar la posición del jugador
                int jugadorFila = -1, jugadorColumna = -1;
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        if ((jugador == 1 && tablero[i][j] == 1) || (jugador == 2 && tablero[i][j] == 2)) {
                            jugadorFila = i;
                            jugadorColumna = j;
                            break;
                        }
                    }
                    if (jugadorFila != -1) break;
                }

                if (jugadorFila == -1) {
                    System.out.println("El jugador no se encuentra en el tablero.");
                    break;
                }

                // Detectar colisiones y mover según la dirección
                boolean movimientoValido = false;
                if (direccion == 1 && jugadorFila > 0) { // Arriba
                    if (tablero[jugadorFila - 1][jugadorColumna] == 0) { // Celda vacía
                        tablero[jugadorFila][jugadorColumna] = 0; // Eliminar jugador de la posición actual
                        tablero[jugadorFila - 1][jugadorColumna] = jugador; // Mover jugador arriba
                        movimientoValido = true;
                    } else {
                        System.out.println("Colisión detectada: No puedes mover al jugador hacia arriba.");
                    }
                } else if (direccion == 2 && jugadorFila < tablero.length - 1) { // Abajo
                    if (tablero[jugadorFila + 1][jugadorColumna] == 0) {
                        tablero[jugadorFila][jugadorColumna] = 0;
                        tablero[jugadorFila + 1][jugadorColumna] = jugador;
                        movimientoValido = true;
                    } else {
                        System.out.println("Colisión detectada: No puedes mover al jugador hacia abajo.");
                    }
                } else if (direccion == 3 && jugadorColumna > 0) { // Izquierda
                    if (tablero[jugadorFila][jugadorColumna - 1] == 0) {
                        tablero[jugadorFila][jugadorColumna] = 0;
                        tablero[jugadorFila][jugadorColumna - 1] = jugador;
                        movimientoValido = true;
                    } else {
                        System.out.println("Colisión detectada: No puedes mover al jugador hacia la izquierda.");
                    }
                } else if (direccion == 4 && jugadorColumna < tablero[jugadorFila].length - 1) { // Derecha
                    if (tablero[jugadorFila][jugadorColumna + 1] == 0) {
                        tablero[jugadorFila][jugadorColumna] = 0;
                        tablero[jugadorFila][jugadorColumna + 1] = jugador;
                        movimientoValido = true;
                    } else {
                        System.out.println("Colisión detectada: No puedes mover al jugador hacia la derecha.");
                    }
                }

                if (movimientoValido) {
                    System.out.println("Movimiento realizado.");
                }
                break;
    
                case 3:
                // Verificar si se ha alcanzado el objetivo
                int jugadorGanador = -1;
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        // Verificamos si el jugador está en la posición del objetivo (valor 4)
                        if ((tablero[i][j] == 1 && tablero[i][j] == 4) || (tablero[i][j] == 2 && tablero[i][j] == 4)) {
                            jugadorGanador = tablero[i][j];
                            break;
                        }
                    }
                    if (jugadorGanador != -1) break;
                }

                if (jugadorGanador != -1) {
                    System.out.println("¡El jugador " + jugadorGanador + " ha ganado! Ha alcanzado el objetivo.");
                    break; // Salir del juego si se encuentra al ganador
                } else {
                    System.out.println("Aún no se ha alcanzado el objetivo.");
                }
                break;
    
                case 4:
                // Inicializar el tablero con celdas vacías (0)
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        tablero[i][j] = 0;  // Por defecto 0
                    }
                }

                // Colocar Jugador 1
                int fila1 = tableroAleatorio.nextInt(3);
                int columna1 = tableroAleatorio.nextInt(3);
                tablero[fila1][columna1] = 1;

                // Colocar Jugador 2
                int fila2, columna2;
                do {
                    fila2 = tableroAleatorio.nextInt(3);
                    columna2 = tableroAleatorio.nextInt(3);
                } while (tablero[fila2][columna2] != 0); // Asegurarse de que esté vacío
                tablero[fila2][columna2] = 2;

                // Colocar Obstáculo
                int fila3, columna3;
                do {
                    fila3 = tableroAleatorio.nextInt(3);
                    columna3 = tableroAleatorio.nextInt(3);
                } while (tablero[fila3][columna3] != 0); // Asegurarse de que esté vacío
                tablero[fila3][columna3] = 3;

                // Colocar Objetivo
                int fila4, columna4;
                do {
                    fila4 = tableroAleatorio.nextInt(3);
                    columna4 = tableroAleatorio.nextInt(3);
                } while (tablero[fila4][columna4] != 0); // Asegurarse de que esté vacío
                tablero[fila4][columna4] = 4;

                System.out.println("Tablero generado aleatoriamente.");
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
