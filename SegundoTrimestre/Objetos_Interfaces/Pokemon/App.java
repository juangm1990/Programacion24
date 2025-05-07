package SegundoTrimestre.Objetos_Interfaces.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pokemon> listaPokemons = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ POKÉMON ---");
            System.out.println("1. Añadir Pokémon");
            System.out.println("2. Mostrar Pokémon");
            System.out.println("3. Atacar");
            System.out.println("4. Defender");
            System.out.println("5. Curar (solo Bulbasur)");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué Pokémon quieres añadir?");
                    System.out.println("1. Bulbasur  2. Charmander  3. Squirtel");
                    int tipo = input.nextInt();
                    input.nextLine();

                    System.out.print("Nombre del Pokémon: ");
                    String nombre = input.nextLine();

                    if (tipo == 1) {
                        listaPokemons.add(new Bulbasur(nombre));
                    } else if (tipo == 2) {
                        listaPokemons.add(new Charmander(nombre));
                    } else if (tipo == 3) {
                        listaPokemons.add(new Squirtel(nombre));
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    if (listaPokemons.size() == 0) {
                        System.out.println("No hay Pokémon en la lista.");
                    } else {
                        for (int i = 0; i < listaPokemons.size(); i++) {
                            System.out.println((i + 1) + ". " + listaPokemons.get(i));
                        }
                    }
                    break;

                case 3:
                    if (listaPokemons.size() < 2) {
                        System.out.println("Necesitas al menos 2 Pokémon para atacar.");
                    } else {
                        System.out.println("Lista de Pokémon:");
                        for (int i = 0; i < listaPokemons.size(); i++) {
                            System.out.println((i + 1) + ". " + listaPokemons.get(i).getNombre());
                        }

                        System.out.print("Elige el número del que ataca: ");
                        int atacante = input.nextInt() - 1;
                        input.nextLine();

                        System.out.print("Elige el número del que recibe el ataque: ");
                        int defensor = input.nextInt() - 1;
                        input.nextLine();

                        if (atacante >= 0 && atacante < listaPokemons.size() &&
                            defensor >= 0 && defensor < listaPokemons.size() &&
                            atacante != defensor) {
                            listaPokemons.get(atacante).atacar(listaPokemons.get(defensor));
                            System.out.println("¡Ataque realizado!");
                        } else {
                            System.out.println("Elección inválida.");
                        }
                    }
                    break;

                case 4:
                    if (listaPokemons.size() == 0) {
                        System.out.println("No hay Pokémon para defender.");
                    } else {
                        for (int i = 0; i < listaPokemons.size(); i++) {
                            System.out.println((i + 1) + ". " + listaPokemons.get(i).getNombre());
                        }

                        System.out.print("Elige el número del Pokémon que se pondrá en defensa: ");
                        int defIndex = input.nextInt() - 1;
                        input.nextLine();

                        if (defIndex >= 0 && defIndex < listaPokemons.size()) {
                            listaPokemons.get(defIndex).defender(true);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 5:
                    if (listaPokemons.size() == 0) {
                        System.out.println("No hay Pokémon en la lista.");
                    } else {
                        for (int i = 0; i < listaPokemons.size(); i++) {
                            System.out.println((i + 1) + ". " + listaPokemons.get(i).getNombre());
                        }

                        System.out.print("Elige el número del Pokémon que quieres curar: ");
                        int curarIndex = input.nextInt() - 1;
                        input.nextLine();

                        if (curarIndex >= 0 && curarIndex < listaPokemons.size()) {
                            Pokemon p = listaPokemons.get(curarIndex);
                            if (p instanceof Bulbasur) {
                                ((Bulbasur) p).curar();
                            } else {
                                System.out.println("Este Pokémon no puede curarse.");
                            }
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("¡Adiós, entrenador Pokémon!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 6);

        input.close();
    }
}
