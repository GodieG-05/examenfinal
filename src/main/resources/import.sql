USE examen;

INSERT INTO customer (idcostumer, namecostumer, lastnamecostumer, codecitycostumer, emailcostumer, birthdate, lon, latitud)
VALUES 
('CUST001', 'Ana', 'Martínez', 'CTY01', 'ana.martinez@example.com', '1985-03-25', -58.3816, -34.6037),
('CUST002', 'Luis', 'García', 'CTY02', 'luis.garcia@example.com', '1990-07-15', -0.1276, 51.5074),
('CUST003', 'María', 'Rodríguez', 'CTY03', 'maria.rodriguez@example.com', '1982-11-30', 2.3522, 48.8566),
('CUST004', 'Juan', 'Pérez', 'CTY01', 'juan.perez@example.com', '1995-01-12', -74.0060, 40.7128),
('CUST005', 'Laura', 'González', 'CTY04', 'laura.gonzalez@example.com', '1988-06-22', 139.6917, 35.6895);

INSERT INTO city (codecity, namecity, codereg)
VALUES 
('CTY01', 'Buenos Aires', 'REG01'),
('CTY02', 'Londres', 'REG02'),
('CTY03', 'París', 'REG03'),
('CTY04', 'Tokio', 'REG04'),
('CTY05', 'Nueva York', 'REG01');

INSERT INTO region (codereg, namereg, codecountry)
VALUES 
('REG01', 'Noroeste', 'USA'),
('REG02', 'Nordeste', 'USA'),
('REG03', 'Buenos Aires', 'ARG'),
('REG04', 'Provence-Alpes-Côte d\'Azur', 'FRA'),
('REG05', 'Kanto', 'JPN');

INSERT INTO country (codecountry, namecountry)
VALUES 
('USA', 'United States'),
('ARG', 'Argentina'),
('FRA', 'France'),
('JPN', 'Japan'),
('CAN', 'Canada');
