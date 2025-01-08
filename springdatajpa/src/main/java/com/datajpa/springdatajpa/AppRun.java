package com.datajpa.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.datajpa.springdatajpa.model.UserJPA;
import com.datajpa.springdatajpa.repository.RepositoryJPA;

public class AppRun implements CommandLineRunner {
    @Autowired
    private RepositoryJPA repositoryJPA;

    @Override
    public void run(String... args) throws Exception {
        UserJPA user = new UserJPA();
        user.setName("Endrigo");
        user.setEmail("TesteEndrigo@gmail.com");
        user.setPassword("123456");

        repositoryJPA.save(user);

        for(UserJPA u : repositoryJPA.findAll()) {
            System.out.println(u);
        }
    }
}
