package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

public class BicicletaElectrica extends Vehiculo {

    public BicicletaElectrica(String nombre, double precioPorDia) {
        super(nombre, precioPorDia);
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        // Tiene un descuento del 15% por ser ecológica
        return (precioPorDia * dias) * 0.85;
    }
}
