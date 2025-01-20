package SegundoTrimestre.EjerciciosClase.ControlFicheros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlFicherosMultiples1 {
    
    public static void main(String[] args) throws Exception{
        
        
             Scanner input = new Scanner(System.in);

        try {
            System.out.println("Introduzca el dividendo");
            int n = input.nextInt();
            System.out.println("Introduzca el divisor");
            int d = input.nextInt();

            double c=n/d;
            System.out.println("Resultado = " + c);
        }

        catch (InputMismatchException e){
            System.out.println("Ha introducido un carácter no válido");
        }
        catch (ArithmeticException e){
            System.out.println("El divisor no puede ser cero");
        }
        catch (Exception e){
            System.out.println("Error desconocido");
            System.out.println(e.getMessage());
        }
        
        input.close();
        
    
    }
}
