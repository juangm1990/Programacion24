package TercerTrimestre.NetBeans;

import javax.swing.JFrame;

public class Ventana {
    
       public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Mi primera ventana en Java");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
