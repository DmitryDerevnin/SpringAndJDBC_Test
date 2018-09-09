-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `enrollees`
--

DROP TABLE IF EXISTS `enrollees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `enrollees` (
  `idEnrollee` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `Faculty_id` int(11) DEFAULT NULL,
  `Certificate_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEnrollee`),
  KEY `fk_Enrollees_Faculty_idx` (`Faculty_id`),
  KEY `fk_Enrollees_Certificate1_idx` (`Certificate_id`),
  CONSTRAINT `fk_Enrollees_Certificate1` FOREIGN KEY (`Certificate_id`) REFERENCES `certificate` (`idcertificate`),
  CONSTRAINT `fk_Enrollees_Faculty` FOREIGN KEY (`Faculty_id`) REFERENCES `faculty` (`idfaculty`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollees`
--

LOCK TABLES `enrollees` WRITE;
/*!40000 ALTER TABLE `enrollees` DISABLE KEYS */;
INSERT INTO `enrollees` VALUES (1,'Oleg','Efremov',NULL,NULL),(2,'Valentin','Nekrasov',NULL,NULL),(3,'Faina','Drozdova',NULL,NULL),(4,'Liliya','Kabanova',NULL,NULL),(5,'Aleksey','Sobolev',NULL,NULL),(6,'Anatoly','Makarov',NULL,NULL);
/*!40000 ALTER TABLE `enrollees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-09 13:06:10
