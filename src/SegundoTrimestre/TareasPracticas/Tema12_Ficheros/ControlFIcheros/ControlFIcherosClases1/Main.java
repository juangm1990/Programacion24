package SegundoTrimestre.TareasPracticas.Tema12_Ficheros.ControlFIcheros.ControlFIcherosClases1;

public class Main {
    
    public static void main(String[] args) {
            
        
         try {
            Tecnico t = new Tecnico(1, "Javi");
        } catch (Exception e) {
           System.out.println(e.getMessage());;
        }



    }
}
