package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehiculo> lista = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("MENÚ VEHÍCULOS");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Mostrar todos los vehículos");
            System.out.println("3. Mostrar precio de alquiler por 3 días");
            System.out.println("4. Mostrar vehículos que requieren licencia");
            System.out.println("5. Mostrar vehículo más caro por día");
            System.out.println("6. Mostrar vehículos sin licencia y < 100 euros por 3 días");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué tipo de vehículo deseas añadir?");
                    System.out.println("1. Coche");
                    System.out.println("2. Moto");
                    System.out.println("3. Furgoneta");
                    System.out.println("4. Bicicleta eléctrica");
                    int tipo = input.nextInt();
                    input.nextLine(); // Limpiar buffer

                    System.out.print("Introduce el nombre del vehículo: ");
                    String nombre = input.nextLine();
                    System.out.print("Introduce el precio por día: ");
                    double precio = input.nextDouble();
                    input.nextLine(); // Limpiar buffer

                    if (tipo == 1) {
                        lista.add(new Coche(nombre, precio));
                    } else if (tipo == 2) {
                        lista.add(new Moto(nombre, precio));
                    } else if (tipo == 3) {
                        lista.add(new Furgoneta(nombre, precio));
                    } else if (tipo == 4) {
                        lista.add(new BicicletaElectrica(nombre, precio));
                    } else {
                        System.out.println("Tipo no válido.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                    break;

                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        Vehiculo v = lista.get(i);
                        System.out.println(v.getNombre() + ": " + v.calcularPrecioAlquiler(3) + " euros por 3 días");
                    }
                    break;

                case 4:
                    for (int i = 0; i < lista.size(); i++) {
                        Vehiculo v = lista.get(i);
                        if (v instanceof RequiereLicencia) {
                            System.out.println(v.getNombre() + " requiere licencia");
                        }
                    }
                    break;

                case 5:
                    if (lista.size() == 0) {
                        System.out.println("No hay vehículos.");
                        break;
                    }
                    Vehiculo masCaro = lista.get(0);
                    for (int i = 1; i < lista.size(); i++) {
                        if (lista.get(i).getPrecioPorDia() > masCaro.getPrecioPorDia()) {
                            masCaro = lista.get(i);
                        }
                    }
                    System.out.println("Vehículo más caro por día: " + masCaro.getNombre() +
                            " (" + masCaro.getPrecioPorDia() + " euros)");
                    break;

                case 6:
                    for (int i = 0; i < lista.size(); i++) {
                        Vehiculo v = lista.get(i);
                        boolean sinLicencia = !(v instanceof RequiereLicencia);
                        boolean barato = v.calcularPrecioAlquiler(3) < 100;
                        if (sinLicencia && barato) {
                            System.out.println(v.getNombre() + " NO requiere licencia y cuesta menos de 100 euros por 3 días.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        input.close();
    }
}
