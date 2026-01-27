package cine.repositorio;

import cine.entidad.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepositorio extends JpaRepository<Peliculas, Long> {}
