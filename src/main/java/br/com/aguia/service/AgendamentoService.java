package br.com.aguia.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aguia.model.Agendamento;
import br.com.aguia.repository.IAgendamentoRepository;

@Service
public class AgendamentoService {

	@Autowired
	private IAgendamentoRepository agendamentoRepository;

	public Optional<Agendamento> buscarAgendamentoAtivoPorUsuario(Long idUsuario) {
		return agendamentoRepository.buscarAgendamentoAtivoPorUsuario(LocalDateTime.now(), idUsuario);
	}

	@Transactional
	public Agendamento salvar(Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
}
