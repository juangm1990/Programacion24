package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios_Regalo;

import java.io.Serializable;

public class Valoracion implements Serializable{
    
    private int id;
    private String nombre;
    private int puntuacion;


    public Valoracion (int id, String nombre, int puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + puntuacion;
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
        Valoracion other = (Valoracion) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (puntuacion != other.puntuacion)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Valoracion [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
    }

}
