package br.com.aguia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aguia.model.Conferencia;
import br.com.aguia.repository.IConferenciaRepository;

@Service
public class ConferenciaService {

	@Autowired
	private IConferenciaRepository conferenciaRepository;

	public List<Conferencia> buscarPorAgendamento(Long idAgendamento) {
		return conferenciaRepository.buscarPontuacaoPorAgendamento(idAgendamento);
	}

	public Integer pontuacaoPorAgendamento(Long idAgendamento) {
		 return conferenciaRepository.pontuacaoPorAgendamento(idAgendamento).orElse(0);
	}

	public int pontuacaoTotal(Long idUsuario) {
		return conferenciaRepository.pontuacaoTotal(idUsuario).orElse(0);
	}

}
