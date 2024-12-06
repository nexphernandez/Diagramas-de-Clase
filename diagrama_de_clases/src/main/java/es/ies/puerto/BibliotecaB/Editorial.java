package es.ies.puerto.BibliotecaB;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Editorial {
    private String nombre;
    private String direccion;
    private int contacto;
    private List<Libro> libros;

    /**
     * Constructo por defecto
     */
    public Editorial() {
        this.libros = new ArrayList<>();
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre de la editorial
     * @param direccion de la editorial
     * @param contacto de la editorial
     */
    public Editorial(String nombre, String direccion, int contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getContacto() {
        return this.contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    /**
     * Funcion para registrar libros en la editorial
     * @param libro a registrar
     * @return true/false
     */
    public boolean registrarEditorial(Libro libro){
        if (libros.contains(libro)) {
            return false;
        }
        libros.add(libro);
        return true;
    }

    /**
     * metodo para listar los lbros
     */
    public void listarLibrosEditorial (){
        if (libros.isEmpty()) {
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Editorial)) {
            return false;
        }
        Editorial editorial = (Editorial) o;
        return Objects.equals(nombre, editorial.nombre) && Objects.equals(direccion, editorial.direccion) && contacto == editorial.contacto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, contacto);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", contacto='" + getContacto() + "'" +
            "}";
    }
    
}
