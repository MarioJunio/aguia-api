package br.com.aguia.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conferencia.class)
public abstract class Conferencia_ {

	public static volatile SingularAttribute<Conferencia, Integer> pontuacao;
	public static volatile SingularAttribute<Conferencia, LocalDateTime> dataConferencia;
	public static volatile SingularAttribute<Conferencia, SolicitacaoConferencia> solicitacaoConferencia;
	public static volatile SingularAttribute<Conferencia, Long> id;

	public static final String PONTUACAO = "pontuacao";
	public static final String DATA_CONFERENCIA = "dataConferencia";
	public static final String SOLICITACAO_CONFERENCIA = "solicitacaoConferencia";
	public static final String ID = "id";

}

