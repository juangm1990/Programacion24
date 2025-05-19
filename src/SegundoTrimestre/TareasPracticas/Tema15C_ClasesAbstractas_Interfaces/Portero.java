package SegundoTrimestre.TareasPracticas.Tema15C_ClasesAbstractas_Interfaces;

public class Portero extends Jugador implements Entrenable{
    
    public Portero (String nombre, int numeroCamiseta, String posicion) {
        super(nombre, numeroCamiseta, posicion);
    }

    //Métodos
    public void entrenar() {
        System.out.println("Realiza una atajada espectacular");
    }

    public void accionEspecial() {
        System.out.println("¡Ha parado el penalti");
    }

}
