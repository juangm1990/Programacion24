package PrimerTrimestre.TareasPracticasClase.Tarea_10;

public class Entrenador extends Persona {

    private int idFederacion;

    // Constructor por defecto
    public Entrenador(){
        super();
        this.idFederacion = 0;
    }

    // Constructor por parámetros
    public Entrenador(int id, String n, String ap, String f, double p, double al, int iF){
        super(id,n,ap,f,p,al);
        this.idFederacion = iF;
    }

    // Constructor de copia
    public Entrenador(Entrenador copia){
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    // Métodos y funciones
    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idF) {
        this.idFederacion = idF;
    }

    public void viajar(){
        System.out.println("El entrenador " + getNombre() + getApellidos() + " está viajando");
    }

    public boolean tieneSobrepeso(){
        double imc = super.peso / (super.altura * super.altura);
        if (imc >= 25) {
            return true;
        }
        return false;
    }

    public void entrenar(){
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + "está entrenando al equipo");
    }

    @Override
    public String toString() {
        return "Entrenador: [Id Federacion = " + idFederacion + ", Nombre = " + getNombre() + 
               " " + getApellidos() + ", Peso = " + peso + ", Altura = " + altura + "]";
    }
    
}
