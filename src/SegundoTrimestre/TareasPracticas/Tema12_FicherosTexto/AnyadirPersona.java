package SegundoTrimestre.TareasPracticas.Tema12_FicherosTexto;

/*
 * 1 – Realiza un programa que escriba en el fichero “personas.txt” ” con flujo de escritura carácter 
 * por carácter, un ArrayList de 5 personas creado previamente y guarde cada persona en una línea del fichero.
 * 
 * 2 – Realiza un programa que lea el fichero “personas.txt” utilizando la ruta relativa del 
 * fichero con flujo de lectura carácter a carácter y lo muestre por pantalla.  
 * 
 * 3 – Realiza un programa que lea el fichero “personas.txt” utilizando la ruta absoluta 
 * del fichero con flujo de lectura línea a línea y lo muestre por pantalla. 
 * 
 * 4 – Realiza un programa que añada en el fichero “personas.txt” dos personas más al final del fichero con 
 * flujo de escritura línea a línea. 
 */

import java.io.FileWriter;
import java.util.ArrayList;

public class AnyadirPersona {
 
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Alejandro", "Caballero");
        Persona p2 = new Persona("Fali", "De la Fuente");
    

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(p1);
        personas.add(p2);
      

        FileWriter fw = null;

        fw = new FileWriter("personas.txt", true);

        for (int i = 0; i < personas.size(); i++) {

            fw.append(personas.get(i).toString());
        }
        fw.close();
    }
}