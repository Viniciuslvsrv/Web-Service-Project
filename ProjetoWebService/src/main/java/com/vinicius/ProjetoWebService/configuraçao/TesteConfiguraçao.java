package com.vinicius.ProjetoWebService.configuraçao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.vinicius.ProjetoWebService.entidades.Usuario;
import com.vinicius.ProjetoWebService.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TesteConfiguraçao implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public void run(String... args) throws Exception {
	
	}
	
}
