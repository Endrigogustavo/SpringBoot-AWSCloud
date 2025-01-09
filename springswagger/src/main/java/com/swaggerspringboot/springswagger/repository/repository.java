package com.swaggerspringboot.springswagger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.swaggerspringboot.springswagger.model.PessoaSchema;

public interface repository extends MongoRepository<PessoaSchema, String> {
    
}
