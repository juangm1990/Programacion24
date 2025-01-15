package SegundoTrimestre.Temario.Tema12_Ficheros.Opcion2;

import java.io.FileWriter;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Persona p = new Persona("Persona" + i, "Apellidos" + i, i + 17);
            personas.add(p);
            System.out.println(p);
        }

        FileWriter f = new FileWriter("personas.txt");

        for (int i = 0; i < personas.size(); i++) {
            String personasString = personas.get(i).toString();
            for (int j = 0; j < personasString.length(); j++) {
                char caracterPersona = personasString.charAt(j);
                f.write(caracterPersona);
            }
            f.write("\n");
        }

        f.close(); // Cerramos el primer flujo

        // Abrimos el segundo flujo para 'persona.txt'
        FileWriter fr = new FileWriter("persona.txt");

        for (int i = 0; i < personas.size(); i++) {
            String personaString = personas.get(i).toString();
            for (int j = 0; j < personaString.length(); j++) {
                char caracterPersona = personaString.charAt(j);
                fr.write(caracterPersona); // Escribimos en fr, no en f
            }
            fr.write("\n");
        }

        fr.close(); // Cerramos el segundo flujo

    }
}
