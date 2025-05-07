package SegundoTrimestre.Objetos_Interfaces.Mundial;

public class Entrenador extends Persona implements Basico {

    private String estrategia;

    public Entrenador(String nombre, int edad, double altura, double peso, String estrategia) {
        super(nombre, edad, altura, peso);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void mostrar() {
        System.out.println("Entrenador: " + nombre + ", Edad: " + edad + ", Altura: " + altura + " m, Peso: " + peso + " kg, Estrategia: " + estrategia);
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " está organizando la concentración del equipo.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " está viajando como entrenador.");
    }
}