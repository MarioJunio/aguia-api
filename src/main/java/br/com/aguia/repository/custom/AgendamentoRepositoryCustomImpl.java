package br.com.aguia.repository.custom;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.aguia.model.Agendamento;
import br.com.aguia.resource.filter.AgendamentoFilter;

@Repository
@Transactional(readOnly = true)
public class AgendamentoRepositoryCustomImpl implements IAgendamentoRepositoryCustom {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Agendamento> consultar(AgendamentoFilter filter) {
		
		//TODO: Implementar filtro utilizando criteria
		
		return null;
	}

}
