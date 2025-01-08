package com.springvalue.springbootvalue.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class controllerUser implements CommandLineRunner {
    @Value("${nome}")
    private String nome;

    @Value("${email}")
    private String email;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
