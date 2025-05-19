package PrimerTrimestre.Clases.Unidireccional;

public class Coche3 {
    
    
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int velocidadActual;
    private boolean arrancado;

    private final static int velocidadMaxima = 120;

    public Coche3(String mat, String mar, String mod, String col) {

        this.matricula = mat;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.velocidadActual = 0;
        this.arrancado = false;
    }

    public boolean arrancar() {

        if (this.velocidadActual == 0 && !this.arrancado) {
            this.arrancado = true;
            return true;
        }

        return false;
    }

    public boolean parar() {

        if (this.velocidadActual == 0 && this.arrancado) {
            this.arrancado = false;
            return true;
        }

        return false;
    }

    public void acelerar(int vel) {

        if (this. arrancado) {

            if (this.velocidadActual + vel >= velocidadMaxima) {

                this.velocidadActual = velocidadMaxima;
    
            } else {
    
                this.velocidadActual += vel;
            }
        }        
    }

    public String toString() {

        return "Matrícula: " + this.matricula + " " +
                "Marca: " + this.marca + " " +
                "Modelo: " + this.modelo + " " +
                "Color: " + this.color + " " +
                "Velocidad Actual: " + this.velocidadActual + " " +
                "Arrancado: " + this.arrancado;
    }
}
