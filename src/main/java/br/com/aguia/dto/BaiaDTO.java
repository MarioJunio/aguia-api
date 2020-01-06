package br.com.aguia.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaiaDTO {
	
	@EqualsAndHashCode.Include
	private Long id;
	
	private String codigo;
	
	private ClubeDTO clube;
	
	private List<AgendamentoDTO> agendamentos = new ArrayList<>();
	
}
