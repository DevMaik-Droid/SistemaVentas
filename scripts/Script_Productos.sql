-- Active: 1714257401294@@127.0.0.1@3306@bd_sistema_ventas

-- DDL COMPONENTES:

CREATE TABLE tb_productos(
	idp BIGINT AUTO_INCREMENT PRIMARY KEY,
	claveProducto VARCHAR(10),
	precioUnitario DECIMAL(10, 2),
	precioTotal DECIMAL(10, 2),
	cantidad INTEGER,
	disponibilidad VARCHAR(50) DEFAULT 'DISPONIBLE',
	idProveedor BIGINT,
	idUsuario BIGINT,
	fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_Proveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor),
	CONSTRAINT fk_Usuario FOREIGN KEY(idUsuario) REFERENCES tb_usuario(idUsuario),
	CONSTRAINT fk_Clave1 FOREIGN KEY(claveProducto) REFERENCES tb_componente(clave),
	CONSTRAINT fk_Clave2 FOREIGN KEY(claveProducto) REFERENCES tb_computadora(clave),
	CONSTRAINT fk_Clave3 FOREIGN KEY(claveProducto) REFERENCES tb_laptop(clave),
	CONSTRAINT fk_Clave4 FOREIGN KEY(claveProducto) REFERENCES tb_accesorios(clave)
);

CREATE INDEX idx_clave ON tb_componente (clave);
CREATE INDEX idx_clave ON tb_computadora (clave);
CREATE INDEX idx_clave ON tb_laptop (clave);
CREATE INDEX idx_clave ON tb_accesorios (clave);

CREATE TABLE tb_componente(
	idc int auto_increment PRIMARY KEY,
	clave VARCHAR(10),
	componente VARCHAR(100),
	marca VARCHAR(100),
	modelo VARCHAR(100),
	capacidad VARCHAR(20),
	velocidad VARCHAR(50),
	imagen BLOB,
	descripcion TEXT
);

CREATE TABLE tb_computadora(
	idComputadora int auto_increment PRIMARY KEY,
	clave VARCHAR(10),
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
	descripcion TEXT
);

CREATE TABLE tb_laptop(
	idLaptop int auto_increment PRIMARY KEY,
	clave VARCHAR(10),
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
	descripcion TEXT
);

CREATE TABLE tb_accesorios (
	IdAccesorio INT auto_increment PRIMARY KEY,
	clave VARCHAR(10),
	nombre VARCHAR(50),
	marca VARCHAR(50),
	imagen BLOB,
	descripcion VARCHAR(100)
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