package cine.entidad;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name="proyecciones")
public class Proyecciones {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id_proyeccion;
    @ManyToOne
    @JoinColumn(name = "id_peliculafk")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pelicula") // Asegúrate que en Peliculas el ID se llame así
    @JsonIdentityReference(alwaysAsId = true)
    Peliculas id_peliculaFK;

    @ManyToOne
    @JoinColumn(name = "id_salafk")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_sala") // Asegúrate que en Salas el ID se llame así
    @JsonIdentityReference(alwaysAsId = true)
    Salas id_salaFK;

    LocalDateTime fecha_hora_inicio;
    LocalDateTime fecha_hora_fin;
    double precio_entrada;
    int asientos_disponibles;
    @OneToMany(mappedBy = "id_proyeccionfk")
    List<Entradas> entradas;

    public Proyecciones() {}

    public Proyecciones(Long id_proyeccion, Peliculas id_peliculaFK, Salas id_salaFK, LocalDateTime fecha_hora_inicio, LocalDateTime fecha_hora_fin, double precio_entrada, int asientos_disponibles) {
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

    public Peliculas getId_peliculaFK() {
        return id_peliculaFK;
    }
    public void setId_peliculaFK(Peliculas id_peliculaFK) {
        this.id_peliculaFK = id_peliculaFK;
    }

    public Salas getId_salaFK() {
        return id_salaFK;
    }
    public void setId_salaFK(Salas id_salaFK) {
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
