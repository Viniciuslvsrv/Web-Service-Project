package com.vinicius.ProjetoWebService.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.ProjetoWebService.entidades.Categoria;
import com.vinicius.ProjetoWebService.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServiço {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	public List<Categoria> buscarTodos() {
		return categoriaRepositorio.findAll();
	}
	
	public Categoria buscarPorId(Long id) {
		 Optional<Categoria> obj =  categoriaRepositorio.findById(id);
		 
		 return obj.get();
	}
	
}
