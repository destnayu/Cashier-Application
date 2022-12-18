-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2022 at 04:38 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dua`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `berat_bersih` varchar(10) NOT NULL,
  `harga_barang` varchar(10) NOT NULL,
  `stok` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `berat_bersih`, `harga_barang`, `stok`) VALUES
('BR001', 'Nastar', '250 gr', '55000', '8'),
('BR002', 'Nastar', '500 gr', '65000', '12'),
('BR003', 'Nastar Keju', '250 gr', '60000', '12'),
('BR004', 'Nastar Keju', '500 gr', '70000', '11'),
('BR005', 'Putri Salju', '250 gr', '65000', '5'),
('BR006', 'Putri Salju', '500 gr', '70000', '10'),
('BR007', 'Semprit Hongkong', '250 gr', '40000', '10'),
('BR008', 'Semprit Hongkong', '500 gr', '50000', '12'),
('BR009', 'Peanuts', '250 gr', '60000', '12'),
('BR010', 'Peanuts ', '500 gr', '65000', '12'),
('BR011', 'Peanuts', '1000 gr', '70000', '10'),
('BR012', 'Sagu Keju ', '250 gr', '50000', '5'),
('BR013', 'Sagu Keju', '500 gr', '55000', '10'),
('BR014', 'Kastengel', '250 gr', '65000', '10'),
('BR015', 'Kestengel', '500 gr', '70000', '10');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` varchar(5) NOT NULL,
  `nama_karyawan` varchar(50) NOT NULL,
  `alamat_karyawan` varchar(200) NOT NULL,
  `jenis_kelamin` varchar(2) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `no_hp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `alamat_karyawan`, `jenis_kelamin`, `jabatan`, `no_hp`) VALUES
('K0001', 'Meti Wibowo', 'Jl. Iris Raya 36 Tambun Utara', 'P', 'Pemilik', '081234567891'),
('K0002', 'Helen', 'Komplek Rindam Jaya Jl. Flores No. 11 Bekasi Utara', 'P', 'Admin', '08987654321'),
('K0003', 'Jovita', 'Bekasi Jaya Indah Estate Blok A3 No. 7 Bekasi Timur', 'P', 'Admin', '085612345678'),
('K0004', 'Iksan Muhammad', 'Jl. Perintis Merdeka No. 46 Bekasi Timur', 'L', 'Produksi', '087712345690'),
('K0005', 'Abdul', 'Jl. Melati', 'L', 'Produksi', '08123748273'),
('K0006', 'Natasya', 'Jl. Pelatuk Raya No. 3 Bekasi Timur', 'P', 'Pelayan', '08889099441'),
('K0007', 'Muholik', 'Jl. Raya Pekayon Bekasi Barat', 'L', 'Produksi', '089990128765'),
('K0008', 'Marsha', 'Jl. Teluk Betung No.48 Jakarta Timur', 'P', 'Produksi', '081288679089'),
('K0009', 'Arsya', 'Jl. Durian Jaya 1 No. 15 Karang Rejo, Bekasi Utara', 'L', 'Pelayan', '089908981265'),
('K0010', 'Arifa Melati', 'Jl. Chandra Bhagasi RT 6 RW 8 Jl. Anggrek No. 38 Bekasi Utara', 'P', 'Produksi', '089912340987');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin'),
('user', 'duamahkota');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` varchar(5) NOT NULL,
  `nama_pembeli` varchar(50) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `jenis_kelamin` varchar(2) NOT NULL,
  `no_hp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `jenis_kelamin`, `no_hp`) VALUES
('P0001', 'Septia', 'Komplek Rindam Jaya Jl. Anggrek No. 31 Bekasi Utara', 'P', '0812392810'),
('P0002', 'Vania', 'Bekasi Jaya Jl. Teratai No. 1 Bekasi Timur', 'P', '08123819100'),
('P0003', 'Fachrur', 'Jl. Siliwangi Depok Jawa Barat', 'L', '081234567800'),
('P0004', 'Veronica ', 'Jl. Bumi Sari No. 31 Jakarta Timur', 'P', '081323456700'),
('P0005', 'Muhammad', 'Jl Anggrek Raya', 'L', '081236631517'),
('P0006', 'Choki Marvel', 'Taman Wisma Jaya Blok C1 No. 7 Bekasi Timur', 'L', '083190885444'),
('P0007', 'Pamungkas', 'Perumahan Villa Nusa Indah Jl. Teratai 3 Blok C8 No. 11 Cikarang Selatan', 'L', '088890783453');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `faktur` varchar(10) NOT NULL,
  `tgl` date NOT NULL,
  `id_pembeli` varchar(5) NOT NULL,
  `nama_pembeli` varchar(50) NOT NULL,
  `id_barang` varchar(5) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga_barang` varchar(10) NOT NULL,
  `jumlah` varchar(5) NOT NULL,
  `total_harga` varchar(10) NOT NULL,
  `bayar` varchar(10) NOT NULL,
  `kembali` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`faktur`, `tgl`, `id_pembeli`, `nama_pembeli`, `id_barang`, `nama_barang`, `harga_barang`, `jumlah`, `total_harga`, `bayar`, `kembali`) VALUES
('FK0001', '2022-08-15', 'P0001', 'Septia', 'BR006', 'Putri Salju', '70000', '2', '140000', '150000', '10000'),
('FK0002', '2022-08-16', 'P0002', 'Vania', 'BR001', 'Nastar', '55000', '3', '165000', '200000', '35000'),
('FK0003', '2022-08-16', 'P0003', 'Fachrur', 'BR007', 'Semprit Hongkong', '40000', '2', '80000', '100000', '20000'),
('FK0004', '2022-08-16', 'P0004', 'Veronica ', 'BR005', 'Putri Salju', '65000', '1', '65000', '70000', '5000'),
('FK0005', '2022-08-16', 'P0005', 'Muhammad', 'BR004', 'Nastar Keju', '70000', '1', '70000', '100000', '30000'),
('FK0006', '2022-08-16', 'P0006', 'Choki Marvel', 'BR001', 'Nastar', '55000', '1', '55000', '60000', '5000'),
('FK0007', '2022-08-17', 'P0007', 'Pamungkas', 'BR005', 'Putri Salju', '65000', '1', '65000', '70000', '5000');

--
-- Triggers `transaksi`
--
DELIMITER $$
CREATE TRIGGER `transaksi` AFTER INSERT ON `transaksi` FOR EACH ROW BEGIN
UPDATE barang SET stok = stok-NEW.jumlah
WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
