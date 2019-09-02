package br.com.aguia.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Agendamento.class)
public abstract class Agendamento_ {

	public static volatile SingularAttribute<Agendamento, String> observacao;
	public static volatile SingularAttribute<Agendamento, Usuario> instrutorAprovou;
	public static volatile SingularAttribute<Agendamento, Baia> baia;
	public static volatile SingularAttribute<Agendamento, LocalDateTime> inicio;
	public static volatile SingularAttribute<Agendamento, Usuario> usuario;
	public static volatile SingularAttribute<Agendamento, Long> id;
	public static volatile SingularAttribute<Agendamento, LocalDateTime> fim;
	public static volatile SingularAttribute<Agendamento, String> status;

	public static final String OBSERVACAO = "observacao";
	public static final String INSTRUTOR_APROVOU = "instrutorAprovou";
	public static final String BAIA = "baia";
	public static final String INICIO = "inicio";
	public static final String USUARIO = "usuario";
	public static final String ID = "id";
	public static final String FIM = "fim";
	public static final String STATUS = "status";

}

