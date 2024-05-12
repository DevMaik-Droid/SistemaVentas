-- Active: 1708136644866@@127.0.0.1@3306@bd_sistema_ventas

-- DDL COMPONENTES:


CREATE TABLE tb_componente(
	idc int auto_increment PRIMARY KEY,
	claveComponente VARCHAR(10),
	nombre VARCHAR(100),
	marca VARCHAR(100),
	modelo VARCHAR(100),
	capacidad VARCHAR(20),
	velocidad VARCHAR(50),
	imagen BLOB,
	descripcion TEXT,
	fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE tb_laptop(
	idLaptop int auto_increment PRIMARY KEY,
	claveLaptop VARCHAR(10),
	nombre VARCHAR(100),
	marca VARCHAR(100),
	modelo VARCHAR(100),
	procesador VARCHAR(100),
	memoriaRam VARCHAR(100),
	almacenamiento VARCHAR(100),
	conectividad VARCHAR(100),
	tarjetaGrafica VARCHAR(100),
	pantalla VARCHAR(100),
	bateria VARCHAR(100),
	imagen BLOB,
	descripcion TEXT,
	fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE tb_accesorios (
	IdAccesorio INT auto_increment PRIMARY KEY,
	claveAccesorio VARCHAR(10),
	nombre VARCHAR(50),
	marca VARCHAR(50),
	modelo VARCHAR(50),
	imagen BLOB,
	descripcion VARCHAR(100),
	fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE tb_computadora(
	idComputadora int auto_increment PRIMARY KEY,
	claveComputadora VARCHAR(10),
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
	descripcion TEXT,
	fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE tb_productos(
	idp BIGINT AUTO_INCREMENT PRIMARY KEY,
	claveProducto VARCHAR(10),
	nombreProducto VARCHAR(100),
	categoriaProducto VARCHAR(50),
	precioUnitario DECIMAL(10, 2),
	stock INTEGER,
	precioTotal DECIMAL(10, 2),
	disponibilidad VARCHAR(50) DEFAULT 'DISPONIBLE',
	idProveedor BIGINT,
	idUsuario BIGINT,
	fechaModificacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_Proveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_Usuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_transacciones(
	idTransaccion BIGINT AUTO_INCREMENT PRIMARY KEY,
	montoTotal DOUBLE,
	montoPagado DOUBLE,
	tipoPago VARCHAR(50),
	estadoPago VARCHAR(50),
	fechaLimite DATE,
	plazos VARCHAR(20),
	observaciones TEXT,
	id_Proveedor BIGINT,
	id_Usuario BIGINT,
	id_Producto INTEGER,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_TProveedor FOREIGN KEY(id_Proveedor) REFERENCES tb_proveedor(idProveedor),
	constraint fk_TProduccto FOREIGN KEY(id_Producto) REFERENCES 
	CONSTRAINT fk_TUsuario FOREIGN KEY(id_Usuario) REFERENCES tb_usuario(idUsuario)
);

SELECT * FROM tb_accesorios;