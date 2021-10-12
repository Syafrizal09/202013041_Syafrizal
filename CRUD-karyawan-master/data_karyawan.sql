-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2021 at 09:48 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(100) CHARACTER SET utf8 NOT NULL,
  `telepon` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('pria','wanita') CHARACTER SET utf8 NOT NULL,
  `tempat_lahir` varchar(100) NOT NULL,
  `tanggal_lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama`, `email`, `telepon`, `alamat`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`) VALUES
(1, 'Muhammad khalif rafi', 'rafi@student.uns.ac.id', '0897163861829', 'Pasar kliwon, Surakarta', 'pria', 'Surakarta', '2001-09-16'),
(3, 'Kross', 'Kross08@gmail.com', '098768767898', 'Berlin Jerman', 'pria', 'Jerman', '1990-08-16'),
(4, 'Bambang', 'Bambang@gmail.com', '089765678453', 'Jakarta', 'pria', 'Jakarta', '1990-04-12'),
(5, 'Adel', 'Adel@gmail.com', '076718354789', 'New York', 'wanita', 'Amerika', '2001-04-21'),
(6, 'Khabib Nurmagomedov', 'Khabib@gmail.com', '09387483833', 'Dagestan', 'pria', 'Rusia', '1990-08-25');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id_karyawan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
