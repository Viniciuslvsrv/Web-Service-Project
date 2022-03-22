package com.vinicius.ProjetoWebService.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.ProjetoWebService.entidades.Pedido;
import com.vinicius.ProjetoWebService.serviços.PedidoServiço;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecursos {
	
	@Autowired
	private PedidoServiço serviço;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> buscarTodos() {
		List<Pedido> list = serviço.buscarTodos();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> buscarPorId (@PathVariable Long id) {
		Pedido pedido = serviço.buscarPorId(id);
		
		return ResponseEntity.ok().body(pedido);
	}
	
}