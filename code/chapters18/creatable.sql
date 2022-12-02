CREATE TABLE `emp` (
    `id` INT,
    `name` VARCHAR(32),
    `sex` CHAR(1),
    birthday DATE,
    entry_data DATETIME,
    job VARCHAR(32),
    salary DOUBLE,
    `resume` TEXT
) CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;
