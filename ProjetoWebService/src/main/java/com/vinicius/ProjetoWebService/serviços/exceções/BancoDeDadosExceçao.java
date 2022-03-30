package com.vinicius.ProjetoWebService.serviços.exceções;

public class BancoDeDadosExceçao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BancoDeDadosExceçao (String msg) {
		super(msg);
	}

}
