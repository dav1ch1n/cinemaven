package cine.repositorios.repositorioMongo;

import cine.entidad.Salas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalasRepositorioMongo extends MongoRepository<Salas, String> {
}
