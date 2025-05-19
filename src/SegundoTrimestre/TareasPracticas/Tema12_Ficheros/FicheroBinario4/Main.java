package SegundoTrimestre.TareasPracticas.Tema12_Ficheros.FicheroBinario4;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i< 5; i++){
            Persona p = new Persona(i, "Nombre"+i, "Apellidos"+i, 18+i);
            personas.add(p);
        }
        //Bite a bit
        FileOutputStream fo = new FileOutputStream("personas.txt");
        //Más funcionalidad
        ObjectOutputStream oo = new ObjectOutputStream(fo);

        for (int i = 0; i< personas.size(); i++){
            oo.writeObject((personas.get(i)));

        }

        oo.close();
        fo.close();


        // Leer y mostrar personas que tengan más de 20 años

        FileInputStream fi = new FileInputStream("personas.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        while (fi.available()>0) {
            Persona p  =(Persona)oi.readObject();

            if (p.getEdad()>20) {
                System.out.println(p);
            }
            
        }

        oi.close();
        fi.close();




    }
}
