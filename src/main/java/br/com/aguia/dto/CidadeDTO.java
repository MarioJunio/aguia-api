package br.com.aguia.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CidadeDTO {

	private Long id;

	private String nome;

	private EstadoDTO estado;
	
}
