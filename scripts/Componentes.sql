-- DDL COMPONENTES:

CREATE TABLE tb_componente(
	idc int auto_increment PRIMARY KEY,
	componente VARCHAR(100),
	marca VARCHAR(100),
	modelo VARCHAR(100),
	capacidad VARCHAR(20),
	velocidad VARCHAR(50),
	idProveedor BIGINT,
	precio DOUBLE,
	cantidad INT,
	disponibilidad VARCHAR(50),
	imagen BLOB,
	descripcion TEXT,
	CONSTRAINT fk_idproveedor FOREIGN KEY(idProveedor) REFERENCES tb_proveedor(idProveedor)
);








