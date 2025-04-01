package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        ArrayList<Participantes> participantes = new ArrayList<>();
        ArrayList<Partidas> partidas = new ArrayList<>();

        do {
            // Menú de opciones
            System.out.println("GESTIÓN DE PARTICIPANTES Y PARTIDAS");
            System.out.println("0| Salir");
            System.out.println("1| Agregar Participante");
            System.out.println("2| Agregar Partida");
            System.out.println("3| Guardar Participantes");
            System.out.println("4| Guardar Partidas");
            System.out.println("5| Mostrar Participantes");
            System.out.println("6| Mostrar Partidas");
            System.out.print("Opción: ");
            
            opcion = input.nextInt();
            input.nextLine(); // Salto de línea

            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                case 1:
                    agregarParticipante(participantes);
                    break;
                case 2:
                    agregarPartida(partidas);
                    break;
                case 3:
                    guardarParticipantes(participantes);
                    break;
                case 4:
                    guardarPartidas(partidas);
                    break;
                case 5:
                    mostrarParticipantes();
                    break;
                case 6:
                    mostrarPartidas();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);  // El bucle continuará hasta que se elija la opción 0
    }

    // AGREGAR PARTICIPANTE
    private static void agregarParticipante(ArrayList<Participantes> participantes) {
        String linea;
        Participantes participante;
        FileOutputStream fosParticipantes = null;
        ObjectOutputStream oosParticipantes = null;

        try {
            fosParticipantes = new FileOutputStream("Participantes.dat", true);  // "true" para agregar al archivo
            oosParticipantes = new ObjectOutputStream(fosParticipantes);

            do {
                System.out.println("Introduce datos (id#nombre#email): ");
                linea = input.nextLine();
                if (!linea.equals("fin")) {
                    String[] datos = linea.split("#");
                    participante = new Participantes(datos[0], datos[1], datos[2]);
                    participantes.add(participante);
                    oosParticipantes.writeObject(participante); // Escribir al archivo
                    System.out.println("¿Parar? Escribe 'fin' para terminar.");
                }
            } while (!linea.equals("fin"));
        } catch (Exception e) {
            System.out.println("Error al agregar participante: " + e.getMessage());
        } finally {
            try {
                if (oosParticipantes != null) {
                    oosParticipantes.close();
                }
                if (fosParticipantes != null) {
                    fosParticipantes.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }

    // AGREGAR PARTIDA
    private static void agregarPartida(ArrayList<Partidas> partidas) {
        String linea;
        Partidas partida;
        FileOutputStream fosPartidas = null;
        ObjectOutputStream oosPartidas = null;

        try {
            fosPartidas = new FileOutputStream("Partidas.dat", true);  // "true" para agregar al archivo
            oosPartidas = new ObjectOutputStream(fosPartidas);

            do {
                System.out.println("Introduce datos (id#nombre del juego#puntuación): ");
                linea = input.nextLine();
                if (!linea.equals("fin")) {
                    String[] datos = linea.split("#");
                    partida = new Partidas(datos[0], datos[1], datos[2]);
                    partidas.add(partida);
                    oosPartidas.writeObject(partida); // Escribir al archivo
                    System.out.println("¿Parar? Escribe 'fin' para terminar.");
                }
            } while (!linea.equals("fin"));
        } catch (Exception e) {
            System.out.println("Error al agregar partida: " + e.getMessage());
        } finally {
            try {
                if (oosPartidas != null) {
                    oosPartidas.close();
                }
                if (fosPartidas != null) {
                    fosPartidas.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }

    // GUARDAR PARTICIPANTES
    private static void guardarParticipantes(ArrayList<Participantes> participantes) {
        FileOutputStream fosParticipantes = null;
        ObjectOutputStream oosParticipantes = null;

        try {
            fosParticipantes = new FileOutputStream("Participantes.dat");
            oosParticipantes = new ObjectOutputStream(fosParticipantes);
            for (Participantes p : participantes) {
                oosParticipantes.writeObject(p);
            }
            System.out.println("Participantes guardados correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar participantes: " + e.getMessage());
        } finally {
            try {
                if (oosParticipantes != null) {
                    oosParticipantes.close();
                }
                if (fosParticipantes != null) {
                    fosParticipantes.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }

    // GUARDAR PARTIDAS
    private static void guardarPartidas(ArrayList<Partidas> partidas) {
        FileOutputStream fosPartidas = null;
        ObjectOutputStream oosPartidas = null;

        try {
            fosPartidas = new FileOutputStream("Partidas.dat");
            oosPartidas = new ObjectOutputStream(fosPartidas);
            for (Partidas pa : partidas) {
                oosPartidas.writeObject(pa);
            }
            System.out.println("Partidas guardadas correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar partidas: " + e.getMessage());
        } finally {
            try {
                if (oosPartidas != null) {
                    oosPartidas.close();
                }
                if (fosPartidas != null) {
                    fosPartidas.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }

    // MOSTRAR PARTICIPANTES (Leer el archivo y mostrar por consola)
    private static void mostrarParticipantes() {
        FileInputStream fisParticipantes = null;
        ObjectInputStream oisParticipantes = null;

        try {
            fisParticipantes = new FileInputStream("Participantes.dat");
            oisParticipantes = new ObjectInputStream(fisParticipantes);
            System.out.println("Lista de Participantes:");
            while (true) {
                try {
                    Participantes p = (Participantes) oisParticipantes.readObject();
                    System.out.println(p);
                } catch (Exception e) {
                    break;  // Termina cuando llegue al final del archivo
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer los participantes: " + e.getMessage());
        } finally {
            try {
                if (oisParticipantes != null) {
                    oisParticipantes.close();
                }
                if (fisParticipantes != null) {
                    fisParticipantes.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }

    // MOSTRAR PARTIDAS (Leer el archivo y mostrar por consola)
    private static void mostrarPartidas() {
        FileInputStream fisPartidas = null;
        ObjectInputStream oisPartidas = null;

        try {
            fisPartidas = new FileInputStream("Partidas.dat");
            oisPartidas = new ObjectInputStream(fisPartidas);
            System.out.println("Lista de Partidas:");
            while (true) {
                try {
                    Partidas pa = (Partidas) oisPartidas.readObject();
                    System.out.println(pa);
                } catch (Exception e) {
                    break;  // Termina cuando llegue al final del archivo
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer las partidas: " + e.getMessage());
        } finally {
            try {
                if (oisPartidas != null) {
                    oisPartidas.close();
                }
                if (fisPartidas != null) {
                    fisPartidas.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar los flujos: " + e.getMessage());
            }
        }
    }
}
