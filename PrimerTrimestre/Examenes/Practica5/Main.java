package PrimerTrimestre.Examenes.Practica5;

public class Main {
    
    public static void main(String[] args) throws Exception{
     
        
        Contrato c1=new Contrato(2000, "jornada completa", "Fijo");

        Empleado e1= new Empleado("Juan", "Galisteo", "+34648606500", c1);

        System.out.println(e1);
        
    }
}
