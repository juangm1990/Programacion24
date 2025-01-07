package PrimerTrimestre.Examenes.BolaExtra6;

public class Main {
    
    public static void main(String[] args) {

            // Constructor por parámetros
            Vehiculo vehiculo1 = new Vehiculo("ABC123", "ModeloA", 120);
            Camion camion1 = new Camion("DEF456", "ModeloB", 150, 8000.5, 2000.0);
            Taxi taxi1 = new Taxi("GHI789", "ModeloC", 100, 12345);
            Autobus autobus1 = new Autobus("JKL012", "ModeloD", 200, 50);
    
            System.out.println("Vehículos registrados: " + Vehiculo.getNumVehiculos());
    
            // Constructor de copia
            Vehiculo vehiculoCopia = new Vehiculo(vehiculo1);
            System.out.println("Vehículo copia: " + vehiculoCopia.getMatricula() + ", " + vehiculoCopia.getModelo());
    
            // Entrada de LOS vehículos
            vehiculo1.entradaVehiculo();
            camion1.entradaVehiculo();
            taxi1.entradaVehiculo();
            autobus1.entradaVehiculo();
    
            System.out.println("Vehículos registrados después de entradas: " + Vehiculo.getNumVehiculos());
    
            // Salida de los vehículos
            vehiculo1.salidaVehiculo();
            camion1.salidaVehiculo();
            taxi1.salidaVehiculo();
            autobus1.salidaVehiculo();
    
            System.out.println("Vehículos registrados después de salidas: " + Vehiculo.getNumVehiculos());
        }
}
