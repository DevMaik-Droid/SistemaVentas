
CREATE TABLE tb_cliente (
    idCliente BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correoElectronico VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(20),
    departamento VARCHAR(50),
    direccion VARCHAR(100),
    estado VARCHAR(10)
);
CREATE TABLE tb_ventas (
    idVenta BIGINT AUTO_INCREMENT PRIMARY KEY,
    cantidad DECIMAL(10, 2) NOT NULL,
    precioUnitario DECIMAL(10, 2) NOT NULL,
    descuento DECIMAL(10, 2) NOT NULL,
    subtotal DECIMAL(10, 2) NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    metodoPago VARCHAR(50),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    idCliente BIGINT,
    idProducto BIGINT,
    idUsuario BIGINT,
    CONSTRAINT fk_Vcliente FOREIGN KEY (idCliente) REFERENCES tb_cliente(idCliente),
    CONSTRAINT fk_Vproducto FOREIGN KEY (idProducto) REFERENCES tb_productos(idp),
    CONSTRAINT fk_Vusuario FOREIGN KEY (idUsuario) REFERENCES tb_usuario(idUsuario)
);
CREATE TABLE tb_factura (
    idFactura INT AUTO_INCREMENT PRIMARY KEY,
    idVenta BIGINT,
    subTotal DECIMAL(10, 2) NOT NULL,
    impuestos DECIMAL(10, 2) NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    numeroFactura VARCHAR(50) UNIQUE NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_Fventa  FOREIGN KEY (idVenta) REFERENCES tb_ventas(idVenta)
);





-- DDL Ventas

INSERT INTO tb_cliente (nombre, apellido, correoElectronico, telefono, departamento, direccion, estado) VALUES
('Juan', 'Gutierrez', 'juangutierrez@gmail.com', '123456789', 'Santa Cruz', 'Av. Banzer 123', 'Activo'),
('Maria', 'Santos', 'msantos@hotmail.com', '987654321', 'La Paz', 'Calle Murillo 456', 'Activo'),
('Pedro', 'Morales', 'pedro.morales@yahoo.com', '741852963', 'Cochabamba', 'Av. Circunvalación 789', 'Inactivo'),
('Ana', 'Flores', 'anaflores@gmail.com', '369258147', 'Tarija', 'Av. Las Américas 456', 'Activo'),
('Luis', 'Vargas', 'lvargas@gmail.com', '258147369', 'Potosí', 'Calle Sucre 123', 'Activo');
