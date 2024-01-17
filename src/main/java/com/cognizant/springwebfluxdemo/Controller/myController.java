package com.cognizant.springwebfluxdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springwebfluxdemo.models.user;
import com.cognizant.springwebfluxdemo.repo.repo;
import com.cognizant.springwebfluxdemo.service.userService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class myController {
    @Autowired 
    repo uRepo;

    @GetMapping("/{id}")
    public Mono<user> getEmployeeById(@PathVariable String id) {
        userService service = new userService(uRepo);
        return service.findById(id);
    }

    @PostMapping("/create")
    public Mono<user> createUser(@RequestBody user u) {
        userService service = new userService(uRepo);
        return service.saveUser(u);
    }

    @GetMapping("/findAll")
    public Flux<user> findAllUsers() {
        userService service = new userService(uRepo);
        return service.findAllUsers();
    }
}
