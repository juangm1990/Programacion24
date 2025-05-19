package TercerTrimestre.CRUD.GestorEmpresa;

import java.util.List;
import java.util.Scanner;

public class GestorEmpresa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        int opcion;

        do {
            System.out.println("\n=========== GESTOR DE EMPLEADOS ===========");
            System.out.println("0  | Salir del programa");

            System.out.println("----- EMPLEADOS -----");
            System.out.println("1  | Registrar nuevo empleado");
            System.out.println("2  | Listar empleados ascendente");
            System.out.println("3  | Listar empleados descendente");
            System.out.println("4  | Modificar empleado");
            System.out.println("5  | Eliminar empleado");
            System.out.println("6  | Buscar empleado por ID");
            System.out.println("7  | Resetear base de datos");

            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = input.nextLine();
                    System.out.print("Puesto: ");
                    String puesto = input.nextLine();
                    System.out.print("Salario: ");
                    double salario = input.nextDouble();
                    input.nextLine();
                    Empleado nuevoEmpleado = new Empleado(nombre, apellidos, puesto, salario);
                    empleadoDAO.insertar(nuevoEmpleado);
                    break;

                case 2:
                    List<Empleado> listaAsc = empleadoDAO.obtenerTodosAscendente();
                    mostrarEmpleados(listaAsc);
                    break;

                case 3:
                    List<Empleado> listaDesc = empleadoDAO.obtenerTodosDescendente();
                    mostrarEmpleados(listaDesc);
                    break;

                case 4:
                    System.out.print("ID_Empleado a modificar: ");
                    int idMod = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = input.nextLine();
                    System.out.print("Nuevos apellidos: ");
                    String nuevosApellidos = input.nextLine();
                    System.out.print("Nuevo puesto: ");
                    String nuevoPuesto = input.nextLine();
                    System.out.print("Nuevo salario: ");
                    double nuevoSalario = input.nextDouble();
                    input.nextLine();
                    Empleado empMod = new Empleado(idMod, nuevoNombre, nuevosApellidos, nuevoPuesto, nuevoSalario);
                    empleadoDAO.modificar(empMod);
                    break;

                case 5:
                    System.out.print("ID_Empleado a eliminar: ");
                    int idElim = input.nextInt();
                    input.nextLine();
                    empleadoDAO.eliminar(idElim);
                    break;

                case 6:
                    System.out.print("ID_Empleado a buscar: ");
                    int idBus = input.nextInt();
                    input.nextLine();
                    Empleado encontrado = empleadoDAO.buscarPorId(idBus);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("¿Estás seguro de que deseas resetear la base de datos? (s/n): ");
                    String confirm = input.nextLine();
                    if (confirm.equalsIgnoreCase("s")) {
                        empleadoDAO.resetearBaseDeDatos();
                    } else {
                        System.out.println("Operación cancelada.");
                    }
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

    // Mostrar lista de empleados
    private static void mostrarEmpleados(List<Empleado> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : lista) {
                System.out.println(e);
            }
        }
    }
}
