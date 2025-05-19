package SegundoTrimestre.Examenes.Practica9;



import java.io.Serializable;

public class Nota implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int nota5;
    private int nota6;

    public Nota(int id, int nota1, int nota2, int nota3, int nota4, int nota5, int nota6) {
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getNota5() {
        return nota5;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5;
    }

    public int getNota6() {
        return nota6;
    }
    
    public void setNota6(int nota6) {
        this.nota6 = nota6;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + nota1;
        result = prime * result + nota2;
        result = prime * result + nota3;
        result = prime * result + nota4;
        result = prime * result + nota5;
        result = prime * result + nota6;
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
        if (nota1 != other.nota1)
            return false;
        if (nota2 != other.nota2)
            return false;
        if (nota3 != other.nota3)
            return false;
        if (nota4 != other.nota4)
            return false;
        if (nota5 != other.nota5)
            return false;
        if (nota6 != other.nota6)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Nota [id=" + id + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
                + ", nota5=" + nota5 + ", nota6=" + nota6 + "]";
    }
}
