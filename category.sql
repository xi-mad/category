/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.14-log : Database - category
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`category` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `category_name` varchar(256) COLLATE utf8_bin NOT NULL,
  `depth` int(11) DEFAULT NULL,
  `leaf` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `root_id` int(11) DEFAULT NULL,
  `orders` int(11) DEFAULT NULL,
  `is_show` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `category` */

insert  into `category`(`id`,`parent_id`,`category_name`,`depth`,`leaf`,`root_id`,`orders`,`is_show`) values (1,0,'男装女装',0,'no',NULL,NULL,'yes'),(2,0,'家电数码',0,'no',NULL,NULL,'yes'),(3,0,'动漫影视',0,'no',NULL,NULL,'yes'),(4,1,'男装',1,'yes',1,1,'yes'),(5,1,'女装',1,'yes',1,2,'yes'),(6,2,'家电',1,'no',2,1,'yes'),(7,2,'数码',1,'no',2,2,'yes'),(8,3,'动漫',1,'yes',3,1,'yes'),(9,3,'影视',1,'yes',3,2,'yes'),(10,7,'手机',2,'yes',2,1,'yes'),(11,7,'照相机',2,'yes',2,2,'yes'),(12,6,'电视',2,'yes',3,1,'yes');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `append` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `product` */

insert  into `product`(`id`,`category_id`,`name`,`append`) values (5,10,'Galaxy Note 9','{\"1\":\"sanxing\",\"2\":\"4999\",\"3\":\"三星Galaxy Note 9或将采用6.4英寸的曲面全面屏，并搭载4000mAh大容量电池。并且会有高通骁龙845平台+6GB运行内存的组合，与Galaxy S9不同的是，此次，三星Galaxy Note 9的重点将放在Note系列的经典设计S Pen上。\",\"4\":\"2018-10-1\",\"5\":\"no\",\"6\":\"ceshi1|ceshi2|ceshi3\"}');

/*Table structure for table `property_append` */

DROP TABLE IF EXISTS `property_append`;

CREATE TABLE `property_append` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL,
  `display_name` varchar(50) COLLATE utf8_bin NOT NULL,
  `field_name` varchar(50) COLLATE utf8_bin NOT NULL,
  `value_type` varchar(50) COLLATE utf8_bin NOT NULL,
  `value_length` int(11) NOT NULL,
  `input_type` varchar(50) COLLATE utf8_bin NOT NULL,
  `default_value` varchar(500) COLLATE utf8_bin NOT NULL,
  `use_default` varchar(50) COLLATE utf8_bin NOT NULL,
  `is_required` varchar(50) COLLATE utf8_bin NOT NULL,
  `is_show` varchar(50) COLLATE utf8_bin NOT NULL,
  `orders` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `property_append` */

insert  into `property_append`(`id`,`category_id`,`display_name`,`field_name`,`value_type`,`value_length`,`input_type`,`default_value`,`use_default`,`is_required`,`is_show`,`orders`) values (1,10,'品牌','pinpai','string',100,'select','三星|华为|诺基亚,sanxing|huawei|nuojiya,sanxing','yes','yes','yes',1),(2,10,'价格','jiage','f1oat',100,'text','','no','yes','yes',1),(3,10,'描述','miaoshu','string',1000,'textarea','请填写详细描述','no','yes','yes',2),(4,10,'发布日期','faburiqi','date',100,'text','','no','yes','yes',2),(5,10,'包邮','baoyou','bool',100,'radio','是|否,yes|no,yes','yes','yes','yes',2),(6,10,'测试','ceshi','string',100,'checkbox','测试1|测试2|测试3|测试4,ceshi1|ceshi2|ceshi3|ceshi4,ceshi1|ceshi3','yes','yes','yes',3),(7,10,'测试输入','ceshishuru','string',100,'text','','no','no','yes',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
