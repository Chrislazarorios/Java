-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2017 a las 20:29:28
-- Versión del servidor: 10.1.24-MariaDB
-- Versión de PHP: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `disqueria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `discos`
--

CREATE TABLE `discos` (
  `iddisco` tinyint(3) NOT NULL,
  `nombre` varchar(11) COLLATE latin1_spanish_ci NOT NULL,
  `precio` int(3) NOT NULL,
  `idgenero` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `discos`
--

INSERT INTO `discos` (`iddisco`, `nombre`, `precio`, `idgenero`) VALUES
(1, 'soda stereo', 999, 1),
(2, 'coldplay', 890, 1),
(3, 'avici', 500, 2),
(4, 'guetta', 550, 2),
(5, 'fonsi', 970, 3),
(6, 'ubago', 504, 3),
(7, 'metalica', 666, 1),
(8, 'mozart', 980, 4),
(9, 'beethoven', 979, 4),
(10, 'piazzolla', 958, 4),
(11, 'lindberg', 920, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generos`
--

CREATE TABLE `generos` (
  `idgenero` tinyint(3) NOT NULL,
  `genero` varchar(11) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `generos`
--

INSERT INTO `generos` (`idgenero`, `genero`) VALUES
(1, 'rock'),
(2, 'electronica'),
(3, 'latino'),
(4, 'clasica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `iddisco` tinyint(3) NOT NULL,
  `idventas` tinyint(3) NOT NULL,
  `fechaventa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`iddisco`, `idventas`, `fechaventa`) VALUES
(1, 1, '2017-11-01'),
(2, 2, '2017-11-02'),
(3, 3, '2017-11-03'),
(4, 4, '2017-11-04'),
(5, 5, '2017-11-05'),
(8, 6, '2017-11-01'),
(9, 7, '2017-11-03'),
(10, 8, '2017-11-04'),
(11, 9, '2017-11-05');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `discos`
--
ALTER TABLE `discos`
  ADD PRIMARY KEY (`iddisco`),
  ADD KEY `idgenero` (`idgenero`);

--
-- Indices de la tabla `generos`
--
ALTER TABLE `generos`
  ADD PRIMARY KEY (`idgenero`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`iddisco`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `discos`
--
ALTER TABLE `discos`
  MODIFY `iddisco` tinyint(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `generos`
--
ALTER TABLE `generos`
  MODIFY `idgenero` tinyint(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `iddisco` tinyint(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `discos`
--
ALTER TABLE `discos`
  ADD CONSTRAINT `discos_ibfk_1` FOREIGN KEY (`idgenero`) REFERENCES `generos` (`idgenero`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`iddisco`) REFERENCES `discos` (`iddisco`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
