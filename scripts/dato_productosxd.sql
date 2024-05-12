INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES ('C001', 'Tarjeta de Video', 'Nvidia', 'RTX 3080', '8GB', '2000MHz', 'Tarjeta gráfica de alta gama para gaming.');

INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES ('C002', 'Procesador', 'Intel', 'Core i9-10900K', '10 núcleos', '3.7GHz', 'Procesador de alto rendimiento para tareas exigentes.');

INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES ('C003', 'Memoria RAM', 'Corsair', 'Vengeance RGB Pro', '16GB', '3200MHz', 'Módulo de memoria RAM DDR4 con iluminación RGB.');

INSERT INTO tb_componente (claveComponente, nombre, marca, modelo, capacidad, velocidad, descripcion)
VALUES ('C004', 'Disco Duro', 'Samsung', '970 EVO Plus', '1TB', '3500MB/s', 'Unidad de almacenamiento SSD NVMe de alta velocidad.');

INSERT INTO tb_laptop (claveLaptop, nombre, marca, modelo, procesador, memoriaRam, almacenamiento, conectividad, tarjetaGrafica, pantalla, bateria, descripcion)
VALUES ('L001', 'Laptop Gaming', 'MSI', 'GS66 Stealth', 'Intel Core i7-10750H', '16GB DDR4', '1TB SSD', 'WiFi 6, Bluetooth 5.1', 'Nvidia GeForce RTX 3070', '15.6" Full HD 240Hz', '99.9Wh', 'Laptop de alto rendimiento para juegos.');

INSERT INTO tb_laptop (claveLaptop, nombre, marca, modelo, procesador, memoriaRam, almacenamiento, conectividad, tarjetaGrafica, pantalla, bateria, descripcion)
VALUES ('L002', 'Laptop Ultrabook', 'Dell', 'XPS 13', 'Intel Core i5-1135G7', '8GB LPDDR4x', '512GB PCIe SSD', 'WiFi 6, Bluetooth 5.1', 'Intel Iris Xe Graphics', '13.4" 4K InfinityEdge', '52Wh', 'Laptop ligera y potente para trabajo y entretenimiento.');

INSERT INTO tb_laptop (claveLaptop, nombre, marca, modelo, procesador, memoriaRam, almacenamiento, conectividad, tarjetaGrafica, pantalla, bateria, descripcion)
VALUES ('L003', 'Laptop Convertible', 'HP', 'Spectre x360', 'Intel Core i7-1165G7', '16GB DDR4', '1TB PCIe SSD', 'WiFi 6, Bluetooth 5.0', 'Intel Iris Xe Graphics', '13.3" Full HD Touch', '60Wh', 'Laptop versátil con pantalla táctil convertible.');

INSERT INTO tb_accesorios (claveAccesorio, nombre, marca, modelo, descripcion)
VALUES ('A001', 'Mouse Gaming', 'Logitech', 'G502 Hero', 'Mouse con sensor óptico de alta precisión para gaming.');

INSERT INTO tb_accesorios (claveAccesorio, nombre, marca, modelo, descripcion)
VALUES ('A002', 'Teclado Mecánico', 'Razer', 'BlackWidow Elite', 'Teclado mecánico con retroiluminación RGB personalizable.');

INSERT INTO tb_accesorios (claveAccesorio, nombre, marca, modelo, descripcion)
VALUES ('A003', 'Auriculares Inalámbricos', 'Sony', 'WH-1000XM4', 'Auriculares con cancelación de ruido y sonido de alta resolución.');

INSERT INTO tb_computadora (claveComputadora, nombre, procesador, placaMadre, memoriaRam, almacenamiento, tarjetaGrafica, fuente, ccase, monitor, disipadores, ventiladores, precioReal, descripcion)
VALUES ('PC001', 'PC Gamer', 'AMD Ryzen 9 5900X', 'ASUS ROG Strix X570-E', '32GB DDR4', '1TB NVMe SSD, 2TB HDD', 'Nvidia GeForce RTX 3080', 'Seasonic Prime TX-1000', 'NZXT H510i', '27" QHD 144Hz', 'NZXT Kraken X73', 'NZXT Aer RGB', 2499.99, 'PC de alto rendimiento para juegos.');

INSERT INTO tb_computadora (claveComputadora, nombre, procesador, placaMadre, memoriaRam, almacenamiento, tarjetaGrafica, fuente, ccase, monitor, disipadores, ventiladores, precioReal, descripcion)
VALUES ('PC002', 'PC Workstation', 'Intel Xeon W-2295', 'GIGABYTE C621 AORUS XTREME', '64GB ECC DDR4', '2TB NVMe SSD, 4TB HDD', 'Nvidia Quadro RTX 8000', 'EVGA SuperNOVA 1600 T2', 'Fractal Design Define 7 XL', '32" 4K HDR', 'Noctua NH-D15', 'Noctua NF-A14', 5999.99, 'Estación de trabajo profesional para diseño y renderización.');

INSERT INTO tb_computadora (claveComputadora, nombre, procesador, placaMadre, memoriaRam, almacenamiento, tarjetaGrafica, fuente, ccase, monitor, disipadores, ventiladores, precioReal, descripcion)
VALUES ('PC003', 'PC Todo en Uno', 'Intel Core i7-10700', 'ASUS ProArt StudioBook One', '16GB DDR4', '512GB PCIe SSD', 'Nvidia GeForce RTX 2060', 'Dell 200W AC Adapter', 'Dell OptiPlex 7780 AIO', '27" 4K UHD Touch', 'N/A', 'N/A', 1999.99, 'PC compacta con monitor integrado para espacios reducidos.');

