use bd_sistema_ventas;

INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario)
VALUES
-- Placa Base (Motherboard)
('Placa Base (Motherboard)', 'ASUS', 'ROG STRIX B550-F GAMING', NULL, NULL, 199.99, NULL, 50, 'Disponible', NULL, 'Placa base ASUS ROG STRIX B550-F GAMING con chipset B550 para procesadores AMD Ryzen.', 7, 1),
('Placa Base (Motherboard)', 'GIGABYTE', 'B450 AORUS ELITE', NULL, NULL, 129.99, NULL, 30, 'Disponible', NULL, 'Placa base GIGABYTE B450 AORUS ELITE con chipset B450 para procesadores AMD Ryzen.', 8, 1),
('Placa Base (Motherboard)', 'MSI', 'MAG B460M BAZOOKA', NULL, NULL, 89.99, NULL, 20, 'Disponible', NULL, 'Placa base MSI MAG B460M BAZOOKA con chipset B460 para procesadores Intel Core.', 9, 1),
('Placa Base (Motherboard)', 'ASRock', 'H470M-ITX/ac', NULL, NULL, 119.99, NULL, 15, 'Disponible', NULL, 'Placa base ASRock H470M-ITX/ac con chipset H470 para procesadores Intel Core.', 7, 1),
('Placa Base (Motherboard)', 'Biostar', 'TA320-BTC', NULL, NULL, 59.99, NULL, 25, 'Disponible', NULL, 'Placa base Biostar TA320-BTC con chipset A320 para procesadores AMD Ryzen.', 8, 1),
-- Procesador (CPU)
('Procesador (CPU)', 'AMD', 'Ryzen 9 5900X', NULL, '4.8 GHz', 549.99, NULL, 20, 'Disponible', NULL, 'Procesador AMD Ryzen 9 5900X de 12 núcleos y 24 hilos con velocidad de hasta 4.8 GHz.', 9, 1),
('Procesador (CPU)', 'Intel', 'Core i7-10700K', NULL, '5.1 GHz', 379.99, NULL, 30, 'Disponible', NULL, 'Procesador Intel Core i7-10700K de 8 núcleos y 16 hilos con velocidad de hasta 5.1 GHz.', 8, 1),
('Procesador (CPU)', 'AMD', 'Ryzen 5 5600X', NULL, '4.6 GHz', 299.99, NULL, 25, 'Disponible', NULL, 'Procesador AMD Ryzen 5 5600X de 6 núcleos y 12 hilos con velocidad de hasta 4.6 GHz.', 7, 1),
('Procesador (CPU)', 'Intel', 'Core i5-11600K', NULL, '4.9 GHz', 269.99, NULL, 35, 'Disponible', NULL, 'Procesador Intel Core i5-11600K de 6 núcleos y 12 hilos con velocidad de hasta 4.9 GHz.', 8, 1),
('Procesador (CPU)', 'AMD', 'Ryzen 3 3300X', NULL, '4.3 GHz', 149.99, NULL, 40, 'Disponible', NULL, 'Procesador AMD Ryzen 3 3300X de 4 núcleos y 8 hilos con velocidad de hasta 4.3 GHz.', 7, 1),
-- Memoria RAM
('Memoria RAM', 'Corsair', 'Vengeance LPX 16GB', '16 GB', 'DDR4 3200 MHz', 79.99, NULL, 100, 'Disponible', NULL, 'Kit de memoria RAM Corsair Vengeance LPX de 16 GB (2 x 8GB) DDR4 3200 MHz.', 9, 1),
('Memoria RAM', 'Crucial', 'Ballistix RGB 32GB', '32 GB', 'DDR4 3600 MHz', 139.99, NULL, 80, 'Disponible', NULL, 'Kit de memoria RAM Crucial Ballistix RGB de 32 GB (2 x 16GB) DDR4 3600 MHz.', 8, 1),
('Memoria RAM', 'G.SKILL', 'Trident Z Neo 64GB', '64 GB', 'DDR4 4000 MHz', 299.99, NULL, 60, 'Disponible', NULL, 'Kit de memoria RAM G.SKILL Trident Z Neo de 64 GB (4 x 16GB) DDR4 4000 MHz.', 8, 1),
('Memoria RAM', 'Kingston', 'HyperX Fury 8GB', '8 GB', 'DDR4 2666 MHz', 39.99, NULL, 120, 'Disponible', NULL, 'Kit de memoria RAM Kingston HyperX Fury de 8 GB (1 x 8GB) DDR4 2666 MHz.', 9, 1),
('Memoria RAM', 'TeamGroup', 'T-Force Delta RGB 16GB', '16 GB', 'DDR4 3000 MHz', 69.99, NULL, 90, 'Disponible', NULL, 'Kit de memoria RAM TeamGroup T-Force Delta RGB de 16 GB (2 x 8GB) DDR4 3000 MHz.', 7, 1),
-- Almacenamiento (HDD)
('Almacenamiento (HDD)', 'Seagate', 'BarraCuda 2TB', '2 TB', '7200 RPM', 59.99, NULL, 50, 'Disponible', NULL, 'Disco duro Seagate BarraCuda de 2 TB para almacenamiento de datos.', 8, 1),
('Almacenamiento (HDD)', 'Western Digital', 'Blue 4TB', '4 TB', '5400 RPM', 99.99, NULL, 40, 'Disponible', NULL, 'Disco duro Western Digital Blue de 4 TB para almacenamiento de datos.', 7, 1),
('Almacenamiento (HDD)', 'Toshiba', 'P300 1TB', '1 TB', '7200 RPM', 44.99, NULL, 60, 'Disponible', NULL, 'Disco duro Toshiba P300 de 1 TB para almacenamiento de datos.', 7, 1),
('Almacenamiento (HDD)', 'Seagate', 'FireCuda 2TB', '2 TB', '7200 RPM', 89.99, NULL, 45, 'Disponible', NULL, 'Disco duro híbrido Seagate FireCuda de 2 TB para almacenamiento de datos.', 8, 1),
('Almacenamiento (HDD)', 'Western Digital', 'Black 6TB', '6 TB', '7200 RPM', 169.99, NULL, 35, 'Disponible', NULL, 'Disco duro Western Digital Black de 6 TB para almacenamiento de datos.', 9, 1);
INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario) VALUES
('Almacenamiento (SSD)', 'Samsung', '970 EVO Plus 1TB', '1 TB', 'NVMe M.2 - NVMe PCIe Gen3 x4', 149.99, NULL, 70, 'Disponible', NULL, 'Disco de estado sólido Samsung 970 EVO Plus de 1 TB para almacenamiento de datos.', 9, 1),
('Almacenamiento (SSD)', 'Crucial', 'MX500 500GB', '500 GB', 'SATA SSD - 500 MB/s a 600 MB/s', 59.99, NULL, 80, 'Disponible', NULL, 'Disco de estado sólido Crucial MX500 de 500 GB para almacenamiento de datos.', 9, 1),
('Almacenamiento (SSD)', 'ADATA', 'XPG SX8200 Pro 2TB', '2 TB', 'NVMe M.2 - NVMe PCIe Gen4 x4', 249.99, NULL, 60, 'Disponible', NULL, 'Disco de estado sólido ADATA XPG SX8200 Pro de 2 TB para almacenamiento de datos.', 8, 1),
('Almacenamiento (SSD)', 'Western Digital', 'Blue SN550 1TB', '1 TB', 'NVMe M.2 - NVMe PCIe Gen3 x4', 109.99, NULL, 90, 'Disponible', NULL, 'Disco de estado sólido Western Digital Blue SN550 de 1 TB para almacenamiento de datos.', 7, 1),
('Almacenamiento (SSD)', 'Kingston', 'A2000 500GB', '500 GB', 'SATA SSD - 500 MB/s a 600 MB/s', 69.99, NULL, 100, 'Disponible', NULL, 'Disco de estado sólido Kingston A2000 de 500 GB para almacenamiento de datos.', 8, 1);

