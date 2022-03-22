package com.vinicius.ProjetoWebService.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.ProjetoWebService.entidades.Usuario;
import com.vinicius.ProjetoWebService.serviços.UsuarioServiço;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecursos {
	
	@Autowired
	private UsuarioServiço serviço;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> buscarTodos() {
		List<Usuario> list = serviço.buscarTodos();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> buscarPorId (@PathVariable Long id) {
		Usuario usuario = serviço.buscarPorId(id);
		
		return ResponseEntity.ok().body(usuario);
	}
	
}
