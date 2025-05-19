package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoMultijugador extends JuegoDigital implements Multijugador {

    public JuegoMultijugador(int id, String titulo, double precio, String genero, double tamanoGB, String plataforma) {
        super(id, titulo, precio, genero, tamanoGB, plataforma);
    }

    @Override
    public void conectarJugadores(int numJugadores) {
        System.out.println("hay " + numJugadores + " jugadores");
    }
}
