--Borrado de Tablas
DROP TABLE administrativos CASCADE CONSTRAINTS;
DROP TABLE capacitacion CASCADE CONSTRAINTS;
DROP TABLE chequeo CASCADE CONSTRAINTS;
DROP TABLE detallechequeo CASCADE CONSTRAINTS;
DROP TABLE usuarios CASCADE CONSTRAINTS;
DROP TABLE perfilusuario CASCADE CONSTRAINTS;
DROP TABLE cliente CASCADE CONSTRAINTS;
DROP TABLE pago CASCADE CONSTRAINTS;
DROP TABLE visita CASCADE CONSTRAINTS;
DROP TABLE profesionales CASCADE CONSTRAINTS;
DROP TABLE usuario CASCADE CONSTRAINTS;
DROP SEQUENCE capacitacion_seq;
DROP TRIGGER capacitacion_bir;
DROP SEQUENCE pago_seq;
DROP TRIGGER pago_bir;
DROP SEQUENCE visita_seq;
DROP TRIGGER visita_bir;

--Creacion de tablas
CREATE TABLE administrativos (
    runadministrativo   NUMBER(9) NOT NULL,
    nombres             VARCHAR2(50),
    apellidos           VARCHAR2(50),
    correo              VARCHAR2(100),
    area                VARCHAR2(100),
    usuario_runusuario  NUMBER(9) NOT NULL
);

ALTER TABLE administrativos ADD CONSTRAINT administrativos_pk PRIMARY KEY ( runadministrativo );

CREATE TABLE capacitacion (
    idcapacitacion      NUMBER NOT NULL,
    capfecha            VARCHAR2(50) NOT NULL,
    caphora             VARCHAR2(50) NOT NULL,
    caplugar            VARCHAR2(100) NOT NULL,
    capduracion         NUMBER,
    cliente_rutcliente  NUMBER(9) NOT NULL
);

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( idcapacitacion );

CREATE TABLE chequeo (
    idchequeo      NUMBER NOT NULL,
    nombrechequeo  VARCHAR2(50)
);

ALTER TABLE chequeo ADD CONSTRAINT chequeo_pk PRIMARY KEY ( idchequeo );

CREATE TABLE detallechequeo (
    visita_idvisita    NUMBER NOT NULL,
    chequeo_idchequeo  NUMBER NOT NULL,
    estadocumplimiento NUMBER NOT NULL
);

CREATE TABLE usuarios (
    usuarioid  NUMBER NOT NULL,
    login      VARCHAR2(30) NOT NULL,
    clave      VARCHAR2(100) NOT NULL
);

ALTER TABLE usuarios ADD CONSTRAINT usuarios_pk PRIMARY KEY ( usuarioid );

CREATE TABLE perfilusuario (
    perfilusuarioid  NUMBER NOT NULL,
    usuarioid        NUMBER NOT NULL,
    rol              VARCHAR2(30) NOT NULL
);

ALTER TABLE perfilusuario ADD CONSTRAINT perfilusuario_pk PRIMARY KEY ( perfilusuarioid );

CREATE TABLE cliente (
    rutcliente       NUMBER(9) NOT NULL,
    clinombre        VARCHAR2(30) NOT NULL,
    cliapellidos     VARCHAR2(50) NOT NULL,
    clitelefono      VARCHAR2(20) NOT NULL,
    cliafp           VARCHAR2(30),
    clisistemasalud  NUMBER(2),
    clidireccion     VARCHAR2(100) NOT NULL,
    clicomuna        VARCHAR2(50) NOT NULL,
    cliedad          NUMBER(3) NOT NULL,
	usuario_runusuario NUMBER(9) NOT NULL
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rutcliente );

CREATE TABLE pago (
    idpago              NUMBER NOT NULL,
    fechapago           VARCHAR2(20),
    montopago           NUMBER,
    mes                 NUMBER(2),
    año                 NUMBER(4),
    cliente_rutcliente  NUMBER(9) NOT NULL
);

