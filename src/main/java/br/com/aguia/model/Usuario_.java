package br.com.aguia.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Boolean> instrutor;
	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, String> telefone;
	public static volatile SingularAttribute<Usuario, Endereco> endereco;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, Clube> clube;
	public static volatile SingularAttribute<Usuario, Long> id;
	public static volatile SingularAttribute<Usuario, LocalDate> dataNascimento;

	public static final String INSTRUTOR = "instrutor";
	public static final String SENHA = "senha";
	public static final String TELEFONE = "telefone";
	public static final String ENDERECO = "endereco";
	public static final String NOME = "nome";
	public static final String CLUBE = "clube";
	public static final String ID = "id";
	public static final String DATA_NASCIMENTO = "dataNascimento";

}

