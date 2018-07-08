--Criação das tabelas
CREATE SCHEMA ZikaPET;
SET search_path to ZikaPET;
CREATE TABLE Atendente(
	nome		varchar(30),
	cpf		varchar(11),
	telefone	varchar(12),
	id		serial,
	CONSTRAINT atendente_pk PRIMARY KEY (id)
);

CREATE TABLE Cuidador(
	nome		varchar(30),	
	cpf		varchar(11),
	telefone	varchar(12),
	id		serial,
	CONSTRAINT cuidador_pk PRIMARY KEY (id)

);


CREATE TABLE Veterinario(
	nome		varchar(30),
	cpf		varchar(11),
	telefone	varchar(12),
	id		serial,
	CONSTRAINT veterinario_pk PRIMARY KEY (id)
);


CREATE TABLE Produtos(
        codBarras       int,
	preco           float,
	nome		varchar(30),
	quantidade      int,
	CONSTRAINT produtos_pk PRIMARY KEY (codBarras)
);

CREATE TABLE Hotel(
	nQuartos        int
);


CREATE TABLE Cliente(
	nome		varchar(30),
	cpf		varchar(11),
	telefone	varchar(12),
	CONSTRAINT cliente_pk PRIMARY KEY (cpf)
);


CREATE TABLE Animal(
	cpf		varchar(11),
--Cão ou gato
        tipo            char,
	nome		varchar(30),
	raca            varchar(30),
	estado          varchar(30),
	nome		varchar(30),
	CONSTRAINT donoAnimal_fk FOREIGN KEY (cpf) REFERENCES cliente(cpf),
	CONSTRAINT tipo CHECK (
		UPPER(tipo) = 'G' OR 
		UPPER(tipo) = 'C'
        )
);

CREATE TABLE Recibo(
        idCompra        serial,
	preco           float,
	Descricao       varchar(400),
	CONSTRAINT recibo_pk PRIMARY KEY (idCompra)
	CONSTRAINT donoRecibo_fk FOREIGN KEY (cpf) REFERENCES cliente(cpf)
);

CREATE TABLE ReciboProduto(
        codBarras       int,
        idCompra        serial,
        CONSTRAINT prod_fk FOREIGN KEY (codBarras) REFERENCES Produtos(codBarras),
        CONSTRAINT rec_fk FOREIGN KEY (cpf) REFERENCES Recibo(idCompra)
        
)
