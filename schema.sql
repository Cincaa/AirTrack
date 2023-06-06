CREATE SCHEMA PaymentApp;
CREATE TABLE `payment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
   `amount` decimal UNSIGNED NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `customer` varchar(200) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM PaymentApp.payment;