package cine.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "proyecciones")
public class Proyecciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_proyeccion;
    int id_peliculaFK;
    int id_salaFK;
    LocalDateTime fecha_hora_inicio;
    LocalDateTime fecha_hora_fin;
    double precio_entrada;
    int asientos_disponibles;

    public Proyecciones() {}

    public Proyecciones(Long id_proyeccion, int id_peliculaFK, int id_salaFK, LocalDateTime fecha_hora_inicio, LocalDateTime fecha_hora_fin, double precio_entrada, int asientos_disponibles) {
        this.id_proyeccion = id_proyeccion;
        this.id_peliculaFK = id_peliculaFK;
        this.id_salaFK = id_salaFK;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.fecha_hora_fin = fecha_hora_fin;
        this.precio_entrada = precio_entrada;
        this.asientos_disponibles = asientos_disponibles;
    }

    public Long getId_proyeccion() {
        return id_proyeccion;
    }
    public void setId_proyeccion(Long id_proyeccion) {
        this.id_proyeccion = id_proyeccion;
    }

    public int getId_peliculaFK() {
        return id_peliculaFK;
    }
    public void setId_peliculaFK(int id_peliculaFK) {
        this.id_peliculaFK = id_peliculaFK;
    }

    public int getId_salaFK() {
        return id_salaFK;
    }
    public void setId_salaFK(int id_salaFK) {
        this.id_salaFK = id_salaFK;
    }

    public LocalDateTime getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }
    public void setFecha_hora_inicio(LocalDateTime fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public LocalDateTime getFecha_hora_fin() {
        return fecha_hora_fin;
    }
    public void setFecha_hora_fin(LocalDateTime fecha_hora_fin) {
        this.fecha_hora_fin = fecha_hora_fin;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }
    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    public int getAsientos_disponibles() {
        return asientos_disponibles;
    }
    public void setAsientos_disponibles(int asientos_disponibles) {
        this.asientos_disponibles = asientos_disponibles;
    }
}
