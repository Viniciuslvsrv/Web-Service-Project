package com.vinicius.ProjetoWebService.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.ProjetoWebService.entidades.Produto;
import com.vinicius.ProjetoWebService.repositorios.ProdutoRepositorio;

@Service
public class ProdutoServiço {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public List<Produto> buscarTodos() {
		return produtoRepositorio.findAll();
	}
	
	public Produto buscarPorId(Long id) {
		 Optional<Produto> obj =  produtoRepositorio.findById(id);
		 
		 return obj.get();
	}
	
}
