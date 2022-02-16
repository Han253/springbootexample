package com.example.ejemplo.controller;

import javax.validation.Valid;

import com.example.ejemplo.dto.UserForm;
import com.example.ejemplo.dto.UsuarioDetails;
import com.example.ejemplo.service.UserInterfaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInterfaceService service;

    @GetMapping
    public String index(){
        return "Hola Mundo desde Spring";
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioDetails createUser(@RequestBody @Valid UserForm userForm){
        return(service.create(userForm));
    }
    
}
