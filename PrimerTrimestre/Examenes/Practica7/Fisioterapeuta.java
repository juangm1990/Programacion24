package PrimerTrimestre.Examenes.Practica7;

public class Fisioterapeuta extends Masajista {
    
    // Atributo específico de Fisioterapeuta
    private int anosExperiencia;

    // Constructor por defecto
    public Fisioterapeuta() {
        super();  
        this.anosExperiencia = 0;  
    }

    // Constructor con parámetros
    public Fisioterapeuta(int i, String n, String ape, String fNac, double p, double a, String t, int experiencia) {
        super(i, n, ape, fNac, p, a, t);  
        this.anosExperiencia = experiencia; 
    }

    // Constructor de copia
    public Fisioterapeuta(Fisioterapeuta copia) {
        super(copia); 
        this.anosExperiencia = copia.anosExperiencia;  
    }

    // Métodos getter y setter
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void viajar() {
        System.out.println("Fisioterapeuta viajando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Fisioterapeuta concentrándose");
    }

    @Override
    public void comer() {
        System.out.println("Fisioterapeuta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Fisioterapeuta durmiendo");
    }

    @Override
    public String toString() {
        return "Fisioterapeuta" + " | " + super.toString() + " | Años de experiencia: " + anosExperiencia ;
    }
}
