DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  reader VARCHAR(250) NOT NULL,
  ISBN VARCHAR(250) NOT NULL,
  name VARCHAR(250) DEFAULT NULL,
  description VARCHAR(250) DEFAULT NULL
);


insert into Book(reader,ISBN,name,description) values ('manish','1234567789','book-1','First book from me');
