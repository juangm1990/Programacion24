package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

public class Coche extends Vehiculo implements RequiereLicencia {

    public Coche(String nombre, double precioPorDia) {
        super(nombre, precioPorDia);
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        // Suponemos que el precio es simplemente precioPorDia * días
        return precioPorDia * dias;
    }

    @Override
    public boolean necesitaLicencia() {
        return true;
    }
}
