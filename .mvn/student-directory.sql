CREATE DATABASE  IF NOT EXISTS `student-database`;
USE `student-database`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `student` VALUES 
	(1,'miran','jamal','mermer@it.com'),
	(2,'muahamad','jamal','muhamad@it.com')
	

