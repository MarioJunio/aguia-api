package br.com.aguia.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgendamentoDTO {

	@EqualsAndHashCode.Include
	private Long id;
	
	@JsonIgnoreProperties({"endereco"})
	private UsuarioDTO usuario;

	@JsonIgnoreProperties({"clube", "agendamentos"})
	private BaiaDTO baia;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime inicio;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime fim;

	@JsonIgnoreProperties({"endereco", "clube"})
	private UsuarioDTO instrutor;
	
	private String observacao;
	
	private boolean instrutorNotificado; 

	private boolean usuarioNotificado;

	public AgendamentoDTO(Long id) {
		this.id = id;
	}

}
