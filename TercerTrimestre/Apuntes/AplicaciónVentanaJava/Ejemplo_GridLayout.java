package TercerTrimestre.Apuntes.AplicaciónVentanaJava;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo_GridLayout {
    
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Mi primera ventana en Java");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        
        JPanel panel = new JPanel(new GridLayout (2,2));
        panel.add(new JButton("Boton1"));
        panel.add(new JButton("Boton2"));
        panel.add(new JButton("Boton3"));
        frame.add(panel);
        frame.setVisible(true);


        
        
    }
}
