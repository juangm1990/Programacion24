package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_Prueba;

import java.io.Serializable;

public class Nota implements Serializable{
    String id;
    Double nota1;
    Double nota2;
    Double nota3;
    Double nota4;
    Double nota5;
    Double nota6;
    public Nota(String id, Double nota1, Double nota2, Double nota3, Double nota4, Double nota5, Double nota6) {
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getNota1() {
        return nota1;
    }
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    public Double getNota2() {
        return nota2;
    }
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public Double getNota3() {
        return nota3;
    }
    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    public Double getNota4() {
        return nota4;
    }
    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }
    public Double getNota5() {
        return nota5;
    }
    public void setNota5(Double nota5) {
        this.nota5 = nota5;
    }
    public Double getNota6() {
        return nota6;
    }
    public void setNota6(Double nota6) {
        this.nota6 = nota6;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nota1 == null) ? 0 : nota1.hashCode());
        result = prime * result + ((nota2 == null) ? 0 : nota2.hashCode());
        result = prime * result + ((nota3 == null) ? 0 : nota3.hashCode());
        result = prime * result + ((nota4 == null) ? 0 : nota4.hashCode());
        result = prime * result + ((nota5 == null) ? 0 : nota5.hashCode());
        result = prime * result + ((nota6 == null) ? 0 : nota6.hashCode());
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nota1 == null) {
            if (other.nota1 != null)
                return false;
        } else if (!nota1.equals(other.nota1))
            return false;
        if (nota2 == null) {
            if (other.nota2 != null)
                return false;
        } else if (!nota2.equals(other.nota2))
            return false;
        if (nota3 == null) {
            if (other.nota3 != null)
                return false;
        } else if (!nota3.equals(other.nota3))
            return false;
        if (nota4 == null) {
            if (other.nota4 != null)
                return false;
        } else if (!nota4.equals(other.nota4))
            return false;
        if (nota5 == null) {
            if (other.nota5 != null)
                return false;
        } else if (!nota5.equals(other.nota5))
            return false;
        if (nota6 == null) {
            if (other.nota6 != null)
                return false;
        } else if (!nota6.equals(other.nota6))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Nota [id=" + id + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
                + ", nota5=" + nota5 + ", nota6=" + nota6 + "]";
    }
}
