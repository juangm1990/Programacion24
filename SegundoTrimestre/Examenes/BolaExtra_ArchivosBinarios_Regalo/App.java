package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios_Regalo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("GESTIÓN DE USUARIOS");
            System.out.println("0| Salir");
            System.out.println("1| Agregar usuario");
            System.out.println("2| Listar usuarios");
            System.out.println("3| Agregar valoracion");
            System.out.println("4| Listar valoraciones");
            System.out.println("5| Listar TODO");

            System.out.println("----------------------------");
            System.out.print("Por favor, elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    agregarUsuario(input);
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    agregarValoracion(input);
                    break;
                case 4:
                    listarValoracion();
                    break;
                case 5:
                    listarUsuarios();
                    listarValoracion();
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

    /*
     * AGREGAR USUARIOS Y CREAR DOCUMENTO USUARIOS.DAT
     */

    private static void agregarUsuario(Scanner input) {
        ArrayList<Usuario> usuarios = cargarUsuario();

        System.out.print("Introduce el id: ");
        int id = input.nextInt();
        input.nextLine(); // Consumir salto de línea

        // Verificar si la ID ya existe
        for (Usuario e : usuarios) {
            if (e.getId() == id) {
                System.out.println("Error: La ID ya existe. No se añadirá el usuario.");
                return;
            }
        }

        System.out.print("Introduce el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce la email: ");
        String email = input.nextLine();

        usuarios.add(new Usuario(id, nombre, email));
        guardarUsuarios(usuarios);
        System.out.println("Usuario agregado correctamente.");
    }

    private static ArrayList<Usuario> cargarUsuario() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuarios.dat"))) {
            while (true) {
                try {
                    usuarios.add((Usuario) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // Archivo no existe, se creará uno nuevo
        } catch (Exception e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }

        return usuarios;
    }

    private static void guardarUsuarios(ArrayList<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usuarios.dat"))) {
            for (Usuario e : usuarios) {
                oos.writeObject(e);
            }
        } catch (Exception e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    /*
     * LISTAR LOS USUARIOS
     */

    private static void listarUsuarios() {
        ArrayList<Usuario> usuarios = cargarUsuario();
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.println("Lista de usuarios:");
        for (Usuario e : usuarios) {
            System.out.println(e);
        }
    }

    /*
     * AGREGAR VALORACIÓN Y CREAR DOCUMENTO VALORACION.DAT
     */

    private static void agregarValoracion(Scanner input) {
        ArrayList<Valoracion> valoraciones = cargarValoracion();

        System.out.print("Introduce el id de la valoración: ");
        int id = input.nextInt();
        input.nextLine(); // Consumir salto de línea

        // Verificar si la ID ya existe
        for (Valoracion e : valoraciones) {
            if (e.getId() == id) {
                System.out.println("Error: La ID ya existe. No se añadirá la valoración.");
                return;
            }
        }

        System.out.print("Introduce el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce la puntuación: ");
        int puntuacion = input.nextInt();

        valoraciones.add(new Valoracion(id, nombre, puntuacion));
        Guardarvaloraciones(valoraciones);
        System.out.println("Valoración agregada correctamente.");
    }

    private static ArrayList<Valoracion> cargarValoracion() {
        ArrayList<Valoracion> valoraciones = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("valoraciones.dat"))) {
            while (true) {
                try {
                    valoraciones.add((Valoracion) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // Archivo no existe, se creará uno nuevo
        } catch (Exception e) {
            System.out.println("Error al cargar la valoracion: " + e.getMessage());
        }

        return valoraciones;
    }

    private static void Guardarvaloraciones(ArrayList<Valoracion> valoraciones) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("valoraciones.dat"))) {
            for (Valoracion e : valoraciones) {
                oos.writeObject(e);
            }
        } catch (Exception e) {
            System.out.println("Error al guardar la valoración: " + e.getMessage());
        }
    }

    /*
     * LISTAR LOS USUARIOS
     */

     private static void listarValoracion() {
        ArrayList<Valoracion> valoraciones = cargarValoracion();
        if (valoraciones.isEmpty()) {
            System.out.println("No hay valoraciones registradas.");
            return;
        }

        System.out.println("Lista de valoraciones:");
        for (Valoracion e : valoraciones) {
            System.out.println(e);
        }
    }

}
