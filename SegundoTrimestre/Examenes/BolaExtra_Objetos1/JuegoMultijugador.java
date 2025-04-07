package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoMultijugador extends JuegoDigital implements Multijugador {

    public JuegoMultijugador(int id, String titulo, double precio, String genero, double tamañoGB, String plataforma) {
        super(id, titulo, precio, genero, tamañoGB, plataforma);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.9;
    }

    @Override
    public void concretarJugadores(int numJugadores) {
        System.out.println("hay " + numJugadores+ " jugadores");
    }

   

    
}