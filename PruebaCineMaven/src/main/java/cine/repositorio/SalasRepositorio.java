package cine.repositorio;

import cine.entidad.Salas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalasRepositorio extends JpaRepository<Salas, Long>{
}
