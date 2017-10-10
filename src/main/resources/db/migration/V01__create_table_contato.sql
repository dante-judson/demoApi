create table contato(
	id serial  primary key,
	nome varchar(255),
	telefone varchar(255),
	cpf varchar(255),
	endereco varchar(255),
	status boolean
);