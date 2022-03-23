package com.vinicius.ProjetoWebService.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.ProjetoWebService.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
