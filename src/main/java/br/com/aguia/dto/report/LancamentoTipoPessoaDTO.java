package br.com.aguia.dto.report;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class LancamentoTipoPessoaDTO {

	private String tipo;
	private String pessoa;
	private BigDecimal valor;
}