INSERT INTO tb_componente (componente, marca, modelo, capacidad, velocidad, precioUnitario, precioTotal, cantidad, disponibilidad, imagen, descripcion, idProveedor, idUsuario) VALUES
-- Tarjeta grafica (GPU)
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce RTX 3080', NULL, NULL, 699.99, NULL, 25, 'Disponible', NULL, 'Tarjeta gráfica NVIDIA GeForce RTX 3080 para gaming de alta gama.', 8, 1),
('Tarjeta grafica (GPU)', 'AMD', 'Radeon RX 6900 XT', NULL, NULL, 999.99, NULL, 15, 'Disponible', NULL, 'Tarjeta gráfica AMD Radeon RX 6900 XT para gaming de alta gama.', 8, 1),
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce GTX 1660 Ti', NULL, NULL, 279.99, NULL, 30, 'Disponible', NULL, 'Tarjeta gráfica NVIDIA GeForce GTX 1660 Ti para gaming de gama media.', 8, 1),
('Tarjeta grafica (GPU)', 'AMD', 'Radeon RX 6700 XT', NULL, NULL, 479.99, NULL, 20, 'Disponible', NULL, 'Tarjeta gráfica AMD Radeon RX 6700 XT para gaming de gama alta.', 7, 1),
('Tarjeta grafica (GPU)', 'NVIDIA', 'GeForce RTX 3060', NULL, NULL, 329.99, NULL, 35, 'Disponible', NULL, 'Tarjeta gráfica NVIDIA GeForce RTX 3060 para gaming de gama media.', 9, 1),
-- Fuente Alimentacion
('Fuente Alimentacion', 'EVGA', 'SuperNOVA 750 G3', NULL, NULL, 119.99, NULL, 40, 'Disponible', NULL, 'Fuente de alimentación EVGA SuperNOVA 750 G3 de 750W con certificación 80 Plus Gold.', 9, 1),
('Fuente Alimentacion', 'Corsair', 'RM750x', NULL, NULL, 129.99, NULL, 35, 'Disponible', NULL, 'Fuente de alimentación Corsair RM750x de 750W con certificación 80 Plus Gold.', 9, 1),
('Fuente Alimentacion', 'Seasonic', 'Focus GX-650', NULL, NULL, 99.99, NULL, 50, 'Disponible', NULL, 'Fuente de alimentación Seasonic Focus GX-650 de 650W con certificación 80 Plus Gold.', 9, 1),
('Fuente Alimentacion', 'Thermaltake', 'Smart RGB 600W', NULL, NULL, 64.99, NULL, 60, 'Disponible', NULL, 'Fuente de alimentación Thermaltake Smart RGB de 600W con iluminación RGB.', 7, 1),
('Fuente Alimentacion', 'Cooler Master', 'MWE Gold 750W', NULL, NULL, 109.99, NULL, 45, 'Disponible', NULL, 'Fuente de alimentación Cooler Master MWE Gold 750W con certificación 80 Plus Gold.', 8, 1),
-- Monitor
('Monitor', 'ASUS', 'VG248QE', NULL, NULL, 199.99, NULL, 30, 'Disponible', NULL, 'Monitor ASUS VG248QE de 24" con resolución 1080p y frecuencia de actualización de 144Hz.', 9, 1),
('Monitor', 'Acer', 'Predator XB271HU', NULL, NULL, 599.99, NULL, 20, 'Disponible', NULL, 'Monitor Acer Predator XB271HU de 27" con resolución 1440p y frecuencia de actualización de 144Hz.', 8, 1),
('Monitor', 'LG', '27GL850-B', NULL, NULL, 449.99, NULL, 25, 'Disponible', NULL, 'Monitor LG 27GL850-B de 27" con resolución 1440p y frecuencia de actualización de 144Hz.', 7, 1),
('Monitor', 'Dell', 'S2719DGF', NULL, NULL, 369.99, NULL, 35, 'Disponible', NULL, 'Monitor Dell S2719DGF de 27" con resolución 1440p y frecuencia de actualización de 155Hz.', 8, 1),
('Monitor', 'Samsung', 'LC27F396FHUXEN', NULL, NULL, 169.99, NULL, 40, 'Disponible', NULL, 'Monitor Samsung LC27F396FHUXEN de 27" con resolución 1080p y curvatura 1800R.', 7, 1),
-- Case
('Case', 'NZXT', 'H510', NULL, NULL, 69.99, NULL, 50, 'Disponible', NULL, 'Case NZXT H510 compacto de tamaño medio con panel lateral de vidrio templado.', 7, 1),
('Case', 'Corsair', 'iCUE 4000X RGB', NULL, NULL, 129.99, NULL, 30, 'Disponible', NULL, 'Case Corsair iCUE 4000X RGB de tamaño medio con iluminación RGB y panel lateral de vidrio templado.', 9, 1),
('Case', 'Phanteks', 'Eclipse P400A', NULL, NULL, 89.99, NULL, 40, 'Disponible', NULL, 'Case Phanteks Eclipse P400A de tamaño medio con panel frontal de malla para un mejor flujo de aire.', 8, 1),
('Case', 'Fractal Design', 'Meshify C', NULL, NULL, 99.99, NULL, 35, 'Disponible', NULL, 'Case Fractal Design Meshify C compacto con panel frontal de malla para una mejor ventilación.', 7, 1),
('Case', 'Cooler Master', 'MasterBox MB511', NULL, NULL, 59.99, NULL, 45, 'Disponible', NULL, 'Case Cooler Master MasterBox MB511 de tamaño medio con panel lateral de acrílico.', 9, 1),
-- Disipador
('Disipador', 'Noctua', 'NH-D15', NULL, NULL, 89.99, NULL, 25, 'Disponible', NULL, 'Disipador Noctua NH-D15 de doble torre con dos ventiladores de 140mm para una refrigeración eficiente.', 7, 1),
('Disipador', 'Cooler Master', 'Hyper 212 RGB Black Edition', NULL, NULL, 44.99, NULL, 35, 'Disponible', NULL, 'Disipador Cooler Master Hyper 212 RGB Black Edition con iluminación RGB y diseño de torre única.', 8, 1),
('Disipador', 'be quiet!', 'Dark Rock Pro 4', NULL, NULL, 89.99, NULL, 30, 'Disponible', NULL, 'Disipador be quiet! Dark Rock Pro 4 de doble torre con dos ventiladores Silent Wings para un rendimiento silencioso.', 9, 1),
('Disipador', 'ARCTIC', 'Freezer 34 eSports DUO', NULL, NULL, 49.99, NULL, 40, 'Disponible', NULL, 'Disipador ARCTIC Freezer 34 eSports DUO con dos ventiladores de 120mm y diseño asimétrico para un rendimiento eficiente.', 9, 1),
('Disipador', 'Scythe', 'Mugen 5 Rev.B', NULL, NULL, 47.99, NULL, 45, 'Disponible', NULL, 'Disipador Scythe Mugen 5 Rev.B con ventilador de 120mm y diseño de torre única para una refrigeración efectiva.', 8, 1),
-- Ventiladores
('Ventiladores', 'Corsair', 'LL120 RGB', NULL, NULL, 39.99, NULL, 60, 'Disponible', NULL, 'Kit de ventiladores Corsair LL120 RGB de 120mm con iluminación RGB para una refrigeración personalizable.', 9, 1),
('Ventiladores', 'NZXT', 'AER RGB 2', NULL, NULL, 29.99, NULL, 70, 'Disponible', NULL, 'Kit de ventiladores NZXT AER RGB 2 de 120mm con iluminación RGB y diseño optimizado para un flujo de aire mejorado.', 8, 1),
('Ventiladores', 'ARCTIC', 'P12 PWM PST', NULL, NULL, 12.99, NULL, 80, 'Disponible', NULL, 'Ventilador ARCTIC P12 PWM PST de 120mm con control PWM y tecnología de compartición de señal para un funcionamiento silencioso.', 7, 1),
('Ventiladores', 'be quiet!', 'Silent Wings 3', NULL, NULL, 24.99, NULL, 50, 'Disponible', NULL, 'Ventilador be quiet! Silent Wings 3 de 140mm con diseño de aspa optimizado para un funcionamiento silencioso.', 9, 1),
('Ventiladores', 'Thermaltake', 'Riing 12 RGB', NULL, NULL, 29.99, NULL, 65, 'Disponible', NULL, 'Kit de ventiladores Thermaltake Riing 12 RGB de 120mm con iluminación RGB y aspas de compresión para un flujo de aire concentrado.', 8, 1);

UPDATE tb_componente SET precioTotal = precioUnitario * cantidad;

SELECT * FROM tb_componente;