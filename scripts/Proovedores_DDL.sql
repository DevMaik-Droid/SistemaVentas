-- Active: 1714257401294@@127.0.0.1@3306@bd_sistema_ventas
use bd_sistema_ventas;
-- 3 proovedores para cada producto
INSERT INTO tb_proveedor (empresa, proveedor, telefono, direccion, email, productoSum, estado, observaciones) VALUES
('Tech Bolivia SRL', 'Juan Pérez', '+59112345678', 'Av. Arce #123, La Paz, Bolivia', 'juan@techbolivia.com', 'COMPUTADORA', 'ACTIVO', ''),
('ByteLatam SA', 'María López', '+59145678901', 'Calle Potosí #456, La Paz, Bolivia', 'maria@bytelatam.com', 'COMPUTADORA', 'ACTIVO', ''),
('SistemasAndes Ltda.', 'Pablo González', '+59178901234', 'Av. Ballivián #789, La Paz, Bolivia', 'pablo@sistemasandes.com', 'COMPUTADORA', 'ACTIVO', ''),
('LaptopWorld Ltda.', 'Martín Ramírez', '+59132165487', 'Calle Murillo #321, La Paz, Bolivia', 'martin@laptopworld.com', 'LAPTOP', 'ACTIVO', ''),
('ElectroComputadoras SRL', 'Ana Silva', '+59165498732', 'Av. Mariscal Santa Cruz #654, La Paz, Bolivia', 'ana@electrocomputadoras.com', 'LAPTOP', 'ACTIVO', ''),
('TecnologíaAndina SA', 'Diego Torres', '+59198765432', 'Calle Sagárnaga #987, La Paz, Bolivia', 'diego@tecnologiaandina.com', 'LAPTOP', 'ACTIVO', ''),
('ComponentesBolivia SA', 'Carla Mendoza', '+59110123456', 'Av. 6 de Agosto #101, La Paz, Bolivia', 'carla@componentesbolivia.com', 'COMPONENTES', 'ACTIVO', ''),
('TecnoPartes Ltda.', 'Pedro García', '+59156789012', 'Calle Landaeta #567, La Paz, Bolivia', 'pedro@tecnoPartes.com', 'COMPONENTES', 'ACTIVO', ''),
('InnovaciónElectrónica SA', 'Laura López', '+59187654321', 'Av. Camacho #876, La Paz, Bolivia', 'laura@innovacionelectronica.com', 'COMPONENTES', 'ACTIVO', ''),
('AccesoriosBolivia SA', 'José Rodríguez', '+59123456789', 'Av. 16 de Julio #234, La Paz, Bolivia', 'jose@accesoriosbolivia.com', 'ACCESORIOS', 'ACTIVO', ''),
('GadgetsAndes SRL', 'Sofía Martínez', '+59134567890', 'Calle Illampu #345, La Paz, Bolivia', 'sofia@gadgetsandes.com', 'ACCESORIOS', 'ACTIVO', ''),
('InnovaciónAccesorios Ltda.', 'Andrés López', '+59178901234', 'Av. Buenos Aires #789, La Paz, Bolivia', 'andres@innovacionaccesorios.com', 'ACCESORIOS', 'ACTIVO', '');

UPDATE tb_proveedor SET productoSum = UPPER(productoSum);