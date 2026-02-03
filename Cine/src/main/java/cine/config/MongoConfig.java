package cine.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;
import java.util.List;

@Configuration // 1. Indica que esta clase es de configuración
@EnableMongoRepositories(basePackages = "cine.repositorios.repositorioMongo")
public class MongoConfig {
    @Autowired
    private MongoTemplate mongoTemplate; // Herramienta principal de Spring para hablar con Mongo

    @PostConstruct // 2. Esto se ejecuta AUTOMÁTICAMENTE al arrancar la app
    public void inicializar() {
        try {
            // Ponemos todos los nombres en una lista
            List<String> colecciones = Arrays.asList(
                    "empleados",
                    "entradas",
                    "peliculas",
                    "proyecciones",
                    "salas"
            );
            // Recorremos la lista una por una
            for (String coleccion : colecciones) {
                if (!mongoTemplate.collectionExists(coleccion)) {
                    mongoTemplate.createCollection(coleccion);
                    System.out.println("✅ Colección creada: " + coleccion);
                } else {
                    System.out.println("ℹ️ La colección ya existe: " + coleccion);
                }
            }

        } catch (Exception e) {
            System.err.println("Error crítico al conectar con Mongo: " + e.getMessage());
        }
    }
}