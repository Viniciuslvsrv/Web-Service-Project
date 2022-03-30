package com.vinicius.ProjetoWebService.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.vinicius.ProjetoWebService.entidades.Usuario;
import com.vinicius.ProjetoWebService.repositorios.UsuarioRepositorio;
import com.vinicius.ProjetoWebService.serviços.exceções.BancoDeDadosExceçao;
import com.vinicius.ProjetoWebService.serviços.exceções.RecursoNaoEncontradoExceçao;

@Service
public class UsuarioServiço {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	public List<Usuario> buscarTodos() {
		return usuarioRepositorio.findAll();
	}

	public Usuario buscarPorId(Long id) {
		Optional<Usuario> obj = usuarioRepositorio.findById(id);

		return obj.orElseThrow(() -> new RecursoNaoEncontradoExceçao(id));
	}

	public Usuario inserçao(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	public void deletar (Long id) {
		try {
			usuarioRepositorio.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new RecursoNaoEncontradoExceçao(id);
		}catch (DataIntegrityViolationException e) {
			throw new BancoDeDadosExceçao(e.getMessage());
		}
	}

	public Usuario atualizaçao(Long id, Usuario usuario) {
		Usuario usuarioAux = usuarioRepositorio.getOne(id);
		atualizarDados(usuarioAux, usuario);

		return usuarioRepositorio.save(usuarioAux);
	}

	private void atualizarDados(Usuario usuarioAux, Usuario usuario) {
		usuarioAux.setNome(usuario.getNome());
		usuarioAux.setEmail(usuario.getEmail());
		usuarioAux.setTelefone(usuario.getTelefone());
	}

}
