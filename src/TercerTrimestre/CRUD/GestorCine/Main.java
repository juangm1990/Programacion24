package TercerTrimestre.CRUD.GestorCine;

import java.util.List;
import java.util.Scanner;
import java.sql.Date;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        SalaDAO salaDAO = new SalaDAO();
        ReservaDAO reservaDAO = new ReservaDAO();
        int opcion;

        do {
            System.out.println("\n=========== GESTOR DE CINE ===========");
            System.out.println("----- PELÍCULAS -----");
            System.out.println("1  | Registrar nueva película");
            System.out.println("2  | Listar películas ASC");
            System.out.println("3  | Listar películas DESC");
            System.out.println("4  | Modificar película");
            System.out.println("5  | Eliminar película");
            System.out.println("6  | Buscar por título");
            System.out.println("7  | Buscar por género");
            System.out.println("8  | Buscar por duración");
            System.out.println("9  | Resetear base de películas");

            System.out.println("----- SALAS -----");
            System.out.println("10 | Registrar nueva sala");
            System.out.println("11 | Listar salas ASC");
            System.out.println("12 | Listar salas DESC");
            System.out.println("13 | Modificar sala");
            System.out.println("14 | Eliminar sala");
            System.out.println("15 | Buscar por nombre");
            System.out.println("16 | Buscar por capacidad");
            System.out.println("17 | Resetear base de salas");

            System.out.println("----- RESERVAS -----");
            System.out.println("18 | Registrar nueva reserva");
            System.out.println("19 | Listar reservas");
            System.out.println("20 | Buscar por ID_Pelicula");
            System.out.println("21 | Buscar por ID_Sala");
            System.out.println("22 | Buscar por fecha");
            System.out.println("23 | Buscar por cliente");
            System.out.println("24 | Eliminar reserva");
            System.out.println("25 | Resetear base de reservas");

            System.out.println("0  | Salir");

            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Género: ");
                    String genero = input.nextLine();
                    System.out.print("Duración (min): ");
                    int duracion = input.nextInt(); input.nextLine();
                    peliculaDAO.insertar(new Pelicula(titulo, genero, duracion));
                    break;

                case 2:
                    mostrarPeliculas(peliculaDAO.obtenerTodosAscendente());
                    break;

                case 3:
                    mostrarPeliculas(peliculaDAO.obtenerTodosDescendente());
                    break;

                case 4:
                    System.out.print("ID_Pelicula a modificar: ");
                    int idPM = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo título: ");
                    String nt = input.nextLine();
                    System.out.print("Nuevo género: ");
                    String ng = input.nextLine();
                    System.out.print("Nueva duración: ");
                    int nd = input.nextInt(); input.nextLine();
                    peliculaDAO.modificar(new Pelicula(idPM, nt, ng, nd));
                    break;

                case 5:
                    System.out.print("ID_Pelicula a eliminar: ");
                    peliculaDAO.eliminar(input.nextInt()); input.nextLine();
                    break;

                case 6:
                    System.out.print("Título: ");
                    mostrarPeliculas(peliculaDAO.buscarPorCampo("Titulo", input.nextLine()));
                    break;

                case 7:
                    System.out.print("Género: ");
                    mostrarPeliculas(peliculaDAO.buscarPorCampo("Genero", input.nextLine()));
                    break;

                case 8:
                    System.out.print("Duración: ");
                    mostrarPeliculas(peliculaDAO.buscarPorCampo("Duracion", input.nextLine()));
                    break;

                case 9:
                    peliculaDAO.resetearBaseDeDatos();
                    break;

                case 10:
                    System.out.print("Nombre sala: ");
                    String nombre = input.nextLine();
                    System.out.print("Capacidad: ");
                    int cap = input.nextInt(); input.nextLine();
                    salaDAO.insertar(new Sala(nombre, cap));
                    break;

                case 11:
                    mostrarSalas(salaDAO.obtenerTodosAscendente());
                    break;

                case 12:
                    mostrarSalas(salaDAO.obtenerTodosDescendente());
                    break;

                case 13:
                    System.out.print("ID_Sala a modificar: ");
                    int idS = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nn = input.nextLine();
                    System.out.print("Nueva capacidad: ");
                    int nc = input.nextInt(); input.nextLine();
                    salaDAO.modificar(new Sala(idS, nn, nc));
                    break;

                case 14:
                    System.out.print("ID_Sala a eliminar: ");
                    salaDAO.eliminar(input.nextInt()); input.nextLine();
                    break;

                case 15:
                    System.out.print("Nombre: ");
                    mostrarSalas(salaDAO.buscarPorCampo("Nombre", input.nextLine()));
                    break;

                case 16:
                    System.out.print("Capacidad: ");
                    mostrarSalas(salaDAO.buscarPorCampo("Capacidad", input.nextLine()));
                    break;

                case 17:
                    salaDAO.resetearBaseDeDatos();
                    break;

                case 18:
                    System.out.print("ID_Pelicula: ");
                    int idP = input.nextInt(); input.nextLine();
                    System.out.print("ID_Sala: ");
                    int idS2 = input.nextInt(); input.nextLine();
                    System.out.print("Fecha (YYYY-MM-DD): ");
                    Date fecha = Date.valueOf(input.nextLine());
                    System.out.print("Hora (HH:MM:SS): ");
                    Time hora = Time.valueOf(input.nextLine());
                    System.out.print("Nombre cliente: ");
                    String cliente = input.nextLine();
                    System.out.print("Asientos: ");
                    int asientos = input.nextInt(); input.nextLine();
                    reservaDAO.insertar(new Reserva(idP, idS2, fecha, hora, cliente, asientos));
                    break;

                case 19:
                    mostrarReservas(reservaDAO.obtenerTodosAscendente());
                    break;

                case 20:
                    System.out.print("ID_Pelicula: ");
                    mostrarReservas(reservaDAO.buscarPorCampo("ID_Pelicula", input.nextLine()));
                    break;

                case 21:
                    System.out.print("ID_Sala: ");
                    mostrarReservas(reservaDAO.buscarPorCampo("ID_Sala", input.nextLine()));
                    break;

                case 22:
                    System.out.print("Fecha: ");
                    mostrarReservas(reservaDAO.buscarPorCampo("Fecha", input.nextLine()));
                    break;

                case 23:
                    System.out.print("Cliente: ");
                    mostrarReservas(reservaDAO.buscarPorCampo("Nombre_Cliente", input.nextLine()));
                    break;

                case 24:
                    System.out.print("ID_Reserva: ");
                    reservaDAO.eliminar(input.nextInt()); input.nextLine();
                    break;

                case 25:
                    reservaDAO.resetearBaseDeDatos();
                    break;

                case 0:
                    System.out.println("Hasta pronto.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        input.close();
    }

    // Métodos auxiliares
    private static void mostrarPeliculas(List<Pelicula> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay películas.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private static void mostrarSalas(List<Sala> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay salas.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private static void mostrarReservas(List<Reserva> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            lista.forEach(System.out::println);
        }
    }
}
