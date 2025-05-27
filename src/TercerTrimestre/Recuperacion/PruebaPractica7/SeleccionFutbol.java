package TercerTrimestre.Recuperacion.PruebaPractica7;

import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes;

    // Constructor por defecto
    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "";
        this.integrantes = new ArrayList<>();
    }

    // Constructor con parámetros
    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    // Constructor de copia
    public SeleccionFutbol(SeleccionFutbol copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.integrantes = new ArrayList<>(copia.integrantes);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    // Añadir persona si no existe
    public boolean anyadir(Persona p) {
        for (Persona persona : integrantes) {
            if (persona.getId() == p.getId()) {
                return false;
            }
        }
        integrantes.add(p);
        p.asignarSeleccion(this);
        return true;
    }

    // Quitar persona si existe
    public boolean quitar(Persona p) {
        for (Persona persona : integrantes) {
            if (persona.getId() == p.getId()) {
                integrantes.remove(persona);
                p.quitarSeleccion(this);
                return true;
            }
        }
        return false;
    }

    // Mostrar todos los integrantes
    public void listarIntegrantes() {
        System.out.println("Integrantes de la selección: " + nombre);
        for (Persona persona : integrantes) {
            System.out.println(persona);
        }
    }

    // Listar solo futbolistas con sobrepeso
    public void listarFutbolistasSobrepeso() {
        System.out.println("Futbolistas con sobrepeso en: " + nombre);
        for (Persona persona : integrantes) {
            if (persona instanceof Futbolista) {
                Futbolista f = (Futbolista) persona;
                if (f.tieneSobrepeso()) {
                    System.out.println(f);
                }
            }
        }
    }
}
