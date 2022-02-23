package com.example.ejemplo.service;

import java.util.List;

import com.example.ejemplo.dto.UserForm;
import com.example.ejemplo.dto.UsuarioDetails;

public interface UserInterfaceService {

    /**
     * 
     * Metodo para guardar usuarios
     * @param UserForm
     */
    public UsuarioDetails create(UserForm formData);

    /**
     * 
     * Metodo para retornar lista de usuarios
     */
    public List<UsuarioDetails> getAll();

    /**
     * Return user by id
     * @return {@link UsuarioDetails}
     * 
     */
    UsuarioDetails findById(Long id);

    /**
     * 
     * @param UserForm data from form to update
     * @param id is the id of the update user.
     */
    UsuarioDetails updateUsuario(UserForm form,Long id);

     /**
     * 
     * Delete by id
     * 
     * @param id is the id of the usuario to delete.
     */
    void deleteById(Long id);
    
}
