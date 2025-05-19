package SegundoTrimestre.Objetos_Interfaces.Mundial;

public class Futbolista extends Persona implements Basico, Deportista {

    private int dorsal;

    public Futbolista(String nombre, int edad, double altura, double peso, int dorsal) {
        super(nombre, edad, altura, peso);
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public void mostrar() {
        System.out.println("Futbolista: " + nombre + ", Edad: " + edad + ", Altura: " + altura + " m, Peso: " + peso + " kg, Dorsal: " + dorsal);
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se está concentrando antes del partido.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " está viajando con la selección.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando con el equipo.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido.");
    }
}
