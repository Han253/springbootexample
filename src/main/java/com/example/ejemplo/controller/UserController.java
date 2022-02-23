package com.example.ejemplo.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.ejemplo.dto.UserForm;
import com.example.ejemplo.dto.UsuarioDetails;
import com.example.ejemplo.service.UserInterfaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInterfaceService service;

    @GetMapping
    public List<UsuarioDetails> getUsers(){
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public UsuarioDetails findById(@PathVariable final Long id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioDetails createUser(@RequestBody @Valid UserForm userForm){
        return(service.create(userForm));
    }

    @PutMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public UsuarioDetails updateById(@RequestBody @Valid UserForm form, @PathVariable final Long id){
        return service.updateUsuario(form, id);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable final Long id){
        service.deleteById(id);
    }
    
}
