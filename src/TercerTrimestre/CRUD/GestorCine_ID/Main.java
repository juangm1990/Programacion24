package TercerTrimestre.CRUD.GestorCine_ID;

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
        int opcion = 0;

        do {
            System.out.println("=========== GESTOR DE CINE MANUAL ===========");
            System.out.println("0  | Salir del programa");

            // PELÍCULAS
            System.out.println("----- PELÍCULAS -----");
            System.out.println("1  | Registrar nueva película");
            System.out.println("2  | Listar películas ascendente");
            System.out.println("3  | Listar películas descendente");
            System.out.println("4  | Modificar película (todos los campos)");
            System.out.println("5  | Eliminar película");
            System.out.println("6  | Buscar por título");
            System.out.println("7  | Buscar por género");
            System.out.println("8  | Buscar por duración");
            System.out.println("9  | Resetear películas");
            System.out.println("10 | Modificar solo título de película");
            System.out.println("11 | Modificar solo género de película");
            System.out.println("12 | Modificar solo duración de película");

            // SALAS
            System.out.println("----- SALAS -----");
            System.out.println("13 | Registrar nueva sala");
            System.out.println("14 | Listar salas ascendente");
            System.out.println("15 | Listar salas descendente");
            System.out.println("16 | Modificar sala (todos los campos)");
            System.out.println("17 | Eliminar sala");
            System.out.println("18 | Buscar sala por nombre");
            System.out.println("19 | Buscar sala por capacidad");
            System.out.println("20 | Resetear salas");
            System.out.println("21 | Modificar solo nombre de sala");
            System.out.println("22 | Modificar solo capacidad de sala");

            // RESERVAS
            System.out.println("----- RESERVAS -----");
            System.out.println("23 | Registrar nueva reserva");
            System.out.println("24 | Listar reservas");
            System.out.println("25 | Buscar reserva por película");
            System.out.println("26 | Buscar reserva por sala");
            System.out.println("27 | Buscar reserva por fecha");
            System.out.println("28 | Buscar reserva por hora");
            System.out.println("29 | Buscar reserva por cliente");
            System.out.println("30 | Buscar reserva por asientos");
            System.out.println("31 | Eliminar reserva");
            System.out.println("32 | Resetear reservas");
            System.out.println("33 | Modificar solo fecha de reserva");
            System.out.println("34 | Modificar solo hora de reserva");
            System.out.println("35 | Modificar solo cliente de reserva");
            System.out.println("36 | Modificar solo asientos de reserva");

            System.out.println("----------------------------------------");
            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt(); input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID (manual): ");
                    int idP = input.nextInt(); input.nextLine();
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Género: ");
                    String genero = input.nextLine();
                    System.out.print("Duración (min): ");
                    int duracion = input.nextInt(); input.nextLine();
                    Pelicula p = new Pelicula(idP, titulo, genero, duracion);
                    System.out.println(peliculaDAO.registrarPelicula(p) ? "Película registrada." : "Error al registrar.");
                    break;
                case 2:
                    mostrarPeliculas(peliculaDAO.listarPeliculas(true));
                    break;
                case 3:
                    mostrarPeliculas(peliculaDAO.listarPeliculas(false));
                    break;
                case 4:
                    System.out.print("ID de la película: "); int idPMod = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo título: "); String tMod = input.nextLine();
                    System.out.print("Nuevo género: "); String gMod = input.nextLine();
                    System.out.print("Nueva duración: "); int dMod = input.nextInt(); input.nextLine();
                    Pelicula pMod = new Pelicula(idPMod, tMod, gMod, dMod);
                    System.out.println(peliculaDAO.actualizarPelicula(pMod) ? "Película actualizada." : "Error.");
                    break;
                case 5:
                    System.out.print("ID a eliminar: "); int idPEl = input.nextInt(); input.nextLine();
                    System.out.println(peliculaDAO.eliminarPelicula(idPEl) ? "Película eliminada." : "Error.");
                    break;
                case 6:
                    System.out.print("Buscar por título: "); mostrarPeliculas(peliculaDAO.buscarPorTitulo(input.nextLine()));
                    break;
                case 7:
                    System.out.print("Buscar por género: "); mostrarPeliculas(peliculaDAO.buscarPorGenero(input.nextLine()));
                    break;
                case 8:
                    System.out.print("Buscar por duración: "); mostrarPeliculas(peliculaDAO.buscarPorDuracion(input.nextInt())); input.nextLine();
                    break;
                case 9:
                    System.out.println(peliculaDAO.resetearPeliculas() ? "Películas reseteadas." : "Error.");
                    break;
                case 10:
                    System.out.print("ID de la película: "); int idPT = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo título: "); String nuevoTitulo = input.nextLine();
                    System.out.println(peliculaDAO.actualizarTitulo(idPT, nuevoTitulo) ? "Título actualizado." : "Error.");
                    break;
                case 11:
                    System.out.print("ID de la película: "); int idPG = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo género: "); String nuevoGenero = input.nextLine();
                    System.out.println(peliculaDAO.actualizarGenero(idPG, nuevoGenero) ? "Género actualizado." : "Error.");
                    break;
                case 12:
                    System.out.print("ID de la película: "); int idPD = input.nextInt(); input.nextLine();
                    System.out.print("Nueva duración: "); int nuevaDuracion = input.nextInt(); input.nextLine();
                    System.out.println(peliculaDAO.actualizarDuracion(idPD, nuevaDuracion) ? "Duración actualizada." : "Error.");
                    break;

                case 13:
                    System.out.print("ID de la sala: "); int idS = input.nextInt(); input.nextLine();
                    System.out.print("Nombre: "); String nombre = input.nextLine();
                    System.out.print("Capacidad: "); int capacidad = input.nextInt(); input.nextLine();
                    Sala s = new Sala(idS, nombre, capacidad);
                    System.out.println(salaDAO.registrarSala(s) ? "Sala registrada." : "Error.");
                    break;
                case 14:
                    mostrarSalas(salaDAO.listarSalas(true));
                    break;
                case 15:
                    mostrarSalas(salaDAO.listarSalas(false));
                    break;
                case 16:
                    System.out.print("ID de la sala: "); int idSMod = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo nombre: "); String nMod = input.nextLine();
                    System.out.print("Nueva capacidad: "); int cMod = input.nextInt(); input.nextLine();
                    Sala sMod = new Sala(idSMod, nMod, cMod);
                    System.out.println(salaDAO.actualizarSala(sMod) ? "Sala actualizada." : "Error.");
                    break;
                case 17:
                    System.out.print("ID a eliminar: "); int idSEl = input.nextInt(); input.nextLine();
                    System.out.println(salaDAO.eliminarSala(idSEl) ? "Sala eliminada." : "Error.");
                    break;
                case 18:
                    System.out.print("Buscar por nombre: "); mostrarSalas(salaDAO.buscarPorNombre(input.nextLine()));
                    break;
                case 19:
                    System.out.print("Buscar por capacidad: "); mostrarSalas(salaDAO.buscarPorCapacidad(input.nextInt())); input.nextLine();
                    break;
                case 20:
                    System.out.println(salaDAO.resetearSalas() ? "Salas reseteadas." : "Error.");
                    break;
                case 21:
                    System.out.print("ID de la sala: "); int idSN = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo nombre: "); String nuevoNombre = input.nextLine();
                    System.out.println(salaDAO.actualizarNombre(idSN, nuevoNombre) ? "Nombre actualizado." : "Error.");
                    break;
                case 22:
                    System.out.print("ID de la sala: "); int idSC = input.nextInt(); input.nextLine();
                    System.out.print("Nueva capacidad: "); int nuevaCapacidad = input.nextInt(); input.nextLine();
                    System.out.println(salaDAO.actualizarCapacidad(idSC, nuevaCapacidad) ? "Capacidad actualizada." : "Error.");
                    break;

                case 23:
                    System.out.print("ID de la reserva: "); int idR = input.nextInt(); input.nextLine();
                    System.out.print("ID Película: "); int idRP = input.nextInt(); input.nextLine();
                    System.out.print("ID Sala: "); int idRS = input.nextInt(); input.nextLine();
                    System.out.print("Fecha (yyyy-mm-dd): "); Date fecha = Date.valueOf(input.nextLine());
                    System.out.print("Hora (hh:mm:ss): "); Time hora = Time.valueOf(input.nextLine());
                    System.out.print("Cliente: "); String cliente = input.nextLine();
                    System.out.print("Asientos: "); int asientos = input.nextInt(); input.nextLine();
                    Reserva r = new Reserva(idR, idRP, idRS, fecha, hora, cliente, asientos);
                    System.out.println(reservaDAO.registrarReserva(r) ? "Reserva registrada." : "Error.");
                    break;
                case 24:
                    mostrarReservas(reservaDAO.listarReservas());
                    break;
                case 25:
                    System.out.print("Buscar por ID de película: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("ID_Pelicula", input.nextLine()));
                    break;
                case 26:
                    System.out.print("Buscar por ID de sala: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("ID_Sala", input.nextLine()));
                    break;
                case 27:
                    System.out.print("Buscar por fecha: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("Fecha", input.nextLine()));
                    break;
                case 28:
                    System.out.print("Buscar por hora: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("Hora", input.nextLine()));
                    break;
                case 29:
                    System.out.print("Buscar por cliente: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("Nombre_Cliente", input.nextLine()));
                    break;
                case 30:
                    System.out.print("Buscar por asientos: "); 
                    mostrarReservas(reservaDAO.buscarPorCampo("Asientos_Reservados", input.nextLine()));
                    break;
                case 31:
                    System.out.print("ID a eliminar: "); int idREl = input.nextInt(); input.nextLine();
                    System.out.println(reservaDAO.eliminarReserva(idREl) ? "Reserva eliminada." : "Error.");
                    break;
                case 32:
                    System.out.println(reservaDAO.resetearReservas() ? "Reservas reseteadas." : "Error.");
                    break;
                case 33:
                    System.out.print("ID de la reserva: "); int idRF = input.nextInt(); input.nextLine();
                    System.out.print("Nueva fecha: "); Date nuevaFecha = Date.valueOf(input.nextLine());
                    System.out.println(reservaDAO.actualizarFecha(idRF, nuevaFecha) ? "Fecha actualizada." : "Error.");
                    break;
                case 34:
                    System.out.print("ID de la reserva: "); int idRH = input.nextInt(); input.nextLine();
                    System.out.print("Nueva hora: "); Time nuevaHora = Time.valueOf(input.nextLine());
                    System.out.println(reservaDAO.actualizarHora(idRH, nuevaHora) ? "Hora actualizada." : "Error.");
                    break;
                case 35:
                    System.out.print("ID de la reserva: "); int idRC = input.nextInt(); input.nextLine();
                    System.out.print("Nuevo cliente: "); String nuevoCliente = input.nextLine();
                    System.out.println(reservaDAO.actualizarCliente(idRC, nuevoCliente) ? "Cliente actualizado." : "Error.");
                    break;
                case 36:
                    System.out.print("ID de la reserva: "); int idRA = input.nextInt(); input.nextLine();
                    System.out.print("Nueva cantidad: "); int nuevosAsientos = input.nextInt(); input.nextLine();
                    System.out.println(reservaDAO.actualizarAsientos(idRA, nuevosAsientos) ? "Asientos actualizados." : "Error.");
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
        } while (opcion != 0);

        input.close();
    }

    private static void mostrarPeliculas(List<Pelicula> lista) {
        if (lista.isEmpty()) System.out.println("No hay películas."); else lista.forEach(System.out::println);
    }

    private static void mostrarSalas(List<Sala> lista) {
        if (lista.isEmpty()) System.out.println("No hay salas."); else lista.forEach(System.out::println);
    }

    private static void mostrarReservas(List<Reserva> lista) {
        if (lista.isEmpty()) System.out.println("No hay reservas."); else lista.forEach(System.out::println);
    }
}