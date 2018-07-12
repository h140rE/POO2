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
/*

CREATE TABLE Veterinario(
	nome		varchar(30),
	cpf		varchar(11),
	telefone	varchar(12),
	id		serial,
	CONSTRAINT veterinario_pk PRIMARY KEY (id)
);
INSERT INTO Veterinario (nome,cpf,telefone,id) VALUES 
        ('Jescie',      '93326327072','309117323445',nextval('funcionarioID')),
        ('Brenda',      '27542004018','770215532568',nextval('funcionarioID')),
        ('Erich',       '97094094094','791207444469',nextval('funcionarioID')),
        ('Dolan',       '79614790075','434464745647',nextval('funcionarioID')),
        ('Zenia',       '68023779001','330562934928',nextval('funcionarioID')),
        ('Keane',       '05197371056','837587732400',nextval('funcionarioID')),
        ('Alexander',   '96598398045','772097412357',nextval('funcionarioID')),
        ('Samantha',    '99917701001','425007823457',nextval('funcionarioID')),
        ('Joel',        '69440133040','613095223506',nextval('funcionarioID')),
        ('Lewis',       '43666598080','122144230534',nextval('funcionarioID'));
*/

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
	CONSTRAINT donoAnimal_fk FOREIGN KEY (cpfDono) REFERENCES cliente(cpf),
	CONSTRAINT animal_pk PRIMARY KEY (cpfDono,nome),
	CONSTRAINT tipo CHECK (
		UPPER(tipo) = 'G' OR 
		UPPER(tipo) = 'C'
        )
);

CREATE TABLE Recibo(
        idCompra        serial,
        cpf		varchar(11),
	preco           float,
	Descricao       varchar(400) NOT NULL,
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

INSERT INTO Atendente (nome,cpf,telefone,id) VALUES
        ('Hedley',      '40049008080','033993604670',nextval('funcionarioID')),
        ('Rae',         '99888670000','031986811808',nextval('funcionarioID')),
        ('Chantale',    '28464557086','109483727543',nextval('funcionarioID')),
        ('Rooney',      '48996240001','103547273940',nextval('funcionarioID')),
        ('Alana',       '75383899030','123476786126',nextval('funcionarioID')),
        ('Deacon',      '99884168067','387266121312',nextval('funcionarioID')),
        ('Ahmed',       '04870533030','753268134235',nextval('funcionarioID')),
        ('Lacota',      '52705686088','174247123545',nextval('funcionarioID')),
        ('Armando',     '93994973058','416935223467',nextval('funcionarioID')),
        ('Germane',     '77751509040','918039123406',nextval('funcionarioID'));
        
INSERT INTO Cuidador (nome,cpf,telefone,id) VALUES
        ('Rahim',       '19023600010','149650423467',nextval('funcionarioID')),
        ('Kermit',      '05383374000','642907612456',nextval('funcionarioID')),
        ('Luke',        '45881915003','794928124456',nextval('funcionarioID')),
        ('Cadman',      '73066573052','564316823456',nextval('funcionarioID')),
        ('Cullen',      '90216865034','691003209843',nextval('funcionarioID')),
        ('Lacey',       '42482082021','158880334985',nextval('funcionarioID')),
        ('Byron',       '80723081069','192725523581',nextval('funcionarioID')),
        ('Unity',       '41272499006','689856123356',nextval('funcionarioID')),
        ('Veronica',    '64527142011','252865023608',nextval('funcionarioID')),
        ('Angela',      '42299586091','124324519785',nextval('funcionarioID'));

INSERT INTO Produtos (codBarras,preco,nome,quantidade) VALUES
	(2,5.0   ,'Shampoo Haskell',52),
	(47,97.0 ,'Condicionador Eudora',80),
	(87,57.0 ,'Escova Dogzeira',28),
	(28,23.0 ,'Gravatinha',16),
	(72,9.0  ,'Pato de plástico Borracheiro',86),
	(50,25.0 ,'Vermífago Irineu',5),
	(55,92.0 ,'Caixa de areia Depósito',77),
	(84,8.0  ,'Ração DeVaca',6),
	(60,58.0 ,'Ração Magnum',37),
	(53,31.0 ,'Apito DoKralho',9);

INSERT INTO Hotel VALUES (5);

INSERT INTO cliente (nome,cpf,telefone) VALUES 
        ('Myra',        '03834902004','539972316474'),
        ('Ruby',        '33672413003','497057146858'),
	('Ivor',        '17278598044','242117166519'),
	('Harlan',      '01143237048','586993906181'),
	('Belle',       '36226158000','965466029476'),
	('Kimberley',   '85390972066','767956910655'),
	('Coby',        '51911345087','977018760982'),
	('Virginia',    '34976352005','185882407241'),
	('Yardley',     '19383455098','956941482611'),
	('Callum',      '84592076095','906977694016');

INSERT INTO Animal (cpfDono, tipo, nome, raca) VALUES
        ('84592076095', 'c', 'Duque', 	'Bulldog'),
        ('19383455098', 'g', 'Tobby', 	'Ragdoll'),
        ('33672413003', 'g', 'Luna', 	'Sphynx'),
        ('03834902004', 'c', 'Huck', 	'Golden Retriever'),
        ('17278598044', 'g', 'Sabido', 	'Angorá'),
        ('01143237048', 'c', 'Raj', 	'Dobermann'),
        ('36226158000', 'g', 'Amora', 	'Maine Coon'),
        ('85390972066', 'c', 'Takito', 	'Perdigueiro'),
        ('51911345087', 'c', 'Link', 	'Rottweiler'),
        ('34976352005', 'g', 'Toquinho','Siamês'),
        ('01143237048', 'c', 'Suro', 	'Dobermann'),
        ('36226158000', 'g', 'Black', 	'Persa'),
        ('85390972066', 'c', 'Fedora', 	'Perdigueiro'),
        ('51911345087', 'c', 'Debian', 	'Rottweiler'),
        ('34976352005', 'g', 'Ubuntu',	'Himalaia');



--INSERT INTO recibo (idCompra,cpf,preco, descricao) VALUES ( nextval(idCompra), '84592076095', , );
 
--INSERT INTO reciboproduto (nome,cpf,telefone) VALUES 

select * from cliente
