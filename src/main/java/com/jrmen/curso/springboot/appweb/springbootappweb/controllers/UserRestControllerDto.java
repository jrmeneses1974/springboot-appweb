package com.jrmen.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrmen.curso.springboot.webapp.springbootweb.models.User;
import com.jrmen.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestControllerDto {

    @GetMapping("/details-Dto")
    public UserDto details() {

        User user = new User("Jorge", "Meneses");
        UserDto userDto = new UserDto();
        
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }
    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Jorge", "Meneses");
        User user2 = new User("Freddy", "Soler");
        User user3 = new User("Jonny", "Florian");

        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;    
    }

    @GetMapping("/list2")
    public List<User> list2() {
        User user = new User("Jorge", "Meneses");
        User user2 = new User("Freddy", "Soler");
        User user3 = new User("Jonny", "Florian");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    
    }

}
