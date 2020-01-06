package br.com.aguia.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDashboardDTO {
	
	private AgendamentoDTO agendamento;
	private Integer pontuacaoAgendamento;
	private Integer pontuacaoTotal;
}
