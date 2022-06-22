DROP DATABASE if exists bomb_reporter_db;
CREATE DATABASE if not exists bomb_reporter_db;
USE bomb_reporter_db;

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

CREATE TABLE reports
(
    id           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    more_details TEXT
);

CREATE TABLE location
(
    id        INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    latitude  VARCHAR(20) NOT NULL,
    longitude VARCHAR(20) NOT NULL
);

CREATE TABLE description
(
    id              INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    size            VARCHAR(2),
    color           varchar(20),
    IMG_PATH        varchar(100),
    quantity        VARCHAR(10),
    secondary_color varchar(20)
);

CREATE TABLE uxo_description
(

    id              INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_description INT NOT NULL,
    reports_id      INT NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id),
    FOREIGN KEY (uxo_description) REFERENCES description (id)
);


CREATE TABLE status
(
    id     INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status varchar(10)
);

CREATE TABLE uxo_status
(
    id         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_status INT NOT NULL,
    reports_id INT NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id),
    FOREIGN KEY (uxo_status) REFERENCES status (id)
);


CREATE TABLE categories
(
    id       INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(20)
);

CREATE TABLE uxo_categories
(
    id             INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_categories INT NOT NULL,
    reports_id     INT NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id),
    FOREIGN KEY (uxo_categories) REFERENCES categories (id)
);


CREATE TABLE uxo_location
(

    id           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_location INT NOT NULL,
    reports_id   INT NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id),
    FOREIGN KEY (uxo_location) REFERENCES location (id)
);