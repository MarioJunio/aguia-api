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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "agendamento")
@Data
public class Agendamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@ManyToOne()
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "baia_id")
	private Baia baia;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@NotNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime inicio;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@NotNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime fim;

	@Enumerated(EnumType.STRING)
	@Column
	private StatusAgendamento status;

	@ManyToOne
	@JoinColumn(name = "instrutor_id_aprovou")
	private Usuario instrutorAprovou;

	@Column
	private String observacao;

	@Column(name = "instrutor_notificado")
	private boolean instrutorNotificado;

	@Column(name = "usuario_notificado")
	private boolean usuarioNotificado;

}
