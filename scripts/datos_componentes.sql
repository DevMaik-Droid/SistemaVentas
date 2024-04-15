-- Placa Base (Motherboard)
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Placa Base', 'ASUS', 'ROG STRIX Z390-F', NULL, NULL, 2, 250.00, 15, 'Disponible', 'Placa base para juegos de alto rendimiento.'),
('Placa Base', 'Gigabyte', 'B450 AORUS ELITE', NULL, NULL, 2, 150.00, 20, 'Disponible', 'Placa base para una configuración de nivel medio.'),
('Placa Base', 'MSI', 'MAG B550 TOMAHAWK', NULL, NULL, 2, 180.00, 18, 'Disponible', 'Placa base con soporte para los últimos procesadores Ryzen de AMD.');

-- Procesador (CPU)
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Procesador (CPU)', 'Intel', 'Core i7-9700K', NULL, NULL, 2, 350.00, 20, 'Disponible', 'Procesador de 9ª generación para tareas intensivas.'),
('Procesador (CPU)', 'AMD', 'Ryzen 7 5800X', NULL, NULL, 2, 450.00, 18, 'Disponible', 'Procesador de la serie Ryzen 5000 con alto rendimiento en juegos y aplicaciones.'),
('Procesador (CPU)', 'Intel', 'Core i9-9900K', NULL, NULL, 2, 500.00, 15, 'Disponible', 'Procesador de 9ª generación con rendimiento extremadamente alto y capacidad de overclocking.');

-- Memoria RAM
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Memoria RAM', 'Corsair', 'Vengeance LPX', '8 GB', 'DDR5-6400 MHz', 2, 80.00, 50, 'Disponible', 'Memoria RAM de 8GB DDR5 para una excelente multitarea.'),
('Memoria RAM', 'Kingston', 'HyperX Fury', '16 GB', 'DDR4-3200 MHz', 2, 100.00, 40, 'Disponible', 'Memoria RAM de 16GB DDR4 para un rendimiento rápido y estable.'),
('Memoria RAM', 'Crucial', 'Ballistix Sport', '32 GB', 'DDR4-3600 MHz', 2, 150.00, 30, 'Disponible', 'Memoria RAM de 32GB DDR4 para una experiencia de juego fluida y multitarea.');

-- Almacenamiento HDD
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Almacenamiento HDD', 'Seagate', 'Barracuda', '1 TB', '5400 RPM', 2, 70.00, 50, 'Disponible', 'Disco duro de 1TB para almacenamiento.'),
('Almacenamiento HDD', 'Western Digital', 'Blue', '2 TB', '7200 RPM', 2, 90.00, 40, 'Disponible', 'Disco duro de 2TB para almacenar una gran cantidad de datos.'),
('Almacenamiento HDD', 'Toshiba', 'P300', '4 TB', '5400 RPM', 2, 120.00, 30, 'Disponible', 'Disco duro de 4TB para almacenamiento masivo y respaldo de datos.');

-- Almacenamiento SSD
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Almacenamiento SSD', 'Samsung', '970 EVO', '500 GB', 'SATA SSD - 300 MB/s a 400 MB/s', 1, 120.00, 25, 'Disponible', 'SSD de 500GB con velocidades de lectura/escritura rápidas.'),
('Almacenamiento SSD', 'Crucial', 'MX500', '1 TB', 'SATA SSD - 500 MB/s a 600 MB/s', 2, 150.00, 20, 'Disponible', 'SSD de 1TB con excelente rendimiento y confiabilidad.'),
('Almacenamiento SSD', 'Western Digital', 'Blue SN550', '250 GB', 'NVMe M.2 - NVMe PCIe Gen3 x4', 3, 80.00, 30, 'Disponible', 'SSD NVMe de 250GB para una experiencia de carga rápida de aplicaciones y juegos.');

