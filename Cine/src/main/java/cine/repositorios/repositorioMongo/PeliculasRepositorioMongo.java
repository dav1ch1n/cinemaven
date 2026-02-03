package cine.repositorios.repositorioMongo;

import cine.entidad.Peliculas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepositorioMongo extends MongoRepository<Peliculas, Long> {}
