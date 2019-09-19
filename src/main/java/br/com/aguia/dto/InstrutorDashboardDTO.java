package br.com.aguia.dto;

import br.com.aguia.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class InstrutorDashboardDTO {
	
	private Long id;
	private String nome;
	
	public InstrutorDashboardDTO(Usuario instrutor) {
		this.id = instrutor.getId();
		this.nome = instrutor.getNome();
	}
}
