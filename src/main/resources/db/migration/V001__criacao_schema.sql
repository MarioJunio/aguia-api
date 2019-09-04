create table estado (
	id integer primary key,
	nome varchar(75),
	uf varchar(2),
	ibge integer,
	ddd varchar(50)
);

create table cidade (
	id bigint primary key,
	nome varchar(100) not null,
	estado_id integer,
	ibge integer
);

create table endereco (
	id bigint primary key auto_increment,
	logradouro varchar(100) not null,
	numero integer,
	bairro varchar(80),
	cidade_id bigint,
	cep varchar(10),
	foreign key (cidade_id) references cidade(id)
);

create table clube(
	id bigint primary key auto_increment,
	nome varchar(80),
	horario_abertura time,
	horario_encerramento time,
	endereco_id bigint,
	foreign key (endereco_id) references endereco(id)
);

create table usuario(
	id bigint primary key auto_increment,
	nome varchar(60) not null,
	telefone varchar(15) not null,
	senha varchar(16),
	data_nascimento date,
	endereco_id bigint,
	instrutor boolean,
	clube_id bigint,
	foreign key (endereco_id) references endereco(id),
	foreign key (clube_id) references clube(id)
);

create table baia (
	id bigint primary key auto_increment,
	codigo varchar(3),
	clube_id bigint,
	foreign key (clube_id) references clube(id)
);

create table agendamento (
	id bigint primary key auto_increment,
	usuario_id bigint not null,
	baia_id bigint not null,
	inicio datetime not null,
	fim datetime not null,
	status varchar(15) not null,
	instrutor_id_aprovou bigint,
	observacao text,
	foreign key (usuario_id) references usuario(id),
	foreign key (baia_id) references baia(id),
	foreign key (instrutor_id_aprovou) references usuario(id)
);

create table solicitacao_conferencia (
	id bigint primary key auto_increment,
	usuario_id bigint not null,
	instrutor_id bigint,
	baia_id bigint not null,
	notificado boolean,
	status varchar(15),
	data_solicitacao datetime,
	data_resposta datetime,
	foreign key (usuario_id) references usuario(id),
	foreign key (baia_id) references baia(id),
	foreign key (instrutor_id) references usuario(id)
);

create table conferencia (
	id bigint primary key auto_increment,
	solicitacao_conferencia_id bigint not null,
	data_conferencia datetime,
	pontuacao integer,
	foreign key (solicitacao_conferencia_id) references solicitacao_conferencia(id)
);

create table premiacao (
	id bigint primary key auto_increment,
	inicio date,
	fim date,
	descricao text,
	clube_id bigint not null,
	foreign key (clube_id) references clube(id)
);

create table premiacao_vencedor (
	premiacao_id bigint not null,
	usuario_id bigint not null,
	pontuacao integer,
	observacao text,
	foreign key (premiacao_id) references premiacao(id),
	foreign key (usuario_id) references usuario(id)
);