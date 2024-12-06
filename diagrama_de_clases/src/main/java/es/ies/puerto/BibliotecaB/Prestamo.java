package es.ies.puerto.BibliotecaB;
/**
 * @author nexphernandez
 * @version 1.0.0
 */

import java.util.Date;
import java.util.Objects;


public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucionPrevista;
    private Date fechaDevolucionFinal;
    private Libro libro;
    private Miembro miembro;
    private int multa;

    /**
     * Constructor por defecto
     */
    public Prestamo() {
    }

    /**
     * Constructor de los atributos de la clase
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @param libro
     * @param miembro
     */
    public Prestamo(Date fechaPrestamo, Date fechaDevolucionPrevista, Libro libro, Miembro miembro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
        this.fechaDevolucionFinal = null;
        this.libro = libro;
        this.miembro = miembro;
        this.libro.setDisponible(false);
        this.multa = 0;
    }

    public int getMulta() {
        return this.multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public Date getFechaDevolucionPrevista() {
        return this.fechaDevolucionPrevista;
    }

    public void setFechaDevolucionPrevista(Date fechaDevolucionPrevista) {
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
    }

    public Date getFechaDevolucionFinal() {
        return this.fechaDevolucionFinal;
    }

    public void setFechaDevolucionFinal(Date fechaDevolucionFinal) {
        this.fechaDevolucionFinal = fechaDevolucionFinal;
    }

    public Date getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return this.miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    /**
     * Metodo para calcular la multa
     */
    public void calcularMulta(){
        if (fechaDevolucionFinal.compareTo(fechaDevolucionPrevista) > 0) {
            this.multa = 20;
        }
    }

    /**
     * Metodo para marcar un libro como devuelto
     * @param fechaDevolucion
     */
    public void marcarDevuelto(Date fechaDevolucion){
        this.fechaDevolucionFinal = fechaDevolucion;
        this.libro.setDisponible(true);
        calcularMulta();
    }

    @Override
    public String toString() {
        return "{" +
            " fechaPrestamo='" + getFechaPrestamo() + "'" +
            ", fechaDevolucionPrevista='" + getFechaDevolucionPrevista() + "'" +
            ", fechaDevolucionFinal='" + getFechaDevolucionFinal() + "'" +
            ", libro='" + getLibro() + "'" +
            ", miembro='" + getMiembro() + "'" +
            ", multa='" + getMulta() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Prestamo)) {
            return false;
        }
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(fechaPrestamo, prestamo.fechaPrestamo) && Objects.equals(fechaDevolucionPrevista, prestamo.fechaDevolucionPrevista) && Objects.equals(fechaDevolucionFinal, prestamo.fechaDevolucionFinal) && Objects.equals(libro, prestamo.libro) && Objects.equals(miembro, prestamo.miembro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaPrestamo, fechaDevolucionPrevista, fechaDevolucionFinal, libro, miembro);
    }


    
}
