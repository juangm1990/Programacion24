package SegundoTrimestre.Repaso.Tema15C_ClasesAbstractas_Interfaces1;

public class Delantero extends Jugador implements Entrenable{
    
    public Delantero (String nombre, int numeroCamiseta, String posicion) {
        super(nombre, numeroCamiseta, posicion);
    }

    //Métodos
    public void entrenar() {
        System.out.println("Dispara al arco");
    }

    public void accionEspecial() {
        System.out.println("¡Gooooooool!¡Ha marcado el penalti!");
    }

}