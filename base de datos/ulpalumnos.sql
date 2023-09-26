-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-09-2023 a las 00:06:47
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ulpalumnos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES
(1, 32984763, 'Lopez', 'Javier', '1988-05-23', 0),
(2, 32984765, 'Ramirez', 'Julian', '2023-09-19', 1),
(3, 27981374, 'Martinez', 'Roque', '1984-08-08', 1),
(4, 28999654, 'Rodriguez', 'Marcelo', '1974-12-12', 1),
(5, 25456123, 'Rondina', 'Carla', '1978-02-21', 1),
(6, 10901066, 'Guidi', 'Alejandra', '2023-04-09', 1),
(7, 15233899, 'Mallorca', 'Graciela', '1980-09-02', 1),
(8, 30211789, 'Juarez', 'Rodrigo', '1993-06-14', 1),
(9, 29554881, 'Banegas', 'Romina', '1993-07-29', 1),
(10, 25941223, 'Morientes', 'Lorena', '1975-08-13', 1),
(11, 35255569, 'Mastrangelo', 'Bruno', '2023-09-07', 1),
(12, 10902355, 'Llorente', 'Carla', '2023-09-01', 1),
(13, 27455122, 'Gimenez', 'Susana', '1963-06-19', 1),
(14, 29555124, 'Marcone', 'Alan', '2023-09-01', 1),
(15, 31002589, 'Canosa', 'Viviana', '1985-04-17', 1),
(16, 15234889, 'Riquelme', 'Roman', '1974-07-10', 1),
(17, 34229884, 'Bilardo', 'Salvador', '1963-06-17', 1),
(18, 1456223, 'Legrand', 'Mirtha', '1897-03-09', 1),
(19, 35255568, 'Mastrangelo', 'Bruno', '2023-09-07', 0),
(20, 25987456, 'Messi', 'Lionel', '1987-06-24', 1),
(21, 22333555, 'Marcone Solares', 'Juan', '2023-09-25', 1),
(22, 482003592, 'Hatcher', 'Euphemia', '1985-11-06', 1),
(23, 928346931, 'Hawkslee', 'Arlie', '2001-02-17', 0),
(24, 182638063, 'Gilardone', 'Jesselyn', '2005-02-10', 1),
(25, 749514089, 'Kmietsch', 'Ianthe', '1983-07-20', 0),
(26, 61519810, 'Cromack', 'Catrina', '1962-07-30', 1),
(27, 513353712, 'Purple', 'Guido', '2014-03-15', 1),
(28, 309989211, 'Argabrite', 'Joshua', '1978-07-16', 1),
(29, 430318361, 'Larose', 'Romy', '2005-04-07', 0),
(30, 163038499, 'Chamberlain', 'Madelin', '1959-12-17', 1),
(31, 332791695, 'Gierth', 'Zelig', '1956-02-01', 0),
(32, 904903271, 'Mathissen', 'Nani', '1986-09-30', 0),
(33, 586128790, 'Domotor', 'Brenda', '1974-08-16', 0),
(34, 601768301, 'Tegeller', 'Aleen', '1985-04-10', 1),
(35, 535690325, 'Marshall', 'Hilary', '2020-10-29', 1),
(36, 666030296, 'Lodwig', 'Kakalina', '1974-11-14', 0),
(37, 455554974, 'Batkin', 'Mella', '2007-12-03', 1),
(38, 112816846, 'Duthie', 'Northrup', '1969-08-13', 0),
(39, 110569303, 'von Grollmann', 'Tedda', '2017-09-02', 0),
(40, 525985965, 'Shower', 'Berthe', '1968-11-12', 1),
(41, 867621867, 'Wolfenden', 'Cris', '1986-03-24', 0),
(42, 582468879, 'Kynastone', 'Amii', '1960-04-08', 0),
(43, 686510555, 'Tyce', 'Carmine', '1985-12-16', 0),
(44, 681660847, 'Camilleri', 'Horten', '1962-11-20', 0),
(45, 296666544, 'Tregoning', 'Auria', '2015-12-17', 1),
(46, 659467619, 'Frediani', 'Cullan', '2020-05-21', 1),
(47, 447339226, 'Gorvette', 'Shane', '1998-10-05', 1),
(48, 930276664, 'Gras', 'Micky', '2015-12-09', 1),
(49, 964128785, 'Parkman', 'Viki', '1999-06-10', 1),
(50, 219608587, 'Brandacci', 'Lalo', '2017-08-07', 1),
(51, 984517410, 'Lynagh', 'Emery', '1983-09-21', 1),
(52, 727198175, 'Lyptrit', 'Amalle', '1950-12-05', 1),
(53, 428650658, 'Lightbowne', 'Patton', '1960-10-30', 0),
(54, 240026447, 'Heape', 'Britta', '1955-06-13', 1),
(55, 261351185, 'Crimmins', 'Adamo', '2011-12-22', 0),
(56, 653153471, 'Batho', 'Ewan', '1998-06-10', 1),
(57, 277196430, 'Cayley', 'Gaby', '2003-07-31', 1),
(58, 714794757, 'Sepey', 'Irena', '1972-12-12', 0),
(59, 979295056, 'Akker', 'Winnie', '2009-02-25', 1),
(60, 120522637, 'Belch', 'Beck', '1970-09-05', 1),
(61, 487420379, 'Pikhno', 'Emlyn', '1962-08-06', 1),
(62, 606432249, 'Goodbar', 'Ivie', '1956-12-10', 0),
(63, 869623029, 'Worsnip', 'Shawn', '2017-11-23', 1),
(64, 648531156, 'Sunshine', 'Amerigo', '1995-01-30', 1),
(65, 444555617, 'Walwood', 'Lew', '2006-01-01', 0),
(66, 908457559, 'Arnow', 'Gray', '1986-04-29', 1),
(67, 248076043, 'Steet', 'Park', '2009-07-05', 0),
(68, 7472064, 'Duchatel', 'Udale', '2012-12-05', 0),
(69, 877323382, 'Killner', 'Eva', '1983-11-01', 1),
(70, 575544089, 'Cassella', 'Atlante', '2020-01-31', 1),
(71, 927526874, 'Stocken', 'Evania', '1970-11-18', 0),
(72, 978067315, 'Burtonshaw', 'Dory', '1994-04-24', 1),
(73, 344568566, 'McMarquis', 'Asia', '1995-12-14', 0),
(74, 219021340, 'Gosnall', 'Borg', '1970-09-21', 1),
(75, 440408712, 'Swithenby', 'Jeanelle', '1978-08-24', 0),
(76, 87666530, 'Isac', 'Nil', '1959-04-02', 0),
(77, 867146707, 'Hackworth', 'Charlot', '1958-06-11', 1),
(78, 836096649, 'Faircloth', 'Tymon', '2001-04-20', 1),
(79, 231224673, 'Meriot', 'Tiffi', '1968-12-18', 1),
(80, 115059063, 'Rozenbaum', 'Jemmie', '1968-11-18', 0),
(81, 150331696, 'Claasen', 'Gray', '1956-10-20', 0),
(82, 934078240, 'Heers', 'Guenna', '1991-08-29', 0),
(83, 540301029, 'Hefferan', 'Josie', '2020-06-11', 0),
(84, 546895039, 'Lafaye', 'Georgi', '1997-09-04', 0),
(85, 205964260, 'Wakeford', 'Heinrik', '1982-01-15', 1),
(86, 154816044, 'Largent', 'Bay', '2020-11-21', 0),
(87, 149347543, 'Feeney', 'Dmitri', '1958-02-11', 1),
(88, 852564655, 'Alvar', 'Jaquenetta', '1996-08-10', 0),
(89, 759938882, 'Brandenburg', 'April', '2005-12-07', 0),
(90, 992602699, 'Hattigan', 'Patty', '2011-03-22', 0),
(91, 948459211, 'Waycott', 'Shell', '1971-09-19', 1),
(92, 154923261, 'Drohun', 'Gery', '2017-07-09', 0),
(93, 159744884, 'Tuiller', 'Sax', '1956-01-14', 1),
(94, 695524437, 'Barhem', 'Marcos', '1952-07-09', 0),
(95, 491410950, 'Bollands', 'Rubin', '1986-06-23', 0),
(96, 718035408, 'Raiment', 'Bernita', '1970-07-05', 1),
(97, 230760854, 'Lenz', 'Milton', '1996-02-16', 1),
(98, 606746262, 'Grabb', 'Megen', '2007-09-06', 0),
(99, 289358539, 'Pedlar', 'Ellerey', '1954-03-13', 0),
(100, 953570665, 'Guite', 'Libbie', '1987-11-05', 0),
(101, 94828152, 'Morsom', 'Harrie', '2021-03-11', 1),
(102, 17002676, 'Gaitley', 'Aprilette', '2011-10-12', 0),
(103, 751258323, 'Limbrick', 'Roberto', '1994-06-22', 1),
(104, 364758469, 'Juleff', 'Rich', '1997-10-09', 0),
(105, 915118409, 'Castillou', 'Joe', '1972-03-03', 0),
(106, 684694297, 'Randall', 'Kalil', '2020-03-24', 0),
(107, 475759208, 'Antonignetti', 'Maddi', '1982-09-22', 1),
(108, 961035893, 'Enderwick', 'Mario', '2008-01-30', 0),
(109, 61240888, 'Vinsen', 'Shalom', '1956-03-09', 1),
(110, 351852399, 'Doumer', 'Gretchen', '2020-11-12', 0),
(111, 436144917, 'Zavittieri', 'Georas', '1970-12-11', 0),
(112, 238161609, 'Hymers', 'Monty', '1999-06-21', 1),
(113, 230424811, 'Philler', 'Leland', '2013-06-05', 1),
(114, 959434128, 'Empson', 'Buddy', '1996-05-14', 1),
(115, 488739444, 'Scarrisbrick', 'Dorita', '1989-04-06', 0),
(116, 942035783, 'Gee', 'Allard', '2001-10-20', 1),
(117, 831074283, 'Dobrovsky', 'Tim', '1994-04-26', 0),
(118, 387414216, 'Pachmann', 'Pearce', '2022-05-24', 1),
(119, 754825012, 'Elnor', 'Chrissy', '1956-12-29', 1),
(120, 870117247, 'Scaysbrook', 'Adora', '2001-04-26', 1),
(121, 32555784, 'Menendez', 'Mariana', '2013-04-10', 1),
(122, 35255588, 'Ronaldo', 'Cristiano', '1994-05-18', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripcion` int(11) NOT NULL,
  `nota` tinyint(11) DEFAULT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`idInscripcion`, `nota`, `idAlumno`, `idMateria`) VALUES
(1, 8, 2, 1),
(4, 7, 2, 2),
(18, 5, 2, 4),
(23, NULL, 3, 1),
(27, NULL, 11, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(1, 'Literatura', 1, 1),
(2, 'Matematicas', 1, 1),
(3, 'Programacion l', 1, 0),
(4, 'Base de Datos', 1, 1),
(5, 'Análisis Matemático II', 2, 1),
(6, 'Programacion Avanzada 2', 2, 1),
(7, 'Laboratorio II', 2, 1),
(8, 'Sistemas Operativos', 2, 1),
(9, 'Física I', 3, 1),
(10, 'Diseño de Sistemas', 3, 1),
(11, 'Testing y QA', 3, 1),
(12, 'Fundamentos de Economía y Finanzas', 3, 1),
(13, 'Administración de Proyectos', 4, 1),
(14, 'Higiene, Seguridad y Ecología', 4, 1),
(15, 'El profesional de TI', 4, 1),
(16, 'Proyecto de Investigación I', 4, 1),
(17, 'Organización Gestion y Entrepreneurship', 5, 1),
(18, 'Inteligencia Artificial', 5, 1),
(19, 'Práctica Profesional Supervisada', 5, 1),
(20, 'Trabajo Final de Grado', 5, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripcion`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
