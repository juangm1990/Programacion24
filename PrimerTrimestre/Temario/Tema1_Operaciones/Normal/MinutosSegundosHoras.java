package PrimerTrimestre.Temario.Tema1_Operaciones.Normal;

public class MinutosSegundosHoras {
    
    public static void main(String[] args) throws Exception {
        
        int horas = 1;
        int minutos = 4;
        int segundos = 2;
        int totalSegundos = 0;

        totalSegundos=(horas*3600)+(minutos*60)+segundos;
        System.out.println(totalSegundos);
        
    }
}
