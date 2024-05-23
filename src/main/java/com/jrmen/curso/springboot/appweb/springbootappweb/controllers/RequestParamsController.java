package com.jrmen.curso.springboot.appweb.springbootappweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jrmen.curso.springboot.appweb.springbootappweb.models.dto.ParamDto;
import com.jrmen.curso.springboot.appweb.springbootappweb.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo") 
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal?") String message) {

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam(required = false, defaultValue = "Hola que tal?") String text, 
                        @RequestParam(required = false, defaultValue = "0") Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
            
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }

}
