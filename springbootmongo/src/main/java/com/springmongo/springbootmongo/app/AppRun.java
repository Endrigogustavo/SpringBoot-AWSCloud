package com.springmongo.springbootmongo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springmongo.springbootmongo.model.UserSchema;
import com.springmongo.springbootmongo.repository.RepositoryMongoDB;

@Component
public class AppRun implements CommandLineRunner {
    @Autowired
    private RepositoryMongoDB repositoryMongoDB;

    @Override
    public void run(String... args) throws Exception {
        UserSchema user = new UserSchema();
        user.setName("Endrigo");
        user.setEmail("EndrigoTeste@gmail.com");

        repositoryMongoDB.save(user);
    }
}
