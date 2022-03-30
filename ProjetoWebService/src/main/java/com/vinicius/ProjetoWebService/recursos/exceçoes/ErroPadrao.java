package com.vinicius.ProjetoWebService.recursos.exceçoes;

import java.io.Serializable;
import java.time.Instant;

public class ErroPadrao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Instant tempo;
	private Integer status;
	private String erro;
	private String msg;
	private String pacote;

	public ErroPadrao() {
		
	}

	public ErroPadrao(Instant tempo, Integer status, String erro, String msg, String pacote) {
		super();
		this.tempo = tempo;
		this.status = status;
		this.erro = erro;
		this.msg = msg;
		this.pacote = pacote;
	}

	public Instant getTempo() {
		return tempo;
	}

	public void setTempo(Instant tempo) {
		this.tempo = tempo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}
	
}
