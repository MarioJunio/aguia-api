package br.com.aguia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "premiacao_vendedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "premiacao", "usuario" })
@ToString
public class PremiacaoVendedor implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "premiacao_id")
	private Premiacao premiacao;

	@Id
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@Column
	private Integer pontuacao;

	@Column
	private String observacao;

}
