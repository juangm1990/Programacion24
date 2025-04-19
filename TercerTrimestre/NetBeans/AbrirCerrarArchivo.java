/*

///////////////////////////////////////
Scroll pane  
    - Text area
Menu
    - Menu iten / Check Box
Label
    - Contador letras
///////////////////////////////////////
/// Cambiar jTextArea1 a jTextArea
///////////////////////////////////////

1. RUTA DEL ARCHIVO 

public class Interfaz extends javax.swing.JFrame {

    String ruta = null;
    
    }
     

2. ABRIR ARCHIVO

  private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)                                                   
        // TODO add your handling code here:

        
        JFileChooser fileChooser = new JFileChooser();
    int resultado = fileChooser.showOpenDialog(this);
    if (resultado == JFileChooser.APPROVE_OPTION) {
        File archivoActual = fileChooser.getSelectedFile();
        ruta = fileChooser.getSelectedFile().getAbsolutePath();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoActual))) {
            jTextArea.read(br, null);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }

    
     
3. CERRAR ARCHIVO

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)                                                   
        // TODO add your handling code here:

            if (ruta != null) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            jTextArea.write(bw); // vuelca el contenido del JTextArea al fichero
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay archivo abierto para guardar.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
 

4. GUARDAR COMO

private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {  

    JFileChooser fileChooser = new JFileChooser();
    int seleccion = fileChooser.showSaveDialog(this);

    if (seleccion == JFileChooser.APPROVE_OPTION) {
        File archivoAGuardar = fileChooser.getSelectedFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoAGuardar))) {
            jTextArea.write(bw); // Vuelca el contenido del JTextArea al nuevo archivo
            JOptionPane.showMessageDialog(this, "Archivo guardado correctamente.", "Guardar como", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }




5. CONTAR CARACTERES

///////////////////////////////
New Java Class (Crear una clase)
Text: Número de caracteres 0 | Número de palabras 0
JtextArea (Botón derecho) --> Events (Key Released)
///////////////////////////////

    private void jTextAreaKeyReleased(java.awt.event.KeyEvent evt) {                                      
            // TODO add your handling code here:
        
            String texto = jTextArea.getText();
        int numCaracteres = texto.length();
        int numPalabras;
        if (texto.trim().isEmpty()) {
        numPalabras = 0;
    }   else {
        numPalabras = texto.trim().split("\\s+").length;
    }   

        jLabel1.setText("Palabras: " + numPalabras + " | Caracteres: " + numCaracteres);
        
    
 */