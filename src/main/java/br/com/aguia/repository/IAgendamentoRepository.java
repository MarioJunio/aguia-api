package br.com.aguia.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.aguia.model.Agendamento;

@Repository
public interface IAgendamentoRepository extends JpaRepository<Agendamento, Long> {

	@Query("select ag from Agendamento ag where ag.inicio >= ?1 and ag.fim <= ?1 and ag.usuario.id = ?2")
	Optional<Agendamento> buscarAgendamentoAtivoPorUsuario(LocalDateTime dataAtual, Long idUsuario);
}
