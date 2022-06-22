CREATE DATABASE if not exists registration_db;
USE registration_db;

CREATE TABLE users
(
    id         BIGINT       NOT NULL AUTO_INCREMENT,
    name       VARCHAR(30)  NOT NULL,
    username   VARCHAR(60)  NOT NULL,
    email      VARCHAR(200) NOT NULL,
    password   VARCHAR(60)  NOT NULL,
    role       VARCHAR(32)  NOT NULL,
    locked     BOOLEAN      NOT NULL,
    enabled    BOOLEAN      NOT NULL,
    primary key (id)
);

# INSERT INTO users (id, name, username, email, password, role, locked, enabled)
# VALUES (0, 'matt', 'mk', 'mk@gmail.com', 'password', 'user', false, true)