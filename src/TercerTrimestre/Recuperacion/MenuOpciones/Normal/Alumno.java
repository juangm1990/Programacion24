package TercerTrimestre.Recuperacion.MenuOpciones.Normal;

public class Alumno extends Persona {
    private String curso;
    private double notaMedia;

    public Alumno() {
        super();
        this.curso = "";
        this.notaMedia = 0;
    }

    public Alumno(int id, String nombre, String apellidos, String curso, double notaMedia) {
        super(id, nombre, apellidos);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public Alumno(Alumno copia) {
        super(copia);
        this.curso = copia.curso;
        this.notaMedia = copia.notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso + ", notaMedia=" + notaMedia;
    }
}
