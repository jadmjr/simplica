-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Dez-2022 às 16:13
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `quiz`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pergunta`
--

CREATE TABLE `pergunta` (
  `id` int(11) NOT NULL,
  `titulo` varchar(200) DEFAULT NULL,
  `opA` varchar(200) DEFAULT NULL,
  `opB` varchar(200) DEFAULT NULL,
  `opC` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pergunta`
--

INSERT INTO `pergunta` (`id`, `titulo`, `opA`, `opB`, `opC`) VALUES
(1, 'qual a cor do mar', 'azul', 'amarelo', 'vermelho'),
(2, 'qual a cor do ceu', 'verde', 'azul', 'vermelho');

-- --------------------------------------------------------

--
-- Estrutura da tabela `resposta`
--

CREATE TABLE `resposta` (
  `idPergunta` int(11) DEFAULT NULL,
  `respostaCerta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `resposta`
--

INSERT INTO `resposta` (`idPergunta`, `respostaCerta`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `respostausuario`
--

CREATE TABLE `respostausuario` (
  `idPergunta` int(11) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `resposta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome`) VALUES
(1, 'sas'),
(2, 'AAAA'),
(3, 'DFSDFSF'),
(4, 'dasd'),
(5, 'dasdasd'),
(6, 'fasfd'),
(7, 'fasfdfsadfa'),
(8, 'gsdfgds'),
(9, 'sds'),
(10, 'dsd'),
(11, 'ghhg'),
(12, 'jhgjhg'),
(13, 'gf'),
(14, 'fdf'),
(15, 'gfdgdf'),
(16, 'gdsfg'),
(17, 'gdfg'),
(18, 'gsdfg'),
(19, '333'),
(20, 'jhgjgh'),
(21, 'jjghj'),
(22, 'fsdf'),
(23, 'fsdffsdfsdf'),
(24, 'fsdffsdfsdfdfgssg'),
(25, 'fsdffsdfsdfdfgssggdfgdf'),
(26, 'gfdg'),
(27, 'hghg'),
(28, 'fsd'),
(29, 'fsd'),
(30, 'fsdaf'),
(31, 'fsdaffasf'),
(32, 'asfd'),
(33, 'fsdfsd'),
(34, 'fsdfsdf'),
(35, 'fsadfsad'),
(36, 'fsdfs'),
(37, 'fdfd'),
(38, 'dasda'),
(39, 'dasdas'),
(40, 'fdsf');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pergunta`
--
ALTER TABLE `pergunta`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pergunta`
--
ALTER TABLE `pergunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
