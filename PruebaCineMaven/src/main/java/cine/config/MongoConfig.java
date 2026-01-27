package cine.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration // 1. Indica que esta clase es de configuración
public class MongoConfig {
    @Autowired
    private MongoTemplate mongoTemplate; // Herramienta principal de Spring para hablar con Mongo

    @PostConstruct // 2. Esto se ejecuta AUTOMÁTICAMENTE al arrancar la app
    public void inicializar() {
        try {
            String empleadosColeccion = "empleados";
            String entradasColeccion = "entradas";
            String peliculasColeccion = "peliculas";
            String proyeccionesColeccion = "proyecciones";
            String salasColeccion = "salas";
            if (!mongoTemplate.collectionExists(empleadosColeccion)) {
                mongoTemplate.createCollection(empleadosColeccion);
                System.out.println("Colección creada con éxito.");

            } else {
                System.out.println("La colección ya existía.");
            }
            if (!mongoTemplate.collectionExists(entradasColeccion)) {
                mongoTemplate.createCollection(entradasColeccion);
                System.out.println("Colección creada con éxito.");

            } else {
                System.out.println("La colección ya existía.");
            }
            if (!mongoTemplate.collectionExists(peliculasColeccion)) {
                mongoTemplate.createCollection(peliculasColeccion);
                System.out.println("Colección creada con éxito.");

            } else {
                System.out.println("La colección ya existía.");
            }
            if (!mongoTemplate.collectionExists(proyeccionesColeccion)) {
                mongoTemplate.createCollection(proyeccionesColeccion);
                System.out.println("Colección creada con éxito.");

            } else {
                System.out.println("La colección ya existía.");
            }
            if (!mongoTemplate.collectionExists(salasColeccion)) {
                mongoTemplate.createCollection(salasColeccion);
                System.out.println("Colección creada con éxito.");

            } else {
                System.out.println("La colección ya existía.");
            }

        } catch (Exception e) {
            System.err.println("Error crítico al intentar conectar/crear en Mongo: " + e.getMessage());
        }
    }
}