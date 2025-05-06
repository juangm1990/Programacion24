package SegundoTrimestre.Objetos_Interfaces.Futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ JUGADORES ---");
            System.out.println("1. Añadir jugador");
            System.out.println("2. Mostrar jugadores");
            System.out.println("3. Entrenar jugadores");
            System.out.println("4. Acción especial de jugadores");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1. Portero  2. Delantero");
                    int tipo = input.nextInt();
                    input.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();

                    System.out.print("Número de camiseta: ");
                    int numero = input.nextInt();
                    input.nextLine();

                    String posicion = (tipo == 1) ? "Portero" : "Delantero";

                    if (tipo == 1) {
                        jugadores.add(new Portero(nombre, numero, posicion));
                    } else if (tipo == 2) {
                        jugadores.add(new Delantero(nombre, numero, posicion));
                    } else {
                        System.out.println("Tipo incorrecto.");
                    }
                    break;

                case 2:
                    if (jugadores.size() == 0) {
                        System.out.println("No hay jugadores en la lista.");
                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println(jugadores.get(i));
                        }
                    }
                    break;

                case 3:
                    if (jugadores.size() == 0) {
                        System.out.println("No hay jugadores para entrenar.");
                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            Jugador j = jugadores.get(i);
                            if (j instanceof Entrenable) {
                                ((Entrenable) j).entrenar();
                            }
                        }
                    }
                    break;

                case 4:
                    if (jugadores.size() == 0) {
                        System.out.println("No hay jugadores para usar acción especial.");
                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            jugadores.get(i).accionEspecial();
                        }
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego, entrenador!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);

        input.close();
    }
}
