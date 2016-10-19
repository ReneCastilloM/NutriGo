-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-10-2016 a las 09:05:36
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
  `sexo` varchar(1) NOT NULL,
  `escolaridad` varchar(15) NOT NULL,
  `a_heredo` varchar(25) NOT NULL,
  `a_no_pat` varchar(25) NOT NULL,
  `a_pat` varchar(25) NOT NULL,
  `alergias_a` varchar(30) NOT NULL,
  `quirurgicos` varchar(35) NOT NULL,
  `trastornos` varchar(35) NOT NULL,
  `suplementos` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `boleano` tinyint(1) NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`boleano`, `hora`) VALUES
(1, '08:00:00'),
(0, '12:20:00');

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
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
