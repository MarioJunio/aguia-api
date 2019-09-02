package br.com.aguia.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estado.class)
public abstract class Estado_ {

	public static volatile SingularAttribute<Estado, String> uf;
	public static volatile SingularAttribute<Estado, String> ddd;
	public static volatile SingularAttribute<Estado, String> ibge;
	public static volatile SingularAttribute<Estado, String> nome;
	public static volatile SingularAttribute<Estado, Long> id;

	public static final String UF = "uf";
	public static final String DDD = "ddd";
	public static final String IBGE = "ibge";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

