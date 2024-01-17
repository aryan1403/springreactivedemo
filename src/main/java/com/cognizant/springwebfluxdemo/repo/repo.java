package com.cognizant.springwebfluxdemo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.cognizant.springwebfluxdemo.models.user;
import reactor.core.publisher.Mono;

public interface repo extends ReactiveMongoRepository<user, String> {
}