ALTER TABLE pago ADD CONSTRAINT pago_pk PRIMARY KEY ( idpago );

CREATE TABLE visita (
    idvisita            NUMBER NOT NULL,
    visfecha            VARCHAR2(50) NOT NULL,
    vishora             VARCHAR2(50),
    vislugar            VARCHAR2(50) NOT NULL,
    viscomentario       VARCHAR2(250) NOT NULL,
    cliente_rutcliente  NUMBER(9) NOT NULL
);

ALTER TABLE visita ADD CONSTRAINT visita_pk PRIMARY KEY ( idvisita );

CREATE TABLE profesionales (
    runprofesional      NUMBER(9) NOT NULL,
    nombres             VARCHAR2(50),
    apellidos           VARCHAR2(50),
    telefono            VARCHAR2(50),
    titulo              VARCHAR2(50),
    proyecto            VARCHAR2(50),
    usuario_runusuario  NUMBER(9) NOT NULL
);

ALTER TABLE profesionales ADD CONSTRAINT profesionales_pk PRIMARY KEY ( runprofesional );

CREATE TABLE usuario (
    rutusuario          NUMBER(9) NOT NULL,
    nombre              VARCHAR2(100) NOT NULL,
    fechanacimiento     VARCHAR2(50) NOT NULL,
    tipo                NUMBER NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( rutusuario );

--Crear secuencia autoincrementable para tabla capacitacion
CREATE SEQUENCE capacitacion_seq START WITH 1;

CREATE OR REPLACE TRIGGER capacitacion_bir 
BEFORE INSERT ON capacitacion 
FOR EACH ROW
BEGIN
SELECT capacitacion_seq.NEXTVAL
INTO   :new.idcapacitacion
FROM   dual;
END;

--Crear secuencia autoincrementable para tabla pago
CREATE SEQUENCE pago_seq START WITH 1;

CREATE OR REPLACE TRIGGER pago_bir 
BEFORE INSERT ON pago 
FOR EACH ROW
BEGIN
SELECT pago_seq.NEXTVAL
INTO   :new.idpago
FROM   dual;
END;

--Crear secuencia autoincrementable para tabla visita
CREATE SEQUENCE visita_seq START WITH 1;

CREATE OR REPLACE TRIGGER visita_bir 
BEFORE INSERT ON visita 
FOR EACH ROW
BEGIN
SELECT visita_seq.NEXTVAL
INTO   :new.idvisita
FROM   dual;
END;

ALTER TABLE detallechequeo ADD CONSTRAINT detallechequeo_pk 
PRIMARY KEY ( visita_idvisita, chequeo_idchequeo );

ALTER TABLE detallechequeo
ADD CONSTRAINT detallechequeo_chequeo_fk FOREIGN KEY ( chequeo_idchequeo )
REFERENCES chequeo ( idchequeo );

ALTER TABLE detallechequeo
ADD CONSTRAINT detallechequeo_visita_fk FOREIGN KEY ( visita_idvisita )
REFERENCES visita ( idvisita );

ALTER TABLE cliente
ADD CONSTRAINT cliente_usuario_fk FOREIGN KEY ( usuario_runusuario )
REFERENCES usuario ( rutusuario );

ALTER TABLE pago
ADD CONSTRAINT pago_cliente_fk FOREIGN KEY ( cliente_rutcliente )
REFERENCES cliente ( rutcliente );

ALTER TABLE visita
ADD CONSTRAINT visita_cliente_fk FOREIGN KEY ( cliente_rutcliente )
REFERENCES cliente ( rutcliente );

--Insercion de registros en tablas
--Insercion de registros en tabla usuario
INSERT INTO usuario VALUES(111,'Carlos Lopez','11/07/1954',1);
INSERT INTO usuario VALUES(222,'Camila Corral','25/09/1963',2);
INSERT INTO usuario VALUES(333,'Maria Carrasco','05/10/1979',3);

--Insercion de registros en tabla cliente
INSERT INTO cliente VALUES(444,'Eusebio', 'Jara Castro','91234567','Modelo',1,
'Avenida Siempre Viva 123','Valparaiso',33, 111);
INSERT INTO cliente VALUES(555,'Luisa', 'Peña Perez','97654321','Habitat',2,
'Pasaje Castillo 333','La Florida',42,222);
INSERT INTO cliente VALUES(666,'Laura', 'Cortes Flores','91231234','Provida',1,
'Avenida San Martin 148','Santiago',20, 333);

--Insercion de registros en tabla administrativos
INSERT INTO administrativos VALUES(777,'Julio Pablo','Iglesias Diaz','julio.iglesias@gmail.com',
'Servicio al cliente',111);
INSERT INTO administrativos VALUES(888,'Paula Andrea','Rosas del Campo','paula.rosas@gmail.com',
'Logistica',222);
INSERT INTO administrativos VALUES(999,'Jorge Ignacio','Campos Aldea','jorge.campos@gmail.com',
'Contabilidad',333);

--Insercion de registros en tabla profesionales
INSERT INTO profesionales VALUES(122,'Romina Andrea', 'Rojas Jara','95123456',
'Prevencionista de riesgo', 'Proyecto 1',111);
INSERT INTO profesionales VALUES(133,'Luis Alberto', 'Tapia Tapia','94326784',
'Ingeniero constructor', 'Proyecto 2',222);
INSERT INTO profesionales VALUES(144,'Carolina Francisca', 'Rios del Sur','959876543',
'Prevencionista de riesgo', 'Proyecto 3',333);

--Insercion de registros en tabla pago
INSERT INTO pago VALUES(null,'2021-01-01',5500,1,2021,444);
INSERT INTO pago VALUES(null,'2021-02-03',50000,2,2021,555);
INSERT INTO pago VALUES(null,'2021-02-02',19000,2,2021,666);

--Insercion de registros en tabla capacitacion
INSERT INTO capacitacion VALUES(null,'2021-01-02', '11:00','Maipú',120,444);
INSERT INTO capacitacion VALUES(null,'2021-02-02', '11:00','Los Angeles',15,555);
INSERT INTO capacitacion VALUES(null,'2021-02-03', '11:00','Concepción',30,666);

--Insercion de registros en tabla visita
INSERT INTO visita VALUES(null,'2021-01-21','10:30','Valparaiso','sin comentarios',444);
INSERT INTO visita VALUES(null,'2021-02-11','16:15','Santiago','sin comentarios',555);
INSERT INTO visita VALUES(null,'2021-02-09','18:00','Las Condes','sin comentarios',666);

--Insercion de registros en tabla chequeo
INSERT INTO chequeo VALUES(1,'Zonas de seguridad establecidas');
INSERT INTO chequeo VALUES(2,'Demarcación de zonas de peligro');
INSERT INTO chequeo VALUES(3,'Salidas de emergencia señalizadas');

--Insercion de registros en tabla detallechequeo
INSERT INTO detallechequeo VALUES(1,2,1);
INSERT INTO detallechequeo VALUES(2,1,3);
INSERT INTO detallechequeo VALUES(3,3,2);

--Insercion de registros en tabla usuarios
INSERT INTO usuarios VALUES(1,'17443539','$2a$10$tcetvTf9rwScMXgzr.0Ejedm2Y53JLkSHNLVXK1InP2IVNfEjuHYq');
INSERT INTO usuarios VALUES(2,'12345678','$2a$10$ti1Gi7TVt6Gb0UsmP9yeYOf/jPVFknPV8SlrYSpfzBLpvvP9ZNieS');
INSERT INTO usuarios VALUES(3,'87654321','$2a$10$uyXk5tywnatwqgvbizwZI.HinEOmLS16OIifCNQnYbhX0aKMQZ9hy');

--Insercion de registros en tabla perfilusuario
INSERT INTO perfilusuario VALUES(1,1,'ROLE_CLI');
INSERT INTO perfilusuario VALUES(2,2,'ROLE_ADMIN');
INSERT INTO perfilusuario VALUES(3,3,'ROLE_PRO');

COMMIT;