package cine.repositorios.repositorioMongo;

import cine.entidad.Entradas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradasRepositorioMongo extends MongoRepository<Entradas, String> {

}
