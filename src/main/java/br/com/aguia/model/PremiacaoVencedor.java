package br.com.aguia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "premiacao_vencedor")
@Data
@NoArgsConstructor
public class PremiacaoVencedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@EmbeddedId
	private PremiacaoVencedorId id;
	
	@Column
	private Integer pontuacao;

	@Column
	private String observacao;

}
