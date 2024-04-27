use bd_sistema_ventas;
-- 3 proovedores para cada producto
INSERT INTO tb_proveedor (nombre, contacto, direccion, email, productoSum, fechaRegistro, estado, observaciones) VALUES

('Tech Bolivia SRL', 'Juan Pérez', 'Av. Arce #123, La Paz, Bolivia', 'juan@techbolivia.com', 'COMPUTADORA', '2024-04-27', 'activo', ''),
('ByteLatam SA', 'María López', 'Calle Potosí #456, La Paz, Bolivia', 'maria@bytelatam.com', 'COMPUTADORA', '2024-04-27', 'activo', ''),
('SistemasAndes Ltda.', 'Pablo González', 'Av. Ballivián #789, La Paz, Bolivia', 'pablo@sistemasandes.com', 'COMPUTADORA', '2024-04-27', 'activo', ''),

('LaptopWorld Ltda.', 'Martín Ramírez', 'Calle Murillo #321, La Paz, Bolivia', 'martin@laptopworld.com', 'laptop', '2024-04-27', 'activo', ''),
('ElectroComputadoras SRL', 'Ana Silva', 'Av. Mariscal Santa Cruz #654, La Paz, Bolivia', 'ana@electrocomputadoras.com', 'laptop', '2024-04-27', 'activo', ''),
('TecnologíaAndina SA', 'Diego Torres', 'Calle Sagárnaga #987, La Paz, Bolivia', 'diego@tecnologiaandina.com', 'laptop', '2024-04-27', 'activo', ''),

('ComponentesBolivia SA', 'Carla Mendoza', 'Av. 6 de Agosto #101, La Paz, Bolivia', 'carla@componentesbolivia.com', 'componentes', '2024-04-27', 'activo', ''),
('TecnoPartes Ltda.', 'Pedro García', 'Calle Landaeta #567, La Paz, Bolivia', 'pedro@tecnoPartes.com', 'componentes', '2024-04-27', 'activo', ''),
('InnovaciónElectrónica SA', 'Laura López', 'Av. Camacho #876, La Paz, Bolivia', 'laura@innovacionelectronica.com', 'componentes', '2024-04-27', 'activo', ''),

('AccesoriosBolivia SA', 'José Rodríguez', 'Av. 16 de Julio #234, La Paz, Bolivia', 'jose@accesoriosbolivia.com', 'accesorios', '2024-04-27', 'activo', ''),
('GadgetsAndes SRL', 'Sofía Martínez', 'Calle Illampu #345, La Paz, Bolivia', 'sofia@gadgetsandes.com', 'accesorios', '2024-04-27', 'activo', ''),
('InnovaciónAccesorios Ltda.', 'Andrés López', 'Av. Buenos Aires #789, La Paz, Bolivia', 'andres@innovacionaccesorios.com', 'accesorios', '2024-04-27', 'activo', '');

UPDATE tb_proveedor SET productoSum = UPPER(productoSum);