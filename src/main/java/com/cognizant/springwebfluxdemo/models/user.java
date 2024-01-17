package com.cognizant.springwebfluxdemo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document
public class user {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String streetAdd;
    private String email;
}
