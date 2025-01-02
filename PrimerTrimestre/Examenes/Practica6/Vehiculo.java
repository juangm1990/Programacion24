package PrimerTrimestre.Examenes.Practica6;

public class Vehiculo {
    
    protected String matricula;
    protected boolean alquilado;

    public Vehiculo(String m, boolean a) {
        this.matricula = m;
        this.alquilado = a;
    }

    public Vehiculo() {
        this.matricula = "0000 AAA";
        this.alquilado = false;
    }

    public Vehiculo(Vehiculo copia) {
        this.matricula = copia.matricula;
        this.alquilado = copia.alquilado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String m) {
        this.matricula = m;
    }

    public boolean isAlquilado() {
        return alquilado;
    }
    
    public void setAlquilado(boolean a) {
        this.alquilado = a;
    }

    public String alquilar() {
        
        if (!this.alquilado) {
            this.alquilado = true;

            return "Ha alquilado el vehículo";
        }
        else {
            return "El vehículo ya se encuentra alquilado";
        }
    }

    public String devolver(int x) {

        if (this.alquilado) {
            this.alquilado = false;
            
            return "Ha alquilado el vehículo";
        }
        else {
            return "El vehículo no está alquilado, no se puede devolver";
        }
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", alquilado=" + alquilado + "]";
    }
}
