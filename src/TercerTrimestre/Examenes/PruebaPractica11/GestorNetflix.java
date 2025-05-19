package TercerTrimestre.Examenes.PruebaPractica11;

import java.util.List;
import java.util.Scanner;

public class GestorNetflix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContenidoDAO dao = new ContenidoDAO();
        int opcion;

        do {
            System.out.println("\n=========== GESTOR NETFLIX ===========");
            System.out.println("1. Insertar nuevo contenido");
            System.out.println("2. Listar contenido");
            System.out.println("3. Actualizar un campo");
            System.out.println("4. Actualizar todo el contenido");
            System.out.println("5. Eliminar por ID");
            System.out.println("6. Eliminar por título");
            System.out.println("7. Buscar por palabra clave");
            System.out.println("8. Mostrar contenidos sin valoración");
            System.out.println("9. Mostrar contenidos con valoración");
            System.out.println("10. Mostrar media de valoración por tipo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Tipo (película o serie): ");
                    String tipo = input.nextLine();
                    System.out.print("Género: ");
                    String genero = input.nextLine();
                    System.out.print("Duración (minutos): ");
                    int duracion = input.nextInt();
                    input.nextLine();
                    System.out.print("Año de estreno: ");
                    int estreno = input.nextInt();
                    input.nextLine();
                    System.out.print("Valoración (ej. 4,5 o 0 si no tiene): ");
                    double valoracion = input.nextDouble();
                    input.nextLine();

                    Contenido nuevo = new Contenido(titulo, tipo, genero, duracion, estreno, valoracion);
                    dao.insertar(nuevo);
                    break;

                case 2:
                    List<Contenido> lista = dao.listarPorTipo();
                    if (lista.isEmpty()) {
                        System.out.println("No hay contenido.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID del contenido a modificar: ");
                    int idCampo = input.nextInt();
                    input.nextLine();
                    Contenido c = dao.obtenerPorId(idCampo);
                    if (c == null) {
                        System.out.println("Contenido no encontrado.");
                        break;
                    }

                    System.out.println("1. Título");
                    System.out.println("2. Tipo");
                    System.out.println("3. Género");
                    System.out.println("4. Duración");
                    System.out.println("5. Estreno");
                    System.out.println("6. Valoración");
                    System.out.print("Campo a modificar: ");
                    int campo = input.nextInt();
                    input.nextLine();

                    switch (campo) {
                        case 1:
                            System.out.print("Nuevo título: ");
                            c.setTitulo(input.nextLine());
                            break;
                        case 2:
                            System.out.print("Nuevo tipo: ");
                            c.setTipo(input.nextLine());
                            break;
                        case 3:
                            System.out.print("Nuevo género: ");
                            c.setGenero(input.nextLine());
                            break;
                        case 4:
                            System.out.print("Nueva duración: ");
                            c.setDuracion(input.nextInt());
                            input.nextLine();
                            break;
                        case 5:
                            System.out.print("Nuevo estreno: ");
                            c.setEstreno(input.nextInt());
                            input.nextLine();
                            break;
                        case 6:
                            System.out.print("Nueva valoración: ");
                            double nuevaVal = input.nextDouble();
                            input.nextLine();
                            c.setValoracion(nuevaVal);
                            break;
                        default:
                            System.out.println("Campo no válido.");
                    }

                    dao.actualizar(c);
                    break;

                case 4:
                    System.out.print("ID del contenido a modificar: ");
                    int idMod = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo título: ");
                    String nuevoTitulo = input.nextLine();
                    System.out.print("Nuevo tipo: ");
                    String nuevoTipo = input.nextLine();
                    System.out.print("Nuevo género: ");
                    String nuevoGenero = input.nextLine();
                    System.out.print("Nueva duración: ");
                    int nuevaDuracion = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo estreno: ");
                    int nuevoEstreno = input.nextInt();
                    input.nextLine();
                    System.out.print("Nueva valoración: ");
                    double nuevaValoracion = input.nextDouble();
                    input.nextLine();

                    Contenido actualizado = new Contenido(idMod, nuevoTitulo, nuevoTipo, nuevoGenero, nuevaDuracion, nuevoEstreno, nuevaValoracion);
                    dao.actualizar(actualizado);
                    break;

                case 5:
                    System.out.print("ID del contenido a eliminar: ");
                    int idEliminar = input.nextInt();
                    input.nextLine();
                    dao.eliminarPorId(idEliminar);
                    break;

                case 6:
                    System.out.print("Título del contenido a eliminar: ");
                    String tituloEliminar = input.nextLine();
                    dao.eliminarPorTitulo(tituloEliminar);
                    break;

                case 7:
                    System.out.print("Palabra clave (en título o género): ");
                    String palabra = input.nextLine();
                    List<Contenido> encontrados = dao.buscarPorPalabraClave(palabra);
                    if (encontrados.isEmpty()) {
                        System.out.println("No se encontraron resultados.");
                    } else {
                        for (int i = 0; i < encontrados.size(); i++) {
                            System.out.println(encontrados.get(i));
                        }
                    }
                    break;

                case 8:
                    List<Contenido> sinValoracion = dao.listarSinValoracion();
                    if (sinValoracion.isEmpty()) {
                        System.out.println("Todos los contenidos tienen valoración.");
                    } else {
                        System.out.println("----- CONTENIDOS SIN VALORACIÓN (0.0) -----");
                        for (int i = 0; i < sinValoracion.size(); i++) {
                            System.out.println(sinValoracion.get(i));
                        }
                    }
                    break;

                case 9:
                    List<Contenido> conValoracion = dao.listarConValoracion();
                    boolean hayPeliculas = false;
                    boolean haySeries = false;

                    for (int i = 0; i < conValoracion.size(); i++) {
                        Contenido cont = conValoracion.get(i);
                        if (cont.getTipo().equalsIgnoreCase("pelicula") || cont.getTipo().equalsIgnoreCase("película")) {
                            if (!hayPeliculas) {
                                System.out.println("----- PELÍCULAS -----");
                                hayPeliculas = true;
                            }
                            System.out.println(cont);
                        } else if (cont.getTipo().equalsIgnoreCase("serie")) {
                            if (!haySeries) {
                                System.out.println("----- SERIES -----");
                                haySeries = true;
                            }
                            System.out.println(cont);
                        }
                    }

                    if (!hayPeliculas && !haySeries) {
                        System.out.println("No hay contenidos con valoración.");
                    }
                    break;

                case 10:
                    dao.mostrarMediaPorTipo();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        input.close();
    }
}
