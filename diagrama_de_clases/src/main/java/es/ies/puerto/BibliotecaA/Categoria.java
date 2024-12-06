package es.ies.puerto.BibliotecaA;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Categoria {
    private String nombre;
    private String descripcion;
    private List<String> libros;

    /**
     * Constructor por defecto 
     */
    public Categoria() {
        this.libros = new ArrayList<>();
    }

    /**
     * Constructtor de los atributos de la clase
     * @param nombre
     * @param descripcion
     */
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para agregar un libro a esta categoria
     * @param libro de libos
     */
    public void agregarCategoria(String libro){
        libros.add(libro);
    }

    /**
     * Funcion para listar los libros de esta categoria
     * @return lista de libros
     */
    public List<String> listarLibrosPorCategoría(){
        return new ArrayList<>(libros);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Categoria)) {
            return false;
        }
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && Objects.equals(descripcion, categoria.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            "}";
    }
    
}
