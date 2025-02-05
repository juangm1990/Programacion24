package SegundoTrimestre.Discord.ArchivosBinario_Estudiantes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.*;

public class GestionEstudiantes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("GESTIÓN DE ESTUDIANTES");
            System.out.println("0| Salir");
            System.out.println("1| Agregar estudiante");
            System.out.println("2| Buscar estudiante");
            System.out.println("3| Listar estudiantes");
            System.out.println("4| Eliminar estudiante");
            System.out.println("5| Cambiar edad del estudiante");
            System.out.println("6| Cambiar ID del estudiante");
            System.out.println("7| Calcular la media de edades");
            System.out.println("8| Ordenar estudiantes por edad");
            System.out.println("----------------------------");
            System.out.print("Por favor, elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante(input);
                    break;
                case 2:
                    buscarEstudiante(input);
                    break;
                case 3:
                    listarEstudiantes();
                    break;
                case 4:
                    eliminarEstudiante(input);
                    break;
                case 5:
                    cambiarEdad(input);
                    break;
                case 6:
                    cambiarID(input);
                    break;
                case 7:
                    calcularMediaEdades();
                    break;
                case 8:
                    ordenarEstudiantesPorEdad();
                    break;
                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        input.close();
    }

    private static void agregarEstudiante(Scanner input) {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        System.out.print("Introduce el id: ");
        int id = input.nextInt();
        input.nextLine(); // Consumir salto de línea

        // Verificar si la ID ya existe
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                System.out.println("Error: La ID ya existe. No se añadirá el estudiante.");
                return;
            }
        }

        System.out.print("Introduce el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = input.nextInt();

        estudiantes.add(new Estudiante(id, nombre, edad));
        guardarEstudiantes(estudiantes);
        System.out.println("Estudiante agregado correctamente.");
    }

    private static void buscarEstudiante(Scanner input) {
        System.out.print("Introduce el id del estudiante a buscar: ");
        int idBuscar = input.nextInt();
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        for (Estudiante e : estudiantes) {
            if (e.getId() == idBuscar) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    private static void listarEstudiantes() {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    private static void eliminarEstudiante(Scanner input) {
        System.out.print("Introduce el id del estudiante a eliminar: ");
        int idEliminar = input.nextInt();
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        boolean eliminado = estudiantes.removeIf(e -> e.getId() == idEliminar);

        if (eliminado) {
            guardarEstudiantes(estudiantes);
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("No se encontró un estudiante con esa ID.");
        }
    }

    private static void cambiarEdad(Scanner input) {
        System.out.print("Introduce el id del estudiante a cambiar la edad: ");
        int idCambiar = input.nextInt();
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        for (Estudiante e : estudiantes) {
            if (e.getId() == idCambiar) {
                System.out.print("Introduce la nueva edad: ");
                e.setEdad(input.nextInt());
                guardarEstudiantes(estudiantes);
                System.out.println("Edad actualizada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un estudiante con esa ID.");
    }

    private static void cambiarID(Scanner input) {
        System.out.print("Introduce el id del estudiante a cambiar: ");
        int idCambiar = input.nextInt();
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        for (Estudiante e : estudiantes) {
            if (e.getId() == idCambiar) {
                System.out.print("Introduce el nuevo ID: ");
                e.setId(input.nextInt());
                guardarEstudiantes(estudiantes);
                System.out.println("ID actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un estudiante con esa ID.");
    }

    private static void calcularMediaEdades() {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        double media = estudiantes.stream().mapToInt(Estudiante::getEdad).average().orElse(0);
        System.out.println("La media de edades de los estudiantes es: " + media);
    }

    private static void ordenarEstudiantesPorEdad() {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        estudiantes.sort((e1, e2) -> Integer.compare(e1.getEdad(), e2.getEdad()));

        System.out.println("Estudiantes ordenados por edad:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    private static ArrayList<Estudiante> cargarEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estudiantes.dat"))) {
            while (true) {
                try {
                    estudiantes.add((Estudiante) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // Archivo no existe, se creará uno nuevo
        } catch (Exception e) {
            System.out.println("Error al cargar estudiantes: " + e.getMessage());
        }

        return estudiantes;
    }

    private static void guardarEstudiantes(ArrayList<Estudiante> estudiantes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            for (Estudiante e : estudiantes) {
                oos.writeObject(e);
            }
        } catch (Exception e) {
            System.out.println("Error al guardar estudiantes: " + e.getMessage());
        }
    }
}
