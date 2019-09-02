package br.com.aguia.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Premiacao.class)
public abstract class Premiacao_ {

	public static volatile SingularAttribute<Premiacao, LocalDate> inicio;
	public static volatile SingularAttribute<Premiacao, Clube> clube;
	public static volatile SingularAttribute<Premiacao, Long> id;
	public static volatile SingularAttribute<Premiacao, LocalDate> fim;
	public static volatile SingularAttribute<Premiacao, String> descricao;

	public static final String INICIO = "inicio";
	public static final String CLUBE = "clube";
	public static final String ID = "id";
	public static final String FIM = "fim";
	public static final String DESCRICAO = "descricao";

}

