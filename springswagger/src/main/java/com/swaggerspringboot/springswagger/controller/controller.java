package com.swaggerspringboot.springswagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swaggerspringboot.springswagger.model.PessoaSchema;
import com.swaggerspringboot.springswagger.repository.repository;

@RestController
public class controller {
 
    @Autowired
    private repository repository;

    @GetMapping
    public String Home(){
        return "Home";
    }

    @PostMapping("/save")
    public PessoaSchema Cadastro(@RequestBody PessoaSchema pessoa){
        return repository.save(pessoa);
    }

    @GetMapping("/list")
    public Iterable<PessoaSchema> Listar(){
        return repository.findAll();
    }
}
