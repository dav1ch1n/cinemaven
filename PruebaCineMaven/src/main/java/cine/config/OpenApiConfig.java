package cine.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "PruebaCineMaven",
                version = "1.0",
                description = "Documentación de la API de gestión de productos"
        )
)
public class OpenApiConfig { }