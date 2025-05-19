package PrimerTrimestre.Examenes.Practica7;


import java.util.Scanner;

public class MenuOpciones {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Mundial mundial_2022 = null;  // Inicialización del Mundial
        int opcion = 0;

        do {
            // Mostrar el menú de opciones
            System.out.println("0| Salir del programa");
            System.out.println("1| Crear un Mundial");
            System.out.println("2| Crear una selección");
            System.out.println("3| Crear un futbolista");
            System.out.println("4| Crear un entrenador");
            System.out.println("5| Mostrar la lista de los futbolistas de los países");
            System.out.println("6| Eliminar un futbolista");
            System.out.println("7| Mostrar los jugadores con sobrepeso");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            opcion = input.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");
                    break;

                case 1: // Crear un Mundial
                    System.out.println("Introduce el ID del Mundial:");
                    int idMundial = input.nextInt();
                    System.out.println("Introduce el año del Mundial:");
                    int anyoMundial = input.nextInt();
                    mundial_2022 = new Mundial(idMundial, anyoMundial);  // Crear el Mundial con los valores introducidos
                    System.out.println("Mundial creado: " + mundial_2022);
                    break;

                case 2: // Crear una selección
                    if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Introduce el ID de la selección:");
                    int idSeleccion = input.nextInt();
                    input.nextLine(); // Limpiar el buffer
                    System.out.println("Introduce el nombre de la selección:");
                    String nombreSeleccion = input.nextLine();
                    SeleccionFutbol seleccion = new SeleccionFutbol(idSeleccion, nombreSeleccion);
                    if (!mundial_2022.anyadirSeleccion(idSeleccion, nombreSeleccion)) {
                        System.out.println("La selección ya existe en el Mundial.");
                    } else {
                        System.out.println("Selección creada: " + seleccion);
                    }
                    break;

                case 3: // Crear un futbolista y añadirlo a la selección
                    if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Introduce el ID del futbolista:");
                    int idFutbolista = input.nextInt();
                    input.nextLine(); 
                    System.out.println("Introduce el nombre:");
                    String nombreFutbolista = input.nextLine();
                    System.out.println("Introduce los apellidos:");
                    String apellidosFutbolista = input.nextLine();
                    System.out.println("Introduce el año de nacimiento:");
                    String fechaNacFutbolista = input.nextLine();
                    System.out.println("Introduce el peso:");
                    double pesoFutbolista = input.nextDouble();
                    System.out.println("Introduce la altura:");
                    double alturaFutbolista = input.nextDouble();
                    System.out.println("Introduce el dorsal:");
                    int dorsalFutbolista = input.nextInt();
                    input.nextLine(); 
                    System.out.println("Introduce la demarcación:");
                    String demarcacionFutbolista = input.nextLine();

                    // Selección a la que se añadirá el futbolista
                    System.out.println("Introduce el ID de la selección a la que pertenece el futbolista:");
                    int idSeleccionFutbolista = input.nextInt();

                    Futbolista futbolista = new Futbolista(idFutbolista, nombreFutbolista, apellidosFutbolista, fechaNacFutbolista, pesoFutbolista, alturaFutbolista, dorsalFutbolista, demarcacionFutbolista);
                    SeleccionFutbol seleccionFutbolista = mundial_2022.getSeleccion(idSeleccionFutbolista);
                    
                    if (seleccionFutbolista != null) {
                        seleccionFutbolista.anadirPersona(futbolista);  // Añadir futbolista a la selección
                        System.out.println("Futbolista creado y añadido a la selección: " + futbolista);
                    } else {
                        System.out.println("No se encontró una selección con ese ID.");
                    }
                    break;

                case 4: // Crear un entrenador y añadirlo a la selección
                    if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Introduce el ID del entrenador:");
                    int idEntrenador = input.nextInt();
                    input.nextLine(); // Limpiar el buffer
                    System.out.println("Introduce el nombre:");
                    String nombreEntrenador = input.nextLine();
                    System.out.println("Introduce los apellidos:");
                    String apellidosEntrenador = input.nextLine();
                    System.out.println("Introduce el año de nacimiento:");
                    String fechaNacEntrenador = input.nextLine();
                    System.out.println("Introduce el peso:");
                    double pesoEntrenador = input.nextDouble();
                    System.out.println("Introduce la altura:");
                    double alturaEntrenador = input.nextDouble();
                    System.out.println("Introduce el ID de federación:");
                    int idFederacionEntrenador = input.nextInt();
                    Entrenador entrenador = new Entrenador(idEntrenador, nombreEntrenador, apellidosEntrenador, fechaNacEntrenador, pesoEntrenador, alturaEntrenador, idFederacionEntrenador);
                    // Añadir entrenador a la selección
                    System.out.println("Introduce el ID de la selección para añadir el entrenador:");
                    int idSeleccionEntrenador = input.nextInt();
                    SeleccionFutbol seleccionEntrenador = mundial_2022.getSeleccion(idSeleccionEntrenador);
                    if (seleccionEntrenador != null) {
                        seleccionEntrenador.anadirPersona(entrenador);  // Añadir entrenador a la selección
                        System.out.println("Entrenador creado y añadido a la selección: " + entrenador);
                    } else {
                        System.out.println("No se encontró una selección con ese ID.");
                    }
                    break;

                case 5: // Mostrar la lista de futbolistas por país
                    if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Listado de futbolistas de España:");
                    mundial_2022.getSeleccion(1).listarIntegrantes();
                    System.out.println("Listado de futbolistas de Argentina:");
                    mundial_2022.getSeleccion(2).listarIntegrantes();
                    break;

                case 6: // Eliminar un futbolista
                    if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Introduce el ID de la selección de la que eliminar el jugador:");
                    int idSeleccionEliminar = input.nextInt();
                    System.out.println("Introduce el ID del jugador a eliminar:");
                    int idJugadorEliminar = input.nextInt();
                    if (mundial_2022.getSeleccion(idSeleccionEliminar).borrarPersona(idJugadorEliminar)) {
                        System.out.println("Jugador eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró al jugador con ese ID.");
                    }
                    break;

                case 7: // Mostrar los jugadores con sobrepeso
                 if (mundial_2022 == null) {
                        System.out.println("Primero debes crear un Mundial.");
                        break;
                    }
                    System.out.println("Jugadores con sobrepeso en España:");
                    mundial_2022.getSeleccion(1).listarFutbolistasSobrepeso();  // Mostrar futbolistas con sobrepeso en España
                    System.out.println("Jugadores con sobrepeso en Argentina:");
                    mundial_2022.getSeleccion(2).listarFutbolistasSobrepeso();  // Mostrar futbolistas con sobrepeso en Argentina
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 0); // Termina cuando se elige la opción 0

        input.close(); // Cerrar el Scanner
    }

}
