-- Database Name : pos_mvc_db

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int NOT NULL,
  `name` varchar(150) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(150) NOT NULL,
  `postalCode` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `qoh` int NOT NULL,
  `unitPrice` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int NOT NULL,
  `cust_id` int NOT NULL,
  `createDate` datetime NOT NULL,
  `total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_idx` (`cust_id`),
  CONSTRAINT `id` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `item_id` int NOT NULL,
  `unit_price` decimal(10,2) NOT NULL,
  `qty` int NOT NULL,
  `sub_total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_idx` (`item_id`),
  KEY `id_order_idx` (`order_id`),
  CONSTRAINT `id_item` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);
