package cine.repositorio;

import cine.entidad.Entradas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradasRepositorio extends JpaRepository<Entradas, Long> {

}
