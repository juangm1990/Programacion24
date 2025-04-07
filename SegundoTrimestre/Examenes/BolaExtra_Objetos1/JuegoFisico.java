package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoFisico extends Videojuego {
    
    private double gastosEnvio;

    public JuegoFisico(int id, String titulo, double precio, String genero, double gastosEnvio) {
        super(id, titulo, precio, genero);
        this.gastosEnvio = gastosEnvio;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    @Override
    public  double calcularPrecioFinal(){
        return precio + gastosEnvio;
        
    }


    @Override
    public String toString() {
        return "Juegofisico [id=" + id + ", gastosEnvio=" + gastosEnvio + ", titulo=" + titulo + ", precio=" + precio
                + ", genero=" + genero + "]";
    }

  

    
}

