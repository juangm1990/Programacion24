/*

String ruta = null;

ABRIR ARCHIVO

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

CERRAR ARCHIVO

    if (ruta != null) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            jTextArea.write(bw); // vuelca el contenido del JTextArea al fichero
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay archivo abierto para guardar.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
 

GUARDAR COMO

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
    
 */