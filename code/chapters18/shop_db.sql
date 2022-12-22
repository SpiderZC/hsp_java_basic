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
-- Table structure for table `goods`
--

DROP DATABASE IF  EXISTS 'shop_db';
CREATE DATABASE shop_db;
use shop_db;

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods` (
  `goods_id` INT PRIMARY KEY,
  `goods_name` varchar(64) NOT NULL DEFAULT '',
  `unitprice` DECIMAL(10, 2) NOT NULL DEFAULT 0 check(unitprice >= 1.0 and unitprice <= 9999.99),
  `category` INT NOT NULL DEFAULT 0,
  `provider` varchar(64) NOT NULL DEFAULT ''
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` INT PRIMARY KEY,
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `address` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `email` varchar(64) unique COLLATE utf8mb4_unicode_ci NOT NULL,
  `sex` ENUM('man', 'woman') NOT NULL,
  `card_id` char(18) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase` (
  `order_id` INT UNSIGNED PRIMARY KEY,
  `customer_id` INT NOT NULL DEFAULT 0,
  `goods_id` INT NOT NULL DEFAULT 0,
  `nums` INT NOT NULL DEFAULT 0,
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
  FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
) ENGINE=InnoDB;
