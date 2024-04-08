-- DDL COMPONENTES:


CREATE TABLE motherboard(
	idm INT auto_increment PRIMARY KEY,
	marca VARCHAR(100),
	modelo VARCHAR(100),
	socket_procesador VARCHAR(100),
	chipset VARCHAR(50),
	formato VARCHAR(30),
	precio DECIMAL(10,2),
	cantidad int,
	obs TEXT
);


INSERT INTO motherboard (idm, marca, modelo, socket_procesador, chipset, formato, precio, cantidad)
VALUES
(0, 'ASUS', 'ROG Strix Z690-E Gaming WIFI', 'LGA1200', 'Z690', 'ATX', 3500.00, 20),
(0, 'ASUS', 'TUF Gaming B660-Plus WIFI', 'LGA1700', 'B660', 'ATX', 2500.00, 20),
(0, 'ASUS', 'Prime Z590-A', 'LGA1200', 'Z590', 'ATX', 3000.00, 20),
(0, 'ASUS', 'ROG Maximus XIII Hero', 'LGA1700', 'Z690', 'ATX', 4000.00, 20),
(0, 'ASUS', 'Prime H510M-A', 'LGA1200', 'H510', 'micro ATX', 2000.00, 20);

INSERT INTO motherboard (idm, marca, modelo, socket_procesador, chipset, formato, precio, cantidad)
VALUES
(0, 'Gigabyte', 'Z690 AORUS Ultra', 'LGA1700', 'Z690', 'ATX', 3800.00, 20),
(0, 'Gigabyte', 'B660 AORUS PRO AX DDR4', 'LGA1700', 'B660', 'ATX', 2600.00, 20),
(0, 'Gigabyte', 'Z590 AORUS Elite AX DDR4', 'LGA1200', 'Z590', 'ATX', 3200.00, 20),
(0, 'Gigabyte', 'B660M AORUS ELITE DDR4', 'LGA1700', 'B660', 'micro ATX', 2300.00, 20),
(0, 'Gigabyte', 'Z690 AORUS Master DDR4', 'LGA1700', 'Z690', 'ATX', 4200.00, 20);

INSERT INTO motherboard (idm, marca, modelo, socket_procesador, chipset, formato, precio, cantidad)
VALUES
(0, 'MSI', 'MPG Z690 GAMING CARBON WIFI', 'LGA1700', 'Z690', 'ATX', 3900.00, 20),
(0, 'MSI', 'MAG B660 TOMAHAWK DDR4', 'LGA1700', 'B660', 'ATX', 2700.00, 20),
(0, 'MSI', 'MEG Z690 GODLIKE DDR4', 'LGA1700', 'Z690', 'ATX', 4800.00, 20),
(0, 'MSI', 'MAG B660M MORTAR WIFI DDR4', 'LGA1700', 'B660', 'micro ATX', 2400.00, 20),
(0, 'MSI', 'MPG Z590 GAMING EDGE WIFI', 'LGA1200', 'Z590', 'ATX', 3300.00, 20);

SELECT DISTINCT marca FROM motherboard;








