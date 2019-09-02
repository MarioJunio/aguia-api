package br.com.aguia.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SolicitacaoConferencia.class)
public abstract class SolicitacaoConferencia_ {

	public static volatile SingularAttribute<SolicitacaoConferencia, Usuario> instrutor;
	public static volatile SingularAttribute<SolicitacaoConferencia, LocalDateTime> dataSolicitacao;
	public static volatile SingularAttribute<SolicitacaoConferencia, Boolean> notificado;
	public static volatile SingularAttribute<SolicitacaoConferencia, LocalDateTime> dataResposta;
	public static volatile SingularAttribute<SolicitacaoConferencia, Baia> baia;
	public static volatile SingularAttribute<SolicitacaoConferencia, Boolean> aceito;
	public static volatile SingularAttribute<SolicitacaoConferencia, Usuario> usuario;
	public static volatile SingularAttribute<SolicitacaoConferencia, Long> id;

	public static final String INSTRUTOR = "instrutor";
	public static final String DATA_SOLICITACAO = "dataSolicitacao";
	public static final String NOTIFICADO = "notificado";
	public static final String DATA_RESPOSTA = "dataResposta";
	public static final String BAIA = "baia";
	public static final String ACEITO = "aceito";
	public static final String USUARIO = "usuario";
	public static final String ID = "id";

}

