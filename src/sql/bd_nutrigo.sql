-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2016 a las 07:36:47
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_nutrigo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `id` int(3) NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `edad` int(2) NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `celular` bigint(20) NOT NULL,
  `escolaridad` varchar(15) NOT NULL,
  `a_heredo` varchar(25) NOT NULL,
  `a_no_pat` varchar(25) NOT NULL,
  `a_pat` varchar(25) NOT NULL,
  `alergias_a` varchar(30) NOT NULL,
  `alergias_m` varchar(30) NOT NULL,
  `quirurgicos` varchar(35) NOT NULL,
  `trastornos` varchar(35) NOT NULL,
  `suplementos` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`id`, `nombre`, `edad`, `sexo`, `telefono`, `correo`, `celular`, `escolaridad`, `a_heredo`, `a_no_pat`, `a_pat`, `alergias_a`, `alergias_m`, `quirurgicos`, `trastornos`, `suplementos`) VALUES
(1, 'Rene Castillo', 0, 'Masculino', 1112, 'rene@', 221, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(2, 'Jose Perez', 0, 'Masculino', 2221, 'rene@', 1112, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(3, 'Luis Alvarez', 0, 'Masculino', 22210021, 'luis@hotmail.com', 2020202, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(4, 'Cesar Eddie', 0, 'Masculino', 101010, 'cesar@hotmail.com', 1110101010, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(5, 'Martha Sanchez', 0, 'Masculino', 11112, 'martha@hotmail.com', 22222221, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(6, 'Andrea Lopez Cisneros', 30, 'Femenino', 83556100, 'andrea@hotmail.com', 8115203366, 'Posgrado', 'Diabetes', 'Antecedente 1', 'Ninguno', 'Paracetamol', 'Ninguna', 'Fistulas', 'Ninguno', 1),
(7, 'Lucia Venezuela', 68, 'Femenino', 1234568777, 'lucia@hotm', 1155478547774, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(8, 'Luis Jaime Ortiz', 34, 'Masculino', 1102236554, 'lj@hotmail.com', 222012365554, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(9, 'Martha Castillo Mireles', 17, 'Femenino', 83825719, 'martha1@hotmail.com', 811269325, 'Bachiller', 'Hipertension', 'Hipertension', 'Alcoholismo', 'paracetamol', '', 'Ileostoias', 'Extreñimiento', 1),
(10, 'Mayra Alejandra Villareal Salazar', 29, 'Femenino', 83133182, 'mayra_latermita@hotamial.com', 8116300282, 'Licenciatura', 'Hipertension', 'Ninguno', 'Ninguno', 'aspirina junior, acido folico', 'Ninguna', 'Ninguno', 'Extreñimiento', 1),
(11, 'Rene Castillo', 0, 'Masculino', 221, 'rnee@', 112, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes_clinico`
--

CREATE TABLE `pacientes_clinico` (
  `id` int(3) NOT NULL,
  `edema` tinyint(1) NOT NULL,
  `obesidad` tinyint(1) NOT NULL,
  `unas_1` tinyint(1) NOT NULL,
  `unas_2` tinyint(1) NOT NULL,
  `cuello_1` tinyint(1) NOT NULL,
  `cuello_2` tinyint(1) NOT NULL,
  `nervioso_1` tinyint(1) NOT NULL,
  `nervioso_2` tinyint(1) NOT NULL,
  `nervioso_3` tinyint(1) NOT NULL,
  `rostro_1` tinyint(1) NOT NULL,
  `rostro_2` tinyint(1) NOT NULL,
  `rostro_3` tinyint(1) NOT NULL,
  `dientes_1` tinyint(1) NOT NULL,
  `dientes_2` tinyint(1) NOT NULL,
  `dientes_3` tinyint(1) NOT NULL,
  `urinaria_1` tinyint(1) NOT NULL,
  `urinaria_2` tinyint(1) NOT NULL,
  `torax_1` tinyint(1) NOT NULL,
  `torax_2` tinyint(1) NOT NULL,
  `torax_3` tinyint(1) NOT NULL,
  `torax_4` tinyint(1) NOT NULL,
  `boca_1` tinyint(1) NOT NULL,
  `boca_2` tinyint(1) NOT NULL,
  `boca_3` tinyint(1) NOT NULL,
  `boca_4` tinyint(1) NOT NULL,
  `boca_5` tinyint(1) NOT NULL,
  `boca_6` tinyint(1) NOT NULL,
  `ojos_1` tinyint(1) NOT NULL,
  `ojos_2` tinyint(1) NOT NULL,
  `ojos_3` tinyint(1) NOT NULL,
  `ojos_4` tinyint(1) NOT NULL,
  `ojos_5` tinyint(1) NOT NULL,
  `piel_1` tinyint(1) NOT NULL,
  `piel_2` tinyint(1) NOT NULL,
  `piel_3` tinyint(1) NOT NULL,
  `piel_4` tinyint(1) NOT NULL,
  `piel_5` tinyint(1) NOT NULL,
  `piel_6` tinyint(1) NOT NULL,
  `piel_7` tinyint(1) NOT NULL,
  `esqueleto_1` tinyint(1) NOT NULL,
  `esqueleto_2` tinyint(1) NOT NULL,
  `esqueleto_3` tinyint(1) NOT NULL,
  `gastro_1` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_clinico`
--

INSERT INTO `pacientes_clinico` (`id`, `edema`, `obesidad`, `unas_1`, `unas_2`, `cuello_1`, `cuello_2`, `nervioso_1`, `nervioso_2`, `nervioso_3`, `rostro_1`, `rostro_2`, `rostro_3`, `dientes_1`, `dientes_2`, `dientes_3`, `urinaria_1`, `urinaria_2`, `torax_1`, `torax_2`, `torax_3`, `torax_4`, `boca_1`, `boca_2`, `boca_3`, `boca_4`, `boca_5`, `boca_6`, `ojos_1`, `ojos_2`, `ojos_3`, `ojos_4`, `ojos_5`, `piel_1`, `piel_2`, `piel_3`, `piel_4`, `piel_5`, `piel_6`, `piel_7`, `esqueleto_1`, `esqueleto_2`, `esqueleto_3`, `gastro_1`) VALUES
(1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
(10, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes_evaluacion`
--

CREATE TABLE `pacientes_evaluacion` (
  `id` int(3) NOT NULL,
  `hora_1` varchar(15) NOT NULL,
  `lugar_1` varchar(40) NOT NULL,
  `alimento_1` varchar(50) NOT NULL,
  `ingredientes_1` varchar(400) NOT NULL,
  `hora_2` varchar(15) NOT NULL,
  `lugar_2` varchar(40) NOT NULL,
  `alimento_2` varchar(50) NOT NULL,
  `ingredientes_2` varchar(400) NOT NULL,
  `hora_3` varchar(15) NOT NULL,
  `lugar_3` varchar(40) NOT NULL,
  `alimento_3` varchar(50) NOT NULL,
  `ingredientes_3` varchar(400) NOT NULL,
  `hora_4` varchar(15) NOT NULL,
  `lugar_4` varchar(40) NOT NULL,
  `alimento_4` varchar(50) NOT NULL,
  `ingredientes_4` varchar(400) NOT NULL,
  `hora_5` varchar(15) NOT NULL,
  `lugar_5` varchar(40) NOT NULL,
  `argumento_5` varchar(50) NOT NULL,
  `ingredientes_5` varchar(400) NOT NULL,
  `hora_6` varchar(15) NOT NULL,
  `lygar_6` varchar(40) NOT NULL,
  `alimento_6` varchar(50) NOT NULL,
  `ingredientes_6` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_evaluacion`
--

INSERT INTO `pacientes_evaluacion` (`id`, `hora_1`, `lugar_1`, `alimento_1`, `ingredientes_1`, `hora_2`, `lugar_2`, `alimento_2`, `ingredientes_2`, `hora_3`, `lugar_3`, `alimento_3`, `ingredientes_3`, `hora_4`, `lugar_4`, `alimento_4`, `ingredientes_4`, `hora_5`, `lugar_5`, `argumento_5`, `ingredientes_5`, `hora_6`, `lygar_6`, `alimento_6`, `ingredientes_6`) VALUES
(1, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(2, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(3, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(4, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(5, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(6, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(7, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(8, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(9, '13:00:00', 'Casa', 'huevo con jamon', 'huevo\njamon\naceite', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', ''),
(10, '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '', '0:00:00', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes_info`
--

CREATE TABLE `pacientes_info` (
  `id` int(3) NOT NULL,
  `peso` float NOT NULL,
  `estatura` float NOT NULL,
  `c_cintura` float NOT NULL,
  `c_cadera` float NOT NULL,
  `c_muneca` float NOT NULL,
  `c_brazo` float NOT NULL,
  `biceps` float NOT NULL,
  `triceps` float NOT NULL,
  `subescapular` float NOT NULL,
  `ileocrestal` float NOT NULL,
  `suprailiaco` float NOT NULL,
  `hemoglobina` float NOT NULL,
  `hematrocitos` float NOT NULL,
  `linfocitos` float NOT NULL,
  `glucosa` float NOT NULL,
  `urea` float NOT NULL,
  `a_urico` float NOT NULL,
  `creatonina` float NOT NULL,
  `trigliceridos` float NOT NULL,
  `colesterol` float NOT NULL,
  `albumina` float NOT NULL,
  `sodio` float NOT NULL,
  `potasio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_info`
--

INSERT INTO `pacientes_info` (`id`, `peso`, `estatura`, `c_cintura`, `c_cadera`, `c_muneca`, `c_brazo`, `biceps`, `triceps`, `subescapular`, `ileocrestal`, `suprailiaco`, `hemoglobina`, `hematrocitos`, `linfocitos`, `glucosa`, `urea`, `a_urico`, `creatonina`, `trigliceridos`, `colesterol`, `albumina`, `sodio`, `potasio`) VALUES
(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2),
(5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4),
(6, 90, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2),
(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(9, 82, 162, 23, 100, 100, 26, 12, 12, 12, 22, 25, 12, 12, 20, 100, 22, 22, 1.2, 150, 15, 22, 33, 22),
(10, 56, 155, 70, 100, 100, 17, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12),
(11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `id` int(2) NOT NULL,
  `boleano` tinyint(1) NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`id`, `boleano`, `hora`) VALUES
(1, 1, '08:00:00'),
(2, 0, '12:20:00'),
(3, 0, '20:00:00'),
(4, 1, '22:00:00'),
(5, 0, '00:00:05'),
(6, 1, '20:00:00'),
(7, 1, '20:00:00'),
(8, 0, '16:00:00'),
(9, 1, '12:00:00'),
(10, 1, '22:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `pass` varchar(35) NOT NULL,
  `sexo` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `nombre`, `correo`, `pass`, `sexo`) VALUES
('Usuario_1', 'Jose Perez Torres', 'juanp@hotmail.com', '202cb962ac59075b964b07152d234b70', 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pacientes_clinico`
--
ALTER TABLE `pacientes_clinico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pacientes_evaluacion`
--
ALTER TABLE `pacientes_evaluacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pacientes_info`
--
ALTER TABLE `pacientes_info`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `pacientes_clinico`
--
ALTER TABLE `pacientes_clinico`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `pacientes_evaluacion`
--
ALTER TABLE `pacientes_evaluacion`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `pacientes_info`
--
ALTER TABLE `pacientes_info`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
