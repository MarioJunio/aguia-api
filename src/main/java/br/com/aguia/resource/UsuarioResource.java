package br.com.aguia.resource;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aguia.dto.UsuarioDashboardDTO;
import br.com.aguia.model.Agendamento;
import br.com.aguia.model.Usuario;
import br.com.aguia.service.AgendamentoService;
import br.com.aguia.service.ConferenciaService;
import br.com.aguia.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private AgendamentoService agendamentoService;

	@Autowired
	private ConferenciaService conferenciaService;

	@PostMapping()
	public ResponseEntity<Usuario> salvar(@RequestBody @Valid Usuario usuario) {
		System.out.println("[POST]; (/usuarios)");
		System.out.println(usuario);

		Usuario usuarioSalvo = usuarioService.salvar(usuario);
		return ResponseEntity.created(null).body(usuarioSalvo);
	}

	@GetMapping("/dashboard/{id}")
	public ResponseEntity<UsuarioDashboardDTO> dashboard(@PathVariable Long id) {
		System.out.printf("[POST]; (/usuarios/dashboard/%d\n)", id);
		UsuarioDashboardDTO dashboardDTO = new UsuarioDashboardDTO();

		Optional<Agendamento> agendamentoAtivo = agendamentoService.buscarAgendamentoAtivoPorUsuario(id);

		// se existe algum agendamento ativo para este usuario
		// sera buscado suas conferencias para calcular os pontos do agendamento
		if (agendamentoAtivo.isPresent()) {
			dashboardDTO.setAgendamento(agendamentoAtivo.get());
			dashboardDTO
					.setPontuacaoParcial(conferenciaService.pontuacaoPorAgendamento(agendamentoAtivo.get().getId()));

		}

		// busca a pontuacao total do usuario
		dashboardDTO.setPontuacaoTotal(conferenciaService.pontuacaoTotal(id));

		return ResponseEntity.ok(dashboardDTO);
	}
}
