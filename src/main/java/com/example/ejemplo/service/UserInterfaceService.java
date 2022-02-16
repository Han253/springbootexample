package com.example.ejemplo.service;

import com.example.ejemplo.dto.UserForm;
import com.example.ejemplo.dto.UsuarioDetails;

public interface UserInterfaceService {

    /**
     * 
     * Metodo para guardar usuarios
     * @param UserForm
     */
    public UsuarioDetails create(UserForm formData);
    
}
