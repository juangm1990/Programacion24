package TercerTrimestre.CRUD.GestorClientes_ID;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();
        int opcion = 0;

        do {
            System.out.println("0| Salir del programa");
            System.out.println("1| Registrar cliente");
            System.out.println("2| Listar clientes ascendente");
            System.out.println("3| Listar clientes descendente");
            System.out.println("4| Actualizar cliente");
            System.out.println("5| Eliminar cliente");
            System.out.println("6| Buscar cliente por ID");
            System.out.println("7| Buscar cliente por Nombre");
            System.out.println("8| Buscar cliente por Apellido");
            System.out.println("9| Buscar cliente por Email");
            System.out.println("10| Buscar cliente por teléfono");
            System.out.println("11| Resetear la base de datos");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el ID:");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.println("Introduce el nombre:");
                    String nombre = input.nextLine();

                    System.out.println("Introduce los apellidos:");
                    String apellidos = input.nextLine();

                    System.out.println("Introduce el email:");
                    String email = input.nextLine();

                    System.out.println("Introduce el teléfono:");
                    String telefono = input.nextLine();

                    Cliente nuevoCliente = new Cliente(id, nombre, apellidos, email, telefono);
                    if (clienteDAO.registrarCliente(nuevoCliente)) {
                        System.out.println("Cliente registrado correctamente.");
                    } else {
                        System.out.println("Error al registrar cliente.");
                    }
                    break;

                case 2:
                    mostrarResultados(clienteDAO.listarClientes(true));
                    break;

                case 3:
                    mostrarResultados(clienteDAO.listarClientes(false));
                    break;

                case 4:
                    System.out.println("Introduce el ID del cliente a actualizar:");
                    int idActualizar = input.nextInt();
                    input.nextLine();

                    System.out.println("Nuevo nombre:");
                    String nuevoNombre = input.nextLine();
                    System.out.println("Nuevos apellidos:");
                    String nuevosApellidos = input.nextLine();
                    System.out.println("Nuevo email:");
                    String nuevoEmail = input.nextLine();
                    System.out.println("Nuevo teléfono:");
                    String nuevoTelefono = input.nextLine();

                    Cliente actualizado = new Cliente(idActualizar, nuevoNombre, nuevosApellidos, nuevoEmail, nuevoTelefono);
                    if (clienteDAO.actualizarCliente(actualizado)) {
                        System.out.println("Cliente actualizado correctamente.");
                    } else {
                        System.out.println("Error al actualizar cliente.");
                    }
                    break;

                case 5:
                    System.out.println("Introduce el ID del cliente a eliminar:");
                    int idEliminar = input.nextInt();
                    input.nextLine();

                    if (clienteDAO.eliminarCliente(idEliminar)) {
                        System.out.println("Cliente eliminado correctamente.");
                    } else {
                        System.out.println("Error al eliminar cliente.");
                    }
                    break;

                case 6:
                    System.out.println("Introduce el ID a buscar:");
                    int idBuscar = input.nextInt();
                    input.nextLine();

                    Cliente encontrado = clienteDAO.buscarPorId(idBuscar);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró ningún cliente con ese ID.");
                    }
                    break;

                case 7:
                    System.out.println("Introduce el nombre a buscar:");
                    mostrarResultados(clienteDAO.buscarPorCampo("nombre", input.nextLine()));
                    break;

                case 8:
                    System.out.println("Introduce el apellido a buscar:");
                    mostrarResultados(clienteDAO.buscarPorCampo("apellidos", input.nextLine()));
                    break;

                case 9:
                    System.out.println("Introduce el email a buscar:");
                    mostrarResultados(clienteDAO.buscarPorCampo("email", input.nextLine()));
                    break;

                case 10:
                    System.out.println("Introduce el teléfono a buscar:");
                    mostrarResultados(clienteDAO.buscarPorCampo("telefono", input.nextLine()));
                    break;

                case 11:
                    if (clienteDAO.resetearBaseDeDatos()) {
                        System.out.println("Base de datos reseteada correctamente.");
                    } else {
                        System.out.println("Error al resetear la base de datos.");
                    }
                    break;

                case 0:
                    System.out.println("Gracias y hasta pronto. Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }

    private static void mostrarResultados(List<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No se encontraron resultados.");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }
}
