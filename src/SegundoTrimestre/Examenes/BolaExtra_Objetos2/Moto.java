package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

public class Moto extends Vehiculo implements RequiereLicencia {

    public Moto(String nombre, double precioPorDia) {
        super(nombre, precioPorDia);
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        // Se le aplica un pequeño descuento del 10%
        return (precioPorDia * dias) * 0.9;
    }

    @Override
    public boolean necesitaLicencia() {
        return true;
    }
}
