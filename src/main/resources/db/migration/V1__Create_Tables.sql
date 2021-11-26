create database tally_test;

use
tally_test;
DROP TABLE IF EXISTS `tally_userinfo`;
CREATE TABLE `tally_userinfo`
(
    `id`          BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `username`    VARCHAR(64) NOT NULL,
    `password`    VARCHAR(64) NOT NULL,
    `create_time` DATETIME    NOT NULL,
    `update_time` DATETIME DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY `pk_id` (`id`),
    UNIQUE KEY `uk_username` (`username`)
);

INSERT
`tally_userinfo` VALUE (NULL, 'admin', 'test', NOW(), NULL);
SELECT *
FROM tally_test.tally_userinfo;