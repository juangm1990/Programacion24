public class Pokemon {
    
    protected int ps;
    protected String tipo;
    protected int nivel;
    protected String nombre;
    protected boolean defendiendo;


    //CONSTRUCTOR
    public Pokemon(String nombre, String tipo) {
        this.ps = 1000;
        this.nombre = nombre;
        this.nivel = 1;
        this.tipo = tipo;
        this.defendiendo = false;
    }


    public int getPs() {
        return ps;
    }


    public void setPs(int ps) {
        this.ps = ps;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getNivel() {
        return nivel;
    }


    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean isDefendiendo() {
        return defendiendo;
    }


    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    //Método personalizado: Lo guarda y no tiene retorno
    public void atacar (Pokemon otro){
        if(!otro.defendiendo){
            otro.ps=otro.ps-100;
        }
        else{
            otro.ps=otro.ps-50;
        }
    }

    public void defender (boolean estado){
        this.defendiendo=estado;
    }
    


    @Override
    public String toString() {
        return "Pokemon [ps= " + ps + ", tipo= " + tipo + ", nivel= " + nivel + ", nombre= " + nombre + ", defendiendo= " + defendiendo + "]";
    }
    
    
    

    
}