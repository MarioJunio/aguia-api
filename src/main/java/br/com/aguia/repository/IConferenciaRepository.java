package br.com.aguia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.aguia.model.Conferencia;

@Repository
public interface IConferenciaRepository extends JpaRepository<Conferencia, Long> {

	@Query("select conf from Conferencia conf left join conf.solicitacaoConferencia sol left join sol.baia ba left join ba.agendamentos agen where agen.id = ?1")
	List<Conferencia> buscarPontuacaoPorAgendamento(Long idAgendamento);
	
	@Query("select sum(conf.pontuacao) from Conferencia conf left join conf.solicitacaoConferencia sol left join sol.baia ba left join ba.agendamentos agen where agen.id = ?1")
	Integer pontuacaoPorAgendamento(Long idAgendamento);

	@Query("select sum(conf.pontuacao) from Conferencia conf left join conf.solicitacaoConferencia sol where sol.usuario.id = ?1")
	int pontuacaoTotal(Long idUsuario);
}
