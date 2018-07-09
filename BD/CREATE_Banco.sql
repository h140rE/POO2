CREATE SCHEMA ZikaPET;
--DROP SCHEMA ZikaPET CASCADE;
SET search_path to ZikaPET;
CREATE SEQUENCE funcionarioID;
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
	cpfDono		varchar(11),
--Cão ou gato
        tipo            char,
	nome		varchar(30),
	raca            varchar(30),
	estado          varchar(30),
	CONSTRAINT donoAnimal_fk FOREIGN KEY (cpfDono) REFERENCES cliente(cpf),
	CONSTRAINT tipo CHECK (
		UPPER(tipo) = 'G' OR 
		UPPER(tipo) = 'C'
        )
);

CREATE TABLE Recibo(
        idCompra        serial,
        cpf		varchar(11),
	preco           float,
	Descricao       varchar(400),
	CONSTRAINT recibo_pk PRIMARY KEY (idCompra),
	CONSTRAINT donoRecibo_fk FOREIGN KEY (cpf) REFERENCES cliente(cpf)
);

CREATE TABLE ReciboProduto(
        codBarras       int,
        idCompra        serial,
        CONSTRAINT prod_fk FOREIGN KEY (codBarras) REFERENCES Produtos(codBarras),
        CONSTRAINT rec_fk FOREIGN KEY (idCompra) REFERENCES Recibo(idCompra)
        
);

--Inserts

		--CORRIGIR OS TELEFONES PARA VARCHAR
INSERT INTO Atendente (nome,cpf,telefone,id) VALUES
        ('Hedley',      '40049008080',4766685,nextval('funcionarioID')),
        ('Rae',         '99888670000',813671,nextval('funcionarioID')),
        ('Chantale',    '28464557086',107870,nextval('funcionarioID')),
        ('Rooney',      '48996240001',5861599,nextval('funcionarioID')),
        ('Alana',       '75383899030',6786126,nextval('funcionarioID')),
        ('Deacon',      '99884168067',3872661,nextval('funcionarioID')),
        ('Ahmed',       '04870533030',7532681,nextval('funcionarioID')),
        ('Lacota',      '52705686088',174247,nextval('funcionarioID')),
        ('Armando',     '93994973058',4169352,nextval('funcionarioID')),
        ('Germane',     '77751509040',9180391,nextval('funcionarioID'));
        
INSERT INTO Cuidador (nome,cpf,telefone,id) VALUES
        ('Rahim',       '19023600010',1496504,nextval('funcionarioID')),
        ('Kermit',      '05383374000',6429076,nextval('funcionarioID')),
        ('Luke',        '45881915003',794928,nextval('funcionarioID')),
        ('Cadman',      '73066573052',5643168,nextval('funcionarioID')),
        ('Cullen',      '90216865034',6910032,nextval('funcionarioID')),
        ('Lacey',       '42482082021',1588803,nextval('funcionarioID')),
        ('Byron',       '80723081069',1927255,nextval('funcionarioID')),
        ('Unity',       '41272499006',6898561,nextval('funcionarioID')),
        ('Veronica',    '64527142011',2528650,nextval('funcionarioID')),
        ('Angela',      '42299586091',5197859,nextval('funcionarioID'));

INSERT INTO Veterinario (nome,cpf,telefone,id) VALUES 
        ('Jescie',      '93326327072',3091173,nextval('funcionarioID')),
        ('Brenda',      '27542004018',7702155,nextval('funcionarioID')),
        ('Erich',       '97094094094',7912074,nextval('funcionarioID')),
        ('Dolan',       '79614790075',4344647,nextval('funcionarioID')),
        ('Zenia',       '68023779001',3305629,nextval('funcionarioID')),
        ('Keane',       '05197371056',8375877,nextval('funcionarioID')),
        ('Alexander',   '96598398045',7720974,nextval('funcionarioID')),
        ('Samantha',    '99917701001',4250078,nextval('funcionarioID')),
        ('Joel',        '69440133040',6130952,nextval('funcionarioID')),
        ('Lewis',       '43666598080',2144230,nextval('funcionarioID'));

--CORRIGIR O NOME DOS PRODUTOS
INSERT INTO Produtos (codBarras,preco,nome,quantidade) VALUES
	(2,5.0   ,'Felicia',52),
	(47,97.0 ,'Uta',80),
	(87,57.0 ,'Quincy',28),
	(28,23.0 ,'Tamara',16),
	(72,9.0  ,'Kylan',86),
	(50,25.0 ,'Blythe',5),
	(55,92.0 ,'Christen',77),
	(84,8.0  ,'Brittany',6),
	(60,58.0 ,'Jael',37),
	(53,31.0 ,'Veda',9);

INSERT INTO Hotel VALUES (5);

--CORRIGIR TELEFONES
INSERT INTO cliente (nome,cpf,telefone) VALUES 
        ('Myra',        '03834902004',539972316474),
        ('Ruby',        '33672413003',497057146858),
	('Ivor',        '17278598044',242117166519),
	('Harlan',      '01143237048',586993906181),
	('Belle',       '36226158000',965466029476),
	('Kimberley',   '85390972066',767956910655),
	('Coby',        '51911345087',977018760982),
	('Virginia',    '34976352005',185882407241),
	('Yardley',     '19383455098',956941482611),
	('Callum',      '84592076095',906977694016);

INSERT INTO Animal (cpfDono, tipo, nome, raca, estado) VALUES
        ('84592076095', 'c', 'Duque', 	'Bulldog',		'Finalizado'),
        ('19383455098', 'g', 'Tobby', 	'Ragdoll', 		'Finalizado'),
        ('33672413003', 'g', 'Luna', 	'Sphynx',		'Finalizado'),
        ('03834902004', 'c', 'Huck', 	'Golden Retriever',	'Finalizado'),
        ('17278598044', 'g', 'Sabido', 	'Angorá', 		'Finalizado'),
        ('01143237048', 'c', 'Raj', 	'Dobermann', 		'Finalizado'),
        ('36226158000', 'g', 'Amora', 	'Maine Coon',	 	'Finalizado'),
        ('85390972066', 'c', 'Takito', 	'Perdigueiro', 		'Finalizado'),
        ('51911345087', 'c', 'Link', 	'Rottweiler', 		'Finalizado'),
        ('34976352005', 'g', 'Toquinho','Siamês', 		'Finalizado'),
        ('01143237048', 'c', 'Suro', 	'Dobermann', 		'Finalizado'),
        ('36226158000', 'g', 'Black', 	'Persa', 		'Finalizado'),
        ('85390972066', 'c', 'Fedora', 	'Perdigueiro', 		'Finalizado'),
        ('51911345087', 'c', 'Debian', 	'Rottweiler', 		'Finalizado'),
        ('34976352005', 'g', 'Ubuntu',	'Himalaia', 		'Finalizado');



--INSERT INTO recibo (idCompra,cpf,preco, descricao) VALUES 
 
 
--INSERT INTO reciboproduto (nome,cpf,telefone) VALUES 


