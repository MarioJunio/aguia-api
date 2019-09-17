package br.com.aguia.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aguia.model.Usuario;
import br.com.aguia.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Transactional()
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
