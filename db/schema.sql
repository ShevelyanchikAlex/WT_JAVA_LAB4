CREATE SCHEMA IF NOT EXISTS `hotel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE
`hotel` ;


CREATE TABLE IF NOT EXISTS `hotel`.`user`
(
    `id` INT
(
    10
) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR
(
    25
) NOT NULL,
    `password` VARCHAR
(
    100
) NOT NULL,
    `role` ENUM
(
    'admin',
    'user'
) NULL DEFAULT 'user',
    PRIMARY KEY
(
    `id`
))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;



CREATE TABLE IF NOT EXISTS `hotel`.`room`
(
    `id` INT
(
    11
) NOT NULL AUTO_INCREMENT,
    `room_number` VARCHAR
(
    10
) NOT NULL,
    `occupied` VARCHAR
(
    5
) NOT NULL DEFAULT 'false',
    PRIMARY KEY
(
    `id`
))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;