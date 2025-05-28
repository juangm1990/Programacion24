package TercerTrimestre.Recuperacion.Recuperacion6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Maquina[] maquinas = new Maquina[5];
        Herramienta[] herramientas = new Herramienta[5];
        int contMaquinas = 0;
        int contHerramientas = 0;

        int opcion;

        do {
            System.out.println("--- MENÚ PRINCIPAL ---");
            System.out.println("1 | Crear artículo (Máquina o Herramienta)");
            System.out.println("2 | Alquilar artículo");
            System.out.println("3 | Devolver artículo");
            System.out.println("4 | Mostrar artículos alquilados");
            System.out.println("5 | Mostrar todos los artículos");
            System.out.println("6 | Calcular precio de alquiler");
            System.out.println("0 | Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Qué deseas crear? (1 = Máquina, 2 = Herramienta): ");
                    int tipoArticuloCrear = input.nextInt();
                    if (tipoArticuloCrear == 1 && contMaquinas < maquinas.length) {
                        System.out.print("Código: ");
                        String codigo = input.next();
                        System.out.print("Precio por hora: ");
                        double precioHora = input.nextDouble();

                        maquinas[contMaquinas] = new Maquina(codigo, false, precioHora, 0, 0);
                        contMaquinas++;
                        System.out.println("Máquina creada.");
                    } else if (tipoArticuloCrear == 2 && contHerramientas < herramientas.length) {
                        System.out.print("Código: ");
                        String codigo = input.next();
                        System.out.print("Precio por semana: ");
                        double precioSemana = input.nextDouble();

                        herramientas[contHerramientas] = new Herramienta(codigo, false, precioSemana, 0);
                        contHerramientas++;
                        System.out.println("Herramienta creada.");
                    } else {
                        System.out.println("No se puede crear más.");
                    }
                    break;

                case 2:
                    System.out.print("¿Qué deseas alquilar? (1 = Máquina, 2 = Herramienta): ");
                    int tipoArticuloAlquilar = input.nextInt();
                    if (tipoArticuloAlquilar == 1) {
                        for (int i = 0; i < contMaquinas; i++) {
                            if (!maquinas[i].isAlquilado()) {
                                System.out.print("Km inicio para " + maquinas[i].getCodigo() + ": ");
                                int kmInicio = input.nextInt();
                                maquinas[i].setKmInicio(kmInicio);
                                maquinas[i].setAlquilado(true);
                                System.out.println("Máquina alquilada.");
                                break;
                            }
                        }
                    } else if (tipoArticuloAlquilar == 2) {
                        for (int i = 0; i < contHerramientas; i++) {
                            if (!herramientas[i].isAlquilado()) {
                                System.out.print("Semanas de alquiler: ");
                                int semanas = input.nextInt();
                                herramientas[i].setSemanasAlquiladas(semanas);
                                herramientas[i].setAlquilado(true);
                                System.out.println("Herramienta alquilada.");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("¿Qué deseas devolver? (1 = Máquina, 2 = Herramienta): ");
                    int tipoArticuloDevolver = input.nextInt();
                    if (tipoArticuloDevolver == 1) {
                        for (int i = 0; i < contMaquinas; i++) {
                            if (maquinas[i].isAlquilado()) {
                                System.out.print("Km fin para " + maquinas[i].getCodigo() + ": ");
                                int kmFin = input.nextInt();
                                maquinas[i].setKmFin(kmFin);
                                maquinas[i].setAlquilado(false);
                                System.out.println("Máquina devuelta.");
                                break;
                            }
                        }
                    } else if (tipoArticuloDevolver == 2) {
                        for (int i = 0; i < contHerramientas; i++) {
                            if (herramientas[i].isAlquilado()) {
                                herramientas[i].setAlquilado(false);
                                System.out.println("Herramienta devuelta.");
                                break;
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Artículos alquilados:");
                    for (int i = 0; i < contMaquinas; i++) {
                        if (maquinas[i].isAlquilado()) {
                            System.out.println(maquinas[i]);
                        }
                    }
                    for (int i = 0; i < contHerramientas; i++) {
                        if (herramientas[i].isAlquilado()) {
                            System.out.println(herramientas[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Todos los artículos:");
                    for (int i = 0; i < contMaquinas; i++) {
                        System.out.println(maquinas[i]);
                    }
                    for (int i = 0; i < contHerramientas; i++) {
                        System.out.println(herramientas[i]);
                    }
                    break;

                case 6:
                    System.out.println("¿De qué artículo quieres calcular el precio?");
                    System.out.println("1 | Máquina");
                    System.out.println("2 | Herramienta");
                    System.out.print("Elige una opción: ");
                    int tipoArticuloPrecio = input.nextInt();

                    if (tipoArticuloPrecio == 1) {
                        for (int i = 0; i < contMaquinas; i++) {
                            int horasUsadas = maquinas[i].getKmFin() - maquinas[i].getKmInicio();
                            if (horasUsadas < 0) {
                                System.out.println("Error: km fin menor que km inicio en la máquina " + maquinas[i].getCodigo());
                            } else {
                                double precioMaquina = horasUsadas * maquinas[i].getPrecioHora();
                                System.out.println("Máquina " + maquinas[i].getCodigo() + ": " + precioMaquina + " euros");
                            }
                        }
                    } else if (tipoArticuloPrecio == 2) {
                        for (int i = 0; i < contHerramientas; i++) {
                            double precioHerramienta = herramientas[i].getPrecioSemana() * herramientas[i].getSemanasAlquiladas();
                            System.out.println("Herramienta " + herramientas[i].getCodigo() + ": " + precioHerramienta + " euros");
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Gracias por usar el programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        input.close();
    }
}
