package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "agendamento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Agendamento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "baia_id")
	private Baia baia;

	@NotNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime inicio;

	@NotNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime fim;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column
	private StatusAgendamento status;

	@ManyToOne
	@JoinColumn(name = "instrutor_id_aprovou")
	private Usuario instrutorAprovou;

	@Column
	private String observacao;

}
