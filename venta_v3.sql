-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2019 a las 03:28:50
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `venta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `descripcion`) VALUES
(1, 'ABARROTES'),
(2, 'FRUTAS Y VERDURAS'),
(4, 'CARNES AVES Y PESCADO'),
(5, 'CONGELADOS'),
(6, 'LACTEOS Y HUEVOS'),
(7, 'BEBIDAS CERVEZAS Y LICORES'),
(8, 'PANADERIA PASTELERIA Y COMIDAS'),
(9, 'CUIDADO DE BEBE'),
(10, 'JUGUETERIA'),
(11, 'LIMPIEZA'),
(12, 'MASCOTAS'),
(13, 'QUESOS Y FIAMBRES'),
(14, 'CUIDADO PERSONAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `Id` int(11) NOT NULL DEFAULT 0,
  `descripcion` varchar(150) DEFAULT NULL,
  `subcategoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`Id`, `descripcion`, `subcategoria`) VALUES
(1, 'Azúcar', 1),
(2, 'Endulzantes', 1),
(3, 'Pescados en conserva', 2),
(4, 'Naranjas y Mandarinas y Frutas Cítricas', 3),
(5, 'Tomate, Pepino, Pimiento y Rocoto', 4),
(6, 'Zapallo, Berenjena y Caigua', 4),
(7, 'Manzanas, Peras y Membrillos', 3),
(8, 'Melocotones, Duraznos, Ciruelas y Cerezas', 3),
(9, 'Papaya, Mango y Piña', 3),
(10, 'Plátanos y Uvas', 3),
(11, 'Sandía, Melón y Tuna', 3),
(12, 'Fresas, Arándanos, Aguaymanto y Frutas Berries', 3),
(13, 'Maracuyá, Granadilla y Tumbo', 3),
(14, 'Chirimoya, Lúcuma, Carambola y Frutas Exóticas', 3),
(15, 'Paltas', 3),
(16, 'Frutas Picadas y Preparadas', 3),
(17, 'Frutas Congeladas', 3),
(18, 'Cebolla, Limón, Ajo y Ají', 4),
(19, 'Zanahoria, Beterraga, Rabanito y Otras Raíces', 4),
(20, 'Papa, Camote, Yuca y Otros Tubérculos', 4),
(21, 'Brócoli, Coliflor y Alcachofa', 4),
(22, 'Apio, Espárrago y Otros Tallos', 4),
(23, 'Choclo, Arvejas, Vainitas, Habas y Otras Legumbres', 4),
(24, 'Lechuga, Espinaca y Hojas Verdes', 4),
(25, 'Hierbas e Infusiones', 4),
(26, 'Hongos y Setas', 4),
(27, 'Germinados', 4),
(28, 'Verduras Picadas y Preparadas', 4),
(29, 'Verduras Congeladas', 4),
(30, 'Carne Molida de Res', 5),
(31, 'Cortes de Res', 5),
(32, 'Menudencias de Res', 5),
(33, 'Elaborados de Res', 5),
(34, 'Congelado de res', 5),
(35, 'Lomo de Cerdo', 6),
(36, 'Chuletas y Costillas de Cerdo', 6),
(37, 'Otros Cortes de Cerdo', 6),
(38, 'Elaborados de Cerdo', 6),
(39, 'Pollo Entero y Trozado', 7),
(40, 'Pechuga de pollo', 7),
(41, 'Otros Cortes de Pollo', 7),
(42, 'Elaborados de Pollo', 7),
(43, 'Congelados de pollo', 7),
(44, 'Pavo Entero', 8),
(45, 'Cortes de Pavo', 8),
(46, 'Elaborados de Pavo', 8),
(47, 'Pescados frescos', 9),
(48, 'Pescados congelados', 9),
(49, 'Mariscos frescos', 10),
(50, 'Mariscos congelados', 10),
(51, 'Aceite vegetal', 21),
(52, 'Aceite vegetal', 21),
(53, 'Aceites especiales', 21),
(54, 'Arroz extra', 24),
(55, 'Arroz superior', 24),
(56, 'Arroz integral y especiales', 24),
(57, 'Frijol', 25),
(58, 'Lenteja', 25),
(59, 'Arveja', 25),
(60, 'Garbanzo', 25),
(61, 'Pallar', 25),
(62, 'Quinua', 25),
(63, 'Otras Menestras', 25),
(64, 'Fideos cortos', 22),
(65, 'Fideos chinos', 22),
(66, 'Pastas rellenas y para rellenar', 22),
(67, 'Salsas', 22),
(68, 'Purés', 26),
(69, 'Sopas', 26),
(70, 'Cremas', 26),
(71, 'Comidas listas', 26),
(72, 'Café', 27),
(73, 'Cereales', 27),
(74, 'Chocolate para taza', 27),
(75, 'Complementos alimenticios', 27),
(76, 'Modificadores de Leche', 27),
(77, 'Mermeladas y mieles', 27),
(78, 'Té e Infusiones', 27),
(79, 'Galletas Dulces', 28),
(80, 'Galletas saladas', 28),
(81, 'Chocolates', 28),
(82, 'Caramelos y Chupetes', 28),
(83, 'Gomitas y Gomas de Mascar', 28),
(84, 'Otras Golosinas', 28),
(85, 'Papas', 29),
(86, 'Camotes, chifles y yucas', 29),
(87, 'Piqueos mixtos', 29),
(88, 'Maíz', 29),
(89, 'Pretzels', 29),
(90, 'Maní, habas, pistachos y semillas', 29),
(91, 'Frutos secos', 29),
(92, 'Salsas y dips', 29),
(93, 'Frutas en conserva', 2),
(94, 'Aceitunas en conserva', 2),
(95, 'Verduras en conserva', 2),
(96, 'Legumbres en conserva', 2),
(97, 'Mariscos en conserva', 2),
(98, 'Otras Conservas', 2),
(99, 'Mayonesa', 30),
(100, 'Ketchup', 30),
(101, 'Mostaza', 30),
(102, 'Ají y rocoto', 30),
(103, 'Salsas de tomate', 30),
(104, 'Salsas especiales', 30),
(105, 'Sal', 30),
(106, 'Pimienta', 30),
(107, 'Otros condimentos', 30),
(108, 'Vinagre', 30),
(109, 'Sillao', 30),
(110, 'Aliños y vinagretas', 30),
(111, 'Agua de mesa', 31),
(112, 'Agua mineral', 31),
(113, 'Agua saborizada', 31),
(114, 'Agua tónica', 31),
(115, 'Jugos y Néctares', 32),
(116, 'Bebidas', 32),
(117, 'Refrescos Instantáneos', 32),
(119, 'Té Bebible', 33),
(120, 'Bebidas Rehidratantes', 34),
(121, 'Bebidas Energizantes', 34),
(122, 'Bebidas Nutricionales', 34),
(123, 'Cervezas Nacionales', 35),
(124, 'Cervezas Importadas', 35),
(125, 'Cervezas Artesanales', 35),
(126, 'Whisky', 36),
(127, 'Ron', 36),
(128, 'Vodka', 36),
(129, 'Pisco', 36),
(130, 'Gin', 36),
(131, 'Tequila', 36),
(132, 'Licores de Crema', 36),
(133, 'Otros Licores', 36),
(134, 'Licores Preparados', 36),
(135, 'Complementos de Licores', 36),
(136, 'Tabaco', 36),
(137, 'Vino Tinto', 37),
(138, 'Vino Blanco', 37),
(139, 'Vino Rosé', 37),
(140, 'Sangría', 37),
(141, 'Cava', 38),
(142, 'Champagne', 38),
(143, 'Otros Espumantes', 38);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `usuario` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`usuario`, `password`) VALUES
('carlos', '123456'),
('carmen', '123456'),
('jesus', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `precioAnt` double NOT NULL,
  `unid` varchar(2) NOT NULL,
  `clase` int(11) NOT NULL,
  `imagen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `precio`, `precioAnt`, `unid`, `clase`, `imagen`) VALUES
(1, 'AZUCAR RUBIA PERU LINDO BL 5KG', 11.9, 12.9, 'UN', 1, 'azucar.png'),
(2, 'AZUCAR BLANCA PERU LINDO BL 1K', 1.5, 1.8, 'UN', 1, 'azucar_blanca.jpg'),
(3, 'FILETE DE ATUN EN AGUA Y SAL / ACEITE VEGETAL FANNY LA x 170 g', 4.5, 4.89, 'LA', 3, 'atun.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoria`
--

CREATE TABLE `subcategoria` (
  `ID` int(11) NOT NULL,
  `DESCRIPCION` varchar(100) NOT NULL,
  `categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `subcategoria`
--

INSERT INTO `subcategoria` (`ID`, `DESCRIPCION`, `categoria`) VALUES
(5, 'Res', 4),
(6, 'Cerdo', 4),
(7, 'Pollo', 4),
(8, 'Pavo', 4),
(9, 'Pescados', 4),
(10, 'Mariscos', 4),
(11, 'Hamburguesas, Nuggets y Apanados', 5),
(12, 'Enrollados', 5),
(13, 'Masas, Pastas, Bocaditos y Salsas', 5),
(14, 'Huevos', 6),
(15, 'Leche', 6),
(16, 'Mantequilla y Margarina', 6),
(17, 'Yogurt', 6),
(18, 'Quesos', 13),
(19, 'Fiambres', 13),
(20, 'Embutidos', 13),
(21, 'Aceite', 1),
(22, 'Fideos y Pastas', 1),
(23, 'Confitería', 1),
(2, 'Conservas', 1),
(24, 'Arroz', 1),
(25, 'Menestras', 1),
(1, 'Azúcar y endulzantes', 1),
(26, 'Comidas instantáneas               ', 1),
(27, 'Desayunos', 1),
(28, 'Confitería', 1),
(29, 'Snacks y Piqueos', 1),
(30, 'Salsas, Cremas y Condimentos', 1),
(31, 'Aguas', 7),
(32, 'Jugos', 7),
(33, 'Te Bebible', 7),
(34, 'Gaseosas Bebidas Funcionales', 7),
(35, 'Cervezas', 7),
(36, 'Licores y Tabaco', 7),
(37, 'Vinos', 7),
(38, 'Espumantes', 7),
(39, 'Pan Envasado', 8),
(40, 'Pan de la Casa', 8),
(41, 'Tamales y Humitas', 8),
(42, 'Tortillas y Masas', 8),
(43, 'Tortas', 8),
(44, 'Postres', 8),
(45, 'Repostería', 8),
(46, 'Pañales y Toallitas Húmedas', 9),
(47, 'Cuidado y Aseo del Bebé', 9),
(48, 'Alimentos para Bebé', 9),
(49, 'Textil para Bebé', 9),
(50, 'Accesorios para Bebé', 9),
(51, 'Cuidado del Cabello', 14),
(52, 'Cuidado Bucal ', 14),
(53, 'Jabones y Perfumería', 14),
(54, 'Afeitado', 14),
(55, 'Cuidado de la Piel', 14),
(56, 'Protección Femenina', 14),
(57, 'Juguetes', 10),
(58, 'Bebé e Infantil', 10),
(59, 'Juegos de Mesa y Exterior', 10),
(60, 'Cuidado de la Ropa', 11),
(61, 'Limpieza de Baño', 11),
(62, 'Cuidado del Hogar', 11),
(63, 'Limpieza del Hogar', 11),
(64, 'Limpieza de Calzado', 11),
(65, 'Limpieza de Cocina', 11),
(66, 'Limpieza y cuidado de auto', 11),
(67, 'Perros', 12),
(68, 'Gatos', 12),
(3, 'Frutas', 2),
(4, 'Verduras', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
