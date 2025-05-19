package TercerTrimestre.NetBeans;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraWindows {
    
     public static void main(String[] args) {

        //VENTANA
        JFrame frame = new JFrame("Calculadora Windows");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //CREO PRIMER PANEL
        JPanel panel1 = new JPanel(new BorderLayout());      
        panel1.add (new JTextField("0"), BorderLayout.NORTH);

        //CREO SEGUNDO PANEL
        JPanel panel2 = new JPanel(new GridLayout(6, 4, 5, 5));

        panel2.add(new JButton("%"));
        panel2.add(new JButton("CE"));
        panel2.add(new JButton("C"));
        panel2.add(new JButton("Borrar"));
        panel2.add(new JButton("1/X"));
        panel2.add(new JButton("X2"));
        panel2.add(new JButton("2RaizX"));
        panel2.add(new JButton("%"));
        panel2.add(new JButton("7"));
        panel2.add(new JButton("8"));
        panel2.add(new JButton("9"));
        panel2.add(new JButton("X"));
        panel2.add(new JButton("4"));
        panel2.add(new JButton("5"));
        panel2.add(new JButton("6"));
        panel2.add(new JButton("-"));
        panel2.add(new JButton("1"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("3"));
        panel2.add(new JButton("+"));
        panel2.add(new JButton("+/-"));
        panel2.add(new JButton("0"));
        panel2.add(new JButton(","));
        panel2.add(new JButton("="));

        panel1.add(panel2, BorderLayout.CENTER);
        frame.add(panel1);

        frame.setVisible(true);
    }
}