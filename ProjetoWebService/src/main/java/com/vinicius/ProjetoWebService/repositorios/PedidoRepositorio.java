package com.vinicius.ProjetoWebService.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.ProjetoWebService.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}
