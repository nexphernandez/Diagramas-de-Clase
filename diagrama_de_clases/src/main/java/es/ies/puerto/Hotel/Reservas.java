package es.ies.puerto.Hotel;

import es.ies.puerto.Fecha;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Reservas {
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;

    /**
     * Contructor por defeccto
     */
    public Reservas() {
    }

    /**
     * Constructor de los atributos de la clase
     * @param fechaEntrada
     * @param fechaSalida
     * @param cliente de la reserva
     * @param habitacion de la reserva
     */
    public Reservas(Fecha fechaEntrada, Fecha fechaSalida, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Fecha getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    /**
     * Metodo para calcular el coste total
     * @param noche
     * @return
     */
    public float calcularCostoTotal(float noche){
        return habitacion.getPrecio() * noche;
    }

    /**
     * Funcion para confirmar una reserva
     * @return
     */
    public boolean confirmarReserva(){
        if (!habitacion.getDisponible()) {
            return false;
        }
        habitacion.setDisponible(false);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reservas)) {
            return false;
        }
        Reservas reservas = (Reservas) o;
        return Objects.equals(fechaEntrada, reservas.fechaEntrada) && Objects.equals(fechaSalida, reservas.fechaSalida) && Objects.equals(cliente, reservas.cliente) && Objects.equals(habitacion, reservas.habitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEntrada, fechaSalida, cliente, habitacion);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaEntrada='" + getFechaEntrada() + "'" +
            ", fechaSalida='" + getFechaSalida() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", habitacion='" + getHabitacion() + "'" +
            "}";
    }
    

}
