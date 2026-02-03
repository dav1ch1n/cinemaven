package cine.repositorios.repositorioJPA;

import cine.entidad.Peliculas;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PeliculasRepositorioJPA extends JpaRepository<Peliculas, Long> {}
