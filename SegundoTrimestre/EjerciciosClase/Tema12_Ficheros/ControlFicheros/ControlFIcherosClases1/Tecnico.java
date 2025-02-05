package SegundoTrimestre.EjerciciosClase.Tema12_Ficheros.ControlFicheros.ControlFIcherosClases1;

public class Tecnico {
    
    private int id;
    private String nombre;
    private Coche coche;

    public Tecnico(int id, String nombre) throws CocheIDException {
        this.id = id;
        this.nombre = nombre;
        coche = new Coche (1,"Audi","A4");
        coche.setId(0);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Tecnico [id=" + id + ", nombre=" + nombre + "]";
    }

}
