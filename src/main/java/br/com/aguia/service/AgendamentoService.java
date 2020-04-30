package br.com.aguia.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aguia.model.Agendamento;
import br.com.aguia.model.StatusAgendamento;
import br.com.aguia.repository.IAgendamentoRepository;
import br.com.aguia.resource.filter.AgendamentoFilter;

@Service
public class AgendamentoService {

	@Autowired
	private IAgendamentoRepository agendamentoRepository;

	public Optional<Agendamento> buscarAgendamentoAtivoPorUsuario(Long idUsuario) {
		return agendamentoRepository.buscarAgendamentoAtivoPorUsuario(LocalDateTime.now(), idUsuario);
	}

	@Transactional
	public Agendamento novo(Agendamento agendamento) {
		agendamento.setStatus(StatusAgendamento.PENDENTE);
		return agendamentoRepository.save(agendamento);
	}
	
	public Collection<Agendamento> consultar(AgendamentoFilter filter) {
		return agendamentoRepository.consultar(filter);
	}
}
