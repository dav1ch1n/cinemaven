package cine.entidad;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
//@Document(collection = "entradas")
@Table(name="entradas")
public class Entradas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id_entradas;
    @ManyToOne
    @JoinColumn(name = "id_salafk")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_sala")
    @JsonIdentityReference(alwaysAsId = true)
    Salas id_salaFK;

    @ManyToOne
    @JoinColumn(name = "id_proyeccionfk")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_proyeccion")
    @JsonIdentityReference(alwaysAsId = true)
    Proyecciones id_proyeccionfk;

    public Entradas(){}
    public Entradas(Long id_entradas, Salas id_salaFK, Proyecciones id_proyeccionfk) {
        this.id_entradas = id_entradas;
        this.id_salaFK = id_salaFK;
        this.id_proyeccionfk = id_proyeccionfk;
    }

    public Long getId_entradas() {
        return id_entradas;
    }
    public void setId_entradas(Long id_entradas) {
        this.id_entradas = id_entradas;
    }

    public Salas getId_salaFK() {
        return id_salaFK;
    }
    public void setId_salaFK(Salas id_salaFK) {
        this.id_salaFK = id_salaFK;
    }

    public Proyecciones getId_proyeccionfk() {
        return id_proyeccionfk;
    }
    public void setId_proyeccionfk(Proyecciones id_proyeccionFK) {
        this.id_proyeccionfk = id_proyeccionfk;
    }
}
