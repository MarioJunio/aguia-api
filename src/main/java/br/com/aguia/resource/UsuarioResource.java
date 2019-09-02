package br.com.aguia.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aguia.model.Usuario;
import br.com.aguia.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping()
	public ResponseEntity<Usuario> salvar(@RequestBody @Valid Usuario usuario) {
		System.out.println(usuario);
		usuarioService.salvar(usuario);
		
		return ResponseEntity.created(null).body(usuario);
	}
	
}
