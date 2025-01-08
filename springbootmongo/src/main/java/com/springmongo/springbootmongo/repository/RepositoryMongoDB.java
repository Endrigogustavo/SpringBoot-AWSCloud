package com.springmongo.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.springbootmongo.model.UserSchema;

public interface RepositoryMongoDB extends MongoRepository<UserSchema, String> {
} 