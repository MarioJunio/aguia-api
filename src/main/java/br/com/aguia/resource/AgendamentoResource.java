package br.com.aguia.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aguia.dto.AgendamentoDTO;
import br.com.aguia.model.Agendamento;
import br.com.aguia.service.AgendamentoService;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoResource extends Resource<Agendamento, AgendamentoDTO> {

	@Autowired
	private AgendamentoService agendamentoService;

	@PostMapping
	public ResponseEntity<AgendamentoDTO> novo(@Valid @RequestBody Agendamento agendamento) {
		AgendamentoDTO agendamentoDto = toDto(agendamentoService.novo(agendamento));
		return ResponseEntity.created(location(String.valueOf(agendamentoDto.getId()))).body(agendamentoDto);
	}
}
