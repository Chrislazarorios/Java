-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2017 a las 20:14:42
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
-- Base de datos: `centroeducativo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `DNI` int(8) NOT NULL,
  `ID_curso` int(3) NOT NULL,
  `Legajo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`DNI`, `ID_curso`, `Legajo`) VALUES
(12345678, 1, 1),
(12345679, 2, 2),
(34561290, 2, 3),
(45672389, 2, 4),
(23456712, 3, 5),
(45671234, 3, 6),
(23891278, 3, 7),
(56123478, 2, 9),
(34129078, 2, 10),
(78123456, 1, 11),
(23456178, 3, 12),
(9345672, 3, 13),
(56234519, 3, 14),
(4567129, 3, 15),
(34891234, 4, 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aulas`
--

CREATE TABLE `aulas` (
  `ID_aula` tinyint(3) UNSIGNED NOT NULL,
  `Capacidad` tinyint(3) UNSIGNED NOT NULL,
  `Carga` tinyint(2) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `aulas`
--

INSERT INTO `aulas` (`ID_aula`, `Capacidad`, `Carga`) VALUES
(1, 8, 2),
(2, 4, 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `consulta_alumno`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `consulta_alumno` (
`DNI` int(8)
,`Nombre` varchar(20)
,`Apellido` varchar(20)
,`ID_curso` int(3)
,`Legajo` int(11)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `consulta_profe`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `consulta_profe` (
`DNI` int(8)
,`Nombre` varchar(20)
,`Apellido` varchar(20)
,`ID_curso` int(11)
,`ID_legajo` int(11)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `ID_curso` int(3) NOT NULL,
  `Horario` tinyint(2) UNSIGNED NOT NULL,
  `Dia` char(2) COLLATE latin1_spanish_ci NOT NULL,
  `Inicia` date NOT NULL,
  `ID_aula` tinyint(3) UNSIGNED NOT NULL,
  `Vacante` tinyint(2) UNSIGNED NOT NULL,
  `id_materia` tinyint(3) UNSIGNED NOT NULL,
  `asignado` char(1) COLLATE latin1_spanish_ci NOT NULL DEFAULT 'n'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`ID_curso`, `Horario`, `Dia`, `Inicia`, `ID_aula`, `Vacante`, `id_materia`, `asignado`) VALUES
(1, 14, 'lu', '2017-10-30', 1, 6, 1, 's'),
(2, 15, 'MA', '2017-10-31', 2, 0, 2, 's'),
(3, 16, 'Ju', '2017-10-05', 1, 0, 3, 's'),
(4, 14, 'MA', '2017-11-14', 2, 3, 1, 'n'),
(5, 11, 'LU', '2017-11-13', 1, 8, 3, 's');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `cursos_alumnos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `cursos_alumnos` (
`ID_curso` int(3)
,`Dia` char(2)
,`Horario` tinyint(2) unsigned
,`hora_fin` int(4) unsigned
,`Inicia` date
,`finaliza` date
,`materia` varchar(20)
,`Duracion` tinyint(3) unsigned
,`DNI` int(8)
,`Nombre` varchar(20)
,`Apellido` varchar(20)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `cursos_completo`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `cursos_completo` (
`ID_curso` int(3)
,`Dia` char(2)
,`Horario` tinyint(2) unsigned
,`hora_fin` int(4) unsigned
,`Inicia` date
,`finaliza` date
,`Nombre` varchar(20)
,`Duracion` tinyint(3) unsigned
,`Vacante` tinyint(2) unsigned
,`asignado` char(1)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `ID_materia` tinyint(3) UNSIGNED NOT NULL,
  `Nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `Duracion` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`ID_materia`, `Nombre`, `Duracion`) VALUES
(1, 'Java', 100),
(2, 'C#', 110),
(3, 'Python', 80);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `DNI` int(8) NOT NULL,
  `Nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `Apellido` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `Condicion` char(1) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`DNI`, `Nombre`, `Apellido`, `Condicion`) VALUES
(4567129, 'Juan', 'Peres', 'A'),
(9345672, 'Maria', 'Kodama', 'A'),
(12345678, 'Juan', 'Alonso', 'A'),
(12345679, 'Pedro', 'Picapiedra', 'A'),
(23456178, 'Juan', 'Gonzalez', 'A'),
(23456712, 'Maria', 'Kodama', 'A'),
(23891278, 'Ana', 'Perez', 'A'),
(34126718, 'Pepito', 'Marrone', 'P'),
(34129078, 'Mario', 'Lopes', 'A'),
(34561290, 'Jose Luis', 'herrera', 'A'),
(34891234, 'Luis', 'Varquez', 'A'),
(36798543, 'Juan', 'Acevedo', 'P'),
(45671234, 'Horacio', 'Maura', 'A'),
(45672389, 'Julio', 'Montez', 'A'),
(46573245, 'Perla', 'Antunez', 'P'),
(56123478, 'Juan', 'Campos', 'A'),
(56234519, 'Julia', 'Martinez', 'A'),
(78123456, 'Laura', 'Alonso', 'A'),
(98765432, 'Luis', 'Gonzalez', 'P');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `DNI` int(8) NOT NULL,
  `ID_curso` int(11) NOT NULL,
  `ID_legajo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`DNI`, `ID_curso`, `ID_legajo`) VALUES
(98765432, 2, 1),
(36798543, 3, 2),
(46573245, 1, 3),
(34126718, 5, 4);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `profe_curso`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `profe_curso` (
`Nombre` varchar(20)
,`Apellido` varchar(20)
,`ID_curso` int(11)
,`materia` varchar(20)
,`Dia` char(2)
,`Horario` tinyint(2) unsigned
);

-- --------------------------------------------------------

--
-- Estructura para la vista `consulta_alumno`
--
DROP TABLE IF EXISTS `consulta_alumno`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `consulta_alumno`  AS  select `alumnos`.`DNI` AS `DNI`,`personas`.`Nombre` AS `Nombre`,`personas`.`Apellido` AS `Apellido`,`alumnos`.`ID_curso` AS `ID_curso`,`alumnos`.`Legajo` AS `Legajo` from (`personas` join `alumnos`) where (`alumnos`.`DNI` = `personas`.`DNI`) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `consulta_profe`
--
DROP TABLE IF EXISTS `consulta_profe`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `consulta_profe`  AS  select `profesores`.`DNI` AS `DNI`,`personas`.`Nombre` AS `Nombre`,`personas`.`Apellido` AS `Apellido`,`profesores`.`ID_curso` AS `ID_curso`,`profesores`.`ID_legajo` AS `ID_legajo` from (`personas` join `profesores`) where (`profesores`.`DNI` = `personas`.`DNI`) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `cursos_alumnos`
--
DROP TABLE IF EXISTS `cursos_alumnos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `cursos_alumnos`  AS  select `cursos_completo`.`ID_curso` AS `ID_curso`,`cursos_completo`.`Dia` AS `Dia`,`cursos_completo`.`Horario` AS `Horario`,`cursos_completo`.`hora_fin` AS `hora_fin`,`cursos_completo`.`Inicia` AS `Inicia`,`cursos_completo`.`finaliza` AS `finaliza`,`cursos_completo`.`Nombre` AS `materia`,`cursos_completo`.`Duracion` AS `Duracion`,`consulta_alumno`.`DNI` AS `DNI`,`consulta_alumno`.`Nombre` AS `Nombre`,`consulta_alumno`.`Apellido` AS `Apellido` from (`cursos_completo` join `consulta_alumno`) where (`cursos_completo`.`ID_curso` = `consulta_alumno`.`ID_curso`) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `cursos_completo`
--
DROP TABLE IF EXISTS `cursos_completo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `cursos_completo`  AS  select `cursos`.`ID_curso` AS `ID_curso`,`cursos`.`Dia` AS `Dia`,`cursos`.`Horario` AS `Horario`,(`cursos`.`Horario` + 3) AS `hora_fin`,`cursos`.`Inicia` AS `Inicia`,(`cursos`.`Inicia` + interval (`materias`.`Duracion` * 7) day) AS `finaliza`,`materias`.`Nombre` AS `Nombre`,`materias`.`Duracion` AS `Duracion`,`cursos`.`Vacante` AS `Vacante`,`cursos`.`asignado` AS `asignado` from (`cursos` join `materias`) where (`cursos`.`id_materia` = `materias`.`ID_materia`) order by `cursos`.`Inicia`,`cursos`.`Horario` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `profe_curso`
--
DROP TABLE IF EXISTS `profe_curso`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `profe_curso`  AS  select `consulta_profe`.`Nombre` AS `Nombre`,`consulta_profe`.`Apellido` AS `Apellido`,`consulta_profe`.`ID_curso` AS `ID_curso`,`cursos_completo`.`Nombre` AS `materia`,`cursos_completo`.`Dia` AS `Dia`,`cursos_completo`.`Horario` AS `Horario` from (`consulta_profe` join `cursos_completo`) where (`consulta_profe`.`ID_curso` = `cursos_completo`.`ID_curso`) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`Legajo`),
  ADD KEY `DNI` (`DNI`),
  ADD KEY `ID_curso` (`ID_curso`);

--
-- Indices de la tabla `aulas`
--
ALTER TABLE `aulas`
  ADD PRIMARY KEY (`ID_aula`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`ID_curso`),
  ADD KEY `id_materia` (`id_materia`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`ID_materia`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`ID_legajo`),
  ADD KEY `DNI` (`DNI`),
  ADD KEY `ID_curso` (`ID_curso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `Legajo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT de la tabla `aulas`
--
ALTER TABLE `aulas`
  MODIFY `ID_aula` tinyint(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `ID_curso` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `ID_materia` tinyint(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `ID_legajo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`DNI`) REFERENCES `personas` (`DNI`),
  ADD CONSTRAINT `alumnos_ibfk_2` FOREIGN KEY (`ID_curso`) REFERENCES `cursos` (`ID_curso`);

--
-- Filtros para la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD CONSTRAINT `cursos_ibfk_1` FOREIGN KEY (`id_materia`) REFERENCES `materias` (`ID_materia`),
  ADD CONSTRAINT `cursos_ibfk_2` FOREIGN KEY (`id_materia`) REFERENCES `materias` (`ID_materia`);

--
-- Filtros para la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD CONSTRAINT `profesores_ibfk_1` FOREIGN KEY (`DNI`) REFERENCES `personas` (`DNI`),
  ADD CONSTRAINT `profesores_ibfk_2` FOREIGN KEY (`ID_curso`) REFERENCES `cursos` (`ID_curso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
