package SegundoTrimestre.Objetos_Interfaces.Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Añadir clientes");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Buscar cliente por ID");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Añadir habitación");
            System.out.println("6. Mostrar habitaciones");
            System.out.println("7. Buscar habitación por número");
            System.out.println("8. Cambiar disponibilidad de habitación");
            System.out.println("9. Media de precio por noche de todas las habitaciones");
            System.out.println("10. Reservar suite (usa la interfaz)");
            System.out.println("11. Mostrar habitaciones disponibles");
            System.out.println("12. Mostrar habitaciones ocupadas");
            System.out.println("13. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    String nombre = "";
                    do {
                        System.out.print("Nombre del cliente (escribe FIN para terminar): ");
                        nombre = input.nextLine();

                        if (!nombre.equalsIgnoreCase("FIN")) {
                            System.out.print("Email del cliente: ");
                            String email = input.nextLine();

                            int id = listaClientes.size() + 1;
                            Cliente cliente = new Cliente(id, nombre, email);
                            listaClientes.add(cliente);
                            System.out.println("Cliente añadido con ID: " + id);
                        }
                    } while (!nombre.equalsIgnoreCase("FIN"));
                    break;

                case 2:
                    if (listaClientes.size() == 0) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println(listaClientes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce el ID del cliente: ");
                    int idBuscar = input.nextInt();
                    input.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < listaClientes.size(); i++) {
                        if (listaClientes.get(i).getId() == idBuscar) {
                            System.out.println(listaClientes.get(i));
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el ID del cliente a eliminar: ");
                    int idEliminar = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < listaClientes.size(); i++) {
                        if (listaClientes.get(i).getId() == idEliminar) {
                            listaClientes.remove(i);
                            System.out.println("Cliente eliminado.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tipo de habitación: 1. Individual  2. Doble  3. Suite");
                    int tipoHab = input.nextInt();
                    input.nextLine();

                    System.out.print("Número de habitación: ");
                    int numero = input.nextInt();
                    input.nextLine();

                    System.out.print("Precio por noche: ");
                    double precio = input.nextDouble();
                    input.nextLine();

                    boolean disponible = true;

                    if (tipoHab == 1) {
                        habitaciones.add(new HabitacionIndividual(numero, precio, disponible));
                    } else if (tipoHab == 2) {
                        habitaciones.add(new HabitacionDoble(numero, precio, disponible));
                    } else if (tipoHab == 3) {
                        habitaciones.add(new HabitacionSuite(numero, precio, disponible));
                    }
                    System.out.println("Habitación añadida correctamente.");
                    break;

                case 6:
                    if (habitaciones.size() == 0) {
                        System.out.println("No hay habitaciones registradas.");
                    } else {
                        for (int i = 0; i < habitaciones.size(); i++) {
                            System.out.println(habitaciones.get(i));
                        }
                    }
                    break;

                case 7:
                    System.out.print("Número de habitación a buscar: ");
                    int numBuscar = input.nextInt();
                    input.nextLine();
                    boolean hallada = false;
                    for (int i = 0; i < habitaciones.size(); i++) {
                        if (habitaciones.get(i).getNumero() == numBuscar) {
                            System.out.println(habitaciones.get(i));
                            hallada = true;
                        }
                    }
                    if (!hallada) {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 8:
                    System.out.print("Número de habitación para cambiar disponibilidad: ");
                    int numCambiar = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < habitaciones.size(); i++) {
                        if (habitaciones.get(i).getNumero() == numCambiar) {
                            boolean actual = habitaciones.get(i).isDisponible();
                            habitaciones.get(i).setDisponible(!actual);
                            System.out.println("Disponibilidad cambiada. Ahora está " + (habitaciones.get(i).isDisponible() ? "disponible" : "ocupada"));
                            break;
                        }
                    }
                    break;

                case 9:
                    if (habitaciones.size() == 0) {
                        System.out.println("No hay habitaciones registradas.");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < habitaciones.size(); i++) {
                            suma += habitaciones.get(i).getPrecioPorNoche();
                        }
                        double media = suma / habitaciones.size();
                        System.out.println("Media de precio por noche: " + media);
                    }
                    break;

                case 10:
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = input.nextLine();
                    System.out.print("Fecha de entrada: ");
                    String fechaEntrada = input.nextLine();
                    System.out.print("Número de noches: ");
                    int noches = input.nextInt();
                    input.nextLine();

                    boolean reservada = false;
                    for (int i = 0; i < habitaciones.size(); i++) {
                        Habitacion h = habitaciones.get(i);
                        if (h instanceof Reservable && h.isDisponible()) {
                            ((Reservable) h).hacerReserva(nombreCliente, fechaEntrada, noches);
                            reservada = true;
                            break;
                        }
                    }
                    if (!reservada) {
                        System.out.println("No hay suites disponibles que se puedan reservar.");
                    }
                    break;

                case 11:
                    System.out.println("--- Habitaciones disponibles ---");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        if (habitaciones.get(i).isDisponible()) {
                            System.out.println(habitaciones.get(i));
                        }
                    }
                    break;

                case 12:
                    System.out.println("--- Habitaciones ocupadas ---");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        if (!habitaciones.get(i).isDisponible()) {
                            System.out.println(habitaciones.get(i));
                        }
                    }
                    break;

                case 13:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 13);

        input.close();
    }
}
