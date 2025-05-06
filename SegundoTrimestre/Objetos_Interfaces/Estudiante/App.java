package SegundoTrimestre.Objetos_Interfaces.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Insertar alumno (normal)");
            System.out.println("2. Insertar alumnos hasta escribir FIN");
            System.out.println("3. Insertar alumno con SPLIT (id#nombre#email)");
            System.out.println("4. Añadir nota a un alumno");
            System.out.println("5. Añadir varias notas hasta escribir FIN");
            System.out.println("6. Añadir nota con SPLIT (id#nota)");
            System.out.println("7. Modificar una nota");
            System.out.println("8. Eliminar una nota");
            System.out.println("9. Eliminar un alumno");
            System.out.println("10. Mostrar todos los alumnos");
            System.out.println("11. Buscar alumno por ID");
            System.out.println("12. Mostrar solo aprobados");
            System.out.println("13. Mostrar solo suspensos");
            System.out.println("14. Mostrar resumen (ID, nombre, email, media)");
            System.out.println("15. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {

                case 1: 
                    insertarAlumnoNormal(input, listaAlumnos);
                    break;
            
                case 2: 
                    insertarAlumnosHastaFin(input, listaAlumnos);
                    break;
            
                case 3: 
                    insertarAlumnoSplit(input, listaAlumnos);
                    break;
            
                case 4: 
                    añadirNotaNormal(input, listaAlumnos);
                    break;
            
                case 5: 
                    añadirNotasHastaFin(input, listaAlumnos);
                    break;
            
                case 6: 
                    añadirNotaSplit(input, listaAlumnos);
                    break;
            
                case 7: 
                    modificarNota(input, listaAlumnos);
                    break;
            
                case 8: 
                    eliminarNota(input, listaAlumnos);
                    break;
            
                case 9: 
                    eliminarAlumno(input, listaAlumnos);
                    break;
            
                case 10: 
                    mostrarTodosLosAlumnos(listaAlumnos);
                    break;
            
                case 11: 
                    buscarAlumnoPorId(input, listaAlumnos);
                    break;
            
                case 12: 
                    mostrarAprobados(listaAlumnos);
                    break;
            
                case 13: 
                    mostrarSuspensos(listaAlumnos);
                    break;
                
                case 14: 
                    mostrarResumenAlumnos(listaAlumnos);
                    break;
                            
                case 15: 
                    System.out.println("Fin del programa.");
                    break;
            
                default: 
                    System.out.println("Opción incorrecta.");
            }
            

        } while (opcion != 14);

        input.close();
    }

    public static void insertarAlumnoNormal(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        Alumno a = new Alumno(id, nombre, email);
        lista.add(a);
        System.out.println("Alumno añadido.");
    }

    public static void insertarAlumnosHastaFin(Scanner input, ArrayList<Alumno> lista) {
        String nombre = "";
        while (true) {
            System.out.print("Nombre (FIN para salir): ");
            nombre = input.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            Alumno a = new Alumno(id, nombre, email);
            lista.add(a);
        }
    }

    public static void insertarAlumnoSplit(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("Escribe los datos (id#nombre#email): ");
        String linea = input.nextLine();
        String[] partes = linea.split("#");
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String email = partes[2];
        Alumno a = new Alumno(id, nombre, email);
        lista.add(a);
        System.out.println("Alumno añadido.");
    }

    public static void añadirNotaNormal(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno: ");
        int id = input.nextInt();
        System.out.print("Nota: ");
        double nota = input.nextDouble();
        input.nextLine();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.get(i).añadirNota(nota);
                System.out.println("Nota añadida.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void añadirNotasHastaFin(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno: ");
        int id = input.nextInt();
        input.nextLine();
        String entrada = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                while (true) {
                    System.out.print("Introduce nota (FIN para salir): ");
                    entrada = input.nextLine();
                    if (entrada.equalsIgnoreCase("FIN")) {
                        break;
                    }
                    double nota = Double.parseDouble(entrada);
                    lista.get(i).añadirNota(nota);
                }
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void añadirNotaSplit(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("Escribe los datos (id#nota): ");
        String linea = input.nextLine();
        String[] partes = linea.split("#");
        int id = Integer.parseInt(partes[0]);
        double nota = Double.parseDouble(partes[1]);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.get(i).añadirNota(nota);
                System.out.println("Nota añadida.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void modificarNota(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno: ");
        int id = input.nextInt();
        input.nextLine();

        for (int i = 0; i < lista.size(); i++) {
            Alumno a = lista.get(i);
            if (a.getId() == id) {
                ArrayList<Double> notas = a.getListaNotas();
                for (int j = 0; j < notas.size(); j++) {
                    System.out.println(j + ". " + notas.get(j));
                }
                System.out.print("Posición a modificar: ");
                int pos = input.nextInt();
                System.out.print("Nueva nota: ");
                double nueva = input.nextDouble();
                input.nextLine();
                if (pos >= 0 && pos < notas.size()) {
                    notas.set(pos, nueva);
                    System.out.println("Nota modificada.");
                } else {
                    System.out.println("Posición incorrecta.");
                }
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void eliminarNota(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno: ");
        int id = input.nextInt();
        input.nextLine();

        for (int i = 0; i < lista.size(); i++) {
            Alumno a = lista.get(i);
            if (a.getId() == id) {
                ArrayList<Double> notas = a.getListaNotas();
                for (int j = 0; j < notas.size(); j++) {
                    System.out.println(j + ". " + notas.get(j));
                }
                System.out.print("Posición a eliminar: ");
                int pos = input.nextInt();
                input.nextLine();
                if (pos >= 0 && pos < notas.size()) {
                    notas.remove(pos);
                    System.out.println("Nota eliminada.");
                } else {
                    System.out.println("Posición incorrecta.");
                }
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void eliminarAlumno(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno a eliminar: ");
        int id = input.nextInt();
        input.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
                System.out.println("Alumno eliminado.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void mostrarTodosLosAlumnos(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
        }
    }

    public static void buscarAlumnoPorId(Scanner input, ArrayList<Alumno> lista) {
        System.out.print("ID del alumno: ");
        int id = input.nextInt();
        input.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.get(i).mostrar();
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void mostrarAprobados(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).estaAprobado()) {
                lista.get(i).mostrar();
            }
        }
    }

    public static void mostrarSuspensos(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).estaAprobado()) {
                lista.get(i).mostrar();
            }
        }
    }


    public static void mostrarResumenAlumnos(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Alumno a = lista.get(i);
            System.out.println("ID: " + a.getId());
            System.out.println("Nombre: " + a.getNombre());
            System.out.println("Email: " + a.getEmail());
            System.out.println("Nota media: " + a.calcularMedia());
    
            // Mostrar todas las notas
            System.out.print("Notas: ");
            ArrayList<Double> notas = a.getListaNotas();
            for (int j = 0; j < notas.size(); j++) {
                System.out.print(notas.get(j) + " ");
            }
    
            System.out.println("\n-------------------------");
        }
    }
    
    



}
