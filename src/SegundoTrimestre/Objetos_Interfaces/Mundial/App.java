package SegundoTrimestre.Objetos_Interfaces.Mundial;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mundial mundial = new Mundial();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ MUNDIAL ---");
            System.out.println("1. Crear selección");
            System.out.println("2. Mostrar selecciones");
            System.out.println("3. Añadir futbolista");
            System.out.println("4. Añadir entrenador");
            System.out.println("5. Añadir fisioterapeuta");
            System.out.println("6. Eliminar futbolista");
            System.out.println("7. Mostrar integrantes de selección");
            System.out.println("8. Clasificación peso (IMC)");
            System.out.println("9. Mostrar media de altura (solo futbolistas)");
            System.out.println("10. Mostrar media de peso (solo futbolistas)");
            System.out.println("11. Mostrar todos los futbolistas con sobrepeso");
            System.out.println("12. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del país: ");
                    String pais = input.nextLine();
                    SeleccionFutbol seleccion = new SeleccionFutbol(pais);
                    mundial.anadirSeleccion(seleccion);
                    System.out.println("Selección creada correctamente.");
                    break;

                case 2:
                    mundial.mostrarSelecciones();
                    break;

                case 3:
                    System.out.print("Nombre del país de la selección: ");
                    String paisFut = input.nextLine();
                    SeleccionFutbol selFut = mundial.buscarSeleccionPorNombre(paisFut);
                    if (selFut != null) {
                        System.out.print("Nombre del futbolista: ");
                        String nombreF = input.nextLine();
                        System.out.print("Edad: ");
                        int edadF = input.nextInt();
                        System.out.print("Altura (en metros): ");
                        double alturaF = input.nextDouble();
                        System.out.print("Peso (en kg): ");
                        double pesoF = input.nextDouble();
                        System.out.print("Dorsal: ");
                        int dorsal = input.nextInt();
                        input.nextLine();

                        Futbolista f = new Futbolista(nombreF, edadF, alturaF, pesoF, dorsal);
                        selFut.anadirPersona(f);
                        System.out.println("Futbolista añadido.");
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del país de la selección: ");
                    String paisE = input.nextLine();
                    SeleccionFutbol selE = mundial.buscarSeleccionPorNombre(paisE);
                    if (selE != null) {
                        System.out.print("Nombre del entrenador: ");
                        String nombreE = input.nextLine();
                        System.out.print("Edad: ");
                        int edadE = input.nextInt();
                        System.out.print("Altura (en metros): ");
                        double alturaE = input.nextDouble();
                        System.out.print("Peso (en kg): ");
                        double pesoE = input.nextDouble();
                        input.nextLine();
                        System.out.print("Estrategia: ");
                        String estrategia = input.nextLine();

                        Entrenador e = new Entrenador(nombreE, edadE, alturaE, pesoE, estrategia);
                        selE.anadirPersona(e);
                        System.out.println("Entrenador añadido.");
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Nombre del país de la selección: ");
                    String paisFisio = input.nextLine();
                    SeleccionFutbol selFis = mundial.buscarSeleccionPorNombre(paisFisio);
                    if (selFis != null) {
                        System.out.print("Nombre del fisioterapeuta: ");
                        String nombre = input.nextLine();
                        System.out.print("Edad: ");
                        int edad = input.nextInt();
                        System.out.print("Altura (en metros): ");
                        double altura = input.nextDouble();
                        System.out.print("Peso (en kg): ");
                        double peso = input.nextDouble();
                        System.out.print("Años de experiencia: ");
                        int experiencia = input.nextInt();
                        System.out.print("¿Tiene camilla? (true/false): ");
                        boolean camilla = input.nextBoolean();
                        input.nextLine();

                        Fisioterapeuta fisio = new Fisioterapeuta(nombre, edad, altura, peso, experiencia, camilla);
                        selFis.anadirPersona(fisio);
                        System.out.println("Fisioterapeuta añadido.");
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 6:
                    System.out.print("Nombre del país de la selección: ");
                    String paisDel = input.nextLine();
                    SeleccionFutbol selDel = mundial.buscarSeleccionPorNombre(paisDel);
                    if (selDel != null) {
                        System.out.print("Nombre del futbolista a eliminar: ");
                        String nombreEliminar = input.nextLine();
                        selDel.eliminarFutbolista(nombreEliminar);
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 7:
                    System.out.print("Nombre del país de la selección: ");
                    String paisVer = input.nextLine();
                    SeleccionFutbol selVer = mundial.buscarSeleccionPorNombre(paisVer);
                    if (selVer != null) {
                        selVer.mostrarIntegrantes();
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 8:
                    System.out.print("Nombre del país de la selección: ");
                    String paisIMC = input.nextLine();
                    SeleccionFutbol selIMC = mundial.buscarSeleccionPorNombre(paisIMC);
                    if (selIMC != null) {
                        selIMC.mostrarPesoClasificado();
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 9:
                    System.out.print("Nombre del país de la selección: ");
                    String paisAltura = input.nextLine();
                    SeleccionFutbol selAltura = mundial.buscarSeleccionPorNombre(paisAltura);
                    if (selAltura != null) {
                        double sumaAltura = 0;
                        int contador = 0;
                        for (int i = 0; i < selAltura.getPersonas().size(); i++) {
                            if (selAltura.getPersonas().get(i) instanceof Futbolista) {
                                Futbolista f = (Futbolista) selAltura.getPersonas().get(i);
                                sumaAltura = sumaAltura + f.getAltura();
                                contador = contador + 1;
                            }
                        }
                        if (contador > 0) {
                            double mediaAltura = sumaAltura / contador;
                            System.out.println("Media de altura: " + String.format("%.2f", mediaAltura) + " m");
                        } else {
                            System.out.println("No hay futbolistas en esta selección.");
                        }
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 10:
                    System.out.print("Nombre del país de la selección: ");
                    String paisPeso = input.nextLine();
                    SeleccionFutbol selPesoMedia = mundial.buscarSeleccionPorNombre(paisPeso);
                    if (selPesoMedia != null) {
                        double sumaPeso = 0;
                        int contador = 0;
                        for (int i = 0; i < selPesoMedia.getPersonas().size(); i++) {
                            if (selPesoMedia.getPersonas().get(i) instanceof Futbolista) {
                                Futbolista f = (Futbolista) selPesoMedia.getPersonas().get(i);
                                sumaPeso = sumaPeso + f.getPeso();
                                contador = contador + 1;
                            }
                        }
                        if (contador > 0) {
                            double mediaPeso = sumaPeso / contador;
                            System.out.println("Media de peso: " + String.format("%.2f", mediaPeso) + " kg");
                        } else {
                            System.out.println("No hay futbolistas en esta selección.");
                        }
                    } else {
                        System.out.println("Selección no encontrada.");
                    }
                    break;

                case 11:
                    boolean alguno = false;
                    for (int i = 0; i < mundial.getSelecciones().size(); i++) {
                        SeleccionFutbol seleccionActual = mundial.getSelecciones().get(i);
                        for (int j = 0; j < seleccionActual.getPersonas().size(); j++) {
                            Persona p = seleccionActual.getPersonas().get(j);
                            if (p instanceof Futbolista) {
                                double altura = p.getAltura();
                                double peso = p.getPeso();
                                if (altura > 0) {
                                    double imc = peso / (altura * altura);
                                    if (imc >= 30) {
                                        System.out.println(p.getNombre() + " (" + seleccionActual.getPais() + ") - IMC: " + String.format("%.2f", imc) + " - Sobrepeso");
                                        alguno = true;
                                    }
                                }
                            }
                        }
                    }
                    if (!alguno) {
                        System.out.println("No hay futbolistas con sobrepeso.");
                    }
                    break;

                case 12:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 13);

        input.close();
    }
}
