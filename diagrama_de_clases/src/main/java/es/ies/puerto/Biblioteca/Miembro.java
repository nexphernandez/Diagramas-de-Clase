package es.ies.puerto.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Miembro {
    private String nombre;
    private String id;
    private List<Prestamo> historial;

    public Miembro() {
    }

    public Miembro(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.historial = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Miembro nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Miembro id(String id) {
        setId(id);
        return this;
    }

    /**
     * Metodo para registrar miembros
     * @param miembro a registrar
     */
    public void registrarMiembros(Prestamo miembro){
        historial.add(miembro);
    }

    /**
     * Metodo para ver el historial
     */
    public void verHistorial(){
        for (Prestamo prestamo : historial) {
            System.out.println(prestamo);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Miembro)) {
            return false;
        }
        Miembro miembro = (Miembro) o;
        return Objects.equals(nombre, miembro.nombre) && Objects.equals(id, miembro.id) && Objects.equals(historial, miembro.historial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, historial);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
}
