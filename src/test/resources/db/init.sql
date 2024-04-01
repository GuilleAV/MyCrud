CREATE DATABASE IF NOT EXISTS `database`;

USE `database`;

CREATE TABLE IF NOT EXISTS `products` (
    `code` INT PRIMARY KEY AUTO_INCREMENT,
    `barcode` VARCHAR(20),
    `description` VARCHAR(200)
);

INSERT INTO `products` (`barcode`, `description`) VALUES
('12345678901234567890', 'Llave combinada 3/8'),
('23456789012345678901', 'Llave regulable grande'),
('34567890123456789012', 'Destornillador');
