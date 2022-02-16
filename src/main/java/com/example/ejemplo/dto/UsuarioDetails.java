package com.example.ejemplo.dto;

import java.util.Date;

import com.example.ejemplo.entity.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDetails {

    private Long id;
    private String first_name;
    private String last_name;
    private int document;
    private Date birth_date;

    public void setEntity(Usuario usuario){
        id = usuario.getId();
        first_name = usuario.getFirst_name();
        last_name = usuario.getLast_name();
        document = usuario.getDocument();
        birth_date = usuario.getBirth_date();
    }
    
}
