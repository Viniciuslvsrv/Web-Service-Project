package com.vinicius.ProjetoWebService.recursos.exceçoes;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vinicius.ProjetoWebService.serviços.exceções.BancoDeDadosExceçao;
import com.vinicius.ProjetoWebService.serviços.exceções.RecursoNaoEncontradoExceçao;

@ControllerAdvice
public class ManipuladorExceçoes {

	@ExceptionHandler(RecursoNaoEncontradoExceçao.class)
	public ResponseEntity<ErroPadrao> recursoNaoEncontrado(RecursoNaoEncontradoExceçao e, HttpServletRequest request){
		String erro = "Recurso nao encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;
		ErroPadrao ep = new ErroPadrao(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
	
		return ResponseEntity.status(status).body(ep);
	}
	
	@ExceptionHandler(BancoDeDadosExceçao.class)
	public ResponseEntity<ErroPadrao> bancoDeDados(BancoDeDadosExceçao e, HttpServletRequest request){
		String erro = "Erro no Banco de dados";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		ErroPadrao ep = new ErroPadrao(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
	
		return ResponseEntity.status(status).body(ep);
	}
}
