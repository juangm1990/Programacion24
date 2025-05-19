package SegundoTrimestre.TareasPracticas.Tema14_Colecciones.Conjuntos_Hashmap;


import java.util.Comparator;

public class Persona implements Comparable<Persona>, Comparator<Persona>{
    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    // hashCode y equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + edad;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    // DAR A LA BOMBILLA compareTO = implements Comparable<Persona>
    @Override
    public int compareTo(Persona o) {

        if (o.getId()>this.getId()) {
            return -1;            
        }
        else if (o.getId()<this.getId()){
            return 1;
        } 
        else {
            return 0;
        }
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        if(o2.getEdad()> o2.getEdad()){
            return -1;
        } 
        else if (o2.getEdad()> o2.getEdad()){
            return 1;
        }
        else {
            
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PERSONA ID = " + id + ", Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + " || ";
    }



}

