package TercerTrimestre.Recuperacion.MenuOpciones.Normal;

public class Profesor extends Persona {
    private String especialidad;
    private String departamento;

    public Profesor() {
        super();
        this.especialidad = "";
        this.departamento = "";
    }

    public Profesor(int id, String nombre, String apellidos, String especialidad, String departamento) {
        super(id, nombre, apellidos);
        this.especialidad = especialidad;
        this.departamento = departamento;
    }

    public Profesor(Profesor copia) {
        super(copia);
        this.especialidad = copia.especialidad;
        this.departamento = copia.departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", especialidad=" + especialidad + ", departamento=" + departamento;
    }
}
