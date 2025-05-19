package SegundoTrimestre.Objetos_Interfaces.Mundial;

public class Fisioterapeuta extends Masajista implements Integrante {

    private boolean tieneCamilla;

    public Fisioterapeuta(String nombre, int edad, double altura, double peso, int experiencia, boolean tieneCamilla) {
        super(nombre, edad, altura, peso, experiencia);
        this.tieneCamilla = tieneCamilla;
    }

    public boolean isTieneCamilla() {
        return tieneCamilla;
    }

    public void setTieneCamilla(boolean tieneCamilla) {
        this.tieneCamilla = tieneCamilla;
    }

    @Override
    public void mostrar() {
        System.out.println("Fisioterapeuta: " + nombre + ", Edad: " + edad + ", Altura: " + altura + " m, Peso: " + peso + " kg, Experiencia: " + experiencia + " años, Camilla: " + (tieneCamilla ? "Sí" : "No"));
    }

    @Override
    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje a un jugador.");
    }

    @Override
    public void atenderJugador() {
        System.out.println(nombre + " está atendiendo rápidamente al jugador lesionado.");
    }
}
