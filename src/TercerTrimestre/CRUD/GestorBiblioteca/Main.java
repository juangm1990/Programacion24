package TercerTrimestre.CRUD.GestorBiblioteca;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LibroDAO libroDAO = new LibroDAO();
        int opcion = 0;

        do {
            System.out.println("========= GESTOR DE LIBROS - AUTO_INCREMENT =========");
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
            System.out.println("9  | Eliminar libro");
            System.out.println("10 | Buscar libro por ID");
            System.out.println("11 | Buscar libro por título");
            System.out.println("12 | Buscar libro por autor");
            System.out.println("13 | Buscar libro por año");
            System.out.println("14 | Buscar libro por género");
            System.out.println("15 | Resetear la base de datos");

            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Autor: ");
                    String autor = input.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = input.nextInt();
                    input.nextLine();
                    System.out.print("Género: ");
                    String genero = input.nextLine();
                    Libro nuevoLibro = new Libro(titulo, autor, anio, genero);
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
                    String nuevoTitulo = input.nextLine();
                    System.out.print("Nuevo autor: ");
                    String nuevoAutor = input.nextLine();
                    System.out.print("Nuevo año de publicación: ");
                    int nuevoAnio = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo género: ");
                    String nuevoGenero = input.nextLine();
                    Libro libroMod = new Libro(idMod, nuevoTitulo, nuevoAutor, nuevoAnio, nuevoGenero, true);
                    libroDAO.modificar(libroMod);
                    break;

                case 5:
                    System.out.print("ID del libro: ");
                    int idTit = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo título: ");
                    String tit = input.nextLine();
                    libroDAO.actualizarCampo(idTit, "Titulo", tit);
                    break;

                case 6:
                    System.out.print("ID del libro: ");
                    int idAut = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo autor: ");
                    String aut = input.nextLine();
                    libroDAO.actualizarCampo(idAut, "Autor", aut);
                    break;

                case 7:
                    System.out.print("ID del libro: ");
                    int idAn = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo año de publicación: ");
                    String an = input.nextLine();
                    libroDAO.actualizarCampo(idAn, "Año_Publicacion", an);
                    break;

                case 8:
                    System.out.print("ID del libro: ");
                    int idGen = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo género: ");
                    String gen = input.nextLine();
                    libroDAO.actualizarCampo(idGen, "Genero", gen);
                    break;

                case 9:
                    System.out.print("ID del libro a eliminar: ");
                    int idElim = input.nextInt();
                    input.nextLine();
                    libroDAO.eliminar(idElim);
                    break;

                case 10:
                    System.out.print("ID del libro a buscar: ");
                    int idBus = input.nextInt();
                    input.nextLine();
                    Libro encontrado = libroDAO.buscarPorId(idBus);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 11:
                    System.out.print("Título a buscar: ");
                    String tituloBus = input.nextLine();
                    List<Libro> porTitulo = libroDAO.buscarPorCampo("Titulo", tituloBus);
                    porTitulo.forEach(System.out::println);
                    break;

                case 12:
                    System.out.print("Autor a buscar: ");
                    String autorBus = input.nextLine();
                    List<Libro> porAutor = libroDAO.buscarPorCampo("Autor", autorBus);
                    porAutor.forEach(System.out::println);
                    break;

                case 13:
                    System.out.print("Año a buscar: ");
                    String anioBus = input.nextLine();
                    List<Libro> porAnio = libroDAO.buscarPorCampo("Año_Publicacion", anioBus);
                    porAnio.forEach(System.out::println);
                    break;

                case 14:
                    System.out.print("Género a buscar: ");
                    String generoBus = input.nextLine();
                    List<Libro> porGenero = libroDAO.buscarPorCampo("Genero", generoBus);
                    porGenero.forEach(System.out::println);
                    break;

                case 15:
                    System.out.print("¿Estás seguro de que deseas resetear la base de datos? (s/n): ");
                    String confirm = input.nextLine();
                    if (confirm.equalsIgnoreCase("s")) {
                        libroDAO.resetearBaseDeDatos();
                    } else {
                        System.out.println("Operación cancelada.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();

        } while (opcion != 0);

        input.close();
    }
}
