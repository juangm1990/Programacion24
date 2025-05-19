package SegundoTrimestre.Examenes.BolaExtra_Objetos1;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList<Videojuego> catalogo = new ArrayList<Videojuego>();

        int menu = 0;

        do {
            System.out.println("1. Agregar videojuego al catálogo");
            System.out.println("2. Mostrar el catálogo de videojuegos");
            System.out.println("3. Conectar jugadores en juegos multijugador");
            System.out.println("4. Cambiar formato de un videojuego");
            System.out.println("5. Media del precio de todos los juegos físicos");
            System.out.println("6. Media del precio de todos los juegos digitales");
            System.out.println("7. Media del precio total de todos los juegos");
            System.out.println("8. Salir");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Pulsa 1 si el juego es físico");
                    System.out.println("Pulsa 2 si el juego es digital");
                    int fisodig = input.nextInt();
                    input.nextLine();
                    if (fisodig == 1) {
                        System.out.println("Introduce el id:");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Introduce el título:");
                        String titulo = input.nextLine();
                        System.out.println("Introduce el precio:");
                        double precio = input.nextDouble();
                        input.nextLine();
                        System.out.println("Introduce el genero:");
                        String genero = input.nextLine();
                        System.out.println("Introduce los gastos de envio:");
                        double gastosEnvio = input.nextDouble();
                        input.nextLine();
                        JuegoFisico j = new JuegoFisico(id, titulo, precio, genero, gastosEnvio);
                        catalogo.add(j);
                        System.out.println("Juego añadido correctamente");
                    } else if (fisodig == 2) {
                        System.out.println("Pulsa 1 si el juego es multijugador");
                        System.out.println("Pulsa 2 si el juego NO es multijugador");
                        int multi = input.nextInt();
                        input.nextLine();
                        System.out.println("Introduce el id:");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Introduce el título:");
                        String titulo = input.nextLine();
                        System.out.println("Introduce el precio:");
                        double precio = input.nextDouble();
                        input.nextLine();
                        System.out.println("Introduce el genero:");
                        String genero = input.nextLine();
                        System.out.println("Introduce el tamaño en GB:");
                        double tamano = input.nextDouble();
                        input.nextLine();
                        System.out.println("Introduce la plataforma:");
                        String plataforma = input.nextLine();
                        if (multi == 1) {
                            JuegoMultijugador j3 = new JuegoMultijugador(id, titulo, precio, genero, tamano, plataforma);
                            catalogo.add(j3);
                        } else {
                            JuegoDigital j2 = new JuegoDigital(id, titulo, precio, genero, tamano, plataforma);
                            catalogo.add(j2);
                        }
                        System.out.println("Juego añadido correctamente");
                    }
                    break;
                case 2:
                    for (int i = 0; i < catalogo.size(); i++) {
                        Videojuego j = catalogo.get(i);
                        System.out.println(catalogo.get(i));
                        System.out.print("Precio final: ");
                        System.out.println(j.calcularPrecioFinal());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Introduce el id del videojuego:");
                    int id2 = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < catalogo.size(); i++) {
                        if (id2 == catalogo.get(i).getId()) {
                            if (catalogo.get(i) instanceof JuegoMultijugador) {
                                System.out.println("Cuantos jugadores tiene el juego:");
                                int jugadores = input.nextInt();
                                input.nextLine();
                                ((JuegoMultijugador) catalogo.get(i)).conectarJugadores(jugadores);
                            } else {
                                System.out.println("Error, el juego no es multijugador.");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce el id del videojuego");
                    int id3 = input.nextInt();
                    input.nextLine();
                    System.out.println("Pulsa 1 para cambiar de fisico a digital");
                    System.out.println("Pulsa 2 para cambiar de digital a fisico");
                    int cambio = input.nextInt();
                    input.nextLine();
                    if (cambio == 1) {
                        for (int i = 0; i < catalogo.size(); i++) {
                            if (id3 == catalogo.get(i).getId()) {
                                if (catalogo.get(i) instanceof JuegoFisico) {
                                    System.out.println("Introduce el tamaño en GB del juego");
                                    double gb = input.nextDouble();
                                    input.nextLine();
                                    System.out.println("Introduce la plataforma del videojuego");
                                    String plat = input.nextLine();
                                    JuegoDigital juegoNuevo = new JuegoDigital(catalogo.get(i).getId(),
                                            catalogo.get(i).getTitulo(), catalogo.get(i).getPrecio(),
                                            catalogo.get(i).getGenero(), gb, plat);
                                    catalogo.add(juegoNuevo);
                                    catalogo.remove(i);
                                } else {
                                    System.out.println("Error, el juego no es fisico");
                                }
                            }
                        }
                    } else if (cambio == 2) {
                        for (int i = 0; i < catalogo.size(); i++) {
                            if (id3 == catalogo.get(i).getId()) {
                                if (catalogo.get(i) instanceof JuegoDigital) {
                                    System.out.println("Introduce los gastos de envio");
                                    double gastos = input.nextDouble();
                                    input.nextLine();
                                    JuegoFisico juegoNuevo2 = new JuegoFisico(catalogo.get(i).getId(),
                                            catalogo.get(i).getTitulo(), catalogo.get(i).getPrecio(),
                                            catalogo.get(i).getGenero(), gastos);
                                    catalogo.add(juegoNuevo2);
                                    catalogo.remove(i);
                                } else {
                                    System.out.println("Error, el juego no es digital");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    double sumaFisicos = 0;
                    int totalFisicos = 0;
                    for (int i = 0; i < catalogo.size(); i++) {
                        if (catalogo.get(i) instanceof JuegoFisico) {
                            sumaFisicos += catalogo.get(i).calcularPrecioFinal();
                            totalFisicos++;
                        }
                    }
                    if (totalFisicos > 0) {
                        System.out.println("Media de juegos físicos: " + (sumaFisicos / totalFisicos));
                    } else {
                        System.out.println("No hay juegos físicos en el catálogo.");
                    }
                    break;
                case 6:
                    double sumaDigitales = 0;
                    int totalDigitales = 0;
                    for (int i = 0; i < catalogo.size(); i++) {
                        if (catalogo.get(i) instanceof JuegoDigital) {
                            sumaDigitales += catalogo.get(i).calcularPrecioFinal();
                            totalDigitales++;
                        }
                    }
                    if (totalDigitales > 0) {
                        System.out.println("Media de juegos digitales: " + (sumaDigitales / totalDigitales));
                    } else {
                        System.out.println("No hay juegos digitales en el catálogo.");
                    }
                    break;
                case 7:
                    double sumaTotal = 0;
                    int total = catalogo.size();
                    for (int i = 0; i < catalogo.size(); i++) {
                        sumaTotal += catalogo.get(i).calcularPrecioFinal();
                    }
                    if (total > 0) {
                        System.out.println("Media de todos los juegos: " + (sumaTotal / total));
                    } else {
                        System.out.println("No hay juegos en el catálogo.");
                    }
                    break;
                case 8:
                    System.out.println("¡Hasta luego! Gracias.");
                    break;
                default:
                    System.out.println("Opción incorrecta. Introduce otra.");
                    break;
            }
        } while (menu != 8);
        input.close();
    }
}
