package br.com.aguia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UsuarioDashboardDTO {
	
	private AgendamentoDashboardDTO agendamento;
	private Integer pontuacaoAgendamento;
	private Integer pontuacaoTotal;
}
