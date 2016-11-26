-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2016 a las 04:17:55
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
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `hora` varchar(5) NOT NULL,
  `asunto` varchar(50) NOT NULL,
  `telefono_cita` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`id`, `nombre`, `correo`, `fecha`, `hora`, `asunto`, `telefono_cita`) VALUES
(6, 'Pedro', 'pe@correo.com', '29/11/2016', '10:00', 'Cita 6', '12312'),
(7, 'EEEx', '321', '17/11/2016', '23:00', '222', '123'),
(8, 'XXAAAS', 'sdcscscs', '14/11/2016', '08:00', 'bhbhbhb', '122333'),
(9, 'Rene Castillo', 'rene@hotmail.com', '15/11/2016', '11:00', 'Primera cita', '202202020'),
(10, 'Eddie Lozano', 'ce@uanl.mx', '15/11/2016', '13:00', 'X', '12344522'),
(11, 'Jose Perez', 'jose@hotmail.com', '15/11/2016', '19:00', '123', '0002020'),
(12, 'Jaime Pedraza', 'jaime@gmail.com', '15/11/2016', '6:00', 'Asuntin', '0000020202202'),
(13, 'Pablo Escobar', 'pablito@hotmail.com', '15/11/2016', '21:00', 'Sin asunto', '123321456'),
(14, 'Maria Alejandra Hernandez', 'maria@hotmail.com', '15/11/2016', '10:00', 'No', '8885552220'),
(15, 'Ernesto Marquez', 'enriquemarquez@hotmail.com', '15/11/2016', '15:00', 'Seguimiento de resultados', '5544226458');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidas_predeterminadas`
--

CREATE TABLE `comidas_predeterminadas` (
  `id` int(3) NOT NULL,
  `calorias` int(4) NOT NULL,
  `comida` varchar(15) NOT NULL,
  `titulo` varchar(70) NOT NULL,
  `ingredientes` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `comidas_predeterminadas`
--

INSERT INTO `comidas_predeterminadas` (`id`, `calorias`, `comida`, `titulo`, `ingredientes`) VALUES
(1, 1600, 'Cena', 'Quesadillas de queso panela', 'con aguacate y queso sin sodio'),
(3, 1400, 'Desayuno', 'Cereal con leche', 'Cereal con leche descremada'),
(4, 1000, 'Colacion', 'Mnzana y almendras', 'Media pieza de manzana golden con 10 almendras'),
(5, 1800, 'Comida', 'Pollito', 'con esparragos y patatas'),
(6, 1600, 'Cena', 'Cereal y yogurth', '1 taza de cereal\n150 ml de yogurth\n10 nueces');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas_1000`
--

