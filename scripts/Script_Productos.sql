-- Active: 1708136644866@@127.0.0.1@3306@bd_sistema_ventas

-- DDL COMPONENTES:
CREATE TABLE tb_componente(
	idc int auto_increment PRIMARY KEY,
	componente VARCHAR(100),
	marca VARCHAR(100),
	modelo VARCHAR(100),
	capacidad VARCHAR(20),
	velocidad VARCHAR(50),
	precioUnitario DECIMAL(10, 2),
	precioTotal DECIMAL(10, 2),
	cantidad INT,
	disponibilidad VARCHAR(50),
	imagen BLOB,
	descripcion TEXT,
	idProveedor BIGINT,
	idUsuario BIGINT,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_componenteProveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_componenteUsuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_computadora(
	idComputadora int auto_increment PRIMARY KEY,
	nombre VARCHAR(100),
	procesador VARCHAR(100),
	placaMadre VARCHAR(100),
	memoriaRam VARCHAR(100),
	almacenamiento VARCHAR(100),
	tarjetaGrafica VARCHAR(100),
	fuente VARCHAR(100),
	ccase VARCHAR(100),
	monitor VARCHAR(100),
	disipadores VARCHAR(100),
	ventiladores VARCHAR(100),
	imagen BLOB,
	precioReal DECIMAL(10, 2),
	precioTotal DECIMAL(10, 2),
	descripcion TEXT,
	idUsuario BIGINT,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_usuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_laptop(
	idLaptop int auto_increment PRIMARY KEY,
	marca VARCHAR(100),
	modelo VARCHAR(100),
	procesador VARCHAR(100),
	memoriaRam VARCHAR(100),
	almacenamiento VARCHAR(100),
	conectividad VARCHAR(100),
	tarjetaGrafica VARCHAR(100),
	pantalla VARCHAR(100),
	bateria VARCHAR(100),
	cantidad INT,
	precioUnitario DOUBLE,
	precioTotal DOUBLE,
	imagen BLOB,
	descripcion TEXT,
	idUsuario BIGINT,
	idProveedor BIGINT,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_LaptopProveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_LaptopUsuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_accesorios (
	IdAccesorio INT auto_increment PRIMARY KEY,
	nombre VARCHAR(50),
	marca VARCHAR(50),
	descripcion VARCHAR(100),
	cantidad INT,
	precioUnitario DECIMAL(10, 2),
	precioTotal DECIMAL(10, 2),
	idProveedor BIGINT,
	idUsuario BIGINT,
	imagen BLOB,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_accesorioProveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_accesorioUsuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_transacciones(
	idTransaccion INTEGER AUTO_INCREMENT PRIMARY KEY,
	idProducto BIGINT,
	montoTotal DOUBLE,
	tipoPago VARCHAR(50),
	estadoPago VARCHAR(50),
	id_Proveedor BIGINT,
	id_Usuario BIGINT,
	observaciones TEXT,
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_TProveedor FOREIGN KEY(id_Proveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_TUsuario FOREIGN KEY(id_Usuario) REFERENCES tb_usuario(idUsuario)
);

SELECT * FROM tb_accesorios;