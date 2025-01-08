package com.springvalue.springbootvalue.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class controllerUser implements CommandLineRunner {
    @Autowired
    private remetente remetente;

    @Value("${email}")
    private String email;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nome Remetente: " + remetente.getNome());
        System.out.println("Email: " + email);
    }
}
