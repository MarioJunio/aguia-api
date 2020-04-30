package br.com.aguia.resource.filter;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class AgendamentoFilter {
	
	private Long baiaId;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime inicio;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime fim;
	
}
