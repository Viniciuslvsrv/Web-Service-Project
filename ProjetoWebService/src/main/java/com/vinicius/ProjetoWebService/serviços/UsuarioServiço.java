package com.vinicius.ProjetoWebService.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.ProjetoWebService.entidades.Usuario;
import com.vinicius.ProjetoWebService.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServiço {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public List<Usuario> buscarTodos() {
		return usuarioRepositorio.findAll();
	}
	
	public Usuario buscarPorId(Long id) {
		 Optional<Usuario> obj =  usuarioRepositorio.findById(id);
		 
		 return obj.get();
	}
	
	public Usuario inserçao (Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public void deletar (Long id) {
		 usuarioRepositorio.deleteById(id);
	}
	
}
