package PrimerTrimestre.Examenes.Practica5;

public class Contrato {
    
    private double salario;
    private String jornada;
    private String clausula;

    public Contrato() {
    

        this.salario = 0;
        this.jornada = "Completa";
        this.clausula = "Ninguna";
    }
    public Contrato(double sal,String jor,String clau) {

        this();
        if(salario >=0)

        this.salario = sal;
        this.jornada = jor;
        this.clausula = clau;
    }
    public Contrato(Contrato c) {

        this.salario = c.salario;
        this.jornada = c.jornada;
        this.clausula = c.clausula;}

    public double getSalario() {
        
        return salario;
    }

    public void setSalario(double salario) {

        if (salario >= 0) {
            this.salario = salario;
        } else new Contrato();
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        if (jornada == "completa" || jornada == "parcial") {
            this.jornada = jornada;
        }

        else
            new Contrato();

    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {

        if (clausula.length() <=500 ) {
            this.clausula = clausula;
        } else
            new Contrato();

    }

    @Override
    public String toString() {
        return "Contrato [salario=" + salario + ", jornada=" + jornada + ", clausula=" + clausula + "]";
    }
}
