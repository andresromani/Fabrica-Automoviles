-- MariaDB dump 10.17  Distrib 10.4.14-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: fabrica_autos
-- ------------------------------------------------------
-- Server version	10.4.14-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `automoviles`
--

DROP TABLE IF EXISTS `automoviles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `automoviles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `variante` enum('sedan','familiar','coupe') DEFAULT NULL,
  `costo` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `automoviles`
--

LOCK TABLES `automoviles` WRITE;
/*!40000 ALTER TABLE `automoviles` DISABLE KEYS */;
INSERT INTO `automoviles` VALUES (1,'sedan',295000.00),(2,'sedan',242000.00),(3,'sedan',262000.00),(4,'familiar',291000.00),(5,'familiar',298000.00),(6,'familiar',257000.00),(7,'coupe',289000.00),(8,'coupe',323000.00),(9,'coupe',335000.00),(10,'sedan',230000.00),(11,'familiar',245000.00),(12,'coupe',270000.00),(13,'sedan',283000.00);
/*!40000 ALTER TABLE `automoviles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opcionales`
--

DROP TABLE IF EXISTS `opcionales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opcionales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_automovil` int(11) NOT NULL,
  `techo_corredizo` bit(1) DEFAULT b'0',
  `aire_acondicionado` bit(1) DEFAULT b'0',
  `frenos_abs` bit(1) DEFAULT b'0',
  `airbag` bit(1) DEFAULT b'0',
  `llantas_aleacion` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`),
  KEY `id_automovil` (`id_automovil`),
  CONSTRAINT `opcionales_ibfk_1` FOREIGN KEY (`id_automovil`) REFERENCES `automoviles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opcionales`
--

LOCK TABLES `opcionales` WRITE;
/*!40000 ALTER TABLE `opcionales` DISABLE KEYS */;
INSERT INTO `opcionales` VALUES (1,1,'','','','',''),(2,2,'','\0','\0','\0','\0'),(3,3,'','','\0','\0','\0'),(4,4,'','','','\0','\0'),(5,5,'','','','','\0'),(6,6,'\0','\0','\0','\0',''),(7,7,'\0','\0','\0','',''),(8,8,'\0','','','',''),(9,9,'','','','',''),(10,13,'\0','','','','');
/*!40000 ALTER TABLE `opcionales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-22 14:01:19
