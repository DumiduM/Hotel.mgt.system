-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2017 at 11:35 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hiru_villa3`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_ID` varchar(6) NOT NULL,
  `Package_ID` varchar(6) NOT NULL,
  `Agent_ID` varchar(6) NOT NULL,
  `PPN` int(8) NOT NULL,
  `Name` text NOT NULL,
  `Country` text NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `TP` int(11) NOT NULL,
  `Admitted_Date` date NOT NULL,
  `Discharged_Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_ID`, `Package_ID`, `Agent_ID`, `PPN`, `Name`, `Country`, `DateOfBirth`, `Gender`, `Status`, `Address`, `TP`, `Admitted_Date`, `Discharged_Date`) VALUES
('AU0002', '002', '003', 12323432, 'Jessica Jamie', 'Australia', '1980-10-17', 'F', 'Divorced', '21 Ramsey\r\n\r\nStreet,Erinsburgh\r\n\r\nVic 3001', 614238669, '2016-05-08', '2016-05-15'),
('CA0001', '001', '002', 23456433, 'John Marcus', 'Canada', '1967-08-05', 'M', 'Married', 'Station 321, Ottawa Ontario, Canada.', 1121345675, '2016-08-07', '2016-08-22'),
('CA0002', '003', '002', 23459980, 'Sarah Claudia', 'Canada', '1969-08-03', 'F', 'Married', 'Suite 103,1855,8th Ave,Ottawa,Canada\r\n', 1705944547, '2016-08-25', '2016-09-17'),
('CA0003', '004', '002', 23473211, 'Emily Jordan', 'Canada', '1987-04-01', 'F', 'Single', '102 Youge Street,Toronto,Canada', 1905728009, '2016-08-21', '2016-09-07'),
('CA0004', '005', '002', 2338150, 'Alex Felix', 'Canada', '1989-02-12', 'M', 'Single', '1900 Fairbanks Ave,Ottawa.Canada', 1519245203, '2016-08-29', '2016-09-07'),
('GE0001', '006', '001', 45362718, 'Rochell Johnson', 'Germany', '1987-03-10', 'M', 'Single', '10 ELM St,Rosenberg 70a,Munich,Germany', 1905728009, '2016-07-20', '2016-08-04');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor_ID` varchar(4) NOT NULL,
  `D_Name` varchar(50) NOT NULL,
  `Emp_No` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor_ID`, `D_Name`, `Emp_No`) VALUES
('D001', 'Harischandre', 'E001'),
('D002', 'Thennakoon', 'E002'),
('D003', 'Ramanee Gunasena', 'E003'),
('D004', 'Wasantah Bandara', 'E004');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Emp_No` varchar(5) NOT NULL,
  `Emp_Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `TP` varchar(11) NOT NULL,
  `Designation` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_No`, `Emp_Name`, `Address`, `TP`, `Designation`) VALUES
('E001', 'Harischandre', '23,Temple street,Bombuwa', '0712365455', 'Doctor'),
('E002', 'Thennakoon', '12,Polwaththa Rd,Bombuwala', '0727856144', 'Doctor'),
('E003', 'Ramanee Gunasena', '2/44,Malkaduwawa,Kurunegala', '0375634123', 'Doctor'),
('E004', 'Wasantah Bandara', '313,Colombo Rd,Kaluthara', '0762337178', 'Doctor'),
('E005', 'Jayasinghe', 'Diyatha Rd,Mathugama', '0723425127', 'Therapist'),
('E006', 'W.D.Wijesekara', '2/40,Samagi mawatha,Kaluthara', '0781232881', 'Therapist');

-- --------------------------------------------------------

--
-- Table structure for table `givenby`
--

CREATE TABLE `givenby` (
  `Treatment_ID` varchar(4) NOT NULL,
  `Therapist_ID` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `givenby`
--

INSERT INTO `givenby` (`Treatment_ID`, `Therapist_ID`) VALUES
('TR01', 'T001'),
('TR04', 'T001'),
('TR06', 'T001'),
('TR02', 'T002'),
('TR03', 'T002'),
('TR05', 'T002'),
('TR07', 'T002');

-- --------------------------------------------------------

--
-- Table structure for table `illness`
--

CREATE TABLE `illness` (
  `illness_Name` varchar(50) NOT NULL,
  `Customer_ID` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `illness`
--

INSERT INTO `illness` (`illness_Name`, `Customer_ID`) VALUES
('Skin Problems', 'AU0002'),
('Stress', 'CA0001'),
('Joint pains', 'CA0002'),
('Obesity', 'CA0003'),
('High Blood Pressure', 'CA0004'),
('Heart Problems', 'GE0001');

-- --------------------------------------------------------

--
-- Table structure for table `include`
--

CREATE TABLE `include` (
  `Package_ID` varchar(4) NOT NULL,
  `Treatment_ID` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `include`
--

INSERT INTO `include` (`Package_ID`, `Treatment_ID`) VALUES
('001', 'TR01'),
('002', 'TR02'),
('003', 'TR03'),
('004', 'TR04'),
('005', 'TR05'),
('006', 'TR06'),
('001', 'TR07');

-- --------------------------------------------------------

--
-- Table structure for table `internantional_agent`
--

CREATE TABLE `internantional_agent` (
  `Agent_ID` varchar(6) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Country` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `TP` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `internantional_agent`
