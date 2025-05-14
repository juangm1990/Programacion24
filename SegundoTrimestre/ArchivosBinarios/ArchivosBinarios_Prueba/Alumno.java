package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_Prueba;

import java.io.Serializable;

public class Alumno implements Serializable{
    String id;
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String email;
    String telefono;
    public Alumno(String id, String nombre1, String nombre2, String apellido1, String apellido2, String email,
            String telefono) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre1() {
        return nombre1;
    }
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre1 == null) ? 0 : nombre1.hashCode());
        result = prime * result + ((nombre2 == null) ? 0 : nombre2.hashCode());
        result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
        result = prime * result + ((apellido2 == null) ? 0 : apellido2.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
        Alumno other = (Alumno) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nombre1 == null) {
            if (other.nombre1 != null)
                return false;
        } else if (!nombre1.equals(other.nombre1))
            return false;
        if (nombre2 == null) {
            if (other.nombre2 != null)
                return false;
        } else if (!nombre2.equals(other.nombre2))
            return false;
        if (apellido1 == null) {
            if (other.apellido1 != null)
                return false;
        } else if (!apellido1.equals(other.apellido1))
            return false;
        if (apellido2 == null) {
            if (other.apellido2 != null)
                return false;
        } else if (!apellido2.equals(other.apellido2))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1
                + ", apellido2=" + apellido2 + ", email=" + email + ", telefono=" + telefono + "]";
    }
}
