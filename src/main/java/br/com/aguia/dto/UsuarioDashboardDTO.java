package br.com.aguia.dto;

import br.com.aguia.model.Agendamento;
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
	
	private Agendamento agendamento;
	private int pontuacaoParcial;
	private int pontuacaoTotal;
}
