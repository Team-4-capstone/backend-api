DROP DATABASE if exists bomb_reporter_db;
CREATE DATABASE if not exists bomb_reporter_db;
USE bomb_reporter_db;


CREATE TABLE reports
(
    id           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    more_details TEXT
#     uxo_location    INT NOT NULL,
#     uxo_description INT NOT NULL
#     FOREIGN KEY (uxo_location) REFERENCES location (id),
#     FOREIGN KEY (uxo_description) REFERENCES uxo_description (id)
);
CREATE TABLE location
(
    id        INT           NOT NULL AUTO_INCREMENT PRIMARY KEY,
    latitude  DECIMAL(6, 5) NOT NULL,
    longitude DECIMAL(6, 5) NOT NULL
);

CREATE TABLE uxo_description
(
    id              INT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    size            VARCHAR(100),
    img             LONGBLOB NOT NULL,
    color           varchar(20),
    quantity        INT      NOT NULL,
    secondary_color varchar(20),
    reports_id      INT      NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id)
);


CREATE TABLE uxo_status
(
    id          INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_status  varchar(10) NOT NULL,
    uxo_reports INT         NOT NULL,
    FOREIGN KEY (uxo_reports) REFERENCES reports (id)
);


CREATE TABLE categories
(
    id                  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    aerial_bombs        VARCHAR(20),
    landmines           VARCHAR(20),
    grenades            VARCHAR(20),
    missiles_rockets    VARCHAR(20),
    projectiles_mortars VARCHAR(20),
    miscellaneous       VARCHAR(20)
);

CREATE TABLE uxo_categories
(
    id            INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_report_id INT NOT NULL,
    category_id   INT NOT NULL,
    FOREIGN KEY (uxo_report_id) REFERENCES reports (id),
    FOREIGN KEY (category_id) REFERENCES categories (id)
);



CREATE TABLE uxo_location
(

    id           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_location INT NOT NULL,
    reports_id   INT NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports (id),
    FOREIGN KEY (uxo_location) REFERENCES location (id)
);



