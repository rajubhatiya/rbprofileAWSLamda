package com.rbhatiya.springbootAWSLamda.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUser() {
        return List.of(new User("John", "Doe", "john.doe@baeldung.com"),
                       new User("John", "Doe", "john.doe-2@baeldung.com"));
    }

    @GetMapping(value = "hello")
    public String sayHello() {
        return "Hello Rajesh";
    }
}