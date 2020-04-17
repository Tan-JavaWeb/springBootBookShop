ALTER DATABASE dbspringbootbookshop CHARACTER SET utf8 COLLATE utf8_unicode_ci;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
	id BIGINT  NOT NULL AUTO_INCREMENT,
    user_name varchar(191) NOT NULL,
    password varchar(225) NOT NULL,
    email varchar(191) NOT NULL,
    email_confirmed boolean,
    full_name varchar(225) COLLATE utf8mb4_unicode_ci,
    address text COLLATE utf8mb4_unicode_ci,
    phone_number varchar(20),
    lock_out_enabled boolean,
    is_deleted boolean,
    created_at timestamp,
	updated_at timestamp,
   	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

ALTER TABLE users ADD CONSTRAINT users_unique_name UNIQUE (user_name);
ALTER TABLE users ADD CONSTRAINT users_unique_email UNIQUE (email);