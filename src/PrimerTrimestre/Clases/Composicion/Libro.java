package PrimerTrimestre.Clases.Composicion;


import java.util.ArrayList;

public class Libro {
    
    private String titulo;
    private int isbn;
    private ArrayList<Pagina> paginas;

    public Libro(String titulo, int isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<Pagina>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }
    
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void agregarPagina(int n, String t) {

        Pagina p = new Pagina(n, t);

        this.paginas.add(p);
    }

    private ArrayList<Pagina> getPaginas() {

        return this.paginas;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]" + getPaginas();
    }
}
