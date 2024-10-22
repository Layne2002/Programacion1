drop schema cine1137;
CREATE SCHEMA if not exists `cine1137` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
use cine1137;
DROP TABLE IF EXISTS Disponible_en ;
DROP TABLE IF EXISTS Plataformas ;
DROP TABLE IF EXISTS Peliculas ;

--
-- Estructura de las tablas
--
create table Peliculas
(
codigo int auto_increment,
nombre varchar(100),
sinopsis varchar(255),
fecha_estreno date,
primary key(codigo)
);
create table Plataformas
(
codigo int auto_increment,
nombre varchar(50),
ruta_imagen varchar(255),
primary key(codigo)
);
create table Disponible_en
(
codPlataforma int,
codPelicula int,
fDisponibilidad date,
primary key(codPlataforma,codPelicula),
foreign key (codpelicula) references Peliculas(codigo),
foreign key (codPlataforma) references Plataformas(codigo)
);