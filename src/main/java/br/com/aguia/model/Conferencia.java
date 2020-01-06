package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "conferencia")
@Data
@NoArgsConstructor
public class Conferencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "solicitacao_conferencia_id")
	private SolicitacaoConferencia solicitacaoConferencia;
	
	@Column(name = "data_conferencia", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataConferencia;
	
	@Column
	private Integer pontuacao;
	
}
