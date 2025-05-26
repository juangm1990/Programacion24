package TercerTrimestre.Recuperacion.PruebaPractica6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        ArrayList<Autobus> autobuses = new ArrayList<>();
        ArrayList<Tractor> tractores = new ArrayList<>();

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1 | Crear vehículo");
            System.out.println("2 | Alquilar vehículo");
            System.out.println("3 | Devolver vehículo");
            System.out.println("4 | Mostrar vehículos alquilados");
            System.out.println("5 | Mostrar todos los vehículos");
            System.out.println("0 | Salir");
            System.out.print("Selecciona una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // LIMPIAR BUFFER

            switch (opcion) {
                case 1:
                    System.out.println("1 | Crear Autobús");
                    System.out.println("2 | Crear Tractor");
                    int tipoCrear = input.nextInt();
                    input.nextLine();

                    if (tipoCrear == 1) {
                        System.out.print("Matrícula del autobús: ");
                        String mat = input.nextLine();
                        System.out.print("Precio por kilómetro: ");
                        double precioKm = input.nextDouble();
                        input.nextLine(); // limpiar buffer
                        Autobus a = new Autobus(mat, precioKm);
                        autobuses.add(a);
                        System.out.println("Autobús creado.");
                    } else if (tipoCrear == 2) {
                        System.out.print("Matrícula del tractor: ");
                        String mat = input.nextLine();
                        System.out.print("Precio por día: ");
                        double precioDia = input.nextDouble();
                        input.nextLine(); // limpiar buffer
                        Tractor t = new Tractor(mat, precioDia);
                        tractores.add(t);
                        System.out.println("Tractor creado.");
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 2:
                    System.out.println("1 | Alquilar Autobús");
                    System.out.println("2 | Alquilar Tractor");
                    int tipoAlquilar = input.nextInt();
                    input.nextLine();

                    if (tipoAlquilar == 1) {
                        System.out.print("Introduce matrícula del autobús: ");
                        String mat = input.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < autobuses.size(); i++) {
                            if (autobuses.get(i).getMatricula().equalsIgnoreCase(mat)) {
                                System.out.print("Introduce kilómetros actuales: ");
                                double kmInicio = input.nextDouble();
                                input.nextLine();
                                autobuses.get(i).alquilar(kmInicio);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún autobús con esa matrícula.");
                        }

                    } else if (tipoAlquilar == 2) {
                        System.out.print("Introduce matrícula del tractor: ");
                        String mat = input.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < tractores.size(); i++) {
                            if (tractores.get(i).getMatricula().equalsIgnoreCase(mat)) {
                                tractores.get(i).alquilar();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún tractor con esa matrícula.");
                        }

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 3:
                    System.out.println("1 | Devolver Autobús");
                    System.out.println("2 | Devolver Tractor");
                    int tipoDevolver = input.nextInt();
                    input.nextLine();

                    if (tipoDevolver == 1) {
                        System.out.print("Introduce matrícula del autobús: ");
                        String mat = input.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < autobuses.size(); i++) {
                            if (autobuses.get(i).getMatricula().equalsIgnoreCase(mat)) {
                                System.out.print("Introduce kilómetros finales: ");
                                double kmFinal = input.nextDouble();
                                input.nextLine();
                                double precio = autobuses.get(i).devolver(kmFinal);
                                System.out.println("Precio total: " + precio + " €");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún autobús con esa matrícula.");
                        }

                    } else if (tipoDevolver == 2) {
                        System.out.print("Introduce matrícula del tractor: ");
                        String mat = input.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < tractores.size(); i++) {
                            if (tractores.get(i).getMatricula().equalsIgnoreCase(mat)) {
                                double precio = tractores.get(i).devolver();
                                System.out.println("Precio total: " + precio + " €");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún tractor con esa matrícula.");
                        }

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 4:
                    System.out.println("1 | Ver autobuses alquilados");
                    System.out.println("2 | Ver tractores alquilados");
                    int tipoMostrarAlq = input.nextInt();
                    input.nextLine();

                    if (tipoMostrarAlq == 1) {
                        boolean hayAlquilados = false;
                        System.out.println("---- AUTOBUSES ALQUILADOS ----");
                        for (int i = 0; i < autobuses.size(); i++) {
                            if (autobuses.get(i).isAlquilado()) {
                                System.out.println(autobuses.get(i).toString());
                                hayAlquilados = true;
                            }
                        }
                        if (!hayAlquilados) {
                            System.out.println("No hay autobuses alquilados.");
                        }

                    } else if (tipoMostrarAlq == 2) {
                        boolean hayAlquilados = false;
                        System.out.println("---- TRACTORES ALQUILADOS ----");
                        for (int i = 0; i < tractores.size(); i++) {
                            if (tractores.get(i).isAlquilado()) {
                                System.out.println(tractores.get(i).toString());
                                hayAlquilados = true;
                            }
                        }
                        if (!hayAlquilados) {
                            System.out.println("No hay tractores alquilados.");
                        }

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 5:
                    System.out.println("----- TODOS LOS AUTOBUSES -----");
                    if (autobuses.size() == 0) {
                        System.out.println("No hay autobuses.");
                    } else {
                        for (int i = 0; i < autobuses.size(); i++) {
                            System.out.println(autobuses.get(i).toString());
                        }
                    }

                    System.out.println("----- TODOS LOS TRACTORES -----");
                    if (tractores.size() == 0) {
                        System.out.println("No hay tractores.");
                    } else {
                        for (int i = 0; i < tractores.size(); i++) {
                            System.out.println(tractores.get(i).toString());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        input.close();
    }
}
