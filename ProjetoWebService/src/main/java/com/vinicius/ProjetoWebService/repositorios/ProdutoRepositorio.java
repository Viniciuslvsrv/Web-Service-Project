package com.vinicius.ProjetoWebService.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.ProjetoWebService.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
