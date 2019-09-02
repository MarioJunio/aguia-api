package br.com.aguia.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Baia.class)
public abstract class Baia_ {

	public static volatile SingularAttribute<Baia, String> codigo;
	public static volatile SingularAttribute<Baia, Clube> clube;
	public static volatile SingularAttribute<Baia, Long> id;

	public static final String CODIGO = "codigo";
	public static final String CLUBE = "clube";
	public static final String ID = "id";

}

