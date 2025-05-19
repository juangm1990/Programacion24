package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_BuscarAñadir2;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorEstudiantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes;

        int opcion;
        do {
            System.out.println("0.- Salir");
            System.out.println("1.- Añadir nuevos estudiantes");
            System.out.println("2.- Listar los estudiantes guardados");
            System.out.println("3.- Buscar un estudiante por su ID");
            System.out.print("Elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    listaEstudiantes = leerEstudiantes(); // Leer los datos previos

                    try {
                        System.out.print("ID del estudiante: ");
                        int id = input.nextInt();
                        input.nextLine(); // Limpiar buffer
                        System.out.print("Nombre del estudiante: ");
                        String nombre = input.nextLine();
                        System.out.print("Edad del estudiante: ");
                        int edad = input.nextInt();

                        listaEstudiantes.add(new Estudiante(id, nombre, edad)); // Agregar nuevo estudiante
                        escribirEstudiantes(listaEstudiantes); // Guardar la lista completa
                        System.out.println("Estudiante añadido correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error al añadir estudiante: " + e.getMessage());
                    }
                    break;

                case 2:
                    listaEstudiantes = leerEstudiantes();
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes guardados.");
                    } else {
                        System.out.println("Lista de estudiantes:");
                        for (Estudiante e : listaEstudiantes) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    listaEstudiantes = leerEstudiantes();
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes en la base de datos.");
                        break;
                    }

                    System.out.print("Ingrese el ID del estudiante a buscar: ");
                    int idBuscado = input.nextInt();
                    boolean encontrado = false;

                    for (Estudiante e : listaEstudiantes) {
                        if (e.getId() == idBuscado) {
                            System.out.println("Estudiante encontrado: " + e);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ningún estudiante con ID " + idBuscado);
                    }
                    break;

                case 0:
                    System.out.println("¡Gracias por usar el programa!");
                    break;

                default:
                    System.out.println("Error: opción no válida.");
            }
        } while (opcion != 0);

        input.close();
    }


    // Método para leer la lista de estudiantes desde el archivo binario.
    @SuppressWarnings("unchecked")
    private static ArrayList<Estudiante> leerEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        File file = new File("estudiantes.dat");

        if (!file.exists()) return estudiantes; // Si el archivo no existe, devolver lista vacía

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof ArrayList<?>) { // Comprobamos que realmente es una lista
                estudiantes = (ArrayList<Estudiante>) obj;
            }
        } catch (Exception e) {
            System.out.println("Error al leer los estudiantes: " + e.getMessage());
        }
        return estudiantes;
    }

    // Método para escribir la lista de estudiantes en el archivo binario.
    private static void escribirEstudiantes(ArrayList<Estudiante> estudiantes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            oos.writeObject(estudiantes);
        } catch (IOException e) {
            System.out.println("Error al guardar estudiantes: " + e.getMessage());
        }
    }
}
