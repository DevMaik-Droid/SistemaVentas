-- Active: 1708136644866@@127.0.0.1@3306@bd_sistema_ventas

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


Claro, los números de teléfono en Bolivia generalmente tienen 8 dígitos y comienzan con ciertos prefijos dependiendo de la región. En La Paz y El Alto, los prefijos comunes son 2 para líneas fijas y 6 o 7 para móviles.

Aquí tienes los datos con números de teléfono más realistas:

-- 50 datos
INSERT INTO tb_cliente (nombre, apellido, correoElectronico, telefono, departamento, direccion, estado) VALUES
('Carlos', 'Perez', 'cperez@gmail.com', '75234567', 'La Paz', 'Av. 16 de Julio 456', 'Inactivo'),
('Laura', 'Gonzalez', 'lgonzalez@hotmail.com', '76234567', 'La Paz', 'Calle Comercio 123', 'Activo'),
('Jose', 'Ramirez', 'jramirez@yahoo.com', '77234567', 'La Paz', 'Av. Buenos Aires 789', 'Activo'),
('Elena', 'Martinez', 'emartinez@gmail.com', '78234567', 'La Paz', 'Calle Sagarnaga 321', 'Inactivo'),
('Miguel', 'Rodriguez', 'mrodriguez@hotmail.com', '79234567', 'La Paz', 'Av. Mariscal Santa Cruz 987', 'Activo'),
('Sofia', 'Lopez', 'slopez@gmail.com', '60234567', 'El Alto', 'Calle 1 456', 'Activo'),
('Luis', 'Mendoza', 'lmendoza@yahoo.com', '61234568', 'El Alto', 'Av. 6 de Marzo 123', 'Activo'),
('Lucia', 'Gutierrez', 'lgutierrez@hotmail.com', '62234567', 'El Alto', 'Calle 2 789', 'Inactivo'),
('Andres', 'Gomez', 'agomez@gmail.com', '63234567', 'El Alto', 'Av. Juan Pablo II 321', 'Activo'),
('Carmen', 'Diaz', 'cdiaz@hotmail.com', '64234567', 'El Alto', 'Calle 3 987', 'Activo'),
('Ricardo', 'Fernandez', 'rfernandez@gmail.com', '65234567', 'El Alto', 'Av. Litoral 456', 'Inactivo'),
('Valeria', 'Castro', 'vcastro@yahoo.com', '66234567', 'El Alto', 'Calle 4 123', 'Activo'),
('Daniel', 'Rojas', 'drojas@gmail.com', '67234567', 'El Alto', 'Av. Panoramica 789', 'Activo'),
('Natalia', 'Ruiz', 'nruiz@hotmail.com', '68234567', 'El Alto', 'Calle 5 321', 'Inactivo'),
('Sergio', 'Molina', 'smolina@gmail.com', '69234567', 'El Alto', 'Av. Bolivia 987', 'Activo'),
('Veronica', 'Navarro', 'vnavarro@gmail.com', '70234567', 'La Paz', 'Calle Potosi 456', 'Activo'),
('Roberto', 'Solis', 'rsolis@hotmail.com', '71234568', 'La Paz', 'Av. Armentia 123', 'Activo'),
('Paula', 'Alvarez', 'palvarez@yahoo.com', '72234568', 'La Paz', 'Calle Illampu 789', 'Inactivo'),
('Alberto', 'Cruz', 'acruz@gmail.com', '73234568', 'La Paz', 'Av. Villazon 321', 'Activo'),
('Teresa', 'Herrera', 'therrera@hotmail.com', '74234568', 'La Paz', 'Calle Loayza 987', 'Activo'),
('Gustavo', 'Torres', 'gtorres@gmail.com', '75234568', 'La Paz', 'Av. 6 de Agosto 456', 'Inactivo'),
('Julia', 'Suarez', 'jsuarez@yahoo.com', '76234568', 'La Paz', 'Calle Jaen 123', 'Activo'),
('Felipe', 'Vega', 'fvega@gmail.com', '77234568', 'La Paz', 'Av. Villarroel 789', 'Activo'),
('Isabel', 'Romero', 'iromero@hotmail.com', '78234568', 'La Paz', 'Calle Colon 321', 'Inactivo'),
('Pablo', 'Chavez', 'pchavez@gmail.com', '79234568', 'La Paz', 'Av. Saavedra 987', 'Activo'),
('Luz', 'Ortiz', 'lortiz@gmail.com', '60234568', 'El Alto', 'Calle 6 456', 'Activo'),
('David', 'Soto', 'dsoto@hotmail.com', '61234569', 'El Alto', 'Av. Tiahuanaco 123', 'Activo'),
('Rosa', 'Espinoza', 'respinoza@yahoo.com', '62234568', 'El Alto', 'Calle 7 789', 'Inactivo'),
('Oscar', 'Reyes', 'oreyes@gmail.com', '63234568', 'El Alto', 'Av. Costanera 321', 'Activo'),
('Patricia', 'Campos', 'pcampos@hotmail.com', '64234568', 'El Alto', 'Calle 8 987', 'Activo'),
('Hector', 'Rivas', 'hrivas@gmail.com', '65234568', 'El Alto', 'Av. 16 de Julio 456', 'Inactivo'),
('Marta', 'Figueroa', 'mfigueroa@yahoo.com', '66234568', 'El Alto', 'Calle 9 123', 'Activo'),
('Edgar', 'Aguirre', 'eaguirre@gmail.com', '67234568', 'El Alto', 'Av. Ferroviaria 789', 'Activo'),
('Flor', 'Serrano', 'fserrano@hotmail.com', '68234568', 'El Alto', 'Calle 10 321', 'Inactivo'),
('Martin', 'Delgado', 'mdelgado@gmail.com', '69234568', 'El Alto', 'Av. Aeropuerto 987', 'Activo'),
('Andrea', 'Mendez', 'amendez@gmail.com', '70234568', 'La Paz', 'Calle Mercado 456', 'Activo'),
('Manuel', 'Vera', 'mvera@hotmail.com', '71234569', 'La Paz', 'Av. Perez Velasco 123', 'Activo'),
('Carla', 'Cabrera', 'ccabrera@yahoo.com', '72234569', 'La Paz', 'Calle Landaeta 789', 'Inactivo'),
('Victor', 'Paredes', 'vparedes@gmail.com', '73234569', 'La Paz', 'Av. Peru 321', 'Activo'),
('Elisa', 'Campos', 'ecampos@hotmail.com', '74234569', 'La Paz', 'Calle Montevideo 987', 'Activo'),
('Renato', 'Jimenez', 'rjimenez@gmail.com', '75234569', 'La Paz', 'Av. Sucre 456', 'Inactivo'),
('Antonia', 'Salazar', 'asalazar@yahoo.com', '76234569', 'La Paz', 'Calle Calama 123', 'Activo'),
('Francisco', 'Miranda', 'fmiranda@gmail.com', '77234569', 'La Paz', 'Av. Ecuador 789', 'Activo'),
('Margarita', 'Lara', 'mlara@hotmail.com', '78234569', 'La Paz', 'Calle Colon 321', 'Inactivo'),
('Raul', 'Ramon', 'rramon@gmail.com', '79234569', 'La Paz', 'Av. Montes 987', 'Activo');
