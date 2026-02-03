package cine.repositorios.repositorioJPA;

import cine.entidad.Salas;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SalasRepositorioJPA extends JpaRepository<Salas, Long> {
}
