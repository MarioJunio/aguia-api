package br.com.aguia.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PremiacaoVendedor.class)
public abstract class PremiacaoVendedor_ {

	public static volatile SingularAttribute<PremiacaoVendedor, Integer> pontuacao;
	public static volatile SingularAttribute<PremiacaoVendedor, String> observacao;
	public static volatile SingularAttribute<PremiacaoVendedor, Usuario> usuario;
	public static volatile SingularAttribute<PremiacaoVendedor, Premiacao> premiacao;

	public static final String PONTUACAO = "pontuacao";
	public static final String OBSERVACAO = "observacao";
	public static final String USUARIO = "usuario";
	public static final String PREMIACAO = "premiacao";

}

