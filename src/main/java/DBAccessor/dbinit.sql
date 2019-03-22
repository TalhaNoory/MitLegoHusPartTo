/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Dhono
 * Created: Mar 22, 2019
 */

-- CREATE DATABASE  IF NOT EXISTS `useradmin`;
-- 
-- 
-- USE `useradmin`;
-- 
-- DROP TABLE IF EXISTS `user`;
-- CREATE TABLE `user` (
-- --   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `userName` varchar(45) NOT NULL,
--   `email` varchar(90) NOT NULL,
--   `password` varchar(45) NOT NULL,
-- --   `role` varchar(20) NOT NULL DEFAULT 'customer',
-- --   PRIMARY KEY (`id`),
-- PRIMARY KEY (`email`),
--   UNIQUE KEY `email_UNIQUE` (`email`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
-- 
-- LOCK TABLES `user` WRITE;
-- INSERT INTO `user` VALUES 
-- (1,'SpørgDigSelv','jens@somewhere.com','jensen'),
-- (2,'Talha','ken@somewhere.com','kensen'),
-- (3,'B2','robin@somewhere.com','batman');
-- -- (1,'jens@somewhere.com','jensen','customer'),
-- -- (2,'ken@somewhere.com','kensen','customer'),
-- -- (3,'robin@somewhere.com','batman','employee');
-- UNLOCK TABLES;
