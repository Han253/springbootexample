package com.example.ejemplo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

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

    @Override
    public List<UsuarioDetails> getAll(){
        Iterable<Usuario> listaUsuarios = repository.findAll();
        List<UsuarioDetails> listaResult = new ArrayList<>();

        listaUsuarios.forEach(usuario->{
            UsuarioDetails usuarioD = new UsuarioDetails();
            usuarioD.setEntity(usuario);
            listaResult.add(usuarioD);
        });    

        return listaResult;
    }

    @Override
    public UsuarioDetails findById(Long id){
        UsuarioDetails usuarioDetail = new UsuarioDetails();
        Usuario usuario = repository.getById(id);
        usuarioDetail.setEntity(usuario);
        return usuarioDetail;        
    }

    @Override
    public UsuarioDetails updateUsuario(UserForm form, Long id){
        Usuario usuario = repository.getById(id);
        form.setEntity(usuario);
        UsuarioDetails usuario_detalle = new UsuarioDetails();
        usuario_detalle.setEntity(repository.save(usuario));
        return usuario_detalle;
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    
}
