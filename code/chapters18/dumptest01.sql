-- MySQL dump 10.13  Distrib 8.0.31, for Linux (x86_64)
--
-- Host: localhost    Database: test01
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept` (
  `deptno` mediumint unsigned NOT NULL DEFAULT '0',
  `dname` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `loc` varchar(13) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES (10,'ACCOUNTING','NEW YORK'),(20,'RESEARCH','DALLAS'),(30,'SALES','CHICAGO'),(40,'OPERATIONS','BOSTON');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `empno` mediumint unsigned NOT NULL DEFAULT '0',
  `ename` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `job` varchar(9) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `mgr` mediumint unsigned DEFAULT NULL,
  `hiredate` date NOT NULL,
  `sal` decimal(7,2) NOT NULL,
  `comm` decimal(7,2) DEFAULT NULL,
  `deptno` mediumint unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (7369,'SMITH','CLERK',7902,'1990-12-17',800.00,NULL,20),(7499,'ALLEN','SALESMAN',7698,'1991-02-20',1600.00,300.00,30),(7521,'WARD','SALESMAN',7698,'1991-02-22',1250.00,500.00,30),(7566,'JONES','MANAGER',7839,'1991-04-02',2975.00,NULL,20),(7654,'MARTIN','SALESMAN',7698,'1991-09-28',1250.00,1400.00,30),(7698,'BLAKE','MANAGER',7839,'1991-05-01',2850.00,NULL,30),(7782,'CLARK','MANAGER',7839,'1991-06-09',2450.00,NULL,10),(7788,'SCOTT','ANALYST',7566,'1997-04-19',3000.00,NULL,20),(7839,'KING','PRESIDENT',NULL,'1991-11-17',5000.00,NULL,10),(7844,'TURNER','SALESMAN',7698,'1991-09-08',1500.00,NULL,30),(7900,'JAMES','CLERK',7698,'1991-12-03',950.00,NULL,30),(7902,'FORD','ANALYST',7566,'1991-12-03',3000.00,NULL,20),(7934,'MILLER','CLERK',7782,'1991-01-23',1300.00,NULL,10);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salgrade`
--

DROP TABLE IF EXISTS `salgrade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salgrade` (
  `grade` mediumint unsigned NOT NULL DEFAULT '0',
  `losal` decimal(17,2) NOT NULL,
  `hisal` decimal(17,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salgrade`
--

LOCK TABLES `salgrade` WRITE;
/*!40000 ALTER TABLE `salgrade` DISABLE KEYS */;
INSERT INTO `salgrade` VALUES (1,700.00,1200.00),(2,1201.00,1400.00),(3,1401.00,2000.00),(4,2001.00,3000.00),(5,3001.00,9999.00);
/*!40000 ALTER TABLE `salgrade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL DEFAULT '1',
  `name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `chinese` float NOT NULL DEFAULT '0',
  `english` float NOT NULL DEFAULT '0',
  `math` float NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'顺子',89,78,90),(2,'张飞',67,98,56),(3,'宋江',87,78,77),(4,'关羽',88,98,90),(5,'赵云',82,84,67),(6,'欧阳峰',55,85,45),(7,'黄蓉',75,65,30);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-03 17:36:16
