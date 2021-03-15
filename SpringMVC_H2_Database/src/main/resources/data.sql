DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  reader VARCHAR(250) NOT NULL,
  ISBN VARCHAR(250) NOT NULL,
  name VARCHAR(250) DEFAULT NULL,
  description VARCHAR(250) DEFAULT NULL
);


insert into Book(reader,ISBN,name,description) values ('manish','1234567789','book-1','First book from me');



create table Reader(
	username VARCHAR(250) primary key,
	fullname VARCHAR(250) NOT NULL,
	password VARCHAR(250) not NULL
);

INSERT INTO READER (username, fullname, password) values ('manish','manish sharma', '1234567');
INSERT INTO READER (username, fullname, password) values ('vinod','vinod kumar', '7654321');
INSERT INTO READER (username, fullname, password) values ('ankush','ankush gupta', '1212121');
	

