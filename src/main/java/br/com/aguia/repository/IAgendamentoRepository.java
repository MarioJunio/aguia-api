package br.com.aguia.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.aguia.model.Agendamento;

@Repository
public interface IAgendamentoRepository extends JpaRepository<Agendamento, Long> {

	@Query("select ag from Agendamento ag where ?1 >= ag.inicio and ?1 <= ag.fim and ag.usuario.id = ?2 and ag.status = 'APROVADO'")
	Optional<Agendamento> buscarAgendamentoAtivoPorUsuario(LocalDateTime dataAtual, Long idUsuario);
}
