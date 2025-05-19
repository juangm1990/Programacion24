package PrimerTrimestre.Clases.Unidireccional;


public class CuentaBancaria {

    // ATRIBUTOS
    private String numCuenta;
    private String nombreTitular;
    private double saldo;


    // CONSTRUCTOR POR DEFECTO
    public CuentaBancaria() {

        this.numCuenta = "1234 1234 1234 1234";
        this.nombreTitular = "";
        this.saldo = 0;
    }

    // CONSTRUCTOR POR PARÁMETROS 1
    public CuentaBancaria(String num, String nombre) {

        this.numCuenta = num;
        this.nombreTitular = nombre;
        this.saldo = 0;
    }

    // CONSTRUCTOR POR PARÁMETROS 2
    public CuentaBancaria(String num, String nombre, double s) {

        this.numCuenta = num;
        this.nombreTitular = nombre;
        this.saldo = s;
    }

    // COSNTRUCTOR COPIA
    public CuentaBancaria(CuentaBancaria copia) {

        this.numCuenta = copia.numCuenta;
        this.nombreTitular = copia.nombreTitular;
        this.saldo = copia.saldo;
    }

    // MÉTODOS

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double cantidad) {

        this.saldo -= cantidad;
    }

    public void ingresar(double cantidad) {

        this.saldo += cantidad;
    }

    public boolean transferir(double cantidad, CuentaBancaria destino) {

        if (this.saldo >= cantidad) {

            this.sacar(cantidad);
            destino.ingresar(cantidad);

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numCuenta=" + numCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
    }
}
