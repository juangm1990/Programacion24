package PrimerTrimestre.Temario.Tema7_Herencia.Pokemon;

public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre){
        super(nombre, "planta");

    }

    //MÉTODO
    public void curar(){
        
        super.ps = super.ps + 50;
    }


}