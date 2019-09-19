package br.com.aguia.dto;

import java.time.LocalDateTime;

import br.com.aguia.model.Agendamento;
import br.com.aguia.model.Baia;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class AgendamentoDashboardDTO {
	
	private Long id;
	private Baia baia;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private InstrutorDashboardDTO instrutor;
	
	public AgendamentoDashboardDTO(Long idAgendamento) {
		this.id = idAgendamento;
	}
	
	public AgendamentoDashboardDTO(Agendamento agendamento) {
		this.id = agendamento.getId();
		this.baia = agendamento.getBaia();
		this.inicio = agendamento.getInicio();
		this.fim = agendamento.getFim();
		this.instrutor = new InstrutorDashboardDTO(agendamento.getInstrutorAprovou());
	}
	
	
}
