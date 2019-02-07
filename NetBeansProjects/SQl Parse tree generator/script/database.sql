DROP DATABASE IF EXISTS db_customer;
CREATE DATABASE  db_customer;
USE  db_customer;

CREATE TABLE IF NOT EXISTS `tblcustomer` (
  `id` mediumint(7) unsigned NOT NULL,
  `customer_code` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `date_of_birth` varchar(50) NOT NULL,
  `email_address` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblcustomer`
--

INSERT INTO `tblcustomer` (`id`, `customer_code`, `first_name`, `last_name`, `gender`, `date_of_birth`, `email_address`, `country`) VALUES
(1, ' 1407222781', 'Sneha', 'Avachar', 'F', '12-5-1990', 'sneha.avachar@gmail.com', '384'),
(2, '1407222782', 'Sandip', 'Tenare', 'M', '4-12-1991', 'sandip.tenare@gmail.com', '385'),
(3, '1407222783', 'Sanjay', 'Mahajan', 'M', '5-12-1991', 'sanjay.mahajan@gmail.com', '386'),
(4, '1407222784', 'Sanika', 'Rake', 'F', '6-1-1991', 'sanikarake@gmail.com', '387'),
(5, '1407222785', 'Monika', 'Rana', 'F', '4-3-1991', 'monikarana@gmail.com', '388'),
(6, '1407222786', 'Sonalika', 'Raje', 'F', '9-1-1992', 'sonalikaraje@gmail.com', '389'),
(7, '1407222787', 'Lila', 'Rane', 'F', '6-5-1991', 'lilarane1@gmail.com', '390'),
(8, '1407222788', 'Neena', 'solanke', 'F', '5-8-1991', 'neenasolanke@gmail.com', '391'),
(9, '1407222783', 'Sachin', 'Tendulkar', 'M', '12-5-1990', 'sachin.tendulkar@gmail.com', '392'),
(10, '1407222859', 'Yuvraj 1', 'Singh 1', 'M', '12-4-1990', '123yuvraj.singh@gmail.com', '323'),
(11, '1407222933', 'Virendra', 'Sewagh', 'M', '3-12-1990', 'verendra@gmail.com', '324'),
(12, '1407222934', 'Vikas', 'Sewalal', 'M', '4-2-1990', 'vikassewalal@gmail.com', '324'),
(13, '1407222935', 'Vikram', 'Sharma', 'M', '1-4-1990', 'vikramsharma@gmail.com', '365'),
(14, '1407222936', 'Vinay', 'Sonole', 'M', '12-2-1990', 'vinaysonole@gmail.com', '354'),
(15, '1407222937', 'Virendra', 'Sewagh', 'M', '2-1-1990', 'verendra@gmail.com', '383'),
(16, '1407743675', 'SUNIL', 'GAVASKAR', 'M', '1-12-1990', 'sunil.gavaskar@gmail.com', '383'),
(17, '1407841667', 'Ramcharan', 'TEja', 'M', '2-12-1990', 'ramcharan@gmail.com', '383'),
(18, '1409053846', 'Pravin', 'Tumsare', 'M', '1-2-1990', 'pravin.t@vsil.com', '383'),
(19, '1407223433', 'Nil', 'Jain', 'M', '5-5-1990', 'niljain@gmail.com', '390'),
(20, '1407222956', 'Ajay', 'Jain', 'M', '2-2-1990', 'ajayjain@gmail.com', '390'),
(21, '1407222965', 'Sanjay', 'Burse', 'M', '2-6-1993', 'sanjayburse@gmail.com', '383'),
(22, '1407222966', 'Nishant', 'Sargar', 'M', '12-7-1991', 'nishant@gmail.com', '383'),
(23, '1407222967', 'Rakesh', 'Sinha', 'M', '6-12-1992', 'rakeshsinha@gmail.com', '390'),
(24, '1407222968', 'Jignesh', 'Saraf', 'M', '1-2-1991', 'jignesh12@gmail.com', '383'),
(25, '1407222989', 'Dinesh', 'Netke', 'M', '15-6-1992', 'dineshnetke@gmail.com', '390'),
(26, '1407222990', 'Jinesh', 'Jain', 'M', '18-2-1993', 'jineshjain@gmail.com', '390'),
(27, '1407222946', 'Sagar', 'Rake', 'M', '5-7-1991', 'sagarrake@gmail.com', '383'),
(28, '1407222765', 'Meena', 'Warma', 'F', '5-5-1991', 'meenawarma@gmail.com', '390'),
(29, '1407222788', 'Leena', 'solanke', 'F', '3-8-1991', 'leenasolanke@gmail.com', '390'),
(30, '1407223780', 'Rina', 'Sharma', 'F', '5-8-1991', 'rinasharma@gmail.com', '383'),
(31, '1403422789', 'Anu', 'Lakde', 'F', '5-5-1990', 'anulakde@gmail.com', '391'),
(32, '1407432798', 'Janu', 'Dalavi', 'F', '4-8-1993', 'janudalavi@gmail.com', '391'),
(33, '1407542781', 'Ritu', 'Dhole', 'F', '5-6-1994', 'ritudhole@gmail.com', '391'),
(34, '1407643675', 'Raju', 'Alone', 'M', '1-6-1990', 'raju.alone@gmail.com', '390'),
(35, '1407843675', 'Amar', 'Tayde', 'M', '1-4-1990', 'amar.tayde@gmail.com', '390'),
(37, '1406743675', 'Shubham', 'Bidwai', 'M', '7-2-1990', 'shubham.bidwai@gmail.com', '390'),
(38, '1407744675', 'Saket', 'Raje', 'M', '1-2-1990', 'saket.raje@gmail.com', '383'),
(39, '1407753675', 'Nilesh', 'Sargar', 'M', '8-1-1990', 'nilu.sargar@gmail.com', '390'),
(40, '1407743676', 'Mahesh', 'Patil', 'M', '1-6-1990', 'mahesh.patil@gmail.com', '383'),
(41, '1407743677', 'Jinesh', 'Sontakke', 'M', '7-12-1990', 'jinesh.sontakke@gmail.com', '383'),
(42, '1407743678', 'Om', 'Sharma', 'M', '7-1-1993', 'om.sharma@gmail.com', '383'),
(43, '1407743679', 'Jay', 'Patil', 'M', '1-2-1991', 'jay.patil@gmail.com', '383'),
(44, '1407743679', 'Jaggu', 'Tikre', 'M', '7-2-1992', 'jaggu.tikre@gmail.com', '383'),
(45, '1407743775', 'Diya', 'Mirza', 'F', '1-5-1990', 'diya.mirza@gmail.com', '390'),
(46, '1407743875', 'Anjali', 'Warma', 'F', '5-2-1990', 'anjuwarma@gmail.com', '903'),
(47, '1407743685', 'Rucha', 'Sakle', 'F', '6-2-1990', 'rucha.sakle@gmail.com', '383'),
(48, '1407743675', 'Ashu', 'Waghmare', 'F', '8-1-1990', 'ashu.waghmare@gmail.com', '390'),
(49, '1407743605', 'Yogita', 'Rekhawar', 'F', '9-1-1992', 'yoga.rakhawar@gmail.com', '383'),
(50, '1407743625', 'Sunita', 'Rake', 'F', '10-2-1991', 'sunita.rake@gmail.com', '390');

-- --------------------------------------------------------

--
-- Table structure for table `tblcustomerinfo`
--

CREATE TABLE IF NOT EXISTS `tblcustomerinfo` (
  `id` mediumint(7) unsigned NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `mbl_no` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblproductpurchase`
--

CREATE TABLE IF NOT EXISTS `tblproductpurchase` (
  `id` mediumint(7) unsigned NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `customer_code` varchar(50) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `item_qty` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblproductpurchase`
--

INSERT INTO `tblproductpurchase` (`id`, `customer_id`, `customer_code`, `item_name`, `item_qty`) VALUES
(1, 1, '1407222781', 'Cucabura bat', '10'),
(2, 2, '1407222782', 'Adidas Helment', '3'),
(3, 3, '1407222783', 'Cucabura bat', '10'),
(4, 4, '1407222784', 'Adidas Helment', '3'),
(5, 5, '1407222785', 'Nike Anklets', '5'),
(6, 6, '1407222786', 'Nike Anklets', '6'),
(7, 7, '1407222787', 'Cucabura bat', '10'),
(8, 8, '1407222788', 'Adidas Helment', '3'),
(9, 9, '1407222783', 'Nike Anklets', '7'),
(10, 10, '1407222859', 'Adidas Helment', '3'),
(11, 11, '1407222933', 'Puma Shoo', '2'),
(12, 12, '1407222934', 'Eva perfume', '7'),
(13, 13, '1407222935', 'Ball pen', '20'),
(14, 14, '1407222936', 'Puma Shoo', '10'),
(15, 15, '1407222937', 'Eva perfume', '5'),
(16, 16, '1407743675', 'Puma Shoo', '25'),
(17, 17, '1407841667', 'Ball pen', '10'),
(18, 18, '1409053846', 'Eva perfume', '6'),
(19, 19, '1407223433', 'Puma Shoo', '40'),
(20, 20, '1407222956', 'Eva perfume', '9'),
(21, 21, '1407222965', 'Ball pen', '40'),
(22, 22, '1407222966', 'Puma Shoo', '25'),
(23, 23, '1407222967', 'Ball pen', '60'),
(24, 24, '1407222968', 'Eva perfume', '37'),
(25, 25, '1407222989', 'Ball pen', '50'),
(26, 26, '1407222990', 'Puma Shoo', '10'),
(27, 27, '1407222946', 'Eva perfume', '17'),
(28, 28, '1407222765', 'Ball pen', '30'),
(29, 29, '1407222788', 'Puma Shoo', '30'),
(30, 30, '1407223780', 'Ball pen', '10'),
(31, 31, '1403422789', 'Cucabura ball', '5'),
(32, 32, '1407432798', 'Nike Anklets', '4'),
(33, 33, '1407542781', 'Bandage', '9'),
(34, 34, '1407643675', 'Cucabura ball', '25'),
(35, 35, '1407843675', 'Nike Anklets', '4'),
(36, 37, '1406743675', 'Bandage', '9'),
(37, 38, '1407744675', 'Puma Shoo', '10'),
(38, 39, '1407753675', 'Cucabura ball', '35'),
(39, 40, '1407743676', 'Nike Anklets', '4'),
(40, 41, '1407743677', 'Bandage', '9'),
(41, 42, '1407743678', 'Puma Shoo', '10'),
(42, 43, '1407743679', 'Cucabura ball', '25'),
(43, 44, '1407743679', 'Puma Shoo', '10'),
(44, 45, '1407743775', 'Nike Anklets', '4'),
(45, 46, '1407743875', 'Bandage', '9'),
(46, 47, '1407743685', 'Puma Shoo', '10'),
(47, 48, '1407743675', 'Cucabura ball', '15'),
(48, 49, '1407743605', 'Nike Anklets', '4'),
(49, 50, '1407743625', 'Bandage', '9');

-- --------------------------------------------------------

--
-- Table structure for table `tblquries`
--

CREATE TABLE IF NOT EXISTS `tblquries` (
  `id` mediumint(7) unsigned NOT NULL,
  `quries` text
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblquries`
--

INSERT INTO `tblquries` (`id`, `quries`) VALUES
(4, 'select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer CROSS JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;'),
(5, 'SELECT c.first_name FROM  `tblcustomer` c , tblproductpurchase p where c.id = p.customer_id ANd p.item_qty = 10'),
(6, 'select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer LEFT OUTER JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;'),
(7, 'select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer LEFT OUTER JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;'),
(8, 'select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer LEFT OUTER JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;'),
(9, 'select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer CROSS JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;'),
(10, '\nSELECT * FROM tblcustomer  GROUP BY  first_name  ; '),
(11, 'SELECT * FROM tblcustomer  GROUP BY  first_name  ; '),
(12, 'SELECT c.first_name FROM  `tblcustomer` c , tblproductpurchase p where c.id = p.customer_id ANd p.item_qty = 10'),
(13, 'null'),
(14, 'SELECT * FROM  tblcustomer c , tblproductpurchase p WHERE p.id != 0 && AND c.id != 0'),
(15, 'SELECT * FROM  tblcustomer c , tblproductpurchase p WHERE p.id != 0  AND c.id != 0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblcustomer`
--
ALTER TABLE `tblcustomer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcustomerinfo`
--
ALTER TABLE `tblcustomerinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblproductpurchase`
--
ALTER TABLE `tblproductpurchase`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblquries`
--
ALTER TABLE `tblquries`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblcustomer`
--
ALTER TABLE `tblcustomer`
  MODIFY `id` mediumint(7) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=51;
--
-- AUTO_INCREMENT for table `tblcustomerinfo`
--
ALTER TABLE `tblcustomerinfo`
  MODIFY `id` mediumint(7) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `tblproductpurchase`
--
ALTER TABLE `tblproductpurchase`
  MODIFY `id` mediumint(7) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT for table `tblquries`
--
ALTER TABLE `tblquries`
  MODIFY `id` mediumint(7) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
