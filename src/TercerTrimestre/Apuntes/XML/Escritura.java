package TercerTrimestre.Apuntes.XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Ficheros XML
public class Escritura {

    public static void main(String[] args) throws Exception {

        try {

            // Elementos del documento XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // Definimos el elemento raiz del elemento
            Element eRaiz = doc.createElement("concesionario");
            doc.appendChild(eRaiz);

            // Definimos el nodo que contendrá los elementos
            Element eCoche = doc.createElement("coche");
            eRaiz.appendChild(eCoche);

            // Atributo para el nodo coche
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            eCoche.setAttributeNode(attr);

            // Definimos cada uno de los elementos para asignarle un valor
            Element eMarca = doc.createElement("marca");
            eMarca.appendChild(doc.createTextNode("Renault"));
            eCoche.appendChild(eMarca);

            Element eModelo = doc.createElement("modelo");
            eModelo.appendChild(doc.createTextNode("Megane"));
            eCoche.appendChild(eModelo);

            Element eCilindrada = doc.createElement("cilindrada");
            eCilindrada.appendChild(doc.createTextNode("1.5"));
            eCoche.appendChild(eCilindrada);

            //////////////////////////////////////////////////////////
            // Clases necesarias para poder finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // (DOM = Document Object Model = Árbol invertido de etiquetas)
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ejercicio3.xml"));

            transformer.transform(source, result);

        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
