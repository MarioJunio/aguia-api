package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "usuario")
@Data
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column
	private String nome;

	@NotBlank
	@Size(min = 11, max = 11)
	@Column
	private String telefone;

	@NotBlank
	@Column
	private String senha;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_nascimento", columnDefinition = "DATE")
	private LocalDate dataNascimento;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	@Column
	private boolean instrutor;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "clube_id")
	private Clube clube;

	@JsonIgnoreProperties({ "usuario" })
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Agendamento> agendamentos;
}
