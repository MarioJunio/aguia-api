package br.com.aguia.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {
	
	@EqualsAndHashCode.Include
	private Long id;
	
	private String nome;
	
	private String telefone;
	
	private LocalDate dataNascimento;
	
	private EnderecoDTO endereco;
	
	private boolean instrutor;
	
	@JsonIgnoreProperties("baias")
	private ClubeDTO clube;
	
}
