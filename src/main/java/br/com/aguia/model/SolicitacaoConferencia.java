package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitacao_conferencia")
public class SolicitacaoConferencia implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "instrutor_id")
	private Usuario instrutor;

	@ManyToOne
	@JoinColumn(name = "baia_id")
	private Baia baia;

	@Column
	private boolean notificado;

	@Column
	private boolean aceito;

	@Column(name = "data_solicitacao", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataSolicitacao;

	@Column(name = "data_resposta", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataResposta;

}
