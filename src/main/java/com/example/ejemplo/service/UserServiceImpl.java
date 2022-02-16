package com.example.ejemplo.service;

import com.example.ejemplo.dto.UserForm;
import com.example.ejemplo.dto.UsuarioDetails;
import com.example.ejemplo.entity.Usuario;
import com.example.ejemplo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserInterfaceService{

    @Autowired
    private UserRepository repository;

    @Override
    public UsuarioDetails create(UserForm formData){
        Usuario usuario = formData.getEntity();
        UsuarioDetails details = new UsuarioDetails();
        details.setEntity(repository.save(usuario));
        return details;
    }
    
}
