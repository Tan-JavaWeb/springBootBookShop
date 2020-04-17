DROP TABLE IF EXISTS app_role_users;

CREATE TABLE IF NOT EXISTS app_role_users(
	id	BIGINT NOT NULL AUTO_INCREMENT,
    users_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;;

ALTER TABLE app_role_users ADD CONSTRAINT app_role_user_FK1 FOREIGN KEY (users_id) REFERENCES users (id);

ALTER TABLE app_role_users ADD CONSTRAINT app_role_user_FK2 FOREIGN KEY (role_id) REFERENCES role (id);