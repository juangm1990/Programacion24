package TercerTrimestre.CRUD.GestorBiblioteca_ID;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LibroDAO libroDAO = new LibroDAO();
        int opcion = 0;

        do {
            System.out.println("========= GESTOR DE LIBROS =========");
            System.out.println("0  | Salir del programa");

            // MENÚ DE LIBROS
            System.out.println("----- LIBROS -----");
            System.out.println("1  | Registrar nuevo libro");
            System.out.println("2  | Listar libros ascendente");
            System.out.println("3  | Listar libros descendente");
            System.out.println("4  | Modificar libro (todos los campos)");
            System.out.println("5  | Modificar solo el título");
            System.out.println("6  | Modificar solo el autor");
            System.out.println("7  | Modificar solo el año de publicación");
            System.out.println("8  | Modificar solo el género");
            System.out.println("9  | Modificar disponibilidad");
            System.out.println("10 | Eliminar libro");
            System.out.println("11 | Buscar libro por ID");
            System.out.println("12 | Buscar libro por título");
            System.out.println("13 | Buscar libro por autor");
            System.out.println("14 | Buscar libro por año");
            System.out.println("15 | Buscar libro por género");
            System.out.println("16 | Resetear la base de datos");

            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("ID del libro: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Autor: ");
                    String autor = input.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = input.nextInt();
                    input.nextLine();
                    System.out.print("Género: ");
                    String genero = input.nextLine();
                    System.out.print("¿Está disponible? (true/false): ");
                    boolean disponible = Boolean.parseBoolean(input.nextLine());
                    Libro nuevoLibro = new Libro(id, titulo, autor, anio, genero, disponible);
                    libroDAO.insertar(nuevoLibro);
                    break;

                case 2:
                    List<Libro> librosAsc = libroDAO.obtenerTodosAscendente();
                    for (Libro l : librosAsc) {
                        System.out.println(l);
                    }
                    break;

                case 3:
                    List<Libro> librosDesc = libroDAO.obtenerTodosDescendente();
                    for (Libro l : librosDesc) {
                        System.out.println(l);
                    }
                    break;

                case 4:
                    System.out.print("ID del libro a modificar: ");
                    int idMod = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo título: ");
                    String tituloNuevo = input.nextLine();
                    System.out.print("Nuevo autor: ");
                    String autorNuevo = input.nextLine();
                    System.out.print("Nuevo año de publicación: ");
                    int anioNuevo = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo género: ");
                    String generoNuevo = input.nextLine();
                    System.out.print("¿Disponible? (true/false): ");
                    boolean disponibleNuevo = Boolean.parseBoolean(input.nextLine());
                    Libro libroModificado = new Libro(idMod, tituloNuevo, autorNuevo, anioNuevo, generoNuevo, disponibleNuevo);
                    libroDAO.modificar(libroModificado);
                    break;

                case 5:
                    System.out.print("ID del libro: ");
                    int idTitulo = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo título: ");
                    String nuevoTitulo = input.nextLine();
                    libroDAO.actualizarCampo(idTitulo, "Titulo", nuevoTitulo);
                    break;

                case 6:
                    System.out.print("ID del libro: ");
                    int idAutor = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo autor: ");
                    String nuevoAutor = input.nextLine();
                    libroDAO.actualizarCampo(idAutor, "Autor", nuevoAutor);
                    break;

                case 7:
                    System.out.print("ID del libro: ");
                    int idAnio = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo año de publicación: ");
                    int nuevoAnio = input.nextInt();
                    input.nextLine();
                    libroDAO.actualizarCampo(idAnio, "Año_Publicacion", String.valueOf(nuevoAnio));
                    break;

                case 8:
                    System.out.print("ID del libro: ");
                    int idGenero = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo género: ");
                    String nuevoGenero = input.nextLine();
                    libroDAO.actualizarCampo(idGenero, "Genero", nuevoGenero);
                    break;

                case 9:
                    System.out.print("ID del libro: ");
                    int idDisp = input.nextInt();
                    input.nextLine();
                    System.out.print("¿Está disponible? (true/false): ");
                    String nuevoDisponible = input.nextLine();
                    libroDAO.actualizarCampo(idDisp, "Disponible", nuevoDisponible);
                    break;

                case 10:
                    System.out.print("ID del libro a eliminar: ");
                    int idEliminar = input.nextInt();
                    libroDAO.eliminar(idEliminar);
                    break;

                case 11:
                    System.out.print("ID del libro a buscar: ");
                    int idBuscar = input.nextInt();
                    Libro libro = libroDAO.buscarPorID(idBuscar);
                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 12:
                    System.out.print("Título del libro a buscar: ");
                    String buscarTitulo = input.nextLine();
                    List<Libro> porTitulo = libroDAO.buscarPorTitulo(buscarTitulo);
                    for (Libro l : porTitulo) {
                        System.out.println(l);
                    }
                    break;

                case 13:
                    System.out.print("Autor del libro a buscar: ");
                    String buscarAutor = input.nextLine();
                    List<Libro> porAutor = libroDAO.buscarPorAutor(buscarAutor);
                    for (Libro l : porAutor) {
                        System.out.println(l);
                    }
                    break;

                case 14:
                    System.out.print("Año de publicación a buscar: ");
                    int buscarAnio = input.nextInt();
                    List<Libro> porAnio = libroDAO.buscarPorAnio(buscarAnio);
                    for (Libro l : porAnio) {
                        System.out.println(l);
                    }
                    break;

                case 15:
                    System.out.print("Género del libro a buscar: ");
                    String buscarGenero = input.nextLine();
                    List<Libro> porGenero = libroDAO.buscarPorGenero(buscarGenero);
                    for (Libro l : porGenero) {
                        System.out.println(l);
                    }
                    break;

                case 16:
                    libroDAO.resetearBaseDeDatos();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
