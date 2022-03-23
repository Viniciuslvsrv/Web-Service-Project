package com.vinicius.ProjetoWebService.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.ProjetoWebService.entidades.Produto;
import com.vinicius.ProjetoWebService.serviços.ProdutoServiço;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRecursos {
	
	@Autowired
	private ProdutoServiço serviço;
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos() {
		List<Produto> list = serviço.buscarTodos();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> buscarPorId (@PathVariable Long id) {
		Produto usuario = serviço.buscarPorId(id);
		
		return ResponseEntity.ok().body(usuario);
	}
	
}
