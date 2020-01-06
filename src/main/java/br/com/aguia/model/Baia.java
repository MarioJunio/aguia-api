package br.com.aguia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "baia")
@Data
@NoArgsConstructor
public class Baia implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "clube_id")
	private Clube clube;
	
	@OneToMany(mappedBy =  "baia", fetch = FetchType.LAZY)
	private List<Agendamento> agendamentos = new ArrayList<>();
}
