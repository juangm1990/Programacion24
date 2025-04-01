package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios;

import java.io.Serializable;

public class Partidas implements Serializable{

    private String id;
    private String nombre_Juego;
    private String puntuacion;

    
    public Partidas(String id, String nombre_Juego, String puntuacion) {
        this.id = id;
        this.nombre_Juego = nombre_Juego;
        this.puntuacion = puntuacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre_Juego() {
        return nombre_Juego;
    }
    public void setNombre_Juego(String nombre_Juego) {
        this.nombre_Juego = nombre_Juego;
    }
    public String getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
    @Override
    public String toString() {
        return id + " " + nombre_Juego  + " " + puntuacion;
    }
    
}
