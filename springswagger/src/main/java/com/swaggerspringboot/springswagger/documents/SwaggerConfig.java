package com.swaggerspringboot.springswagger.documents;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
     private Contact contact() {
        return new Contact("Endrigo", "Teste.com", "null")
     }
}
