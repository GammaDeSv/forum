CREATE TABLE topics (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    status VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    course VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
