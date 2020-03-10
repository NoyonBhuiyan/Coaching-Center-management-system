-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema studentinfo
--

CREATE DATABASE IF NOT EXISTS studentinfo;
USE studentinfo;

--
-- Definition of table `batch41`
--

DROP TABLE IF EXISTS `batch41`;
CREATE TABLE `batch41` (
  `id` int(5) NOT NULL,
  `Name` varchar(30) default NULL,
  `ContactNumber` varchar(13) NOT NULL,
  `FatherName` varchar(30) default NULL,
  `FatherContact` varchar(13) default NULL,
  `MotherName` varchar(30) default NULL,
  `MotherContact` varchar(13) default NULL,
  `Class` varchar(30) default NULL,
  `CollegeName` varchar(45) default NULL,
  `Subjects` varchar(45) default NULL,
  `BatchTime` varchar(30) default NULL,
  `Email` varchar(30) default NULL,
  `Address` varchar(45) default NULL,
  PRIMARY KEY  USING BTREE (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batch41`
--

/*!40000 ALTER TABLE `batch41` DISABLE KEYS */;
INSERT INTO `batch41` (`id`,`Name`,`ContactNumber`,`FatherName`,`FatherContact`,`MotherName`,`MotherContact`,`Class`,`CollegeName`,`Subjects`,`BatchTime`,`Email`,`Address`) VALUES 
 (1,'Noyon bhuiyan','01757106038','Ezabat Ullah','01912661620','Monowara Begum','01937811599','XII','Notre Dame College','Physics Math Biology ','Morning','noyonbhuiyan022@gmail.com','Demra,Dhaka.'),
 (2,'Abdul Mojid','01789454567','Abdul Jalil','01897867098','Hasina Begum','01678765789','XI','Srishty College','Physics ','Morning','abdulmojid@gmail.com','Goran,Khilgaon,Dhaka.'),
 (3,'Borhan Uddin','01789454567','Jamil Uddin','01897867098','Khaleda Akter','01678765789','XII','TNT College','Physics ','Afternoon','borhanuddin@gmail.com','Motijheel,Dhaka.'),
 (4,'Moshiur Rahman','01789454567','Khalilur Rahman','01897867098','Bilkis Begum','01678765789','XI','Dhanmondi Ideal College','Physics ','Morning','moshiurrahman@gmail.com','Jatrabari,Dhaka.'),
 (5,'Mastura Binte Mozammel','01765876787','Gazi Rahim Ullah','01876787678','Monowara Khatun','01980569012','XI','Rajshahi College','Chemistry ','Morning','masturabinte@gmail,com','Malibagh,Dhaka.'),
 (6,'Iftekhar Hossain','01765876787','Enamul Hossain','01876787678','Rahima Akter','01980569012','XII','Tejgaon College','Physics ','Afternoon','iftekhahrossain@gmail.com','Gazipur.'),
 (7,'Nur Mohammad','01965876787','Mohammad Akter Hossain','01876787678','Selina Akter','01780569012','XI','Govt, Science College','Physics ','Morning','nurmohammad@gmail.com','Mohakhali'),
 (8,'Foysal Hossain','01665876787','Azmir Hossain','01776787678','Parvin Akter','01380569012','XII','BAF Shaheen College','Physics ','Afternoon','foysalhossain@gmail.com','Shahjahanpur,Dhaka.'),
 (9,'Sheikh Helal','01565876787','Sheikh Jamal','01676787678','Parul Begum','01880569012','XI','Tolaram College','Physics ','Morning','helalsheikh@gmail.com','Narayangonj.'),
 (10,'Sayem Shikder','01765876787','Ershad Shikder','01876787678','Ivy Rahman','01880569012','XII','Dhaka City College','Physics ','Afternoon','sayemshikder@gmail.com','Wari,Dhaka,'),
 (11,'Piarul Hasan','01784564356','Mohammad Haque','01784567123','Asma Khatun','01783459105','XI','Adamji Cantonment College','Physics ','Morning','piarulhasan@gmail.com','Uttora,Dhaka.'),
 (12,'fghgh','665656','thhjhgjhg','5465665','ghyjyj','656565','XII','fghjyyuj','nullChemistry ','Afternoon','fghyjyj','rtyuyuyy'),
 (13,'frtyht','45466','yhtyytuyu','546566','fgfhy','56566','XI','rgthyytuy','Chemistry Math Biology ','Morning','rgtryyuyt','rgthytyjyt'),
 (14,'gghtyhty','65676576','ghgtyyy','654657','ghhjhj','6546','XII','gtrhyhjuy','Physics Biology ','Afternoon','tyhtyuhytu','rtyyujy');
/*!40000 ALTER TABLE `batch41` ENABLE KEYS */;


--
-- Definition of table `biologyteachers`
--

DROP TABLE IF EXISTS `biologyteachers`;
CREATE TABLE `biologyteachers` (
  `Name` varchar(30) NOT NULL,
  `Institution` varchar(30) default NULL,
  `Department` varchar(10) default NULL,
  `ContactNumber` varchar(13) default NULL,
  `Status` varchar(15) default NULL,
  PRIMARY KEY  (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `biologyteachers`
--

/*!40000 ALTER TABLE `biologyteachers` DISABLE KEYS */;
INSERT INTO `biologyteachers` (`Name`,`Institution`,`Department`,`ContactNumber`,`Status`) VALUES 
 ('','fdvgfbvf','fdgfbfg','43543534','ffffdgff'),
 ('Azhar Islam','DMC','MBBS','01675432316','Best'),
 ('dfdfvg','cxfvcvcv','fcvcvc','54565','fvbbvbn'),
 ('fffgfd','fdvgfbvf','fdgfbfg','43543534','ffffdgff'),
 ('fgfg','fgfgf','fgfgf','fgfgfd','gfdgfgf'),
 ('gghfgthh','fghhfjhj','gghhghgfh','56546767','dffghfgjh'),
 ('Jerin Jahan','DMC','MBBS','01788655566','Better'),
 ('Mumtahina Tabassum','SIMC','MBBS','01675434556','Better'),
 ('Noor Sourov','SIMC','MBBS','01786549087','Best'),
 ('Tazin Rahman','DMC','MBBS','0189876545','Better'),
 ('Tuhin Khan','RMC','MBBS','01897654490','Better');
/*!40000 ALTER TABLE `biologyteachers` ENABLE KEYS */;


--
-- Definition of table `chemistryteachers`
--

DROP TABLE IF EXISTS `chemistryteachers`;
CREATE TABLE `chemistryteachers` (
  `Name` varchar(30) NOT NULL,
  `Institution` varchar(30) default NULL,
  `Department` varchar(10) default NULL,
  `ContactNumber` varchar(13) default NULL,
  `Status` varchar(15) default NULL,
  PRIMARY KEY  (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chemistryteachers`
--

/*!40000 ALTER TABLE `chemistryteachers` DISABLE KEYS */;
INSERT INTO `chemistryteachers` (`Name`,`Institution`,`Department`,`ContactNumber`,`Status`) VALUES 
 ('Aninda','BUET','CE','01678767876','Best'),
 ('cvfgfg','gfgfgfgfgfgf','fgfgfg','gfgfgh','fgfgfghh'),
 ('dfdffdfd','vvff','dvfvf','454554','dffgfdgf'),
 ('dffdfg','vfggfgf','fdfggffg','4354544','fdfggf'),
 ('dfgdfgfd','dggfdg','fdgdfgdf','43545','ggghh'),
 ('dfgdg','dfggg','dsfggfg','3243543','hgfhfgh'),
 ('ggg','gggt','grgt','4353454','fgdfgfdg'),
 ('Maruf Ahmed','BUET','CE','01987654329','Best'),
 ('Miftu Mohammad','BUET','CSC','01897654324','Best'),
 ('Rongon Ahmed','DU','Chemistry','01876886677','Better'),
 ('sdfdsfdsf','dsfdsfdf','dffgg','5435455','dsfdd'),
 ('sdfsdfgdg','dfgfggfdgh','fdsgfdgfg','435346546','dfdsgdfgfh'),
 ('Sojib Hawladar','DMC','MBBS','01679879564','Better');
/*!40000 ALTER TABLE `chemistryteachers` ENABLE KEYS */;


--
-- Definition of table `creditlist`
--

DROP TABLE IF EXISTS `creditlist`;
CREATE TABLE `creditlist` (
  `Srl_no` int(10) unsigned NOT NULL auto_increment,
  `Amount` int(10) unsigned default '0',
  `CreditDate` varchar(45) default NULL,
  `Purpose` varchar(45) default NULL,
  `Details` varchar(45) default NULL,
  `Month` varchar(45) default NULL,
  `Year` varchar(45) default NULL,
  PRIMARY KEY  (`Srl_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `creditlist`
--

/*!40000 ALTER TABLE `creditlist` DISABLE KEYS */;
INSERT INTO `creditlist` (`Srl_no`,`Amount`,`CreditDate`,`Purpose`,`Details`,`Month`,`Year`) VALUES 
 (1,10,'2000-00-00','ZZZ','ZZ',NULL,NULL),
 (2,8000,'2019-12-04',NULL,NULL,NULL,NULL),
 (3,10500,'2019-12-05','Student Payment',NULL,NULL,NULL),
 (4,5500,'2019-12-06','Student Payment','N/A',NULL,NULL),
 (5,546,'2019-11-08','Books Payment','fgfghh','November',NULL),
 (6,566,'2019-12-06','Profit','hghghg','December',NULL),
 (8,3000,'2019-12-08','--Select Credit Purpose--','hghjhjgj','December','2019'),
 (9,5000,'2019-02-05','Student Payment','th','February','2019');
/*!40000 ALTER TABLE `creditlist` ENABLE KEYS */;


--
-- Definition of table `debitlist`
--

DROP TABLE IF EXISTS `debitlist`;
CREATE TABLE `debitlist` (
  `Srl_no` varchar(10) NOT NULL default '',
  `Amount` int(10) NOT NULL,
  `DebitDate` varchar(30) default NULL,
  `Purpose` varchar(45) default NULL,
  `Details` varchar(45) default NULL,
  `Month` varchar(45) default NULL,
  `Year` varchar(45) default NULL,
  PRIMARY KEY  USING BTREE (`Srl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `debitlist`
--

/*!40000 ALTER TABLE `debitlist` DISABLE KEYS */;
INSERT INTO `debitlist` (`Srl_no`,`Amount`,`DebitDate`,`Purpose`,`Details`,`Month`,`Year`) VALUES 
 ('1',3000,'2019-11-15','Office Equipments','Papers,Pens,Marker pen.',NULL,NULL),
 ('2',500,'2019-12-30','--Select Debit Purpose--','dfgghgh',NULL,NULL),
 ('6',5676,'2019-12-06','Monthly Bills','gfhgfhg','December',NULL),
 ('8',5000,'2018-11-14','Monthly Bills','Elictricity bill','November','2018');
/*!40000 ALTER TABLE `debitlist` ENABLE KEYS */;


--
-- Definition of table `finaltest`
--

DROP TABLE IF EXISTS `finaltest`;
CREATE TABLE `finaltest` (
  `id` varchar(10) NOT NULL,
  `Name` varchar(10) default NULL,
  `Class` varchar(10) default NULL,
  `Physics` varchar(10) default NULL,
  `Chemistry` varchar(10) default NULL,
  `Math` varchar(10) default NULL,
  `Biology` varchar(10) default NULL,
  `ExamDate` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finaltest`
--

/*!40000 ALTER TABLE `finaltest` DISABLE KEYS */;
INSERT INTO `finaltest` (`id`,`Name`,`Class`,`Physics`,`Chemistry`,`Math`,`Biology`,`ExamDate`) VALUES 
 ('1','Noyon',NULL,'46','45','40','40','2019-12-06');
/*!40000 ALTER TABLE `finaltest` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(45) default NULL,
  `password` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`id`,`username`,`password`) VALUES 
 (1,'admin','idb');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `mathteachers`
--

DROP TABLE IF EXISTS `mathteachers`;
CREATE TABLE `mathteachers` (
  `Name` varchar(30) NOT NULL,
  `Institution` varchar(30) default NULL,
  `Department` varchar(10) default NULL,
  `ContactNumber` varchar(13) default NULL,
  `Status` varchar(15) default NULL,
  PRIMARY KEY  (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mathteachers`
--

/*!40000 ALTER TABLE `mathteachers` DISABLE KEYS */;
INSERT INTO `mathteachers` (`Name`,`Institution`,`Department`,`ContactNumber`,`Status`) VALUES 
 ('cddddd','dfcdvfdvfdv','ddssddsfv','cdvdvdvd','cdvcdvdvdcvd'),
 ('dsffsg','','','',''),
 ('fdfggfgf','fggfgfgf','fdfgfgfg','4545454','dffdfd'),
 ('fgfgf','','','',''),
 ('Iftekhar Mahmud','BUET','CSE','01987657987','Best'),
 ('Jhinuk','BUET','EEE','01786543290','Better'),
 ('Nishat','BUET','CIVIL','01789765899','Better'),
 ('Plabon','BUET','ME','01987098789','Best'),
 ('sdfdg','','','',''),
 ('Shawkot Jahangir ','DU','Mathmetics','01765432190','Better');
/*!40000 ALTER TABLE `mathteachers` ENABLE KEYS */;


--
-- Definition of table `paidduelist`
--

DROP TABLE IF EXISTS `paidduelist`;
CREATE TABLE `paidduelist` (
  `Id` varchar(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `ClassNo` varchar(10) default NULL,
  `Subjects` varchar(50) default NULL,
  `BatchTime` varchar(20) default NULL,
  `PayableAmount` varchar(10) default NULL,
  `PaymentStatus` varchar(10) default NULL,
  `PaidDueDate` varchar(45) default NULL,
  `StudentPhoneNumber` varchar(13) default NULL,
  `FatherPhoneNumber` varchar(13) default NULL,
  `Month` varchar(45) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paidduelist`
--

/*!40000 ALTER TABLE `paidduelist` DISABLE KEYS */;
INSERT INTO `paidduelist` (`Id`,`Name`,`ClassNo`,`Subjects`,`BatchTime`,`PayableAmount`,`PaymentStatus`,`PaidDueDate`,`StudentPhoneNumber`,`FatherPhoneNumber`,`Month`) VALUES 
 ('1','Noyon Bhuiyan','XI','Physics ','Afternoon','5000','Paid','2019-12-05','017864554','016789078',NULL),
 ('2','Mojid','XII','Chemistry ','Afternoon','2500','paid','2019-12-03','01897654889','01677888908',NULL),
 ('3','dsfdgfg','XI','Chemistry Biology ','Afternoon','3000','due','2019-12-04','5454545','4545646',NULL),
 ('4','fgfhgh','XI','Physics Chemistry Math ','Morning','3000','Due','2019-12-05','43554565','35465656',NULL),
 ('5','sdfsdgfg','XII','Physics Chemistry Math ','Morning','3000','Paid','2019-12-05','344545','3454566',NULL),
 ('50','dffggfgf','XII','Chemistry ','Morning','2500','paid','2019-12-06','45545656','34435454',NULL),
 ('6','fggf','XI','Physics Chemistry ','Afternoon','2500','Paid','2019-12-05','34546456','3454545',NULL);
/*!40000 ALTER TABLE `paidduelist` ENABLE KEYS */;


--
-- Definition of table `physicsteachers`
--

DROP TABLE IF EXISTS `physicsteachers`;
CREATE TABLE `physicsteachers` (
  `Name` varchar(30) NOT NULL,
  `Institutions` varchar(30) default NULL,
  `Department` varchar(10) default NULL,
  `ContactNumber` varchar(13) default NULL,
  `Status` varchar(15) default NULL,
  PRIMARY KEY  (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `physicsteachers`
--

/*!40000 ALTER TABLE `physicsteachers` DISABLE KEYS */;
INSERT INTO `physicsteachers` (`Name`,`Institutions`,`Department`,`ContactNumber`,`Status`) VALUES 
 ('Bappy Chowdhury','BUET','SE','01899876677','Best'),
 ('Barun Kanti Das','BUET','EEE','01678443301','Best'),
 ('dddfgfdg','vdfgfdgfgfd','dfdfgfgfdg','34345654','gfdgfghg'),
 ('fdgfdgfdg','dfggfhgfh','gfghhfgh','345654567','fghfghfh'),
 ('fgfgf','fdghgfhgf','fdgfgg','fgfgfhg','fdghgfhgf'),
 ('fgfggfgf','fggfgfgf','fdfgfgfg','4545454','dffdfd'),
 ('gdfgghfgh','gfgfhgh','fgdfgfgf','5565466','dsfgghgf'),
 ('gfdfgfgb','ffbgffg','ffggfgbg','55546556','gvfdhghbgf'),
 ('gfgfdgf','fbgbb','fghghgfh','556565','ffgghbgfh'),
 ('Hasan mahmud','BUET','EEE','0178976565','Best'),
 ('Plabon','BUET','ME','01898789065','Best'),
 ('Saiful Islam','BUET','CSE','01785645328','Better'),
 ('Sanim Rahman','BUET','CSE','01987756777','Better'),
 ('Tahera Khatun','DU','Physics','01876543295','Better'),
 ('Tushar','BUET','EEE','01786544345','Better');
/*!40000 ALTER TABLE `physicsteachers` ENABLE KEYS */;


--
-- Definition of table `quiztest`
--

DROP TABLE IF EXISTS `quiztest`;
CREATE TABLE `quiztest` (
  `id` varchar(10) NOT NULL,
  `Name` varchar(10) default NULL,
  `Class` varchar(10) default NULL,
  `Physics` varchar(10) default '0',
  `Chemistry` varchar(10) default '0',
  `Math` varchar(10) default '0',
  `Biology` varchar(10) default '0',
  `ExamDate` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quiztest`
--

/*!40000 ALTER TABLE `quiztest` DISABLE KEYS */;
INSERT INTO `quiztest` (`id`,`Name`,`Class`,`Physics`,`Chemistry`,`Math`,`Biology`,`ExamDate`) VALUES 
 ('1','aD','XI','40','40','48','50','2019-12-12'),
 ('2','ef','XI','63','76','0','0','2019-12-17'),
 ('3','fgfr','XI','45','40','30','38','2019-12-05'),
 ('4','sdfdf','XII','30','40','50','40','2019-12-04'),
 ('5','vgbgfbng','XI','50','45','45','45','2019-12-18');
/*!40000 ALTER TABLE `quiztest` ENABLE KEYS */;


--
-- Definition of table `temp`
--

DROP TABLE IF EXISTS `temp`;
CREATE TABLE `temp` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `amount` int(10) unsigned default '0',
  `creditdate` varchar(45) default NULL,
  `purpose` varchar(45) default NULL,
  `detail` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temp`
--

/*!40000 ALTER TABLE `temp` DISABLE KEYS */;
INSERT INTO `temp` (`id`,`amount`,`creditdate`,`purpose`,`detail`) VALUES 
 (1,3000,'2019-12-06',NULL,NULL);
/*!40000 ALTER TABLE `temp` ENABLE KEYS */;


--
-- Definition of table `tempresult`
--

DROP TABLE IF EXISTS `tempresult`;
CREATE TABLE `tempresult` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) default NULL,
  `Class` varchar(45) default NULL,
  `Physics` varchar(45) default NULL,
  `Chemistry` varchar(45) default NULL,
  `Math` varchar(45) default NULL,
  `Biology` varchar(45) default NULL,
  `ExamDate` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tempresult`
--

/*!40000 ALTER TABLE `tempresult` DISABLE KEYS */;
INSERT INTO `tempresult` (`id`,`Name`,`Class`,`Physics`,`Chemistry`,`Math`,`Biology`,`ExamDate`) VALUES 
 (1,'aD','XI','40','40','48','50','2019-12-12');
/*!40000 ALTER TABLE `tempresult` ENABLE KEYS */;


--
-- Definition of table `tempresult2`
--

DROP TABLE IF EXISTS `tempresult2`;
CREATE TABLE `tempresult2` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) default NULL,
  `Class` varchar(45) default NULL,
  `Physics` varchar(45) default NULL,
  `Chemistry` varchar(45) default NULL,
  `Math` varchar(45) default NULL,
  `Biology` varchar(45) default NULL,
  `ExamDate` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tempresult2`
--

/*!40000 ALTER TABLE `tempresult2` DISABLE KEYS */;
INSERT INTO `tempresult2` (`id`,`Name`,`Class`,`Physics`,`Chemistry`,`Math`,`Biology`,`ExamDate`) VALUES 
 (2,'null','null','null','null','null','null','null');
/*!40000 ALTER TABLE `tempresult2` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
