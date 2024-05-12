-- Placa Base (Motherboard)
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C001', 'Placa Base', 'ASUS', 'ROG STRIX Z390-F', NULL, NULL, 'Placa base para juegos de alto rendimiento.'),
('C002', 'Placa Base', 'Gigabyte', 'B450 AORUS ELITE', NULL, NULL, 'Placa base para una configuración de nivel medio.'),
('C003', 'Placa Base', 'MSI', 'MAG B550 TOMAHAWK', NULL, NULL, 'Placa base con soporte para los últimos procesadores Ryzen de AMD.');
-- Procesador (CPU)
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C001', 'Procesador (CPU)', 'Intel', 'Core i7-9700K', '8 núcleos', '3.6GHz', 'Procesador de 9ª generación para tareas intensivas.'),
('C002', 'Procesador (CPU)', 'AMD', 'Ryzen 7 5800X', '8 núcleos', '3.8GHz', 'Procesador de la serie Ryzen 5000 con alto rendimiento en juegos y aplicaciones.'),
('C003', 'Procesador (CPU)', 'Intel', 'Core i9-9900K', '8 núcleos', '3.6GHz', 'Procesador de 9ª generación con rendimiento extremadamente alto y capacidad de overclocking.');

-- Memoria RAM
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C001', 'Memoria RAM', 'Corsair', 'Vengeance LPX', '8 GB', 'DDR5-6400 MHz', 'Memoria RAM de 8GB DDR5 para una excelente multitarea.'),
('C002', 'Memoria RAM', 'Kingston', 'HyperX Fury', '16 GB', 'DDR4-3200 MHz', 'Memoria RAM de 16GB DDR4 para un rendimiento rápido y estable.'),
('C003', 'Memoria RAM', 'Crucial', 'Ballistix Sport', '32 GB', 'DDR4-3600 MHz', 'Memoria RAM de 32GB DDR4 para una experiencia de juego fluida y multitarea.');

-- Almacenamiento HDD
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C004', 'Almacenamiento HDD', 'Seagate', 'Barracuda', '1 TB', '5400 RPM', 'Disco duro de 1TB para almacenamiento.'),
('C005', 'Almacenamiento HDD', 'Western Digital', 'Blue', '2 TB', '7200 RPM', 'Disco duro de 2TB para almacenar una gran cantidad de datos.'),
('C006', 'Almacenamiento HDD', 'Toshiba', 'P300', '4 TB', '5400 RPM', 'Disco duro de 4TB para almacenamiento masivo y respaldo de datos.');

-- Almacenamiento SSD
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C007', 'Almacenamiento SSD', 'Samsung', '970 EVO', '500 GB', 'SATA SSD - 300 MB/s a 400 MB/s', 'SSD de 500GB con velocidades de lectura/escritura rápidas.'),
('C008', 'Almacenamiento SSD', 'Crucial', 'MX500', '1 TB', 'SATA SSD - 500 MB/s a 600 MB/s', 'SSD de 1TB con excelente rendimiento y confiabilidad.'),
('C009', 'Almacenamiento SSD', 'Western Digital', 'Blue SN550', '250 GB', 'NVMe M.2 - NVMe PCIe Gen3 x4', 'SSD NVMe de 250GB para una experiencia de carga rápida de aplicaciones y juegos.');

-- Tarjeta grafica (GPU)
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C010', 'Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce RTX 2080', NULL, NULL, 'Tarjeta gráfica de gama alta para juegos exigentes.'),
('C011', 'Tarjeta grafica (GPU)', 'AMD', 'Radeon RX 6800 XT', NULL, NULL, 'Tarjeta gráfica de la serie Radeon RX 6000 para juegos de alta gama y rendimiento 4K.'),
('C012', 'Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce GTX 1660 Super', NULL, NULL, 'Tarjeta gráfica de gama media con excelente rendimiento en juegos.');

-- Fuente Alimentacion
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C013', 'Fuente Alimentacion', 'Corsair', 'RM750X', NULL, NULL, 'Fuente de alimentación modular de alta eficiencia.'),
('C014', 'Fuente Alimentacion', 'EVGA', 'SuperNOVA 650 G5', NULL, NULL, 'Fuente de alimentación completamente modular con certificación 80 PLUS Gold.'),
('C015', 'Fuente Alimentacion', 'Seasonic', 'Focus GX-850', NULL, NULL, 'Fuente de alimentación de alta gama con ventilador de rodamiento fluido y modo híbrido.');

-- Monitor
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C016', 'Monitor', 'ASUS', 'VG248QE', NULL, NULL, 'Monitor de 24" con alta tasa de refresco para juegos.'),
('C017', 'Monitor', 'Acer', 'Nitro XV240Y', NULL, NULL, 'Monitor de 23.8" con panel IPS y tecnología AMD FreeSync para una experiencia de juego suave.'),
('C018', 'Monitor', 'LG', '27GL83A-B', NULL, NULL, 'Monitor de 27" con panel Nano IPS y una alta tasa de refresco para juegos competitivos.');

-- Case
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C019', 'Case', 'NZXT', 'H510', NULL, NULL, 'Case elegante con excelente gestión de cables.'),
('C020', 'Case', 'Corsair', 'Crystal 570X RGB', NULL, NULL, 'Case con paneles de vidrio templado y efectos de iluminación RGB personalizables.'),
('C021', 'Case', 'Cooler Master', 'MasterBox MB511', NULL, NULL, 'Case de diseño minimalista con amplio espacio para componentes de alta gama.');

-- Disipador
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C022', 'Disipador', 'Cooler Master', 'Hyper 212 EVO', NULL, NULL, 'Disipador de calor de bajo perfil para CPU.'),
('C023', 'Disipador', 'Noctua', 'NH-D15', NULL, NULL, 'Disipador de doble torre con excelentes capacidades de enfriamiento.'),
('C024', 'Disipador', 'be quiet!', 'Dark Rock Pro 4', NULL, NULL, 'Disipador de alto rendimiento con diseño asimétrico y ventiladores silenciosos.');

-- Ventiladores
INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES 
('C025', 'Ventiladores', 'Corsair', 'AF120', NULL, NULL, 'Ventiladores de alto flujo de aire para una buena refrigeración.'),
('C026', 'Ventiladores', 'NZXT', 'AER RGB 2', NULL, NULL, 'Ventiladores de alta calidad con iluminación RGB personalizable.'),
('C027', 'Ventiladores', 'Noctua', 'NF-F12', NULL, NULL, 'Ventiladores de alta eficiencia y bajo ruido para un enfriamiento silencioso.');

-- Continúa con los demás componentes si es necesario...
