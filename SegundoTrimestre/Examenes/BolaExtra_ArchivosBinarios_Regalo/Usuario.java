package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios_Regalo;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombre;
    private String email;

    public Usuario (int id, String nombre, String email2) {
        this.id = id;
        this.nombre = nombre;
        this.email = email2;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        Usuario other = (Usuario) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (email != other.email)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
    }
}
