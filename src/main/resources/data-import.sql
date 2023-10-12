-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: jobs
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Dumping data for table `applicants`
--

LOCK TABLES `applicants` WRITE;
/*!40000 ALTER TABLE `applicants` DISABLE KEYS */;
INSERT INTO `applicants` VALUES (1,'New York','USA','john.doe@example.com','123 Main Street','John','Doe','+1 (555) 555-5555','Apt 2B','NY'),(2,'Los Angeles','USA','jane.smith@example.com','456 Oak Avenue','Jane','Smith','+1 (555) 555-5555','Suite 100','CA'),(3,'London','UK','david.jones@example.com','789 Park Lane','David','Jones','+44 20 5555 5555','Flat 3','London'),(4,'Berlin','Germany','susan.wong@example.com','101 Green Street','Susan','Wong','+49 30 5555 5555','Apt 4','Berlin'),(5,'Toronto','Canada','michael.nguyen@example.com','202 Maple Drive','Michael','Nguyen','+1 (555) 555-5555','Suite 200','ON'),(6,'Sydney','Australia','emily.wilson@example.com','303 Pine Road','Emily','Wilson','+61 2 5555 5555','Unit 5','NSW'),(7,'Paris','France','marie.dupont@example.com','404 Elm Boulevard','Marie','Dupont','+33 1 55 55 55 55','Apartment 6','Paris'),(8,'Madrid','Spain','pablo.gonzalez@example.com','505 Cedar Crescent','Pablo','Gonzalez','+34 91 555 55 55','Apt 7','Madrid'),(9,'Tokyo','Japan','yuki.nakamura@example.com','606 Bamboo Lane','Yuki','Nakamura','+81 3 5555 5555','Apt 9C','Tokyo'),(10,'Mumbai','India','deepak.sharma@example.com','707 Lotus Court','Deepak','Sharma','+91 22 5555 5555','Flat 12','MH'),(11,'Mexico City','Mexico','laura.hernandez@example.com','808 Rose Street','Laura','Hernandez','+52 55 5555 5555','Unit 300','Mexico City'),(12,'Sao Paulo','Brazil','pedro.silva@example.com','909 Sun Avenue','Pedro','Silva','+55 11 5555 5555','Suite 400','Sao Paulo'),(13,'Seoul','South Korea','min-ji.kim@example.com','1010 Cherry Lane','Min Ji','Kim','+82 2 5555 5555','Floor 3','Seoul'),(14,'Moscow','Russia','ivan.petrov@example.com','1111 Birch Road','Ivan','Petrov','+7 495 555 55 55','Apartment 7','Moscow'),(15,'Dubai','UAE','fatima.ali@example.com','1212 Palm Drive','Fatima','Ali','+971 4 555 5555','Unit 15','Dubai'),(16,'Singapore','Singapore','wei.lim@example.com','1313 Orchid Street','Wei','Lim','+65 5555 5555','Block 8','Singapore'),(17,'Hong Kong','Hong Kong','kai.chen@example.com','1414 Bamboo Lane','Kai','Chen','+852 5555 5555','Flat A','Hong Kong'),(18,'Rome','Italy','giulia.moretti@example.com','1515 Olive Court','Giulia','Moretti','+39 06 5555 5555','Apartment 10','Rome'),(19,'Istanbul','Turkey','emir.yilmaz@example.com','1616 Cypress Drive','Emir','Yilmaz','+90 212 555 5555','Kat 4','Istanbul'),(20,'Bangkok','Thailand','sirinrat.somboon@example.com','1717 Lotus Court','Sirinrat','Somboon','+66 2 5555 5555','Room 20','Bangkok');
/*!40000 ALTER TABLE `applicants` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-12 19:34:01


-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: jobs
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Dumping data for table `employers`
--

LOCK TABLES `employers` WRITE;
/*!40000 ALTER TABLE `employers` DISABLE KEYS */;
INSERT INTO `employers` VALUES (1,'ibm@gmail.com','IBM'),(2,'ddroidd@gmail.com','Ddroidd');
/*!40000 ALTER TABLE `employers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-12 19:34:01



-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: jobs
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Dumping data for table `joblistings`
--

LOCK TABLES `joblistings` WRITE;
/*!40000 ALTER TABLE `joblistings` DISABLE KEYS */;
INSERT INTO `joblistings` VALUES (1,'We are seeking a skilled Software Engineer to join our dynamic development team.','Software Engineer',1),(2,' We are looking for a results-driven Marketing Manager to lead our marketing efforts.','Marketing Manager',1),(3,'We are hiring a Data Analyst to join our analytics team.','Data Analyst',1),(4,'We are seeking a Customer Support Specialist to provide exceptional service to our customers.','Customer Support Specialist',1),(5,'We are looking for a talented Graphic Designer to join our creative team.','Graphic Designer',1),(6,'We are currently seeking a detail-oriented Financial Analyst to join our finance team.','Financial Analyst',2),(7,'We are hiring a Human Resources Coordinator to support our HR team.','Human Resources Coordinator',2),(8,'We are looking for an experienced Product Manager to lead the development and launch of new products.','Product Manager',2),(9,'We are seeking an Operations Manager to oversee daily business operations.','Operations Manager',2),(10,'We are looking for a motivated Sales Representative to join our sales team.','Sales Representative',2);
/*!40000 ALTER TABLE `joblistings` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-12 19:34:01



-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: jobs
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Dumping data for table `job_listing_applicant`
--

LOCK TABLES `job_listing_applicant` WRITE;
/*!40000 ALTER TABLE `job_listing_applicant` DISABLE KEYS */;
INSERT INTO `job_listing_applicant` VALUES (1,1),(6,1),(3,2),(2,3),(3,3),(6,3),(8,4),(1,5),(7,5),(1,6),(8,6),(6,7),(7,10),(9,10),(9,11),(1,12),(7,12),(1,15),(7,15),(1,16),(1,17),(10,19);
/*!40000 ALTER TABLE `job_listing_applicant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-12 19:34:01
