package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_Prueba;

import java.io.Serializable;

public class NotaMedia implements Serializable{
    String id;
    String email;
    Double notaMedia;
    public NotaMedia(String id, String email, Double notaMedia) {
        this.id = id;
        this.email = email;
        this.notaMedia = notaMedia;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((notaMedia == null) ? 0 : notaMedia.hashCode());
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
        NotaMedia other = (NotaMedia) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (notaMedia == null) {
            if (other.notaMedia != null)
                return false;
        } else if (!notaMedia.equals(other.notaMedia))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "NotaMedia [id=" + id + ", email=" + email + ", notaMedia=" + notaMedia + "]";
    }

}
