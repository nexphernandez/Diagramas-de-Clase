package es.ies.puerto.BibliotecaB;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Bibliotecario {
    private String nombre;
    private int id;
    private List<Libro> librosRegistrados;
    private List<Prestamo> prestamosGestionados;

    /**
     * Constructor pod defecto
     */
    public Bibliotecario() {
        this.librosRegistrados = new ArrayList<>();
        this.prestamosGestionados = new ArrayList<>();
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre del bibliotecario
     * @param id del bibliotecario
     */
    public Bibliotecario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosRegistrados = new ArrayList<>();
        this.prestamosGestionados = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para registrar libors
     * @param libro
     * @param miembro
     */
    public void registrarLibros(Libro libro, Miembro miembro){
        librosRegistrados.add(libro);
    }
    /**
     * Metodo oara gestionar un prestamo
     * @param libro a prestar
     * @miembro que se lleva el libro
     */
    public void gestionarPrestamo(Libro libro, Miembro miembro){
        Prestamo prestamo = new Prestamo(new java.util.Date(), new java.util.Date(), libro, miembro);
        prestamosGestionados.add(prestamo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bibliotecario)) {
            return false;
        }
        Bibliotecario bibliotecario = (Bibliotecario) o;
        return  id == bibliotecario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
}
