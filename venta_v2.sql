-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2019 a las 03:43:38
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
(12, 'MASCOTAS');

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
(1, 'Azucar', 1),
(2, 'Endulzante', 1),
(3, 'Pescado en conserva', 2),
(4, 'Naranjas, Mandarinas y Frutas citricas', 3),
(5, 'Tomate, Pepino, Pimiento y Rocoto', 4),
(6, 'Zapallo, Berenjena y Caigua', 4);

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
(3, 'FILETE DE ATUN EN AGUA Y SAL / ACEITE VEGETAL FANNY LA x 170 g', 4.5, 4.89, 'LA', 3, 'atun.png');

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
(1, 'Azucar y Endulzante', 1),
(2, 'Conserva', 1),
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