-- Tarjeta grafica (GPU)
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce RTX 2080', NULL, NULL, 1, 600.00, 10, 'Disponible', 'Tarjeta gráfica de gama alta para juegos exigentes.'),
('Tarjeta grafica (GPU)', 'AMD', 'Radeon RX 6800 XT', NULL, NULL, 2, 700.00, 8, 'Disponible', 'Tarjeta gráfica de la serie Radeon RX 6000 para juegos de alta gama y rendimiento 4K.'),
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce GTX 1660 Super', NULL, NULL, 3, 300.00, 15, 'Disponible', 'Tarjeta gráfica de gama media con excelente rendimiento en juegos.');

-- Fuente Alimentacion
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Fuente Alimentacion', 'Corsair', 'RM750X', NULL, NULL, 1, 120.00, 20, 'Disponible', 'Fuente de alimentación modular de alta eficiencia.'),
('Fuente Alimentacion', 'EVGA', 'SuperNOVA 650 G5', NULL, NULL, 2, 100.00, 25, 'Disponible', 'Fuente de alimentación completamente modular con certificación 80 PLUS Gold.'),
('Fuente Alimentacion', 'Seasonic', 'Focus GX-850', NULL, NULL, 3, 150.00, 15, 'Disponible', 'Fuente de alimentación de alta gama con ventilador de rodamiento fluido y modo híbrido.');

-- Monitor
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Monitor', 'ASUS', 'VG248QE', NULL, NULL, 1, 200.00, 15, 'Disponible', 'Monitor de 24" con alta tasa de refresco para juegos.'),
('Monitor', 'Acer', 'Nitro XV240Y', NULL, NULL, 2, 180.00, 20, 'Disponible', 'Monitor de 23.8" con panel IPS y tecnología AMD FreeSync para una experiencia de juego suave.'),
('Monitor', 'LG', '27GL83A-B', NULL, NULL, 3, 300.00, 12, 'Disponible', 'Monitor de 27" con panel Nano IPS y una alta tasa de refresco para juegos competitivos.');

-- Case
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Case', 'NZXT', 'H510', NULL, NULL, 1, 100.00, 40, 'Disponible', 'Case elegante con excelente gestión de cables.'),
('Case', 'Corsair', 'Crystal 570X RGB', NULL, NULL, 2, 180.00, 25, 'Disponible', 'Case con paneles de vidrio templado y efectos de iluminación RGB personalizables.'),
('Case', 'Cooler Master', 'MasterBox MB511', NULL, NULL, 3, 80.00, 35, 'Disponible', 'Case de diseño minimalista con amplio espacio para componentes de alta gama.');

-- Disipador
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Disipador', 'Cooler Master', 'Hyper 212 EVO', NULL, NULL, 1, 50.00, 30, 'Disponible', 'Disipador de calor de bajo perfil para CPU.'),
('Disipador', 'Noctua', 'NH-D15', NULL, NULL, 2, 90.00, 20, 'Disponible', 'Disipador de doble torre con excelentes capacidades de enfriamiento.'),
('Disipador', 'be quiet!', 'Dark Rock Pro 4', NULL, NULL, 3, 85.00, 25, 'Disponible', 'Disipador de alto rendimiento con diseño asimétrico y ventiladores silenciosos.');

-- Ventiladores
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, idProveedor, precio, cantidad, disponibilidad, descripcion)
VALUES 
('Ventiladores', 'Corsair', 'AF120', NULL, NULL, 1, 20.00, 50, 'Disponible', 'Ventiladores de alto flujo de aire para una buena refrigeración.'),
('Ventiladores', 'NZXT', 'AER RGB 2', NULL, NULL, 2, 30.00, 40, 'Disponible', 'Ventiladores de alta calidad con iluminación RGB personalizable.'),
('Ventiladores', 'Noctua', 'NF-F12', NULL, NULL, 3, 25.00, 45, 'Disponible', 'Ventiladores de alta eficiencia y bajo ruido para un enfriamiento silencioso.');
