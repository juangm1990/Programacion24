package SegundoTrimestre.TareasPracticas.Tema12_Ficheros.FicheroBinario1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fo = new FileOutputStream("datos.dat");
        // Amplifica su funcionalidad
        ObjectOutputStream oo = new ObjectOutputStream(fo);

        Persona p1 = new Persona(1, "Juan", "Galisteo");

        oo.writeObject(p1);

        oo.close();
        fo.close();

        // Leerlo

        FileInputStream fi = new FileInputStream("datos.dat");
        ObjectInputStream oi = new ObjectInputStream(fi);

        Persona pFichero = (Persona)oi.readObject();
        pFichero.setId(5);
        System.out.println(pFichero);

        oi.close();
        fi.close();
    }
}
