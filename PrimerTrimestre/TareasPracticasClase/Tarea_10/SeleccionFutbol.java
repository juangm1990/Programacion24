package PrimerTrimestre.TareasPracticasClase.Tarea_10;

import java.util.ArrayList;

public class SeleccionFutbol {
    
    private int id;
    private String nombre;
    public ArrayList<Persona> personas = new ArrayList<>(); // Inicializar aquí
    public ArrayList<Futbolista> jugadores = new ArrayList<>();
    public ArrayList<Futbolista> futbolistasSobrepeso = new ArrayList<>();

    // Constructor por defecto
    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "Nombre";
    }
    
    // Constructor por parámetros
    public SeleccionFutbol(int id, String n) {
        this.id = id;
        this.nombre = n;
        this.personas = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.futbolistasSobrepeso = new ArrayList<>();
    }

    // Métodos y funciones
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public boolean anyadirPersona(Persona p) {
        for (int i = 0; i < personas.size(); i++) {
            if (p.getId() == personas.get(i).getId()) {
                return false; // Si el ID ya existe, no se añade
            }
        }
        personas.add(p);
        return true;
    }

    @Override
    public String toString() {
        return "Selección de Fútbol [Id = " + id + ", Nombre = " + nombre + "]";
    }
}
