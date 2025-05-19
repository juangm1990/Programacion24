package SegundoTrimestre.ArchivosBinarios.Alumno_Full;

import java.io.Serializable;

public class Nota implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private int puntuacion;

    public Nota(int id, String nombre, int puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
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
        Nota other = (Nota) obj;
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
        return "Nota [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
    }
}
