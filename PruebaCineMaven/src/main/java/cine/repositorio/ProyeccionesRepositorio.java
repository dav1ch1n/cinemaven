package cine.repositorio;

import cine.entidad.Proyecciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProyeccionesRepositorio extends JpaRepository<Proyecciones, Long>{
}
