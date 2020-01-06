package br.com.aguia.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PremiacaoVencedorId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "premiacao_id")
	private Premiacao premiacao;
	
	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
}
