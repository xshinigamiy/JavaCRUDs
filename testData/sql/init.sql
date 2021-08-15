DROP DATABASE IF EXISTS userdb;
CREATE DATABASE userdb;
USE userdb;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `first_name` text,
    `last_name` text,
    `age` bigint(20),
    PRIMARY KEY (`id`)
);

INSERT INTO `users` (`id`, `first_name`, `last_name`, `age`) VALUES
(1, 'ajay', 'kumar', '23');

