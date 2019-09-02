package br.com.aguia.model;

import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Clube.class)
public abstract class Clube_ {

	public static volatile SingularAttribute<Clube, LocalTime> horarioEncerramento;
	public static volatile SingularAttribute<Clube, Endereco> endereco;
	public static volatile SingularAttribute<Clube, String> nome;
	public static volatile SingularAttribute<Clube, Long> id;
	public static volatile SingularAttribute<Clube, LocalTime> horarioAbertura;

	public static final String HORARIO_ENCERRAMENTO = "horarioEncerramento";
	public static final String ENDERECO = "endereco";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String HORARIO_ABERTURA = "horarioAbertura";

}

