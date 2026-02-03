package cine.entidad;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "entradas")
@Table(name="entradas")
public class Entradas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id_entradas;
    int id_salaFK;
    int id_proyeccionFK;

    public Entradas(){}
    public Entradas(Long id_entradas, int id_salaFK, int id_proyeccionFK) {
        this.id_entradas = id_entradas;
        this.id_salaFK = id_salaFK;
        this.id_proyeccionFK = id_proyeccionFK;
    }

    public Long getId_entradas() {
        return id_entradas;
    }
    public void setId_entradas(Long id_entradas) {
        this.id_entradas = id_entradas;
    }

    public int getId_salaFK() {
        return id_salaFK;
    }
    public void setId_salaFK(int id_salaFK) {
        this.id_salaFK = id_salaFK;
    }

    public int getId_proyeccionFK() {
        return id_proyeccionFK;
    }
    public void setId_proyeccionFK(int id_proyeccionFK) {
        this.id_proyeccionFK = id_proyeccionFK;
    }
}
