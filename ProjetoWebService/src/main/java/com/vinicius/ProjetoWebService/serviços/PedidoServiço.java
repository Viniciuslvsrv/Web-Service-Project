package com.vinicius.ProjetoWebService.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.ProjetoWebService.entidades.Pedido;
import com.vinicius.ProjetoWebService.repositorios.PedidoRepositorio;

@Service
public class PedidoServiço {
	
	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	public List<Pedido> buscarTodos() {
		return pedidoRepositorio.findAll();
	}
	
	public Pedido buscarPorId(Long id) {
		 Optional<Pedido> obj =  pedidoRepositorio.findById(id);
		 
		 return obj.get();
	}
	
}
