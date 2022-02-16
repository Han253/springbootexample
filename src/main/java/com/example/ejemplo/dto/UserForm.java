package com.example.ejemplo.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.ejemplo.entity.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserForm {

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede estar vacio")
    private String first_name;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede estar vacio")
    private String last_name;

    @NotNull(message = "Este atributo no puede ser nulo")
    private int document;

    private Date birth_date;

    public Usuario getEntity(){
        Usuario usuario = new Usuario();
        setEntity(usuario);
        return usuario;
    }

    public void setEntity(Usuario usuario){
        usuario.setFirst_name(first_name);
        usuario.setLast_name(last_name);
        usuario.setDocument(document);
        usuario.setBirth_date(birth_date);
    }
    
}
