package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_Prueba;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        convertirAlumnosABinario();
        convertirNotasABinario();

        FileInputStream fis = new FileInputStream("alumnos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(fis.available()>0){
            Alumno a = (Alumno)ois.readObject();
            System.out.println(a);
        }

        ois.close();
        fis.close();

        FileInputStream fis2 = new FileInputStream("notas.dat");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);

        while(fis2.available()>0){
            Nota a = (Nota)ois2.readObject();
            System.out.println(a);
        }

        ois2.close();
        fis2.close();

        FileInputStream fis3 = new FileInputStream("alumnos.dat");
        ObjectInputStream ois3 = new ObjectInputStream(fis3);

        FileOutputStream fos4 = new FileOutputStream("notasMedias.dat");
        ObjectOutputStream oos4 = new ObjectOutputStream(fos4);

        while(fis3.available()>0){
            Alumno a = (Alumno)ois3.readObject();
            
            FileInputStream fis4 = new FileInputStream("notas.dat");
            ObjectInputStream ois4 = new ObjectInputStream(fis4);
            Boolean encontrado = false;
            Double notaMedia=0.0;

            while(!encontrado && fis4.available()>0){
                Nota n = (Nota)ois4.readObject();
                
                if(a.getId().equals(n.getId())){
                    notaMedia = (n.getNota1()+n.getNota2()+n.getNota3()+n.getNota4()+n.getNota5()+n.getNota6())/6;
                    encontrado=true;
                }
            }

            NotaMedia nm = new NotaMedia(a.getId(), a.getEmail(), notaMedia);
            oos4.writeObject(nm);

            ois4.close();
            fis4.close();

        }

        ois3.close();
        fis3.close();

        oos4.close();
        fos4.close();

        FileInputStream fis7 = new FileInputStream("notasMedias.dat");
        ObjectInputStream ois7 = new ObjectInputStream(fis7);

        while(fis7.available()>0){
            NotaMedia a = (NotaMedia)ois7.readObject();
            System.out.println(a);
        }

        ois7.close();
        fis7.close();

    }

    public static void convertirAlumnosABinario() throws Exception{
        // TRANSFORMAR FICHERO DE TEXTO ALUMNOS.TXT A BINARIO 
        FileReader fr = new FileReader("alumnos.txt");
        BufferedReader br = new BufferedReader(fr);

        FileOutputStream fos = new FileOutputStream("alumnos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String linea="";

        while((linea=br.readLine())!=null){
            String id="";
            String nombre1="";
            String nombre2="";
            String apellido1="";
            String apellido2="";
            String email="";
            String telefono="";

            for(int i=0; i<4; i++){
                id+=linea.charAt(i);
            }

            for(int i=4; i<15; i++){
                nombre1+=linea.charAt(i);
            }

            for(int i=15; i<28; i++){
                nombre2+=linea.charAt(i);
            }
            
            for(int i=29; i<44; i++){
                apellido1+=linea.charAt(i);
            }

            for(int i=45; i<58; i++){
                apellido2+=linea.charAt(i);
            }

            for(int i=59; i<90; i++){
                email+=linea.charAt(i);
            }

            for(int i=91; i<linea.length(); i++){
                telefono+=linea.charAt(i);
            }

            Alumno a = new Alumno(id, nombre1, nombre2, apellido1, apellido2, email, telefono);
            oos.writeObject(a);
        }

        br.close();
        fr.close();

        oos.close();
        fos.close();

        
    }

    public static void convertirNotasABinario() throws Exception{
        // TRANSFORMAR FICHERO DE TEXTO NOTAS.TXT A BINARIO 
        FileReader fr1 = new FileReader("notas.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        FileOutputStream fos1 = new FileOutputStream("notas.dat");
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

        String linea ="";

        while((linea=br1.readLine())!=null){
            String id="";
            double nota1=0;
            double nota2=0;
            double nota3=0;
            double nota4=0;
            double nota5=0;
            double nota6=0;
            String temp = "";

            for(int i=0; i<4; i++){
                id+=linea.charAt(i);
            }

            nota1 = obtenerNota(linea,4,8);
            nota2 = obtenerNota(linea,8,12);
            nota3 = obtenerNota(linea,12,16);
            nota4 = obtenerNota(linea,16,20);
            nota5 = obtenerNota(linea,20,24);
            nota6 = obtenerNota(linea,24,26);

            Nota n = new Nota(id, nota1, nota2, nota3, nota4, nota5, nota6);
            oos1.writeObject(n);
        }

        br1.close();
        fr1.close();

        oos1.close();
        fos1.close();
    }

    public static double obtenerNota(String linea, int posIni, int posFin){
        String temp = "";
        for(int i=posIni; i<posFin; i++){
            temp += ""+linea.charAt(i);
        }
        return Double.parseDouble(temp);
    }

}
