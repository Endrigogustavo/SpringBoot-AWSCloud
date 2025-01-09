package com.swaggerspringboot.springswagger.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PessoaSwagger")
public class PessoaSchema {
    @Id
    private String id;
    private String nome;
    private String sobrenome;
    private String email;

    public PessoaSchema() {
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
