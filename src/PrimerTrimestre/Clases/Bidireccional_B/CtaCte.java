package PrimerTrimestre.Clases.Bidireccional_B;

public class CtaCte {
    
    private double saldo;
    public Cliente duenyo;

    public CtaCte(double s, Cliente d) {

        this.saldo = s;
        this.duenyo = d;
        duenyo.setCuenta(this);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getDueño() {
        return duenyo;
    }

    public void setDueño(Cliente dueño) {
        this.duenyo = dueño;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}
