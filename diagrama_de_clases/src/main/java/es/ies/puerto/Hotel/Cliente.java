package es.ies.puerto.Hotel;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Cliente {
    private String nombre;
    private int numero;
    private String correo;

    /**
     * @author nexphernandez
     * @version 1.0.0
     */
    public Cliente() {
    }
    
    /**
     * Constructor de los atributos de la clase
     * @param nombre del cliente
     * @param numero del cliente
     * @param correo del cliente
     */
    public Cliente(String nombre, int numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para registrar nuevos clientes
     * @param nombre
     * @param numero
     * @param correo
     */
    public void registrarClientes(String nombre, int numero, String correo){
        new Cliente(nombre, numero, correo);
    }

    /**
     * Metodo para obtener informacion de un cliente
     * @param cliente
     * @return
     */
    public Cliente obtenerInformacion(Cliente cliente){
        return cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && numero == cliente.numero && Objects.equals(correo, cliente.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero, correo);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numero='" + getNumero() + "'" +
            ", correo='" + getCorreo() + "'" +
            "}";
    }
    
}
