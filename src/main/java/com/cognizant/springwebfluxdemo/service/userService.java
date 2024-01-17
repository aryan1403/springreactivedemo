package com.cognizant.springwebfluxdemo.service;

import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

import com.cognizant.springwebfluxdemo.models.user;
import com.cognizant.springwebfluxdemo.repo.repo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class userService {
    private final repo uRepo;
    // private final ReactiveMongoTemplate template;

    public userService(repo uRepo) {
        this.uRepo = uRepo;
        // this.template = template;
    }

    public Flux<user> findAllUsers() {
        return uRepo.findAll();
    }

    public Mono<user> findById(String id) {
        return uRepo.findById(id);
    }

    public Mono<user> saveUser(user u) {
        return uRepo.save(u);
    }

}
