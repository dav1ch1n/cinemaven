package cine.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Salas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_sala;
    String nombre_sala;
    int capacidad;
    String tipo_sala;
    String calidad_sonido;
    Boolean activa;

    public Salas(){}
    public Salas(Long id_sala, String nombre_sala, int capacidad, String tipo_sala, String calidad_sonido, Boolean activa) {
        this.id_sala = id_sala;
        this.nombre_sala = nombre_sala;
        this.capacidad = capacidad;
        this.tipo_sala = tipo_sala;
        this.calidad_sonido = calidad_sonido;
        this.activa = activa;
    }

    public Long getId_sala() {
        return id_sala;
    }
    public void setId_sala(Long id_sala) {
        this.id_sala = id_sala;
    }

    public String getNombre_sala() {
        return nombre_sala;
    }
    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }

    public String getTipo_sala() {
        return tipo_sala;
    }
    public void setTipo_sala(String tipo_sala) {
        this.tipo_sala = tipo_sala;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCalidad_sonido() {
        return calidad_sonido;
    }
    public void setCalidad_sonido(String calidad_sonido) {
        this.calidad_sonido = calidad_sonido;
    }

    public Boolean getActiva() {
        return activa;
    }
    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}
