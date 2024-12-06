package es.ies.puerto.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private Categoria categoria;
    private boolean disponible;
    private List<String> historial;

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<String> getHistorial() {
        return this.historial;
    }

    public void setHistorial(List<String> historial) {
        this.historial = historial;
    }

    /**
     * constructor por defecto
     */
    public Libro() {
        this.disponible = true;
        this.historial = new ArrayList<>();
    }

    /**
     * Constructor de los atributo de la clase
     * @param titulo del libro
     * @param autor del libro
     * @param isbn del libro
     * @param categoria del libro
     */
    public Libro(String titulo, String autor, int isbn, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.disponible = true;
        this.historial = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Funcion para ver si un libro esta disponible
     * @return true/false
     */
    public boolean verificarDisponibilidad(){
        return disponible;
    }

    /**
     * Funcion para ver el histoial de prestamos
     */
    public List<String> verHistorial(){
        return historial;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && isbn == libro.isbn && Objects.equals(categoria, libro.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, isbn, categoria);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", categoria='" + getCategoria() + "'" +
            "}";
    }
    
}
