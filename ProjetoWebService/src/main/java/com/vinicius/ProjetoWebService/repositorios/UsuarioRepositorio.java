package com.vinicius.ProjetoWebService.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.ProjetoWebService.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
