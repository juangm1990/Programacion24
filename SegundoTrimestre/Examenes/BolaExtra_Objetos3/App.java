package SegundoTrimestre.Examenes.BolaExtra_Objetos3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Personaje> lista = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ PERSONAJES ---");
            System.out.println("1. Añadir personaje");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Activar habilidad de híbrido");
            System.out.println("4. Convertir apoyo en híbrido");
            System.out.println("5. Estadísticas de poder");
            System.out.println("6. Buscar por tipo y nivel mínimo");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1. Ataque  2. Apoyo  3. Híbrido");
                    int tipo = input.nextInt();
                    input.nextLine();

                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();

                    System.out.print("Nivel: ");
                    int nivel = input.nextInt();
                    input.nextLine();

                    if (tipo == 1) {
                        System.out.print("Daño base: ");
                        int dano = input.nextInt();
                        input.nextLine();
                        lista.add(new PersonajeAtaque(id, nombre, nivel, dano));
                    } else if (tipo == 2) {
                        System.out.print("Curación base: ");
                        int cura = input.nextInt();
                        input.nextLine();
                        lista.add(new PersonajeApoyo(id, nombre, nivel, cura));
                    } else if (tipo == 3) {
                        System.out.print("Curación base: ");
                        int cura = input.nextInt();
                        input.nextLine();
                        System.out.print("Curación extra: ");
                        int extra = input.nextInt();
                        input.nextLine();
                        lista.add(new PersonajeHibrido(id, nombre, nivel, cura, extra));
                    }
                    break;

                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                        System.out.println("Poder: " + lista.get(i).calcularPoder());
                    }
                    break;

                case 3:
                    System.out.print("ID del híbrido: ");
                    int idH = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < lista.size(); i++) {
                        Personaje p = lista.get(i);
                        if (p.getId() == idH && p instanceof PersonajeHibrido) {
                            ((PersonajeHibrido) p).activarHabilidad();
                        }
                    }
                    break;

                case 4:
                    System.out.print("ID del personaje de apoyo: ");
                    int idA = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < lista.size(); i++) {
                        Personaje p = lista.get(i);
                        if (p.getId() == idA && p instanceof PersonajeApoyo && !(p instanceof PersonajeHibrido)) {
                            PersonajeApoyo apoyo = (PersonajeApoyo) p;
                            System.out.print("Curación extra: ");
                            int extra = input.nextInt();
                            input.nextLine();
                            PersonajeHibrido nuevo = new PersonajeHibrido(
                                apoyo.getId(),
                                apoyo.getNombre(),
                                apoyo.getNivel(),
                                apoyo.curacionBase,
                                extra
                            );
                            lista.set(i, nuevo);
                            System.out.println("Convertido en híbrido.");
                        }
                    }
                    break;

                case 5:
                    int totalAtaque = 0;
                    int totalApoyo = 0;
                    int totalHibrido = 0;
                    int totalPoder = 0;
                    int maxPoder = 0;
                    String masPoderoso = "";

                    for (int i = 0; i < lista.size(); i++) {
                        Personaje p = lista.get(i);
                        int poder = p.calcularPoder();
                        totalPoder = totalPoder + poder;

                        if (p.getRol().equals("ataque")) {
                            totalAtaque = totalAtaque + poder;
                        } else if (p.getRol().equals("apoyo")) {
                            totalApoyo = totalApoyo + poder;
                        } else if (p.getRol().equals("hibrido")) {
                            totalHibrido = totalHibrido + poder;
                        }

                        if (poder > maxPoder) {
                            maxPoder = poder;
                            masPoderoso = p.getNombre();
                        }
                    }

                    double media = 0;
                    if (lista.size() > 0) {
                        media = (double) totalPoder / lista.size();
                    }

                    System.out.println("Poder ATAQUE: " + totalAtaque);
                    System.out.println("Poder APOYO: " + totalApoyo);
                    System.out.println("Poder HÍBRIDO: " + totalHibrido);
                    System.out.println("Media poder total: " + media);
                    System.out.println("Más poderoso: " + masPoderoso + " (" + maxPoder + ")");
                    break;

                case 6:
                    System.out.print("Tipo (ataque, apoyo, hibrido): ");
                    String tipoBuscar = input.nextLine().toLowerCase();
                    System.out.print("Nivel mínimo: ");
                    int nivelMinimo = input.nextInt();
                    input.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < lista.size(); i++) {
                        Personaje p = lista.get(i);
                        if (p.getRol().toLowerCase().equals(tipoBuscar) && p.getNivel() >= nivelMinimo) {
                            System.out.println(p);
                            System.out.println("Poder: " + p.calcularPoder());
                            encontrado = true;
                        }
                    }

                    if (encontrado == false) {
                        System.out.println("No se encontraron personajes de tipo " + tipoBuscar + " con nivel mínimo " + nivelMinimo);
                    }
                    break;

                case 7:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);

        input.close();
    }
}