--

INSERT INTO `internantional_agent` (`Agent_ID`, `Name`, `Country`, `Address`, `TP`) VALUES
('001', 'Achmad Bertram', 'Germany', '4016 Main St, Fort  Worth 76133,Berlin', '4930323112'),
('002', 'Patrick Genrer', 'Canada', '04-1234 W. King St, Toronto, Ontario or Toronto', '01198465743'),
('003', '003', 'Australia', '111,Bourko St, Melbourne Vic 3000', '614288125'),
('004', 'Marina Natalie', 'Russia', '112227,Volgagradski prospect,Moscow,Russia', '7905540665');

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `Invoice_ID` varchar(6) NOT NULL,
  `Customer_ID` varchar(6) NOT NULL,
  `Package_ID` varchar(4) NOT NULL,
  `Basic_Payment` float NOT NULL,
  `Transportation_Charges` float NOT NULL,
  `Medicine_Charges` float NOT NULL,
  `Discount` float NOT NULL,
  `Total_Payment` float NOT NULL,
  `Cash/Cheque` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`Invoice_ID`, `Customer_ID`, `Package_ID`, `Basic_Payment`, `Transportation_Charges`, `Medicine_Charges`, `Discount`, `Total_Payment`, `Cash/Cheque`) VALUES
('IN001', 'AU0002', '002', 50000, 2000, 5000, 0, 57000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `packages`
--

CREATE TABLE `packages` (
  `Package_ID` varchar(4) NOT NULL,
  `Package_Name` varchar(50) NOT NULL,
  `Duration` varchar(15) NOT NULL,
  `Payment` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `packages`
--

INSERT INTO `packages` (`Package_ID`, `Package_Name`, `Duration`, `Payment`) VALUES
('001', 'Package1', '1 Week', 25000),
('002', 'Package2', '2 Weeks', 50000),
('003', 'Package3', '3weeks', 75000),
('004', 'Package4', '1month', 100000),
('005', 'Package5', '1week', 30000),
('006', 'Package6', '2weeks', 60000);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Product_ID` varchar(6) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `Available_Quantity` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Product_ID`, `Product_Name`, `Available_Quantity`) VALUES
('P001', 'Swastha Thriphala', '0'),
('P002', 'Akalapalitha', '0'),
('P003', 'Neelyadhee oil', '0'),
('P004', ' Kolaselesma oil', '0'),
('P005', 'Mora Guli', '0'),
('P006', 'Honey', '0');

-- --------------------------------------------------------

--
-- Table structure for table `suppliedby`
--

CREATE TABLE `suppliedby` (
  `Supplier_ID` varchar(4) NOT NULL,
  `Product_ID` varchar(6) NOT NULL,
  `Price_Per_Unit` float NOT NULL,
  `Quantity` float NOT NULL,
  `Total_Amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `suppliedby`
--

INSERT INTO `suppliedby` (`Supplier_ID`, `Product_ID`, `Price_Per_Unit`, `Quantity`, `Total_Amount`) VALUES
('S001', 'P001', 20, 10, 200),
('S002', 'P002', 30, 20, 600),
('S003', 'P003', 400, 5, 2000),
('S003', 'P004', 500, 4, 2000),
('S004', 'P004', 500, 4, 2000),
('S004', 'P006', 500, 4, 2000),
('S005', 'P005', 20, 50, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `Supplier_ID` varchar(4) NOT NULL,
  `Sup_Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `TP` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`Supplier_ID`, `Sup_Name`, `Address`, `TP`) VALUES
('S001', 'Anura Gunawardana (Link Products)', '11/1,Jaya Srteet,Kaluthara', '0761242165'),
('S002', 'Isuru Jayawardhana (Beam Products)', 'No21,Temple Srteet,Ambalangoda', '0712318355'),
('S003', 'Namal Jayaweera (Pasyala Ayueveda Products)', 'No11/5,Pasyala,Gampaha', '0717689007'),
('S004', 'R.M.Ranawaka (Himalaya Ayurveda Products)', 'Perera Pharmacy,No32,Pallewela,Gampaha', '0721932763'),
('S005', 'Harshana Wijenayaka (Dharani Products)', 'Katugampala,Kurunegala', '0773423455');

-- --------------------------------------------------------

--
-- Table structure for table `therapist`
--

CREATE TABLE `therapist` (
  `Therapist_ID` varchar(4) NOT NULL,
  `Therapist_Name` varchar(50) NOT NULL,
  `Emp_No` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `therapist`
--

INSERT INTO `therapist` (`Therapist_ID`, `Therapist_Name`, `Emp_No`) VALUES
('T001', 'Jayasinghe', 'E005'),
('T002', 'W.D.Wijesekara', 'E006');

-- --------------------------------------------------------

--
-- Table structure for table `treatments`
--

CREATE TABLE `treatments` (
  `Treatment_ID` varchar(4) NOT NULL,
  `T_Name` varchar(50) NOT NULL,
  `Doctor_ID` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `treatments`
--

INSERT INTO `treatments` (`Treatment_ID`, `T_Name`, `Doctor_ID`) VALUES
('TR01', 'Head Massage', 'D001'),
('TR02', 'Herbal Bath', 'D002'),
('TR03', 'Steam Bath', 'D003'),
('TR04', 'Body Massage', 'D004'),
('TR05', 'Ear Treatment', 'D001'),
('TR06', 'Nasal', 'D002'),
('TR07', 'Eye Treat', 'D003'),
('TR08', 'Body Fomentation', 'D004');

-- --------------------------------------------------------

--
-- Table structure for table `use`
--

CREATE TABLE `use` (
  `Treatment_ID` varchar(4) NOT NULL,
  `Product_ID` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `use`
--

INSERT INTO `use` (`Treatment_ID`, `Product_ID`) VALUES
('TR01', 'P001'),
('TR02', 'P002'),
('TR05', 'P002'),
('TR03', 'P003'),
('TR04', 'P004'),
('TR06', 'P005');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserName`, `Password`) VALUES
('Admin1', 'Admin1'),
('Admin2', 'Admin2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_ID`,`Package_ID`,`Agent_ID`),
  ADD UNIQUE KEY `Package_ID` (`Package_ID`),
  ADD KEY `Agent_ID` (`Agent_ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor_ID`),
  ADD KEY `Emp_No` (`Emp_No`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Emp_No`);

--
-- Indexes for table `givenby`
--
ALTER TABLE `givenby`
  ADD PRIMARY KEY (`Treatment_ID`,`Therapist_ID`),
  ADD KEY `Therapist_ID` (`Therapist_ID`),
  ADD KEY `Treatment_ID` (`Treatment_ID`);

--
-- Indexes for table `illness`
--
ALTER TABLE `illness`
  ADD PRIMARY KEY (`Customer_ID`);

--
-- Indexes for table `include`
--
ALTER TABLE `include`
  ADD PRIMARY KEY (`Package_ID`,`Treatment_ID`),
  ADD KEY `Treatment_ID` (`Treatment_ID`);

--
-- Indexes for table `internantional_agent`
--
ALTER TABLE `internantional_agent`
  ADD PRIMARY KEY (`Agent_ID`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`Invoice_ID`),
  ADD KEY `Customer_ID` (`Customer_ID`),
  ADD KEY `Package_ID` (`Package_ID`);

--
-- Indexes for table `packages`
--
ALTER TABLE `packages`
  ADD PRIMARY KEY (`Package_ID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Product_ID`);

--
-- Indexes for table `suppliedby`
--
ALTER TABLE `suppliedby`
  ADD PRIMARY KEY (`Supplier_ID`,`Product_ID`),
  ADD KEY `Product_ID` (`Product_ID`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`Supplier_ID`);

--
-- Indexes for table `therapist`
--
ALTER TABLE `therapist`
  ADD PRIMARY KEY (`Therapist_ID`),
  ADD KEY `Emp_No` (`Emp_No`);

--
-- Indexes for table `treatments`
--
ALTER TABLE `treatments`
  ADD PRIMARY KEY (`Treatment_ID`),
  ADD KEY `Doctor_ID` (`Doctor_ID`);

--
-- Indexes for table `use`
--
ALTER TABLE `use`
  ADD PRIMARY KEY (`Treatment_ID`,`Product_ID`),
  ADD KEY `Product_ID` (`Product_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserName`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`Agent_ID`) REFERENCES `internantional_agent` (`Agent_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`Emp_No`) REFERENCES `employee` (`Emp_No`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `givenby`
--
ALTER TABLE `givenby`
  ADD CONSTRAINT `givenby_ibfk_1` FOREIGN KEY (`Treatment_ID`) REFERENCES `treatments` (`Treatment_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `givenby_ibfk_2` FOREIGN KEY (`Therapist_ID`) REFERENCES `therapist` (`Therapist_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `illness`
--
ALTER TABLE `illness`
  ADD CONSTRAINT `illness_ibfk_1` FOREIGN KEY (`Customer_ID`) REFERENCES `customer` (`Customer_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `include`
--
ALTER TABLE `include`
  ADD CONSTRAINT `include_ibfk_1` FOREIGN KEY (`Package_ID`) REFERENCES `packages` (`Package_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `include_ibfk_2` FOREIGN KEY (`Treatment_ID`) REFERENCES `treatments` (`Treatment_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`Customer_ID`) REFERENCES `customer` (`Customer_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`Package_ID`) REFERENCES `packages` (`Package_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `suppliedby`
--
ALTER TABLE `suppliedby`
  ADD CONSTRAINT `suppliedby_ibfk_1` FOREIGN KEY (`Supplier_ID`) REFERENCES `suppliers` (`Supplier_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `suppliedby_ibfk_2` FOREIGN KEY (`Product_ID`) REFERENCES `products` (`Product_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `therapist`
--
ALTER TABLE `therapist`
  ADD CONSTRAINT `therapist_ibfk_1` FOREIGN KEY (`Emp_No`) REFERENCES `employee` (`Emp_No`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `treatments`
--
ALTER TABLE `treatments`
  ADD CONSTRAINT `treatments_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `use`
--
ALTER TABLE `use`
  ADD CONSTRAINT `use_ibfk_1` FOREIGN KEY (`Treatment_ID`) REFERENCES `treatments` (`Treatment_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `use_ibfk_2` FOREIGN KEY (`Product_ID`) REFERENCES `products` (`Product_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
