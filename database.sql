USE demo;
CREATE TABLE IF NOT EXISTS Employee (
    id INT(11) AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(15, 2) NOT NULL,
    created_Date TIMESTAMP,
    PRIMARY KEY (id)
);
