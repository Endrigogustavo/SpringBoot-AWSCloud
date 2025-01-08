package com.datajpa.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.springdatajpa.model.UserJPA;

public interface RepositoryJPA extends JpaRepository<UserJPA, Integer> {
    
}
