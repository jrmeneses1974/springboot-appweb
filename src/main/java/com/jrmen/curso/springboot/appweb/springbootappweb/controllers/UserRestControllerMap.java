package com.jrmen.curso.springboot.appweb.springbootappweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrmen.curso.springboot.appweb.springbootappweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestControllerMap {

    @GetMapping("/details-Map")
    public Map<String, Object> details() {
        User user = new User("Jorge", "Meneses");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user );

        return body;
    }

}
