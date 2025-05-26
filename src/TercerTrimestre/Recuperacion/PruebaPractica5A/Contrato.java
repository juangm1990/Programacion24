package TercerTrimestre.Recuperacion.PruebaPractica5A;

public class Contrato {

    private double salario;
    private String tipoDeJornada;
    private String clausula;

    // Constructor por parámetros
    public Contrato(double salario, String tipoDeJornada, String clausula) {
        this.salario = salario;
        this.tipoDeJornada = tipoDeJornada;
        this.clausula = clausula;

        this.validarSalarioCrear();
        this.validarTipoDeJornadaCrear();
        this.validarClausulaCrear();
    }

    // Constructor por defecto
    public Contrato() {
        this.salario = 0;
        this.tipoDeJornada = "tiempo completo";
        this.clausula = "Sin cláusula";
    }

    // Constructor de copia
    public Contrato(Contrato copia) {
        this.salario = copia.salario;
        this.tipoDeJornada = copia.tipoDeJornada;
        this.clausula = copia.clausula;
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
        // Si no cumple, no actualiza nada (deja el valor antiguo)
    }

    public String getTipoDeJornada() {
        return tipoDeJornada;
    }

    public void setTipoDeJornada(String tipoDeJornada) {
        if (tipoDeJornada.equals("tiempo completo") || tipoDeJornada.equals("tiempo parcial")) {
            this.tipoDeJornada = tipoDeJornada;
        }
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
        if (clausula.length() <= 500) {
            this.clausula = clausula;
        }
    }

    // Validaciones para creación (corrigen directamente si hay error)
    public void validarSalarioCrear() {
        if (this.salario <= 0) {
            this.salario = 0;
        }
    }

    public void validarTipoDeJornadaCrear() {
        if (!this.tipoDeJornada.equals("tiempo completo") && !this.tipoDeJornada.equals("tiempo parcial")) {
            this.tipoDeJornada = "tiempo completo";
        }
    }

    public void validarClausulaCrear() {
        if (this.clausula.length() > 500) {
            this.clausula = "Sin cláusula";
        }
    }

    // toString para mostrar el contenido
    @Override
    public String toString() {
        return " // Contrato --> Salario: " + this.salario + " euros, Tipo de Jornada: " + this.tipoDeJornada + ", Cláusula: " + this.clausula;
    }
}
