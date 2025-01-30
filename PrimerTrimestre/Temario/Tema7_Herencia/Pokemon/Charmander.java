package PrimerTrimestre.Temario.Tema7_Herencia.Pokemon;

class Charmander extends Pokemon {

    //ATRIBUTOS
    private int multiplicadornyo;

    //CONSTRUCTOR
    public Charmander (String nombre){
        super(nombre, "fuego");

        this.multiplicadornyo = 3;
    }
    
    //MÉTODO
    @Override //SOBRESCRITURA
    public void atacar (Pokemon otro){
        if(otro instanceof Squirtel){
            if(!otro.defendiendo){
                otro.ps=otro.ps-(100*multiplicadornyo);
            }
            else{
                otro.ps=otro.ps-50;
            }
        } 
        else{
            otro.ps = otro.ps - (100 * multiplicadornyo);
        }
  
    }
    
}
