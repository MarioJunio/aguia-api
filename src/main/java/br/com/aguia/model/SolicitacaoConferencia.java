package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "solicitacao_conferencia")
@Data
public class SolicitacaoConferencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
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

	@Column(name = "instrutor_notificado")
	private boolean notificado;

	@Enumerated(EnumType.STRING)
	@Column
	private StatusSolicitacaoConferencia status;

	@Column(name = "data_solicitacao", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataSolicitacao;

	@Column(name = "data_resposta", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataResposta;

}
