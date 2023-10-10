package io.swagger.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-09T22:13:45.179584128Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Server localServer = new Server();
        localServer.setDescription("local");
        localServer.setUrl("http://localhost:8080");
        OpenAPI openAPI = new OpenAPI();
        openAPI.info(info());
        openAPI.setExternalDocs(externalDocumentation());
        openAPI.setServers(Arrays.asList(localServer));
        return openAPI;
    }

    private Info info() {
        return new Info()
                .title("Examen - OpenAPI 3.0")
                .description("Este es una Api basado en la especificación OpenAPI 3.0. "
                        + "Se Puede obtener más información sobre la API en [https://pruebatecnicav2.mx](https://pruebatecnicav2.mx).")
                .termsOfService("http://pruebatecnicav2.mx/terms/")
                .version("1.0.01")
                .contact(new Contact()
                        .email("pruebatecnicav2@mail.mx"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html"));
    }

    private ExternalDocumentation externalDocumentation() {
        return new ExternalDocumentation()
                .description("Más información sobre el examen")
                .url("http://pruebatecnicav2.mx");
    }

}
