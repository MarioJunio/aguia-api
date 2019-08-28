create table cidade (
	id bigint primary key auto_increment,
	nome varchar(100) not null,
	uf char(2) not null
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
)
