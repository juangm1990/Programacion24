package SegundoTrimestre.Objetos_Interfaces.Futbol;


public class Delantero extends Jugador implements Entrenable {

    public Delantero(String nombre, int numeroCamiseta, String posicion) {
        super(nombre, numeroCamiseta, posicion);
    }

    @Override
    public void entrenar() {
        System.out.println("Dispara al arco");
    }

    @Override
    public void accionEspecial() {
        System.out.println("¡Gooooooool! ¡Ha marcado el penalti!");
    }
}