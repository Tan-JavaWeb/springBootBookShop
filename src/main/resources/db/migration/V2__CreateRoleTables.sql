DROP TABLE IF EXISTS role;

CREATE TABLE IF NOT EXISTS role(
	id BIGINT NOT NULL AUTO_INCREMENT,
    role_name varchar(20) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;;