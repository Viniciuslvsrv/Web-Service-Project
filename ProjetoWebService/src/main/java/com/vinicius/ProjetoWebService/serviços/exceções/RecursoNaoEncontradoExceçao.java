package com.vinicius.ProjetoWebService.serviços.exceções;

public class RecursoNaoEncontradoExceçao extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RecursoNaoEncontradoExceçao(Object id) {
		super("Recurso nao encontrado: Id:" + id);
	}
	
}
