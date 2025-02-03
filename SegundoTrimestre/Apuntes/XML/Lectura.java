package SegundoTrimestre.Apuntes.XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


// Ficheros XML
public class Lectura {

    public static void main(String[] args) throws Exception {

        File file = new File("ejercicio3.xml");

        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            // Almacenamos los nodos para luego mostrar la cantidad de ellos con el método getLength()
            NodeList nList = doc.getElementsByTagName("coche");
            System.out.println("Numero d coches: " + nList.getLength());

            // Leer todo su contenido conociendo la estructura del XML
            for (int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("\nCoche id: " + eElement.getAttribute("id"));
                    System.out.println("Marca: " + eElement.getElementsByTagName("marca").item(0).getTextContent());
                    System.out.println("Modelo: " + eElement.getElementsByTagName("modelo").item(0).getTextContent());
                    System.out.println("Cilindrada: " + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());

                }
                
            }
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
