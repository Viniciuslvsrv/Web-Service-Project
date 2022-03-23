package com.vinicius.ProjetoWebService.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.ProjetoWebService.entidades.PedidoItem;

public interface PedidoItemRepositorio extends JpaRepository<PedidoItem, Long> {

}
