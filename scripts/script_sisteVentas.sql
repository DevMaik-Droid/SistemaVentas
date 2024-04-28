-- Active: 1714257401294@@127.0.0.1@3306@bd_sistema_ventas
-- crear nuestra base de datos

create database bd_sistema_ventas;
-- usamos la base de datos
use bd_sistema_ventas;

-- tabla usuarios
CREATE TABLE tb_usuario (
    idUsuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    ci VARCHAR(20) NOT NULL,  -- Se aumentó la longitud para contemplar diferentes formatos de CI
    fecha_nacimiento DATE NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    usuario VARCHAR(15) NOT NULL,
    contrasenia VARCHAR(255) NOT NULL,  -- Se aumentó la longitud de la contraseña
    foto BLOB NOT NULL,
    clave VARCHAR(10) NOT NULL,
    estado VARCHAR(20) NOT NULL, 
    observaciones TEXT
);

-- TABLA PROVEEDOR
CREATE TABLE tb_proveedor(
	idProveedor BIGINT AUTO_INCREMENT PRIMARY KEY,
  empresa VARCHAR(100),
	proveedor VARCHAR(100),
	telefono VARCHAR(20),
	direccion VARCHAR(100),
	email VARCHAR(100),
	productoSum VARCHAR(50),
	estado VARCHAR(10),
	observaciones TEXT,
  fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- crear tabla cliente
create table tb_cliente(
idCliente BIGINT auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
telefono varchar(15) not null,
direccion varchar(100)
);


-- crear tabla producto
create table tb_producto(
idProducto BIGINT (11) auto_increment primary key,
nombre varchar(100) not null,
cantidad int(11) not null,
precio double(10,2) not null,
porcentajeIva int(2) not null,
idCategoria BIGINT not null,
idProveedor BIGINT not null,
estado int(1) not NULL,
fechaProducto date NOT NULL,
CONSTRAINT fk_producto FOREIGN KEY(idCategoria) REFERENCES tb_categoria(idCategoria),
CONSTRAINT fk_proveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor)
);

-- Tabla detalle laptop
CREATE TABLE tb_detalle_computadora(
	id_detalle BIGINT AUTO_INCREMENT PRIMARY KEY,
	modelo VARCHAR(50),
	marca VARCHAR(50),
	procesador VARCHAR(50),
	ram VARCHAR(20),
	discoDuro VARCHAR(30),
	pantalla VARCHAR(50),
	peso DOUBLE,
	id_producto BIGINT,
  CONSTRAINT fk_det_laptop FOREIGN KEY(id_producto) REFERENCES tb_producto(idProducto)
);

CREATE TABLE tb_detalle_accesorio(
    id_detalle BIGINT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(50),
    marca VARCHAR(50),
    tipo VARCHAR(100),
    descripcion VARCHAR(100),
    id_producto BIGINT,
    CONSTRAINT fk_det_accesorio Foreign Key (id_producto) REFERENCES tb_producto(idProducto)
);


-- crear tabla cabecera de venta
create table tb_cabecera_venta(
idCabeceraVenta BIGINT auto_increment primary key,
idCliente BIGINT(11) not null,
valorPagar double(10,2) not null,
fechaVenta date not null, 
CONSTRAINT fk_cab_Cliente FOREIGN KEY(idCliente) REFERENCES tb_cliente(idCliente)
);

-- crear tabla detalle de venta
create table tb_detalle_venta(
idDetalleVenta BIGINT (11) auto_increment primary key,
idCabeceraVenta BIGINT (11) not null,
idProducto BIGINT (11) not null,
cantidad int(11) not null,
precioUnitario double(10,2) not null,
subtotal double(10,2) not null,
descuento double(10,2) not null,
iva double(10,2) not null,
totalPagar double(10,2) not null,
estado int(1) not null,
CONSTRAINT fk_cabecera FOREIGN KEY(idCabeceraVenta) REFERENCES tb_cabecera_venta(idCabeceraVenta),
CONSTRAINT fk_productoDet FOREIGN KEY(idProducto) REFERENCES tb_producto(idProducto)
);

ALTER TABLE tb_usuario MODIFY COLUMN foto LONGBLOB;


-- mostrar todas las tablas de mi base de datos
show tables;
