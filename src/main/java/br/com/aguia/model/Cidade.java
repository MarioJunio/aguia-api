package br.com.aguia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cidade")
@Data
@NoArgsConstructor
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	private Long id;

	@Column
	private String nome;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;
	
	@Column
	private String ibge;

}
