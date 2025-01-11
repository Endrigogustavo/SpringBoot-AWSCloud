package com.swaggerspringboot.springswagger.documents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Teste API")
                        .description("Descrição da API Teste")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Endrigo")
                                .url("https://www.teste.com")
                                .email("null"))
                        .termsOfService("Termos de uso: Teste")
                        .license(new License()
                                .name("Licença - Teste")
                                .url("https://www.teste.com.br")));
    }
}
