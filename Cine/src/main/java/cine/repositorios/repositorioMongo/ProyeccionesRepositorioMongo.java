package cine.repositorios.repositorioMongo;

import cine.entidad.Proyecciones;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProyeccionesRepositorioMongo extends MongoRepository<Proyecciones, Long> {
}
