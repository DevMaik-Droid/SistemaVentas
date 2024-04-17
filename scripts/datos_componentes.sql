-- Placa Base (Motherboard)
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Placa Base', 'ASUS', 'ROG STRIX Z390-F', NULL, NULL, 20, 250.00, 15, 'Disponible', NULL, 'Placa base para juegos de alto rendimiento.', 1, 2, NOW()),
('Placa Base', 'Gigabyte', 'B450 AORUS ELITE', NULL, NULL, 20, 150.00, 20, 'Disponible', NULL, 'Placa base para una configuración de nivel medio.', 1, 2, NOW()),
('Placa Base', 'MSI', 'MAG B550 TOMAHAWK', NULL, NULL, 20, 180.00, 18, 'Disponible', NULL, 'Placa base con soporte para los últimos procesadores Ryzen de AMD.', 1, 2, NOW());


INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Procesador (CPU)', 'Intel', 'Core i7-9700K', NULL, NULL, 350.00, 350.00 * 20, 20, 'Disponible', NULL, 'Procesador de 9ª generación para tareas intensivas.', 1, 2, NOW()),
('Procesador (CPU)', 'AMD', 'Ryzen 7 5800X', NULL, NULL, 450.00, 450.00 * 18, 18, 'Disponible', NULL, 'Procesador de la serie Ryzen 5000 con alto rendimiento en juegos y aplicaciones.', 1, 2, NOW()),
('Procesador (CPU)', 'Intel', 'Core i9-9900K', NULL, NULL, 500.00, 500.00 * 15, 15, 'Disponible', NULL, 'Procesador de 9ª generación con rendimiento extremadamente alto y capacidad de overclocking.', 1, 2, NOW());


INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Memoria RAM', 'Corsair', 'Vengeance LPX', '8 GB', 'DDR5-6400 MHz', 80.00, 80.00 * 50, 50, 'Disponible', NULL, 'Memoria RAM de 8GB DDR5 para una excelente multitarea.', 1, 2, NOW()),
('Memoria RAM', 'Kingston', 'HyperX Fury', '16 GB', 'DDR4-3200 MHz', 100.00, 100.00 * 40, 40, 'Disponible', NULL, 'Memoria RAM de 16GB DDR4 para un rendimiento rápido y estable.', 1, 2, NOW()),
('Memoria RAM', 'Crucial', 'Ballistix Sport', '32 GB', 'DDR4-3600 MHz', 150.00, 150.00 * 30, 30, 'Disponible', NULL, 'Memoria RAM de 32GB DDR4 para una experiencia de juego fluida y multitarea.', 1, 2, NOW());


-- Almacenamiento HDD
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Almacenamiento HDD', 'Seagate', 'Barracuda', '1 TB', '5400 RPM', 70.00, 70.00 * 50, 50, 'Disponible', NULL, 'Disco duro de 1TB para almacenamiento.', 1, 2, NOW()),
('Almacenamiento HDD', 'Western Digital', 'Blue', '2 TB', '7200 RPM', 90.00, 90.00 * 40, 40, 'Disponible', NULL, 'Disco duro de 2TB para almacenar una gran cantidad de datos.', 1, 2, NOW()),
('Almacenamiento HDD', 'Toshiba', 'P300', '4 TB', '5400 RPM', 120.00, 120.00 * 30, 30, 'Disponible', NULL, 'Disco duro de 4TB para almacenamiento masivo y respaldo de datos.', 1, 2, NOW());


-- Almacenamiento SSD
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Almacenamiento SSD', 'Samsung', '970 EVO', '500 GB', 'SATA SSD - 300 MB/s a 400 MB/s', 120.00, 120.00 * 25, 25, 'Disponible', NULL, 'SSD de 500GB con velocidades de lectura/escritura rápidas.', 1, 2, NOW()),
('Almacenamiento SSD', 'Crucial', 'MX500', '1 TB', 'SATA SSD - 500 MB/s a 600 MB/s', 150.00, 150.00 * 20, 20, 'Disponible', NULL, 'SSD de 1TB con excelente rendimiento y confiabilidad.', 1, 2, NOW()),
('Almacenamiento SSD', 'Western Digital', 'Blue SN550', '250 GB', 'NVMe M.2 - NVMe PCIe Gen3 x4', 80.00, 80.00 * 30, 30, 'Disponible', NULL, 'SSD NVMe de 250GB para una experiencia de carga rápida de aplicaciones y juegos.', 1, 2, NOW());


