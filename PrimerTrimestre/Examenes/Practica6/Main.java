package PrimerTrimestre.Examenes.Practica6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int opcion = 0;
        int opcion2 = 0;
        int autobusKm = 0;
        int tractorDias = 0;

        Autobus a1 = new Autobus();

        Tractor t1 = new Tractor();

        do {

            System.out.println("Elige una opción de las siguientes: ");
            System.out.println("1.- Autobuses");
            System.out.println("2.- Tractores");
            System.out.println("0.- Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;

                case 1:
                    System.out.println("Elige una opción de las siguientes");
                    System.out.println("1.- Alquilar Autobús");
                    System.out.println("2.- Devolver Autobús");
                    System.out.println("3.- Obtener precio por Km");

                    opcion2 = input.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println(a1.alquilar());
                            break;

                        case 2:
                            System.out.println("¿Cuántos kilómetros has hecho? ");
                            autobusKm = input.nextInt();

                            System.out.println(a1.devolver(autobusKm));
                            break;

                        case 3:
                            System.out.println("¿Cuántos kilómetros harías? ");
                            autobusKm = input.nextInt();

                            System.out.println(a1.obtenerPrecioAlquiler(autobusKm));
                            break;
                    
                        default:
                            System.out.println("Error al elegir, intentalo de nuevo");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Elige una opción de las siguientes");
                    System.out.println("1.- Alquilar Tractor");
                    System.out.println("2.- Devolver Tractor");
                    System.out.println("3.- Obtener precio por día");

                    opcion2 = input.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println(t1.alquilar());
                            break;

                        case 2:
                            System.out.println("¿Cuántos días has tenido el tractor? ");
                            tractorDias = input.nextInt();

                            System.out.println(t1.devolver(tractorDias));
                            break;

                        case 3:
                            System.out.println("¿Cuántos días lo tendrías? ");
                            tractorDias = input.nextInt();

                            System.out.println(t1.obtenerPrecioAlquiler(tractorDias));
                            break;
                    
                        default:
                            System.out.println("Error al elegir, intentalo de nuevo");
                            break;
                    }
                    break;
            
                default:
                    System.out.println("Error al elegir, intentelo de nuevo");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
