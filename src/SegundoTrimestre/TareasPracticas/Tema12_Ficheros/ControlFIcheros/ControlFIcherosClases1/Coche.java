package SegundoTrimestre.TareasPracticas.Tema12_Ficheros.ControlFIcheros.ControlFIcherosClases1;


public class Coche {
    
    private int id;
    private String marca;
    private String modelo;


    // Constructor por parámetros
    public Coche(int id, String marca, String modelo) {

        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor por defecto
    public Coche() {

        this.id = 1;
        this.marca = "BMW";
        this.modelo = "C";
    }

    // Constructor de copia
    public Coche(Coche copia) {

        super();
        this.id = copia.id;
        this.marca = copia.marca;
        this.modelo = copia.modelo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) throws CocheIDException {

        if (id <= 0) {
            throw new CocheIDException("El ID no puede ser menor o igual a 0");
        }

        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
    }

}
