package PrimerTrimestre.Examenes.Practica7;

import java.util.ArrayList;

public class SeleccionFutbol {

    private int id;
    private String nombre;
    private Mundial mundial;
    private ArrayList<Persona> integrantes;

    // Constructor por defecto
    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = null;
        this.integrantes = new ArrayList<Persona>();
    }

    // Constructor con parámetros
    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.integrantes = new ArrayList<Persona>();
    }

    // Constructor de copia
    public SeleccionFutbol(SeleccionFutbol copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.integrantes = copia.integrantes;
    }

    // Getters y setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mundial getMundial() {
        return this.mundial;
    }

    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }

    public ArrayList<Persona> getIntegrantes() {
        return this.integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    // Métodos para añadir y borrar personas
    public boolean anadirPersona(Persona persona) {
        if (this.integrantes.isEmpty()) {
            this.integrantes.add(persona);
            return true;
        } else {
            for (Persona p : this.integrantes) {
                if (p.getId() == persona.getId()) {
                    return false;
                }
            }
            this.integrantes.add(persona);
            return true;
        }
    }

    public boolean borrarPersona(int id) {
        for (int i = 0; i < this.integrantes.size(); i++) {
            if (this.integrantes.get(i).getId() == id) {
                this.integrantes.remove(i);
                return true;
            }
        }
        return false;
    }

    // Método para obtener el Fisioterapeuta
    public Fisioterapeuta getFisioterapeuta() {
        for (Persona p : this.integrantes) {
            if (p instanceof Fisioterapeuta) {
                return (Fisioterapeuta) p;
            }
        }
        return null;  // Si no se encuentra un Fisioterapeuta, retorna null
    }

    // Método para concentrar al fisioterapeuta
    public void concentrarFisioterapeuta() {
        Fisioterapeuta fisioterapeuta = getFisioterapeuta();
        if (fisioterapeuta != null) {
            fisioterapeuta.concentrarse();
        } else {
            System.out.println("No se ha encontrado un Fisioterapeuta en esta selección.");
        }
    }

    // Listar todos los integrantes
    public void listarIntegrantes() {
        if (this.integrantes.isEmpty()) {
            System.out.println("No hay integrantes en la selección.");
            return;
        }
        for (Persona persona : this.integrantes) {
            System.out.println(persona);
        }
    }

    // Listar futbolistas con sobrepeso
    public void listarFutbolistasSobrepeso() {
        boolean encontrado = false;
        for (Persona persona : this.integrantes) {
            if (persona instanceof Futbolista) {
                Futbolista futbolista = (Futbolista) persona;
                if (futbolista.tieneSobrepeso()) {  // Verifica si el futbolista tiene sobrepeso
                    System.out.println(futbolista);  // Muestra el futbolista
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron futbolistas con sobrepeso.");
        }
    }

    // Asignar Mundial a la selección
    public boolean asignarMundial(Mundial mundial) {
        if (this.mundial == null) {
            this.mundial = mundial;
            return true;
        }
        return false;
    }

    // Borrar Mundial de la selección
    public boolean borrarMundial() {
        if (this.mundial != null) {
            this.mundial = null;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Selección: " + nombre + " | ID: " + id + " | Mundial: " + (mundial != null ? mundial.getAnyo() : "No asignado");
    }
}
