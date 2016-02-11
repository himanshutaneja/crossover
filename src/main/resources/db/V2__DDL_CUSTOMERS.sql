CREATE TABLE `customers` (
  `C_CODE` int(11) NOT NULL AUTO_INCREMENT,
  `C_NAME` varchar(100) DEFAULT NULL,
  `C_ADDRESS` varchar(225) DEFAULT NULL,
  `C_PHONE1` varchar(45) DEFAULT NULL,
  `C_PHONE2` varchar(45) DEFAULT NULL,
  `C_CREDITLIMIT` int(11) DEFAULT NULL,
  `C_CURRENTLIMIT` int(11) DEFAULT NULL,
  PRIMARY KEY (`C_CODE`)
);