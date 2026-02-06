package cine.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Esta clase configura la documentación de la API usando OpenAPI (Swagger)
// y también habilita los repositorios JPA para la parte de gestión de productos.
@Configuration
@EnableJpaRepositories(basePackages = "cine.repositorios.repositorioJPA")
@OpenAPIDefinition(
        info = @Info(
                title = "PruebaCineMaven",
                version = "1.0",
                description = "Documentación de la API de gestión de productos"
        )
)
public class OpenApiConfig { }