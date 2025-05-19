package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

public class Furgoneta extends Vehiculo implements RequiereLicencia {

    public Furgoneta(String nombre, double precioPorDia) {
        super(nombre, precioPorDia);
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        // Las furgonetas tienen un recargo fijo de 20€ por alquiler
        return (precioPorDia * dias) + 20;
    }

    @Override
    public boolean necesitaLicencia() {
        return true;
    }
}
