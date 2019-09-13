CREATE TABLE artist (
    id INT NOT NULL AUTO_INCREMENT,
    name varchar(200),
    gender char(1),
    birthday DATE,
    update_time TIMESTAMP,
    PRIMARY KEY (id)
);