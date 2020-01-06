package br.com.aguia.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnderecoDTO {
	
	private Long id;
	
	private String logradouro;
	
	private int numero;
	
	private String bairro;
	
	private CidadeDTO cidade;
	
	private String cep;
}
