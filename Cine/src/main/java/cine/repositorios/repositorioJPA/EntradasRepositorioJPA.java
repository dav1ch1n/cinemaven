package cine.repositorios.repositorioJPA;

import cine.entidad.Entradas;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EntradasRepositorioJPA extends JpaRepository<Entradas, Long> {

}
