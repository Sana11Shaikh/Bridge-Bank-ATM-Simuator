-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bankmgmtsystem
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank` (
  `PIN` varchar(20) DEFAULT NULL,
  `Deposit_Date` datetime DEFAULT NULL,
  `Type` varchar(30) DEFAULT NULL,
  `Amount` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` VALUES ('8600','2025-09-09 01:28:01','Deposit','10000'),('8600','2025-09-09 01:28:13','Withdrawl','1000'),('8600','2025-09-09 02:13:55','Deposit','1500'),('8600','2025-09-09 02:14:04','Withdrawl','2000'),('8600','2025-09-09 03:20:05','Deposit','250');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `formno` varchar(30) DEFAULT NULL,
  `CardNumber` varchar(30) DEFAULT NULL,
  `PinNumber` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('4180','5040935992506629','4562'),('2284','5040935967976540','7853'),('3005','5040936021291742','4303'),('789','5040935998019996','4986'),('9246','5040936043984499','8600');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `formno` varchar(30) NOT NULL,
  `your_name` varchar(30) DEFAULT NULL,
  `father_name` varchar(30) DEFAULT NULL,
  `surname` varchar(30) DEFAULT NULL,
  `DOB` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `marital_status` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `pincode` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`formno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('2284','Sanaparvin','Rafik','Shaikh','Nov 26, 2003','Female','Unmarried','alkshdfljksadh1212@gmail.com','lakjdhfljd','111111','mh'),('3005','Aarati ','Ganesh','Dhande','Oct 17, 2002','Female','Married','shiakhsana123@gmail.com','Pune','0000000','Maharashtra'),('4180','Sanaparvin','Rafik','Shaikh','Nov 26, 2003','Female','Unmarried','shiakhsana123@gmail.com','At.Lapali,Dist-Buldana','443101','Maharashtra'),('789','Apurva','Avinash','vanjari','Jun 1, 2003','Female','Unmarried','apurvavanjari123@gmail.com','Bodwad','425310','Maharashtra'),('9246','Jagruti ','Ashok','Gite','Nov 26, 2001','Female','Unmarried','gitejagruti123@gmail.com','Lohara','111111','Maharashtra');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signupthree`
--

DROP TABLE IF EXISTS `signupthree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signupthree` (
  `formno` varchar(30) DEFAULT NULL,
  `AccountType` varchar(50) DEFAULT NULL,
  `CardNumber` varchar(30) DEFAULT NULL,
  `PinNumber` varchar(10) DEFAULT NULL,
  `Facility` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signupthree`
--

LOCK TABLES `signupthree` WRITE;
/*!40000 ALTER TABLE `signupthree` DISABLE KEYS */;
INSERT INTO `signupthree` VALUES ('4180','Saving Account','5040935992506629','4562','  ATM Card'),('2284','Saving Account','5040935967976540','7853','  ATM Card'),('3005','Saving Account','5040936021291742','4303','  ATM Card'),('789','Saving Account','5040935998019996','4986','  ATM Card'),('9246','Saving Account','5040936043984499','8600','  ATM Card  Cheque Book');
/*!40000 ALTER TABLE `signupthree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signuptwo`
--

DROP TABLE IF EXISTS `signuptwo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signuptwo` (
  `formno` varchar(30) DEFAULT NULL,
  `Religion` varchar(30) DEFAULT NULL,
  `Category` varchar(30) DEFAULT NULL,
  `Income` varchar(30) DEFAULT NULL,
  `Education` varchar(30) DEFAULT NULL,
  `Occupation` varchar(30) DEFAULT NULL,
  `PAN` varchar(30) DEFAULT NULL,
  `Aadhar_No` varchar(30) DEFAULT NULL,
  `SeniorCitizen` varchar(30) DEFAULT NULL,
  `Existing_account` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signuptwo`
--

LOCK TABLES `signuptwo` WRITE;
/*!40000 ALTER TABLE `signuptwo` DISABLE KEYS */;
INSERT INTO `signuptwo` VALUES ('4180','Muslim','General','<5,00,000','Graduate','Student','111111111111111111111','11111111111111111111111','No','No'),('2284','Muslim','General','<10,00,000','Graduate','Student','2333333333','42222222223','No','No'),('3005','Hindu','OBC','<3,00,000','Graduate','Student','11111111111111111','121212121212212','No','No'),('789','Hindu','NT','<5,00,000','Graduate','Student','000000000000000000000','0000000000000000000','No','No'),('9246','Hindu','OBC','<2,00,000','Graduate','Student','2121212121212121','11111333333333','No','No');
/*!40000 ALTER TABLE `signuptwo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-09  4:22:57
