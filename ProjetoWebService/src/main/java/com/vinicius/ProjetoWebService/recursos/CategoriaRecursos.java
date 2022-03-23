package com.vinicius.ProjetoWebService.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.ProjetoWebService.entidades.Categoria;
import com.vinicius.ProjetoWebService.serviços.CategoriaServiço;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecursos {
	
	@Autowired
	private CategoriaServiço serviço;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> buscarTodos() {
		List<Categoria> list = serviço.buscarTodos();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> buscarPorId (@PathVariable Long id) {
		Categoria usuario = serviço.buscarPorId(id);
		
		return ResponseEntity.ok().body(usuario);
	}
	
}
