DROP DATABASE if exists bomb_reporter_db;
CREATE DATABASE if not exists bomb_reporter_db;
USE bomb_reporter_db;



CREATE TABLE reports
(
    id           INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    more_details TEXT
);



CREATE TABLE location
(
    id        INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    latitude  VARCHAR(10) NOT NULL,
    longitude VARCHAR(10) NOT NULL
);

CREATE TABLE description
(
    id              INT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    size            VARCHAR(2),
    img_file_path   LONGBLOB NOT NULL,
    color           varchar(20),
    quantity        VARCHAR(3)      NOT NULL,
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


CREATE TABLE uxo_status
(
    id          INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_status  varchar(10) NOT NULL,
    uxo_reports INT         NOT NULL,
    FOREIGN KEY (uxo_reports) REFERENCES reports (id)
);


CREATE TABLE categories
(
    id   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(20)
);

CREATE TABLE uxo_categories
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uxo_categories INT NOT NULL,
    reports_id   INT NOT NULL,
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

# CREATE TABLE uxo_reports
# (
#
#     id              INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
#     uxo_location    INT NOT NULL,
#     uxo_description INT NOT NULL,
#     uxo_categories  INT NOT NULL,
#     uxo_status      INT NOT NULL,
#     FOREIGN KEY (uxo_location) REFERENCES location (id),
#     FOREIGN KEY (uxo_description) REFERENCES uxo_description (id),
#     FOREIGN KEY (uxo_categories) REFERENCES uxo_categories (id),
#     FOREIGN KEY (uxo_status) REFERENCES uxo_status (id)
#
# )
