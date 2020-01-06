package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clube")
@Data
@NoArgsConstructor
public class Clube implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column(name = "horario_abertura", columnDefinition = "TIME")
	private LocalTime horarioAbertura;
	
	@Column(name = "horario_encerramento", columnDefinition = "TIME")
	private LocalTime horarioEncerramento;
	
	@OneToOne
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	
	@JsonIgnoreProperties({"clube"})
	@OneToMany(mappedBy = "clube")
	private List<Baia> baias = new ArrayList<>();
	
}