-- Tarjeta grafica (GPU)
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce RTX 2080', NULL, NULL, 600.00, 600.00 * 10, 10, 'Disponible', NULL, 'Tarjeta gráfica de gama alta para juegos exigentes.', 1, 2, NOW()),
('Tarjeta grafica (GPU)', 'AMD', 'Radeon RX 6800 XT', NULL, NULL, 700.00, 700.00 * 8, 8, 'Disponible', NULL, 'Tarjeta gráfica de la serie Radeon RX 6000 para juegos de alta gama y rendimiento 4K.', 1, 2, NOW()),
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce GTX 1660 Super', NULL, NULL, 300.00, 300.00 * 15, 15, 'Disponible', NULL, 'Tarjeta gráfica de gama media con excelente rendimiento en juegos.', 1, 2, NOW());


-- Fuente Alimentacion
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Fuente Alimentacion', 'Corsair', 'RM750X', NULL, NULL, 120.00, 120.00 * 20, 20, 'Disponible', NULL, 'Fuente de alimentación modular de alta eficiencia.', 1, 2, NOW()),
('Fuente Alimentacion', 'EVGA', 'SuperNOVA 650 G5', NULL, NULL, 100.00, 100.00 * 25, 25, 'Disponible', NULL, 'Fuente de alimentación completamente modular con certificación 80 PLUS Gold.', 1, 2, NOW()),
('Fuente Alimentacion', 'Seasonic', 'Focus GX-850', NULL, NULL, 150.00, 150.00 * 15, 15, 'Disponible', NULL, 'Fuente de alimentación de alta gama con ventilador de rodamiento fluido y modo híbrido.', 1, 2, NOW());


-- Monitor
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Monitor', 'ASUS', 'VG248QE', NULL, NULL, 200.00, 200.00 * 15, 15, 'Disponible', NULL, 'Monitor de 24" con alta tasa de refresco para juegos.', 1, 2, NOW()),
('Monitor', 'Acer', 'Nitro XV240Y', NULL, NULL, 180.00, 180.00 * 20, 20, 'Disponible', NULL, 'Monitor de 23.8" con panel IPS y tecnología AMD FreeSync para una experiencia de juego suave.', 1, 2, NOW()),
('Monitor', 'LG', '27GL83A-B', NULL, NULL, 300.00, 300.00 * 12, 12, 'Disponible', NULL, 'Monitor de 27" con panel Nano IPS y una alta tasa de refresco para juegos competitivos.', 1, 2, NOW());


-- Case
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Case', 'NZXT', 'H510', NULL, NULL, 100.00, 100.00 * 40, 40, 'Disponible', NULL, 'Case elegante con excelente gestión de cables.', 1, 2, NOW()),
('Case', 'Corsair', 'Crystal 570X RGB', NULL, NULL, 180.00, 180.00 * 25, 25, 'Disponible', NULL, 'Case con paneles de vidrio templado y efectos de iluminación RGB personalizables.', 1, 2, NOW()),
('Case', 'Cooler Master', 'MasterBox MB511', NULL, NULL, 80.00, 80.00 * 35, 35, 'Disponible', NULL, 'Case de diseño minimalista con amplio espacio para componentes de alta gama.', 1, 2, NOW());


-- Disipador
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Disipador', 'Cooler Master', 'Hyper 212 EVO', NULL, NULL, 50.00, 50.00 * 30, 30, 'Disponible', NULL, 'Disipador de calor de bajo perfil para CPU.', 1, 2, NOW()),
('Disipador', 'Noctua', 'NH-D15', NULL, NULL, 90.00, 90.00 * 20, 20, 'Disponible', NULL, 'Disipador de doble torre con excelentes capacidades de enfriamiento.', 1, 2, NOW()),
('Disipador', 'be quiet!', 'Dark Rock Pro 4', NULL, NULL, 85.00, 85.00 * 25, 25, 'Disponible', NULL, 'Disipador de alto rendimiento con diseño asimétrico y ventiladores silenciosos.', 1, 2, NOW());


-- Ventiladores
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario, fechaRegistro)
VALUES 
('Ventiladores', 'Corsair', 'AF120', NULL, NULL, 20.00, 20.00 * 50, 50, 'Disponible', NULL, 'Ventiladores de alto flujo de aire para una buena refrigeración.', 1, 2, NOW()),
('Ventiladores', 'NZXT', 'AER RGB 2', NULL, NULL, 30.00, 30.00 * 40, 40, 'Disponible', NULL, 'Ventiladores de alta calidad con iluminación RGB personalizable.', 1, 2, NOW()),
('Ventiladores', 'Noctua', 'NF-F12', NULL, NULL, 25.00, 25.00 * 45, 45, 'Disponible', NULL, 'Ventiladores de alta eficiencia y bajo ruido para un enfriamiento silencioso.', 1, 2, NOW());

