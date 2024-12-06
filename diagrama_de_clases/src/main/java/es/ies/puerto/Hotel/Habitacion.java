package es.ies.puerto.Hotel;
import java.util.Objects;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Habitacion {
    private int numero;
    private String tipoHabitacion;
    private float precio;
    private boolean disponible;

    /**
     * Constructor por defecto
     */
    public Habitacion() {
        this.disponible = true;
    }

    /**
     * contructor de los atributo de la clase
     * @param numero de la habitacion
     * @param tipoHabitacion
     * @param precio de la habitacion
     * @param disponible
     */
    public Habitacion(int numero, String tipoHabitacion, float precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.disponible = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Funcion pra verificar si la habitacion esta disponible
     * @return
     */
    public boolean comprobarDisponibilidad(){
        return this.disponible;
    }

    /**
     * Metodo para cambiar la disponibilidad de la habitacion
     */
    public void cambiarEstado(){
        this.disponible = !this.disponible;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Habitacion)) {
            return false;
        }
        Habitacion habitacion = (Habitacion) o;
        return numero == habitacion.numero && Objects.equals(tipoHabitacion, habitacion.tipoHabitacion) && precio == habitacion.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, tipoHabitacion, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", tipoHabitacion='" + getTipoHabitacion() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", disponible='" + getDisponible() + "'" +
            "}";
    }


    
}