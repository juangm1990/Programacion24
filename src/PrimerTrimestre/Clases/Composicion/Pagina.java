package PrimerTrimestre.Clases.Composicion;

public class Pagina {
    
    private int numPagina;
    private String texto;

    public Pagina(int numPaginas, String texto) {
        this.numPagina = numPaginas;
        this.texto = texto;
    }

    public int getNumPaginas() {
        return numPagina;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPagina = numPaginas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Pagina [numPagina=" + numPagina + ", texto=" + texto + "]";
    }
}
