package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSplit {
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
                    System.out.println("Introduce los datos en el formato id#titulo#precio#genero#tipo (Fisico/Digital/Multijugador)");
                    String linea = input.nextLine();
                    String[] datos = linea.split("#");

                    if (datos.length == 5) {
                        int id = Integer.parseInt(datos[0]);
                        String titulo = datos[1];
                        double precio = Double.parseDouble(datos[2]);
                        String genero = datos[3];
                        String tipo = datos[4];
                        Videojuego videojuego = null;

                        if (tipo.equalsIgnoreCase("Fisico")) {
                            System.out.println("Introduce los gastos de envio:");
                            double gastos = input.nextDouble();
                            input.nextLine();
                            videojuego = new JuegoFisico(id, titulo, precio, genero, gastos);
                        } else if (tipo.equalsIgnoreCase("Digital")) {
                            System.out.println("Introduce el tamaño en GB:");
                            double tamano = input.nextDouble();
                            input.nextLine();
                            System.out.println("Introduce la plataforma:");
                            String plataforma = input.nextLine();
                            videojuego = new JuegoDigital(id, titulo, precio, genero, tamano, plataforma);
                        } else if (tipo.equalsIgnoreCase("Multijugador")) {
                            System.out.println("Introduce el tamaño en GB:");
                            double tamano = input.nextDouble();
                            input.nextLine();
                            System.out.println("Introduce la plataforma:");
                            String plataforma = input.nextLine();
                            videojuego = new JuegoMultijugador(id, titulo, precio, genero, tamano, plataforma);
                        }

                        if (videojuego != null) {
                            catalogo.add(videojuego);
                            System.out.println("Juego añadido correctamente");
                        } else {
                            System.out.println("Tipo de juego no reconocido.");
                        }
                    } else {
                        System.out.println("Formato incorrecto. Debe ser id#titulo#precio#genero#tipo");
                    }
                    break;

                case 2:
                    for (int i = 0; i < catalogo.size(); i++) {
                        Videojuego j = catalogo.get(i);
                        System.out.println(j);
                        System.out.println("Precio final: " + j.calcularPrecioFinal());
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Introduce el id del videojuego:");
                    int id = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < catalogo.size(); i++) {
                        if (id == catalogo.get(i).getId()) {
                            if (catalogo.get(i) instanceof JuegoMultijugador) {
                                System.out.println("Introduce el número de jugadores:");
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
                    int id2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Pulsa 1 para cambiar de fisico a digital");
                    System.out.println("Pulsa 2 para cambiar de digital a fisico");
                    int cambio = input.nextInt();
                    input.nextLine();

                    if (cambio == 1) {
                        for (int i = 0; i < catalogo.size(); i++) {
                            if (id2 == catalogo.get(i).getId()) {
                                if (catalogo.get(i) instanceof JuegoFisico) {
                                    System.out.println("Introduce el tamaño en GB del juego");
                                    double gb = input.nextDouble();
                                    input.nextLine();
                                    System.out.println("Introduce la plataforma del videojuego");
                                    String plat = input.nextLine();
                                    JuegoDigital nuevo = new JuegoDigital(catalogo.get(i).getId(), catalogo.get(i).getTitulo(), catalogo.get(i).getPrecio(), catalogo.get(i).getGenero(), gb, plat);
                                    catalogo.add(nuevo);
                                    catalogo.remove(i);
                                } else {
                                    System.out.println("Error, el juego no es físico");
                                }
                            }
                        }
                    } else if (cambio == 2) {
                        for (int i = 0; i < catalogo.size(); i++) {
                            if (id2 == catalogo.get(i).getId()) {
                                if (catalogo.get(i) instanceof JuegoDigital) {
                                    System.out.println("Introduce los gastos de envio");
                                    double gastos = input.nextDouble();
                                    input.nextLine();
                                    JuegoFisico nuevo = new JuegoFisico(catalogo.get(i).getId(), catalogo.get(i).getTitulo(), catalogo.get(i).getPrecio(), catalogo.get(i).getGenero(), gastos);
                                    catalogo.add(nuevo);
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
                            sumaFisicos = sumaFisicos + catalogo.get(i).calcularPrecioFinal();
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
                            sumaDigitales = sumaDigitales + catalogo.get(i).calcularPrecioFinal();
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
                        sumaTotal = sumaTotal + catalogo.get(i).calcularPrecioFinal();
                    }
                    if (total > 0) {
                        System.out.println("Media total de todos los juegos: " + (sumaTotal / total));
                    } else {
                        System.out.println("No hay juegos en el catálogo.");
                    }
                    break;

                case 8:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (menu != 8);
        input.close();
    }
}
