package es.ies.puerto.BibliotecaB;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class SalaDeLectura {
    private String nombre;
    private int capacidad;
    private boolean estaReservado;
    
    /**
     * Cosntructor por defect
     */
    public SalaDeLectura() {
        this.estaReservado = false;
    }

    /**
     * Consructor de los atributos de la clase
     * @param nombre de la sala
     * @param capacidad capacidad
     */
    public SalaDeLectura(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estaReservado = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Funcion para reservar la sala
     * @return
     */
    public boolean reservarSala(){
        if (this.estaReservado) {
            return false;
        }
        return true;
    }

    /**
     * Metodo para saber si la sala esta reservada o no
     * @return
     */
    public boolean verificarDisponibilidad(){
        return !this.estaReservado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SalaDeLectura)) {
            return false;
        }
        SalaDeLectura salaDeLectura = (SalaDeLectura) o;
        return Objects.equals(nombre, salaDeLectura.nombre) && capacidad == salaDeLectura.capacidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capacidad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", capacidad='" + getCapacidad() + "'" +
            "}";
    }
    
}
