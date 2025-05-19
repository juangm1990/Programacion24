package TercerTrimestre.CRUD.GestorClientes;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();
        int opcion = 0;

        do {
            System.out.println("========= GESTOR DE CLIENTES =========");
            System.out.println("0  | Salir del programa");

            System.out.println("----- CLIENTES -----");
            System.out.println("1  | Registrar nuevo cliente");
            System.out.println("2  | Listar clientes ascendente");
            System.out.println("3  | Listar clientes descendente");
            System.out.println("4  | Modificar cliente (todos los campos)");
            System.out.println("5  | Modificar solo el nombre");
            System.out.println("6  | Modificar solo los apellidos");
            System.out.println("7  | Modificar solo el email");
            System.out.println("8  | Modificar solo el teléfono");
            System.out.println("9  | Eliminar cliente");
            System.out.println("10 | Buscar cliente por ID");
            System.out.println("11 | Buscar cliente por nombre");
            System.out.println("12 | Buscar cliente por apellidos");
            System.out.println("13 | Buscar cliente por email");
            System.out.println("14 | Buscar cliente por teléfono");
            System.out.println("15 | Resetear la base de datos");

            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = input.nextLine();
                    Cliente nuevoCliente = new Cliente(nombre, apellidos, email, telefono);
                    clienteDAO.insertar(nuevoCliente);
                    break;

                case 2:
                    List<Cliente> asc = clienteDAO.obtenerTodosAscendente();
                    asc.forEach(System.out::println);
                    break;

                case 3:
                    List<Cliente> desc = clienteDAO.obtenerTodosDescendente();
                    desc.forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("ID del cliente a modificar: ");
                    int idMod = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = input.nextLine();
                    System.out.print("Nuevos apellidos: ");
                    String nuevosApellidos = input.nextLine();
                    System.out.print("Nuevo email: ");
                    String nuevoEmail = input.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String nuevoTelefono = input.nextLine();
                    Cliente clienteMod = new Cliente(idMod, nuevoNombre, nuevosApellidos, nuevoEmail, nuevoTelefono);
                    clienteDAO.modificar(clienteMod);
                    break;

                case 5:
                    System.out.print("ID del cliente: ");
                    int idNom = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nom = input.nextLine();
                    clienteDAO.actualizarCampo(idNom, "Nombre", nom);
                    break;

                case 6:
                    System.out.print("ID del cliente: ");
                    int idApe = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevos apellidos: ");
                    String ape = input.nextLine();
                    clienteDAO.actualizarCampo(idApe, "Apellidos", ape);
                    break;

                case 7:
                    System.out.print("ID del cliente: ");
                    int idEmail = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo email: ");
                    String em = input.nextLine();
                    clienteDAO.actualizarCampo(idEmail, "Email", em);
                    break;

                case 8:
                    System.out.print("ID del cliente: ");
                    int idTel = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String tel = input.nextLine();
                    clienteDAO.actualizarCampo(idTel, "Telefono", tel);
                    break;

                case 9:
                    System.out.print("ID del cliente a eliminar: ");
                    int idElim = input.nextInt();
                    input.nextLine();
                    clienteDAO.eliminar(idElim);
                    break;

                case 10:
                    System.out.print("ID del cliente a buscar: ");
                    int idBus = input.nextInt();
                    input.nextLine();
                    Cliente encontrado = clienteDAO.buscarPorId(idBus);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 11:
                    System.out.print("Nombre a buscar: ");
                    String nomBus = input.nextLine();
                    clienteDAO.buscarPorCampo("Nombre", nomBus).forEach(System.out::println);
                    break;

                case 12:
                    System.out.print("Apellidos a buscar: ");
                    String apeBus = input.nextLine();
                    clienteDAO.buscarPorCampo("Apellidos", apeBus).forEach(System.out::println);
                    break;

                case 13:
                    System.out.print("Email a buscar: ");
                    String emailBus = input.nextLine();
                    clienteDAO.buscarPorCampo("Email", emailBus).forEach(System.out::println);
                    break;

                case 14:
                    System.out.print("Teléfono a buscar: ");
                    String telBus = input.nextLine();
                    clienteDAO.buscarPorCampo("Telefono", telBus).forEach(System.out::println);
                    break;

                case 15:
                    System.out.print("¿Estás seguro de que deseas resetear la base de datos? (s/n): ");
                    String confirm = input.nextLine();
                    if (confirm.equalsIgnoreCase("s")) {
                        clienteDAO.resetearBaseDeDatos();
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
