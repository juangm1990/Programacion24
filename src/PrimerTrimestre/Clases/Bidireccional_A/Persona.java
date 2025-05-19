package PrimerTrimestre.Clases.Bidireccional_A;

import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private ArrayList<Perro> mascotas = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }
    
    public void setMascotas(Perro mascotas) {
        this.mascotas.add(mascotas);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", mascotas=" + mascotas + "]";
    }
}
