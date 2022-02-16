package com.example.ejemplo.repository;

import com.example.ejemplo.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario,Long>{
    
}
