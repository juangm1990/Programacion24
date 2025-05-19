package PrimerTrimestre.Examenes.Practica7;


public class Futbolista extends Persona implements Deportista {
    
    private int dorsal;
    private String demarcacion;

    // Constructores por Defecto, Parámetros y Copia

    public Futbolista() {
        super();
        this.dorsal = 0;
        this.demarcacion = null;
    }

    public Futbolista(int i, String n, String ape, String fNac, double p, double a, int dor, String de) {
        super(i, n, ape, fNac, p, a);
        this.dorsal = dor;
        this.demarcacion = de;
    }

    public Futbolista(Futbolista copia) {
        super(copia);
        this.dorsal = copia.dorsal;
        this.demarcacion = copia.demarcacion;
    }

    // Getters y Setters

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dor) {
        this.dorsal = dor;
    }

    public String getDemarcacion() {
        return this.demarcacion;
    }

    public void setDemarcacion(String de) {
        this.demarcacion = de;
    }

    // Métodos Personalizados

    @Override
    public void viajar() {
        System.out.println("Futbolista viajando: " + this);
    }

    @Override
    public void entrenar() {
        System.out.println("Futbolista entrenando: " + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Futbolista jugando partido: " + this);
    }

    @Override
    public boolean tieneSobrepeso() {
        // Cálculo del IMC (Índice de Masa Corporal)
        double imc = this.peso / (this.altura * this.altura);
        return imc > 25;  // Umbral de sobrepeso ajustado a 25
    }

    @Override
    public boolean asignarSeleccion(SeleccionFutbol s) {
        for (int i = 0; i < this.selecciones.size(); i++) {
            if (this.selecciones.get(i).getId() == s.getId()) {
                return false;
            }
        }
        this.selecciones.add(s);
        return true;
    }

    @Override
    public boolean quitarSeleccion(int id) {
        for(int i = 0; i < this.selecciones.size(); i++) {
            if (this.selecciones.get(i).getId() == id) {
                this.selecciones.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Futbolista = " + super.toString() + " | Dorsal: " + dorsal + " | Demarcacion: " + demarcacion;
    }
}
