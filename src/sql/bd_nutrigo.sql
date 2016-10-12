-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-10-2016 a las 23:44:39
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
  `suplementos` tinyint(1) NOT NULL,
  `peso` float NOT NULL,
  `estatura` float NOT NULL,
  `c_cintura` float NOT NULL,
  `c_cadera` float NOT NULL,
  `c_muñeca` float NOT NULL,
  `c_brazo` float NOT NULL,
  `biceps` float NOT NULL,
  `triceps` float NOT NULL,
  `subescapular` float NOT NULL,
  `ileocrestal` float NOT NULL,
  `suprailiaco` float NOT NULL,
  `hemoglobina` float NOT NULL,
  `hematrocitos` float NOT NULL,
  `lonfocitos` float NOT NULL,
  `glucosa` float NOT NULL,
  `urea` float NOT NULL,
  `acido_urico` float NOT NULL,
  `creatinina` float NOT NULL,
  `trigliceridos` float NOT NULL,
  `colesterol` float NOT NULL,
  `albumina` float NOT NULL,
  `sodio` float NOT NULL,
  `potasio` float NOT NULL,
  `desayuno` varchar(255) NOT NULL,
  `colacion_1` varchar(255) NOT NULL,
  `comida` varchar(255) NOT NULL,
  `colacion_2` varchar(255) NOT NULL,
  `cena` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
('Jose_Perez', 'Jose Perez Torres', 'juanp@hotmail.com', '202cb962ac59075b964b07152d234b70', 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
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
