package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoDigital extends Videojuego {
    
    protected double tamañoGB;
    protected String plataforma;


    public JuegoDigital(int id, String titulo, double precio, String genero, double tamañoGB, String plataforma) {
        super(id, titulo, precio, genero);
        this.tamañoGB = tamañoGB;
        this.plataforma = plataforma;
    }


    public double getTamañoGB() {
        return tamañoGB;
    }


    public void setTamañoGB(double tamañoGB) {
        this.tamañoGB = tamañoGB;
    }


    public String getPlataforma() {
        return plataforma;
    }


    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public  double calcularPrecioFinal(){
        return precio * 0.9;
        
    }


    @Override
    public String toString() {
        return "JuegoDigital [id=" + id + ", tamañoGB=" + tamañoGB + ", titulo=" + titulo + ", plataforma=" + plataforma
                + ", precio=" + precio + ", genero=" + genero + "]";
    }



  

    
    

    
}
