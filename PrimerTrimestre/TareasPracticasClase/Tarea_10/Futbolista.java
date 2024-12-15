package PrimerTrimestre.TareasPracticasClase.Tarea_10;

public class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    // Constructor por defecto
    public Futbolista(){
        super();
        this.dorsal = 0;
        this.demarcacion = "demarcacion";
    }

    // Constructor por parámetros
    public Futbolista(int i, String n, String ap, String fech, double p, double al, int d, String de){
        super(i,n,ap,fech,p,al);
        this.dorsal = d;
        this.demarcacion = de;
    }

    // Constructor de copia
    public Futbolista(Futbolista copia){
        super(copia);
        this.dorsal = copia.dorsal;
        this.demarcacion = copia.demarcacion;
    }

    // Métodos y funciones
    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dor) {
        this.dorsal = dor;
    }

    public String getDemarcacion() {
        return this.demarcacion;
    }

    public void setDemarcacion(String dem) {
        this.demarcacion = dem;
    }

    public void viajar(){
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " está viajando");
    }

    public boolean tieneSobrepeso(){
        double imc = super.peso / (super.altura * super.altura);
        if (imc >= 22) {
            return true;
        }

        return false;
    }

    public void jugarPartido(){
        System.out.println("El futbolista" + getNombre() + " " + getApellidos() + "está jugando el partido");
    }

    @Override
    public String toString() {
        return "El futbolista [Dorsal = " + dorsal + ", Demarcacion = " + demarcacion + "] " + super.toString();
    }
    
}
