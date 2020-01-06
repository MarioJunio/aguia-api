package br.com.aguia.dto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClubeDTO {

	private Long id;

	private String nome;

	private LocalTime horarioAbertura;

	private LocalTime horarioEncerramento;

	private EnderecoDTO endereco;

	@JsonIgnoreProperties({ "clube" })
	private List<BaiaDTO> baias = new ArrayList<>();

}
