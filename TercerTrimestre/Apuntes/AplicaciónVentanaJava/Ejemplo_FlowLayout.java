package TercerTrimestre.Apuntes.AplicaciónVentanaJava;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo_FlowLayout {
    
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Mi primera ventana en Java");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        
        JPanel panel = new JPanel(new FlowLayout (FlowLayout.RIGHT));
        panel.add(new JButton("Uno"));
        panel.add(new JButton("Dos"));
        panel.add(new JButton("Tres"));
        frame.add(panel);
        frame.setVisible(true);


        
        
    }
}
