package TercerTrimestre.Recuperacion.PruebaPractica7;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mundial> mundiales = new ArrayList<>();
        Mundial mundial = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ INTERACTIVO DEL MUNDIAL =====");
            System.out.println("0| Salir");
            System.out.println("1| Crear nuevo mundial");
            System.out.println("2| Listar mundiales existentes");
            System.out.println("3| Añadir selección a un mundial");
            System.out.println("4| Listar selecciones de un mundial");
            System.out.println("5| Añadir integrante a selección");
            System.out.println("6| Listar integrantes de selección");
            System.out.println("7| Listar futbolistas con sobrepeso");
            System.out.print("Elige una opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el año del Mundial: ");
                    int anio = input.nextInt();
                    mundial = new Mundial(anio);
                    mundiales.add(mundial);
                    System.out.println("Mundial " + anio + " creado.");
                    break;

                case 2:
                    if (mundiales.isEmpty()) {
                        System.out.println("No hay mundiales creados.");
                    } else {
                        System.out.println("Mundiales creados:");
                        for (Mundial m : mundiales) {
                            System.out.println("- " + m.getAnio());
                        }
                    }
                    break;

                case 3:
                    if (mundial == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.print("ID de selección: ");
                    int idSel = input.nextInt();
                    input.nextLine();
                    System.out.print("Nombre de la selección: ");
                    String nombreSel = input.nextLine();
                    SeleccionFutbol s = new SeleccionFutbol(idSel, nombreSel);
                    mundial.anyadirSeleccion(s);
                    System.out.println("Selección añadida al Mundial " + mundial.getAnio());
                    break;

                case 4:
                    if (mundial == null || mundial.getSelecciones().isEmpty()) {
                        System.out.println("No hay selecciones registradas.");
                    } else {
                        System.out.println("Selecciones del Mundial " + mundial.getAnio() + ":");
                        for (SeleccionFutbol sel : mundial.getSelecciones()) {
                            System.out.println("- " + sel.getNombre());
                        }
                    }
                    break;

                case 5:
                    if (mundial == null || mundial.getSelecciones().isEmpty()) {
                        System.out.println("Primero crea un Mundial y alguna selección.");
                        break;
                    }

                    System.out.print("Nombre de la selección: ");
                    String nombreBuscada = input.nextLine();
                    SeleccionFutbol seleccion = mundial.getSeleccion(nombreBuscada);
                    if (seleccion == null) {
                        System.out.println("Selección no encontrada.");
                        break;
                    }

                    System.out.println("Tipo de integrante:");
                    System.out.println("1. Futbolista");
                    System.out.println("2. Entrenador");
                    System.out.println("3. Fisioterapeuta");
                    int tipo = input.nextInt();
                    input.nextLine();

                    System.out.print("ID: ");
                    int id = input.nextInt(); input.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = input.nextLine();
                    System.out.print("Edad: ");
                    int edad = input.nextInt();
                    System.out.print("Altura (m): ");
                    double altura = input.nextDouble();
                    System.out.print("Peso (kg): ");
                    double peso = input.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Dorsal: ");
                        int dorsal = input.nextInt(); input.nextLine();
                        System.out.print("Demarcación: ");
                        String demarcacion = input.nextLine();
                        seleccion.anyadir(new Futbolista(id, nombre, apellido, edad, altura, peso, dorsal, demarcacion));
                    } else if (tipo == 2) {
                        System.out.print("ID Federación: ");
                        int idFed = input.nextInt();
                        seleccion.anyadir(new Entrenador(id, nombre, apellido, edad, altura, peso, idFed));
                    } else if (tipo == 3) {
                        System.out.print("Años experiencia: ");
                        int anios = input.nextInt();
                        seleccion.anyadir(new Fisioterapeuta(id, nombre, apellido, edad, altura, peso, anios));
                    }

                    System.out.println("Integrante añadido.");
                    break;

                case 6:
                    if (mundial == null) {
                        System.out.println("Primero crea el Mundial.");
                        break;
                    }
                    System.out.print("Nombre de la selección: ");
                    String nomSelListar = input.nextLine();
                    SeleccionFutbol selListar = mundial.getSeleccion(nomSelListar);
                    if (selListar != null) {
                        selListar.listarIntegrantes();
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 7:
                    if (mundial == null) {
                        System.out.println("Primero crea el Mundial.");
                        break;
                    }
                    System.out.print("Nombre de la selección: ");
                    String nomSelSobrepeso = input.nextLine();
                    SeleccionFutbol selSobrepeso = mundial.getSeleccion(nomSelSobrepeso);
                    if (selSobrepeso != null) {
                        selSobrepeso.listarFutbolistasSobrepeso();
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        input.close();
    }
}
