package SegundoTrimestre.Examenes.Practica9;


import java.io.Serializable;

public class NotaMedia implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    private String email;
    private int notaMedia;

    public NotaMedia(int id, String email, int notaMedia) {
        this.id = id;
        this.email = email;
        this.notaMedia = notaMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNotaMedia() {
        return notaMedia;
    }
    
    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + notaMedia;
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
        if (id != other.id)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (notaMedia != other.notaMedia)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "NotaMedia [id=" + id + ", email=" + email + ", notaMedia=" + notaMedia + "]";
    }
}
