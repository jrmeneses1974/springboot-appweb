package com.jrmen.curso.springboot.appweb.springbootappweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jrmen.curso.springboot.appweb.springbootappweb.models.User;
@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Jorge", "Meneses");
        user.setEmail("Jorge@correo.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "Listado de Usuarios!");
        return "list";
    }
    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(
                new User("Pepa", "Gonzalez", "pepa@cooreo.com"), 
                new User("Paco", "Martinez", "paco@cooreo.com"), 
                new User("Pedro", "perez", "pedro@cooreo.com"),
                new User("Paquita", "Plata"));
    }
}
