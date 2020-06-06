-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: m_db
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Dumping data for table `alerte`
--

LOCK TABLES `alerte` WRITE;
/*!40000 ALTER TABLE `alerte` DISABLE KEYS */;
INSERT INTO `alerte` VALUES (1,'2019-11-11','','Mot de passe','sms',1),(2,'2019-10-30','','Nouveau mot de passse','Email',3),(3,'2019-08-10','','','sms',5),(4,'2019-11-11','','Mot de passe','sms',1),(5,'2019-10-30','','Nouveau mot de passse','Email',3),(6,'2019-08-10','','','sms',5),(7,'2019-11-11','','Mot de passe','sms',1),(8,'2019-10-30','','Nouveau mot de passse','Email',3),(9,'2019-08-10','','','sms',5),(10,'2019-11-11','','Mot de passe','sms',1),(11,'2019-10-30','','Nouveau mot de passse','Email',3),(12,'2019-08-10','','','sms',5);
/*!40000 ALTER TABLE `alerte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `app_user_user_profile`
--

LOCK TABLES `app_user_user_profile` WRITE;
/*!40000 ALTER TABLE `app_user_user_profile` DISABLE KEYS */;
INSERT INTO `app_user_user_profile` VALUES (2,1),(1,2),(3,3),(4,3),(5,3),(7,3),(8,3);
/*!40000 ALTER TABLE `app_user_user_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `banque`
--

LOCK TABLES `banque` WRITE;
/*!40000 ALTER TABLE `banque` DISABLE KEYS */;
INSERT INTO `banque` VALUES (1,'Saumur','Agence Saumu'),(2,'Montreuil_Belay','Agence Montreuil_Bellay'),(3,'Doué La Fontaine','Agence Doue La Fontaine');
/*!40000 ALTER TABLE `banque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `banque_client`
--

LOCK TABLES `banque_client` WRITE;
/*!40000 ALTER TABLE `banque_client` DISABLE KEYS */;
INSERT INTO `banque_client` VALUES (1,1),(2,1),(3,2),(4,3),(5,3),(6,2),(7,3),(8,1),(9,1);
/*!40000 ALTER TABLE `banque_client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `carte_bancaire`
--

LOCK TABLES `carte_bancaire` WRITE;
/*!40000 ALTER TABLE `carte_bancaire` DISABLE KEYS */;
INSERT INTO `carte_bancaire` VALUES (1,'708','2023-12-01 00:00:00','5311641459496349',0,'',1),(2,'123','2021-10-01 00:00:00','4890362201631073',1,'',2),(3,'654','2023-12-01 00:00:00','4402315041617547',1,'',3),(4,'456','2023-11-01 00:00:00','123456789963021',0,'',4),(5,'852','2025-01-02 00:00:00','7896301254789632',1,'',5),(6,'741','2021-01-02 00:00:00','3214569877896541',0,'',6),(7,'963','2025-02-03 00:00:00','7898520147896302',1,'',7),(8,'159','2022-08-01 00:00:00','2301459877533578',0,'',8),(9,'999','2022-01-01 00:00:00','1111641459496349',0,'Carte Bleu',9);
/*!40000 ALTER TABLE `carte_bancaire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'rue de NANTES','2019-01-01','fnicolas@email.com','FlorianClient','101','NICOLAS','202020202','606060606','Particulier',3),(2,'rue de NANTES','2019-01-01','fnicolas@email.com','FlorianClient','101','NICOLAS','202020202','606060606','Particulier',3),(3,'rue Parchappe','2016-12-01','toto@gmail.com','Toto','','Tata','33645895','33654789','',4),(4,'rue Bourgeois','2018-11-05','lolo@gmail.com','LOLO','','Lala','33654210','33456789','',2),(5,'rue Montreuil','2017-01-03','lulu@gmail.com','Rudi','','Lulu','33789654','33123456','',1),(6,'rue du Moulin','2019-05-06','Lara1@gmail.com','Raissa','','Lara','33654123','33987123','',3),(7,'rue Parchappe','2015-04-09','popou@gmail.com','Dada','','Poupi','33741852','33526341','',1),(8,'rue Denain','2018-10-20','doudou@gmail.com','Doudou','','Dernier','33321456','336325897','',4),(9,'rue Soyeux','2014-08-25','yasso@gmail.com','Rayou','','Yasmine','33698520','336012365','',2),(10,'rue Mondeux','2019-03-31','mimo@gmail.com','Malick','','Mimo','33685203','33012345','',3),(11,'rue de NANTES','2019-01-01','fnicolas@email.com','FlorianClient','101','NICOLAS','202020202','606060606','Particulier',3),(12,'15 Avenue Edouard Michelin','2020-01-01','petit.gillian@gmail.com','Petit','101','Gillian','','0768076597','Particulier',3),(13,'12 Rue du Marché','2020-01-01','2110aline@gmail.com','Quiniou','101','Aline','','','Particulier',3),(14,'2 Chemin de la Houssinière','2020-01-01','pascal.andre@univ-nantes.fr','André','101','Pascal','','','Particulier',3);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `client_idclient`
--

LOCK TABLES `client_idclient` WRITE;
/*!40000 ALTER TABLE `client_idclient` DISABLE KEYS */;
/*!40000 ALTER TABLE `client_idclient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `compte`
--

LOCK TABLES `compte` WRITE;
/*!40000 ALTER TABLE `compte` DISABLE KEYS */;
INSERT INTO `compte` VALUES ('',1,'C','','1234567890','CCB',_binary '\0','','2019-10-26 00:00:00','',3000,1200,2,1),('',2,'C','','1859635210','CCB',_binary '\0','','2019-05-06 00:00:00','',1000,200,3,2),('',3,'C','','1589632050','CCB',_binary '\0','','2018-11-25 00:00:00','',2500,650,6,3),('',4,'C','','1425369878','CCB',_binary '\0','','2019-10-05 00:00:00','',1200,800,8,2),('',5,'C','','231645879','CCB',_binary '\0','','2019-06-05 00:00:00','',500,100,4,2),('CLIENT',6,'C','','99911199911','CCB',_binary '\0','','2019-10-26 00:00:00','',3000,2000,9,4),('TIERS',7,'O','BENEF 1 DE 9','00011199911','CTT',_binary '\0','','2019-10-26 00:00:00','',3000,2000,9,4),('TIERS',8,'O','BENEF 2 DE 9','00011199922','CTT',_binary '\0','','2019-10-27 00:00:00','',3000,2300,9,4),('TIERS',9,'O','BENEF 1 DE 8','000999999999','CTT',_binary '\0','','2019-11-12 00:00:00','',3000,2500,8,4),('CLIENT',10,'O','','0123654789','LIV_A',_binary '\0','','2019-06-15 00:00:00','',1250,100,1,4),('CLIENT',11,'O','','0123654789','LIV_A',_binary '\0','','2019-06-15 00:00:00','',1250,100,1,4),('CLIENT',12,'O','','0123654789','LIV_A',_binary '\0','','2019-06-15 00:00:00','',1250,100,1,4),('CLIENT',13,'O','','9874563210','LDD',_binary '\0','','2019-07-12 00:00:00','',2580,2500,1,4),('TIERS',14,'O','','3256987410','CDS',_binary '','','2019-11-12 00:00:00','',3000,1256,5,4);
/*!40000 ALTER TABLE `compte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `conseiller`
--

LOCK TABLES `conseiller` WRITE;
/*!40000 ALTER TABLE `conseiller` DISABLE KEYS */;
INSERT INTO `conseiller` VALUES (1,'Gharib','Fady'),(2,'Dupond','Joseph'),(3,'Durand','Pierre'),(4,'Tabet','Rony'),(5,'Gharib','Fady'),(6,'Dupond','Joseph'),(7,'Durand','Pierre'),(8,'Tabet','Rony');
/*!40000 ALTER TABLE `conseiller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;
/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `infocompte`
--

LOCK TABLES `infocompte` WRITE;
/*!40000 ALTER TABLE `infocompte` DISABLE KEYS */;
INSERT INTO `infocompte` VALUES (1,'codeInfo1','LIVA',20,150,10),(2,'codeInfo2','LDD',50,100,5),(3,'codeInfo3','LIL',150,300,8),(4,'codeInfo4','CDS',25,100,11);
/*!40000 ALTER TABLE `infocompte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `operation`
--

LOCK TABLES `operation` WRITE;
/*!40000 ALTER TABLE `operation` DISABLE KEYS */;
/*!40000 ALTER TABLE `operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `prelevement`
--

LOCK TABLES `prelevement` WRITE;
/*!40000 ALTER TABLE `prelevement` DISABLE KEYS */;
INSERT INTO `prelevement` VALUES (1,'2019-11-10','2021-12-31','A','ORANGE MOBILE',29,9,6),(2,'2019-11-15','2022-12-31','A','MAAF ASSURANCE',50,9,6),(3,'2019-11-20','2022-12-31','A','GMF ASSURANCE',50,8,4);
/*!40000 ALTER TABLE `prelevement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_app`
--

LOCK TABLES `user_app` WRITE;
/*!40000 ALTER TABLE `user_app` DISABLE KEYS */;
INSERT INTO `user_app` VALUES (1,'test','linda49martin@gmail.com','Linda',NULL,NULL,'Martin',0,'$2a$10$8P8He7sEhl6AfQa10U1kPud62Q9QxnHl.J03FWtYzGVSteLuvr792','lmartin','Active',4),(2,'test','admin@gmail.com','admin',NULL,NULL,'admin',0,'$2a$10$OF23t8mqmBeK9lF26EcMj.5vfl2N8iUrTKoAoy56dObjxyn0hVUyG','admin','Active',1),(3,'test','linda44martin@gmail.com','Client1',NULL,NULL,'Martin',0,'$2a$10$f1iQz6xv9iy3sspPdBhyoOjRYQhkLtPGyMij518utobDc3tfa8AmW','client','Active',2),(4,'test','florian.nicolas@adremail.com','Florian',9,NULL,'Nicolas',0,'$2a$10$b8wWtare3cBXlGw34.4NvO7tQBdzUd3dBgnOSK9l9Kn1jKhUNW5uC','fnicolas','Active',2),(5,'test','petit.gillian@gmail.com','Gillian',NULL,NULL,'Petit',0,'$2a$10$u791XrQ9lmbM7qInCiZWMuoCHNAlnU7eMRFm7TQO.aijwyIUQJKzG','gpetit','Active',2),(7,NULL,'2110aline@gmail.com','Aline',NULL,NULL,'Quiniou',NULL,'123emiage','aquiniou','Provisional',NULL),(8,NULL,'pascal.andre@univ-nantes.fr','Pascal',NULL,NULL,'André',NULL,'123emiage','pandré','Provisional',NULL);
/*!40000 ALTER TABLE `user_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_profile`
--

LOCK TABLES `user_profile` WRITE;
/*!40000 ALTER TABLE `user_profile` DISABLE KEYS */;
INSERT INTO `user_profile` VALUES (1,'ADMIN'),(2,'AGENT'),(3,'CLIENT');
/*!40000 ALTER TABLE `user_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_question`
--

LOCK TABLES `user_question` WRITE;
/*!40000 ALTER TABLE `user_question` DISABLE KEYS */;
INSERT INTO `user_question` VALUES (2,'Quel est le nom de famille de votre mère?'),(1,'Quel est le nom de votre ami(e) d\'enfance?'),(4,'Quel était le nom de votre animal de compagnie?'),(3,'Quel était votre matière préférée au collègue?');
/*!40000 ALTER TABLE `user_question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `virement`
--

LOCK TABLES `virement` WRITE;
/*!40000 ALTER TABLE `virement` DISABLE KEYS */;
/*!40000 ALTER TABLE `virement` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-30 11:57:01