CREATE TABLE `dietas_1000` (
  `id` int(2) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `t_desayuno_1` varchar(60) NOT NULL,
  `t_desayuno_2` varchar(60) NOT NULL,
  `t_desayuno_3` varchar(60) NOT NULL,
  `t_desayuno_4` varchar(60) NOT NULL,
  `t_desayuno_5` varchar(60) NOT NULL,
  `t_desayuno_6` varchar(60) NOT NULL,
  `t_desayuno_7` varchar(60) NOT NULL,
  `t_colacion1_1` varchar(60) NOT NULL,
  `t_colacion1_2` varchar(60) NOT NULL,
  `t_colacion1_3` varchar(60) NOT NULL,
  `t_colacion1_4` varchar(60) NOT NULL,
  `t_colacion1_5` varchar(60) NOT NULL,
  `t_colacion1_6` varchar(60) NOT NULL,
  `t_colacion1_7` varchar(60) NOT NULL,
  `t_comida_1` varchar(60) NOT NULL,
  `t_comida_2` varchar(60) NOT NULL,
  `t_comida_3` varchar(60) NOT NULL,
  `t_comida_4` varchar(60) NOT NULL,
  `t_comida_5` varchar(60) NOT NULL,
  `t_comida_6` varchar(60) NOT NULL,
  `t_comida_7` varchar(60) NOT NULL,
  `t_colacion2_1` varchar(60) NOT NULL,
  `t_colacion2_2` varchar(60) NOT NULL,
  `t_colacion2_3` varchar(60) NOT NULL,
  `t_colacion2_4` varchar(60) NOT NULL,
  `t_colacion2_5` varchar(60) NOT NULL,
  `t_colacion2_6` varchar(60) NOT NULL,
  `t_colacion2_7` varchar(60) NOT NULL,
  `t_cena_1` varchar(60) NOT NULL,
  `t_cena_2` varchar(60) NOT NULL,
  `t_cena_3` varchar(60) NOT NULL,
  `t_cena_4` varchar(60) NOT NULL,
  `t_cena_5` varchar(60) NOT NULL,
  `t_cena_6` varchar(60) NOT NULL,
  `t_cena_7` varchar(60) NOT NULL,
  `desayuno_1` varchar(300) NOT NULL,
  `desayuno_2` varchar(300) NOT NULL,
  `desayuno_3` varchar(300) NOT NULL,
  `desayuno_4` varchar(300) NOT NULL,
  `desayuno_5` varchar(300) NOT NULL,
  `desayuno_6` varchar(300) NOT NULL,
  `desayuno_7` varchar(300) NOT NULL,
  `colacion1_1` varchar(300) NOT NULL,
  `colacion1_2` varchar(300) NOT NULL,
  `colacion1_3` varchar(300) NOT NULL,
  `colacion1_4` varchar(300) NOT NULL,
  `colacion1_5` varchar(300) NOT NULL,
  `colacion1_6` varchar(300) NOT NULL,
  `colacion1_7` varchar(300) NOT NULL,
  `comida_1` varchar(300) NOT NULL,
  `comida_2` varchar(300) NOT NULL,
  `comida_3` varchar(300) NOT NULL,
  `comida_4` varchar(300) NOT NULL,
  `comida_5` varchar(300) NOT NULL,
  `comida_6` varchar(300) NOT NULL,
  `comida_7` varchar(300) NOT NULL,
  `colacion2_1` varchar(300) NOT NULL,
  `colacion2_2` varchar(300) NOT NULL,
  `colacion2_3` varchar(300) NOT NULL,
  `colacion2_4` varchar(300) NOT NULL,
  `colacion2_5` varchar(300) NOT NULL,
  `colacion2_6` varchar(300) NOT NULL,
  `colacion2_7` varchar(300) NOT NULL,
  `cena_1` varchar(300) NOT NULL,
  `cena_2` varchar(300) NOT NULL,
  `cena_3` varchar(300) NOT NULL,
  `cena_4` varchar(300) NOT NULL,
  `cena_5` varchar(300) NOT NULL,
  `cena_6` varchar(300) NOT NULL,
  `cena_7` varchar(300) NOT NULL,
  `notas` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dietas_1000`
--

INSERT INTO `dietas_1000` (`id`, `titulo`, `fecha`, `t_desayuno_1`, `t_desayuno_2`, `t_desayuno_3`, `t_desayuno_4`, `t_desayuno_5`, `t_desayuno_6`, `t_desayuno_7`, `t_colacion1_1`, `t_colacion1_2`, `t_colacion1_3`, `t_colacion1_4`, `t_colacion1_5`, `t_colacion1_6`, `t_colacion1_7`, `t_comida_1`, `t_comida_2`, `t_comida_3`, `t_comida_4`, `t_comida_5`, `t_comida_6`, `t_comida_7`, `t_colacion2_1`, `t_colacion2_2`, `t_colacion2_3`, `t_colacion2_4`, `t_colacion2_5`, `t_colacion2_6`, `t_colacion2_7`, `t_cena_1`, `t_cena_2`, `t_cena_3`, `t_cena_4`, `t_cena_5`, `t_cena_6`, `t_cena_7`, `desayuno_1`, `desayuno_2`, `desayuno_3`, `desayuno_4`, `desayuno_5`, `desayuno_6`, `desayuno_7`, `colacion1_1`, `colacion1_2`, `colacion1_3`, `colacion1_4`, `colacion1_5`, `colacion1_6`, `colacion1_7`, `comida_1`, `comida_2`, `comida_3`, `comida_4`, `comida_5`, `comida_6`, `comida_7`, `colacion2_1`, `colacion2_2`, `colacion2_3`, `colacion2_4`, `colacion2_5`, `colacion2_6`, `colacion2_7`, `cena_1`, `cena_2`, `cena_3`, `cena_4`, `cena_5`, `cena_6`, `cena_7`, `notas`) VALUES
(1, 'Titulo 1', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', ''),
(2, 'Ejemplo titulo 2', '2016-11-13', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', ''),
(3, 'Titulin', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'nono'),
(4, 'Titulo de la nota', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Especificacion por defecto'),
(5, 'ASD', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Especificacion'),
(6, 'Titulo provisional', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Sin especificacion'),
(7, 'Tituliini', '2016-11-15', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Sin notas'),
(8, 'X', '2016-11-15', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas_1200`
--

CREATE TABLE `dietas_1200` (
  `id` int(2) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `t_desayuno_1` varchar(60) NOT NULL,
  `t_desayuno_2` varchar(60) NOT NULL,
  `t_desayuno_3` varchar(60) NOT NULL,
  `t_desayuno_4` varchar(60) NOT NULL,
  `t_desayuno_5` varchar(60) NOT NULL,
  `t_desayuno_6` varchar(60) NOT NULL,
  `t_desayuno_7` varchar(60) NOT NULL,
  `t_colacion1_1` varchar(60) NOT NULL,
  `t_colacion1_2` varchar(60) NOT NULL,
  `t_colacion1_3` varchar(60) NOT NULL,
  `t_colacion1_4` varchar(60) NOT NULL,
  `t_colacion1_5` varchar(60) NOT NULL,
  `t_colacion1_6` varchar(60) NOT NULL,
  `t_colacion1_7` varchar(60) NOT NULL,
  `t_comida_1` varchar(60) NOT NULL,
  `t_comida_2` varchar(60) NOT NULL,
  `t_comida_3` varchar(60) NOT NULL,
  `t_comida_4` varchar(60) NOT NULL,
  `t_comida_5` varchar(60) NOT NULL,
  `t_comida_6` varchar(60) NOT NULL,
  `t_comida_7` varchar(60) NOT NULL,
  `t_colacion2_1` varchar(60) NOT NULL,
  `t_colacion2_2` varchar(60) NOT NULL,
  `t_colacion2_3` varchar(60) NOT NULL,
  `t_colacion2_4` varchar(60) NOT NULL,
  `t_colacion2_5` varchar(60) NOT NULL,
  `t_colacion2_6` varchar(60) NOT NULL,
  `t_colacion2_7` varchar(60) NOT NULL,
  `t_cena_1` varchar(60) NOT NULL,
  `t_cena_2` varchar(60) NOT NULL,
  `t_cena_3` varchar(60) NOT NULL,
  `t_cena_4` varchar(60) NOT NULL,
  `t_cena_5` varchar(60) NOT NULL,
  `t_cena_6` varchar(60) NOT NULL,
  `t_cena_7` varchar(60) NOT NULL,
  `desayuno_1` varchar(300) NOT NULL,
  `desayuno_2` varchar(300) NOT NULL,
  `desayuno_3` varchar(300) NOT NULL,
  `desayuno_4` varchar(300) NOT NULL,
  `desayuno_5` varchar(300) NOT NULL,
  `desayuno_6` varchar(300) NOT NULL,
  `desayuno_7` varchar(300) NOT NULL,
  `colacion1_1` varchar(300) NOT NULL,
  `colacion1_2` varchar(300) NOT NULL,
  `colacion1_3` varchar(300) NOT NULL,
  `colacion1_4` varchar(300) NOT NULL,
  `colacion1_5` varchar(300) NOT NULL,
  `colacion1_6` varchar(300) NOT NULL,
  `colacion1_7` varchar(300) NOT NULL,
  `comida_1` varchar(300) NOT NULL,
  `comida_2` varchar(300) NOT NULL,
  `comida_3` varchar(300) NOT NULL,
  `comida_4` varchar(300) NOT NULL,
  `comida_5` varchar(300) NOT NULL,
  `comida_6` varchar(300) NOT NULL,
  `comida_7` varchar(300) NOT NULL,
  `colacion2_1` varchar(300) NOT NULL,
  `colacion2_2` varchar(300) NOT NULL,
  `colacion2_3` varchar(300) NOT NULL,
  `colacion2_4` varchar(300) NOT NULL,
  `colacion2_5` varchar(300) NOT NULL,
  `colacion2_6` varchar(300) NOT NULL,
  `colacion2_7` varchar(300) NOT NULL,
  `cena_1` varchar(300) NOT NULL,
  `cena_2` varchar(300) NOT NULL,
  `cena_3` varchar(300) NOT NULL,
  `cena_4` varchar(300) NOT NULL,
  `cena_5` varchar(300) NOT NULL,
  `cena_6` varchar(300) NOT NULL,
  `cena_7` varchar(300) NOT NULL,
  `notas` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dietas_1200`
--

INSERT INTO `dietas_1200` (`id`, `titulo`, `fecha`, `t_desayuno_1`, `t_desayuno_2`, `t_desayuno_3`, `t_desayuno_4`, `t_desayuno_5`, `t_desayuno_6`, `t_desayuno_7`, `t_colacion1_1`, `t_colacion1_2`, `t_colacion1_3`, `t_colacion1_4`, `t_colacion1_5`, `t_colacion1_6`, `t_colacion1_7`, `t_comida_1`, `t_comida_2`, `t_comida_3`, `t_comida_4`, `t_comida_5`, `t_comida_6`, `t_comida_7`, `t_colacion2_1`, `t_colacion2_2`, `t_colacion2_3`, `t_colacion2_4`, `t_colacion2_5`, `t_colacion2_6`, `t_colacion2_7`, `t_cena_1`, `t_cena_2`, `t_cena_3`, `t_cena_4`, `t_cena_5`, `t_cena_6`, `t_cena_7`, `desayuno_1`, `desayuno_2`, `desayuno_3`, `desayuno_4`, `desayuno_5`, `desayuno_6`, `desayuno_7`, `colacion1_1`, `colacion1_2`, `colacion1_3`, `colacion1_4`, `colacion1_5`, `colacion1_6`, `colacion1_7`, `comida_1`, `comida_2`, `comida_3`, `comida_4`, `comida_5`, `comida_6`, `comida_7`, `colacion2_1`, `colacion2_2`, `colacion2_3`, `colacion2_4`, `colacion2_5`, `colacion2_6`, `colacion2_7`, `cena_1`, `cena_2`, `cena_3`, `cena_4`, `cena_5`, `cena_6`, `cena_7`, `notas`) VALUES
(1, 'Titulo 1', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', ''),
(2, 'Ejemplo titulo 2', '2016-11-13', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas_1400`
--

CREATE TABLE `dietas_1400` (
  `id` int(2) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `t_desayuno_1` varchar(60) NOT NULL,
  `t_desayuno_2` varchar(60) NOT NULL,
  `t_desayuno_3` varchar(60) NOT NULL,
  `t_desayuno_4` varchar(60) NOT NULL,
  `t_desayuno_5` varchar(60) NOT NULL,
  `t_desayuno_6` varchar(60) NOT NULL,
  `t_desayuno_7` varchar(60) NOT NULL,
  `t_colacion1_1` varchar(60) NOT NULL,
  `t_colacion1_2` varchar(60) NOT NULL,
  `t_colacion1_3` varchar(60) NOT NULL,
  `t_colacion1_4` varchar(60) NOT NULL,
  `t_colacion1_5` varchar(60) NOT NULL,
  `t_colacion1_6` varchar(60) NOT NULL,
  `t_colacion1_7` varchar(60) NOT NULL,
  `t_comida_1` varchar(60) NOT NULL,
  `t_comida_2` varchar(60) NOT NULL,
  `t_comida_3` varchar(60) NOT NULL,
  `t_comida_4` varchar(60) NOT NULL,
  `t_comida_5` varchar(60) NOT NULL,
  `t_comida_6` varchar(60) NOT NULL,
  `t_comida_7` varchar(60) NOT NULL,
  `t_colacion2_1` varchar(60) NOT NULL,
  `t_colacion2_2` varchar(60) NOT NULL,
  `t_colacion2_3` varchar(60) NOT NULL,
  `t_colacion2_4` varchar(60) NOT NULL,
  `t_colacion2_5` varchar(60) NOT NULL,
  `t_colacion2_6` varchar(60) NOT NULL,
  `t_colacion2_7` varchar(60) NOT NULL,
  `t_cena_1` varchar(60) NOT NULL,
  `t_cena_2` varchar(60) NOT NULL,
  `t_cena_3` varchar(60) NOT NULL,
  `t_cena_4` varchar(60) NOT NULL,
  `t_cena_5` varchar(60) NOT NULL,
  `t_cena_6` varchar(60) NOT NULL,
  `t_cena_7` varchar(60) NOT NULL,
  `desayuno_1` varchar(300) NOT NULL,
  `desayuno_2` varchar(300) NOT NULL,
  `desayuno_3` varchar(300) NOT NULL,
  `desayuno_4` varchar(300) NOT NULL,
  `desayuno_5` varchar(300) NOT NULL,
  `desayuno_6` varchar(300) NOT NULL,
  `desayuno_7` varchar(300) NOT NULL,
  `colacion1_1` varchar(300) NOT NULL,
  `colacion1_2` varchar(300) NOT NULL,
  `colacion1_3` varchar(300) NOT NULL,
  `colacion1_4` varchar(300) NOT NULL,
  `colacion1_5` varchar(300) NOT NULL,
  `colacion1_6` varchar(300) NOT NULL,
  `colacion1_7` varchar(300) NOT NULL,
  `comida_1` varchar(300) NOT NULL,
  `comida_2` varchar(300) NOT NULL,
  `comida_3` varchar(300) NOT NULL,
  `comida_4` varchar(300) NOT NULL,
  `comida_5` varchar(300) NOT NULL,
  `comida_6` varchar(300) NOT NULL,
  `comida_7` varchar(300) NOT NULL,
  `colacion2_1` varchar(300) NOT NULL,
  `colacion2_2` varchar(300) NOT NULL,
  `colacion2_3` varchar(300) NOT NULL,
  `colacion2_4` varchar(300) NOT NULL,
  `colacion2_5` varchar(300) NOT NULL,
  `colacion2_6` varchar(300) NOT NULL,
  `colacion2_7` varchar(300) NOT NULL,
  `cena_1` varchar(300) NOT NULL,
  `cena_2` varchar(300) NOT NULL,
  `cena_3` varchar(300) NOT NULL,
  `cena_4` varchar(300) NOT NULL,
  `cena_5` varchar(300) NOT NULL,
  `cena_6` varchar(300) NOT NULL,
  `cena_7` varchar(300) NOT NULL,
  `notas` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dietas_1400`
--

INSERT INTO `dietas_1400` (`id`, `titulo`, `fecha`, `t_desayuno_1`, `t_desayuno_2`, `t_desayuno_3`, `t_desayuno_4`, `t_desayuno_5`, `t_desayuno_6`, `t_desayuno_7`, `t_colacion1_1`, `t_colacion1_2`, `t_colacion1_3`, `t_colacion1_4`, `t_colacion1_5`, `t_colacion1_6`, `t_colacion1_7`, `t_comida_1`, `t_comida_2`, `t_comida_3`, `t_comida_4`, `t_comida_5`, `t_comida_6`, `t_comida_7`, `t_colacion2_1`, `t_colacion2_2`, `t_colacion2_3`, `t_colacion2_4`, `t_colacion2_5`, `t_colacion2_6`, `t_colacion2_7`, `t_cena_1`, `t_cena_2`, `t_cena_3`, `t_cena_4`, `t_cena_5`, `t_cena_6`, `t_cena_7`, `desayuno_1`, `desayuno_2`, `desayuno_3`, `desayuno_4`, `desayuno_5`, `desayuno_6`, `desayuno_7`, `colacion1_1`, `colacion1_2`, `colacion1_3`, `colacion1_4`, `colacion1_5`, `colacion1_6`, `colacion1_7`, `comida_1`, `comida_2`, `comida_3`, `comida_4`, `comida_5`, `comida_6`, `comida_7`, `colacion2_1`, `colacion2_2`, `colacion2_3`, `colacion2_4`, `colacion2_5`, `colacion2_6`, `colacion2_7`, `cena_1`, `cena_2`, `cena_3`, `cena_4`, `cena_5`, `cena_6`, `cena_7`, `notas`) VALUES
(1, 'Titulo 1', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas_1600`
--

CREATE TABLE `dietas_1600` (
  `id` int(2) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `t_desayuno_1` varchar(60) NOT NULL,
  `t_desayuno_2` varchar(60) NOT NULL,
  `t_desayuno_3` varchar(60) NOT NULL,
  `t_desayuno_4` varchar(60) NOT NULL,
  `t_desayuno_5` varchar(60) NOT NULL,
  `t_desayuno_6` varchar(60) NOT NULL,
  `t_desayuno_7` varchar(60) NOT NULL,
  `t_colacion1_1` varchar(60) NOT NULL,
  `t_colacion1_2` varchar(60) NOT NULL,
  `t_colacion1_3` varchar(60) NOT NULL,
  `t_colacion1_4` varchar(60) NOT NULL,
  `t_colacion1_5` varchar(60) NOT NULL,
  `t_colacion1_6` varchar(60) NOT NULL,
  `t_colacion1_7` varchar(60) NOT NULL,
  `t_comida_1` varchar(60) NOT NULL,
  `t_comida_2` varchar(60) NOT NULL,
  `t_comida_3` varchar(60) NOT NULL,
  `t_comida_4` varchar(60) NOT NULL,
  `t_comida_5` varchar(60) NOT NULL,
  `t_comida_6` varchar(60) NOT NULL,
  `t_comida_7` varchar(60) NOT NULL,
  `t_colacion2_1` varchar(60) NOT NULL,
  `t_colacion2_2` varchar(60) NOT NULL,
  `t_colacion2_3` varchar(60) NOT NULL,
  `t_colacion2_4` varchar(60) NOT NULL,
  `t_colacion2_5` varchar(60) NOT NULL,
  `t_colacion2_6` varchar(60) NOT NULL,
  `t_colacion2_7` varchar(60) NOT NULL,
  `t_cena_1` varchar(60) NOT NULL,
  `t_cena_2` varchar(60) NOT NULL,
  `t_cena_3` varchar(60) NOT NULL,
  `t_cena_4` varchar(60) NOT NULL,
  `t_cena_5` varchar(60) NOT NULL,
  `t_cena_6` varchar(60) NOT NULL,
  `t_cena_7` varchar(60) NOT NULL,
  `desayuno_1` varchar(300) NOT NULL,
  `desayuno_2` varchar(300) NOT NULL,
  `desayuno_3` varchar(300) NOT NULL,
  `desayuno_4` varchar(300) NOT NULL,
  `desayuno_5` varchar(300) NOT NULL,
  `desayuno_6` varchar(300) NOT NULL,
  `desayuno_7` varchar(300) NOT NULL,
  `colacion1_1` varchar(300) NOT NULL,
  `colacion1_2` varchar(300) NOT NULL,
  `colacion1_3` varchar(300) NOT NULL,
  `colacion1_4` varchar(300) NOT NULL,
  `colacion1_5` varchar(300) NOT NULL,
  `colacion1_6` varchar(300) NOT NULL,
  `colacion1_7` varchar(300) NOT NULL,
  `comida_1` varchar(300) NOT NULL,
  `comida_2` varchar(300) NOT NULL,
  `comida_3` varchar(300) NOT NULL,
  `comida_4` varchar(300) NOT NULL,
  `comida_5` varchar(300) NOT NULL,
  `comida_6` varchar(300) NOT NULL,
  `comida_7` varchar(300) NOT NULL,
  `colacion2_1` varchar(300) NOT NULL,
  `colacion2_2` varchar(300) NOT NULL,
  `colacion2_3` varchar(300) NOT NULL,
  `colacion2_4` varchar(300) NOT NULL,
  `colacion2_5` varchar(300) NOT NULL,
  `colacion2_6` varchar(300) NOT NULL,
  `colacion2_7` varchar(300) NOT NULL,
  `cena_1` varchar(300) NOT NULL,
  `cena_2` varchar(300) NOT NULL,
  `cena_3` varchar(300) NOT NULL,
  `cena_4` varchar(300) NOT NULL,
  `cena_5` varchar(300) NOT NULL,
  `cena_6` varchar(300) NOT NULL,
  `cena_7` varchar(300) NOT NULL,
  `notas` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dietas_1600`
--

INSERT INTO `dietas_1600` (`id`, `titulo`, `fecha`, `t_desayuno_1`, `t_desayuno_2`, `t_desayuno_3`, `t_desayuno_4`, `t_desayuno_5`, `t_desayuno_6`, `t_desayuno_7`, `t_colacion1_1`, `t_colacion1_2`, `t_colacion1_3`, `t_colacion1_4`, `t_colacion1_5`, `t_colacion1_6`, `t_colacion1_7`, `t_comida_1`, `t_comida_2`, `t_comida_3`, `t_comida_4`, `t_comida_5`, `t_comida_6`, `t_comida_7`, `t_colacion2_1`, `t_colacion2_2`, `t_colacion2_3`, `t_colacion2_4`, `t_colacion2_5`, `t_colacion2_6`, `t_colacion2_7`, `t_cena_1`, `t_cena_2`, `t_cena_3`, `t_cena_4`, `t_cena_5`, `t_cena_6`, `t_cena_7`, `desayuno_1`, `desayuno_2`, `desayuno_3`, `desayuno_4`, `desayuno_5`, `desayuno_6`, `desayuno_7`, `colacion1_1`, `colacion1_2`, `colacion1_3`, `colacion1_4`, `colacion1_5`, `colacion1_6`, `colacion1_7`, `comida_1`, `comida_2`, `comida_3`, `comida_4`, `comida_5`, `comida_6`, `comida_7`, `colacion2_1`, `colacion2_2`, `colacion2_3`, `colacion2_4`, `colacion2_5`, `colacion2_6`, `colacion2_7`, `cena_1`, `cena_2`, `cena_3`, `cena_4`, `cena_5`, `cena_6`, `cena_7`, `notas`) VALUES
(1, 'Titulo 1', '2016-11-14', 'fruta', 'cereal', 'yogurth', 'avena', 'cafe', 'omelette', 'vegetales', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'Ejemplo nota'),
(2, 'Ejemplo titulo 2', '2016-11-13', 'taquito', 'xasd', 'assascsc', 'cdsccc', 'dcdscc', 'scsdc', 'dcdscsdcdsc', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'Ejemplo nota 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas_1800`
--

CREATE TABLE `dietas_1800` (
  `id` int(2) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `t_desayuno_1` varchar(60) NOT NULL,
  `t_desayuno_2` varchar(60) NOT NULL,
  `t_desayuno_3` varchar(60) NOT NULL,
  `t_desayuno_4` varchar(60) NOT NULL,
  `t_desayuno_5` varchar(60) NOT NULL,
  `t_desayuno_6` varchar(60) NOT NULL,
  `t_desayuno_7` varchar(60) NOT NULL,
  `t_colacion1_1` varchar(60) NOT NULL,
  `t_colacion1_2` varchar(60) NOT NULL,
  `t_colacion1_3` varchar(60) NOT NULL,
  `t_colacion1_4` varchar(60) NOT NULL,
  `t_colacion1_5` varchar(60) NOT NULL,
  `t_colacion1_6` varchar(60) NOT NULL,
  `t_colacion1_7` varchar(60) NOT NULL,
  `t_comida_1` varchar(60) NOT NULL,
  `t_comida_2` varchar(60) NOT NULL,
  `t_comida_3` varchar(60) NOT NULL,
  `t_comida_4` varchar(60) NOT NULL,
  `t_comida_5` varchar(60) NOT NULL,
  `t_comida_6` varchar(60) NOT NULL,
  `t_comida_7` varchar(60) NOT NULL,
  `t_colacion2_1` varchar(60) NOT NULL,
  `t_colacion2_2` varchar(60) NOT NULL,
  `t_colacion2_3` varchar(60) NOT NULL,
  `t_colacion2_4` varchar(60) NOT NULL,
  `t_colacion2_5` varchar(60) NOT NULL,
  `t_colacion2_6` varchar(60) NOT NULL,
  `t_colacion2_7` varchar(60) NOT NULL,
  `t_cena_1` varchar(60) NOT NULL,
  `t_cena_2` varchar(60) NOT NULL,
  `t_cena_3` varchar(60) NOT NULL,
  `t_cena_4` varchar(60) NOT NULL,
  `t_cena_5` varchar(60) NOT NULL,
  `t_cena_6` varchar(60) NOT NULL,
  `t_cena_7` varchar(60) NOT NULL,
  `desayuno_1` varchar(300) NOT NULL,
  `desayuno_2` varchar(300) NOT NULL,
  `desayuno_3` varchar(300) NOT NULL,
  `desayuno_4` varchar(300) NOT NULL,
  `desayuno_5` varchar(300) NOT NULL,
  `desayuno_6` varchar(300) NOT NULL,
  `desayuno_7` varchar(300) NOT NULL,
  `colacion1_1` varchar(300) NOT NULL,
  `colacion1_2` varchar(300) NOT NULL,
  `colacion1_3` varchar(300) NOT NULL,
  `colacion1_4` varchar(300) NOT NULL,
  `colacion1_5` varchar(300) NOT NULL,
  `colacion1_6` varchar(300) NOT NULL,
  `colacion1_7` varchar(300) NOT NULL,
  `comida_1` varchar(300) NOT NULL,
  `comida_2` varchar(300) NOT NULL,
  `comida_3` varchar(300) NOT NULL,
  `comida_4` varchar(300) NOT NULL,
  `comida_5` varchar(300) NOT NULL,
  `comida_6` varchar(300) NOT NULL,
  `comida_7` varchar(300) NOT NULL,
  `colacion2_1` varchar(300) NOT NULL,
  `colacion2_2` varchar(300) NOT NULL,
  `colacion2_3` varchar(300) NOT NULL,
  `colacion2_4` varchar(300) NOT NULL,
  `colacion2_5` varchar(300) NOT NULL,
  `colacion2_6` varchar(300) NOT NULL,
  `colacion2_7` varchar(300) NOT NULL,
  `cena_1` varchar(300) NOT NULL,
  `cena_2` varchar(300) NOT NULL,
  `cena_3` varchar(300) NOT NULL,
  `cena_4` varchar(300) NOT NULL,
  `cena_5` varchar(300) NOT NULL,
  `cena_6` varchar(300) NOT NULL,
  `cena_7` varchar(300) NOT NULL,
  `notas` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dietas_1800`
--

INSERT INTO `dietas_1800` (`id`, `titulo`, `fecha`, `t_desayuno_1`, `t_desayuno_2`, `t_desayuno_3`, `t_desayuno_4`, `t_desayuno_5`, `t_desayuno_6`, `t_desayuno_7`, `t_colacion1_1`, `t_colacion1_2`, `t_colacion1_3`, `t_colacion1_4`, `t_colacion1_5`, `t_colacion1_6`, `t_colacion1_7`, `t_comida_1`, `t_comida_2`, `t_comida_3`, `t_comida_4`, `t_comida_5`, `t_comida_6`, `t_comida_7`, `t_colacion2_1`, `t_colacion2_2`, `t_colacion2_3`, `t_colacion2_4`, `t_colacion2_5`, `t_colacion2_6`, `t_colacion2_7`, `t_cena_1`, `t_cena_2`, `t_cena_3`, `t_cena_4`, `t_cena_5`, `t_cena_6`, `t_cena_7`, `desayuno_1`, `desayuno_2`, `desayuno_3`, `desayuno_4`, `desayuno_5`, `desayuno_6`, `desayuno_7`, `colacion1_1`, `colacion1_2`, `colacion1_3`, `colacion1_4`, `colacion1_5`, `colacion1_6`, `colacion1_7`, `comida_1`, `comida_2`, `comida_3`, `comida_4`, `comida_5`, `comida_6`, `comida_7`, `colacion2_1`, `colacion2_2`, `colacion2_3`, `colacion2_4`, `colacion2_5`, `colacion2_6`, `colacion2_7`, `cena_1`, `cena_2`, `cena_3`, `cena_4`, `cena_5`, `cena_6`, `cena_7`, `notas`) VALUES
(1, 'Titulo 1', '2016-11-14', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'Ejemplo nota 3'),
(2, 'Ejemplo titulo 2', '2016-11-13', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'Ejemplo nota 4'),
(3, 'Asdf', '2016-11-20', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Sisisi'),
(4, 'Prueba final', '2016-11-20', 'tit des 1', '', '', '', '', '', '', 'tit col 1', '', '', '', '', '', '', 'tit com 1', '', '', '', '', '', '', 'tit col2 1', '', '', '', '', '', '', 'tit cena 1', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No por el momento');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE `notas` (
  `id` int(3) NOT NULL,
  `titulo` varchar(70) NOT NULL,
  `texto` varchar(500) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `tipo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `notas`
--

INSERT INTO `notas` (`id`, `titulo`, `texto`, `fecha`, `hora`, `tipo`) VALUES
(2, 'Titulo 2', 'Texto 2', '2016-10-28', '00:00:00', 'Alerta'),
(5, 'Titulo 5.0', 'Texto 5', '2016-10-31', '18:06:15', 'Sin tipo'),
(6, 'XXXXX', 'XXXXXXXX', '2016-10-29', '00:00:04', 'Sin tipo'),
(7, 'Titulin', 'Contenido x', '2016-10-29', '02:49:18', 'Urgente'),
(9, 'Ventanita 3.0', 'Texto de ventanita', '2016-10-31', '18:06:31', 'Suceso'),
(10, 'Notita', 'Contenido de la nota', '2016-11-15', '01:00:04', 'Positiva'),
(11, 'Ejemplo de nota', 'Contenido de la nota', '2016-11-15', '01:00:40', 'Alerta');

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
(1, 'Rene Castillo M', 0, 'Masculino', 1112, 'rene@', 221, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(2, 'Jose Perez', 0, 'Masculino', 2221, 'rene@', 1112, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(3, 'Luis Alvarez', 0, 'Masculino', 22210021, 'luis@hotmail.com', 2020202, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(6, 'Andrea Lopez Cisneros', 30, 'Femenino', 83556100, 'andrea@hotmail.com', 8115203366, 'Posgrado', 'Diabetes', 'Antecedente 1', 'Ninguno', 'Paracetamol', 'Ninguna', 'Fistulas', 'Ninguno', 1),
(7, 'Lucia Venezuela', 68, 'Femenino', 1234568777, 'lucia@hotm', 1155478547774, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(8, 'Luis Jaime Ortiz', 34, 'Masculino', 1102236554, 'lj@hotmail.com', 222012365554, 'Primaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0),
(9, 'Martha Castillo Mireles', 17, 'Femenino', 83825719, 'martha1@hotmail.com', 811269325, 'Bachiller', 'Hipertension', 'Hipertension', 'Alcoholismo', 'paracetamol', '', 'Ileostoias', 'Extreñimiento', 1),
(10, 'Mayra Alejandra Villareal Salazar', 29, 'Femenino', 83133182, 'mayra_latermita@hotamial.com', 8116300282, 'Licenciatura', 'Hipertension', 'Ninguno', 'Ninguno', 'aspirina junior, acido folico', 'Ninguna', 'Ninguno', 'Extreñimiento', 1),
(12, 'jose martinez', 21, 'Masculino', 12541, '', 125563, 'Secundaria', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguna', 'Ninguna', 'Ninguno', 'Ninguno', 0);

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
  `esqueleto_3` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_clinico`
--

INSERT INTO `pacientes_clinico` (`id`, `edema`, `obesidad`, `unas_1`, `unas_2`, `cuello_1`, `cuello_2`, `nervioso_1`, `nervioso_2`, `nervioso_3`, `rostro_1`, `rostro_2`, `rostro_3`, `dientes_1`, `dientes_2`, `dientes_3`, `urinaria_1`, `urinaria_2`, `torax_1`, `torax_2`, `torax_3`, `torax_4`, `boca_1`, `boca_2`, `boca_3`, `boca_4`, `boca_5`, `boca_6`, `ojos_1`, `ojos_2`, `ojos_3`, `ojos_4`, `ojos_5`, `piel_1`, `piel_2`, `piel_3`, `piel_4`, `piel_5`, `piel_6`, `piel_7`, `esqueleto_1`, `esqueleto_2`, `esqueleto_3`) VALUES
(1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
(10, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes_evaluacion`
--

CREATE TABLE `pacientes_evaluacion` (
  `id` int(3) NOT NULL,
  `hora_1` varchar(15) NOT NULL,
  `alimento_1` varchar(50) NOT NULL,
  `ingredientes_1` varchar(400) NOT NULL,
  `hora_2` varchar(15) NOT NULL,
  `alimento_2` varchar(50) NOT NULL,
  `ingredientes_2` varchar(400) NOT NULL,
  `hora_3` varchar(15) NOT NULL,
  `alimento_3` varchar(50) NOT NULL,
  `ingredientes_3` varchar(400) NOT NULL,
  `hora_4` varchar(15) NOT NULL,
  `alimento_4` varchar(50) NOT NULL,
  `ingredientes_4` varchar(400) NOT NULL,
  `hora_5` varchar(15) NOT NULL,
  `alimento_5` varchar(50) NOT NULL,
  `ingredientes_5` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_evaluacion`
--

INSERT INTO `pacientes_evaluacion` (`id`, `hora_1`, `alimento_1`, `ingredientes_1`, `hora_2`, `alimento_2`, `ingredientes_2`, `hora_3`, `alimento_3`, `ingredientes_3`, `hora_4`, `alimento_4`, `ingredientes_4`, `hora_5`, `alimento_5`, `ingredientes_5`) VALUES
(1, '0:00:05', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(2, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(3, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(6, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(7, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(8, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(9, '13:00:00', 'huevo con jamon', 'huevo\njamon\naceite', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(10, '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', ''),
(12, '10:00:00', 'sanwich', '2 rebanadas pan\n1 rebanada de jamon\n1 rebanada de queso\n', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '', '0:00:00', '', '');

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
  `glucosa` float NOT NULL,
  `a_urico` float NOT NULL,
  `trigliceridos` float NOT NULL,
  `colesterol` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pacientes_info`
--

INSERT INTO `pacientes_info` (`id`, `peso`, `estatura`, `c_cintura`, `c_cadera`, `c_muneca`, `c_brazo`, `biceps`, `triceps`, `glucosa`, `a_urico`, `trigliceridos`, `colesterol`) VALUES
(1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(6, 90, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2),
(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(9, 82, 162, 23, 100, 100, 26, 12, 12, 100, 22, 150, 15),
(10, 56, 155, 70, 100, 100, 17, 10, 10, 12, 12, 12, 12),
(12, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2);

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
  `telefono` bigint(15) NOT NULL,
  `sexo` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `nombre`, `correo`, `pass`, `telefono`, `sexo`) VALUES
('Usuario_1', 'Jose Perez Gonzalez', 'juanp@hotmail.es', '202cb962ac59075b964b07152d234b70', 8114523366, 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comidas_predeterminadas`
--
ALTER TABLE `comidas_predeterminadas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dietas_1000`
--
ALTER TABLE `dietas_1000`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dietas_1200`
--
ALTER TABLE `dietas_1200`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dietas_1400`
--
ALTER TABLE `dietas_1400`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dietas_1600`
--
ALTER TABLE `dietas_1600`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dietas_1800`
--
ALTER TABLE `dietas_1800`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`id`);

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
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT de la tabla `comidas_predeterminadas`
--
ALTER TABLE `comidas_predeterminadas`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `dietas_1000`
--
ALTER TABLE `dietas_1000`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `dietas_1200`
--
ALTER TABLE `dietas_1200`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `dietas_1400`
--
ALTER TABLE `dietas_1400`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `dietas_1600`
--
ALTER TABLE `dietas_1600`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `dietas_1800`
--
ALTER TABLE `dietas_1800`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `notas`
--
ALTER TABLE `notas`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `pacientes_clinico`
--
ALTER TABLE `pacientes_clinico`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `pacientes_evaluacion`
--
ALTER TABLE `pacientes_evaluacion`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `pacientes_info`
--
ALTER TABLE `pacientes_info`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
