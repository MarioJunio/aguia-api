package br.com.aguia.repository.custom;

import java.util.List;

import br.com.aguia.model.Agendamento;
import br.com.aguia.resource.filter.AgendamentoFilter;

public interface IAgendamentoRepositoryCustom {

	public List<Agendamento> consultar(AgendamentoFilter filter);
}
