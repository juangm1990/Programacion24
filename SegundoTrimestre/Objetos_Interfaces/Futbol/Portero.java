package SegundoTrimestre.Objetos_Interfaces.Futbol;

public class Portero extends Jugador implements Entrenable {

    public Portero(String nombre, int numeroCamiseta, String posicion) {
        super(nombre, numeroCamiseta, posicion);
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza una atajada espectacular");
    }

    @Override
    public void accionEspecial() {
        System.out.println("¡Ha parado el penalti!");
    }
}
