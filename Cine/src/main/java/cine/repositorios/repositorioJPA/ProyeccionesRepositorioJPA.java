package cine.repositorios.repositorioJPA;

import cine.entidad.Proyecciones;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProyeccionesRepositorioJPA extends JpaRepository<Proyecciones, Long> {
}
