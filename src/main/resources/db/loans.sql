CREATE TABLE `loans`.`loans` (
  `loan_id` INT NOT NULL AUTO_INCREMENT,
  `loan_type` VARCHAR(45) NULL,
  `loan_amount` DECIMAL NULL,
  `loan_paid` DECIMAL NULL,
  `loan_outstanding` DECIMAL NULL,
  `loan_takenAt` DATETIME NULL,
  `customer_id` INT NULL,
  PRIMARY KEY (`loan_id`));
