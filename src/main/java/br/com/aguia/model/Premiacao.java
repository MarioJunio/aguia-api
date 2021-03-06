package br.com.aguia.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "premiacao")
@Data
@NoArgsConstructor
public class Premiacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "DATE")
	private LocalDate inicio;
	
	@Column(columnDefinition = "DATE")
	private LocalDate fim;
	
	@Column
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "clube_id")
	private Clube clube;
	
	
}
