The database totally has 4 tables named books, staff, loans, and students.

books table has columns:
id BIGINT PRIMARY KEY,
title TEXT(30) NOT NULL,
author TEXT(30) NOT NULL,
publisher TEXT(30) NOT NULL,
isbn TEXT(13) NOT NULL,
publication_year INTEGER NOT NULL,
number_of_pages INTEGER NOT NULL,
available_copies INTEGER NOT NULL

loans table has columns:
id BIGINT PRIMARY KEY,
book_id BIGINT,
borrower_id VARCHAR(15),
issued_staff_id VARCHAR(15) NOT NULL,
date_borrowed DATE NOT NULL,
due_date DATE NOT NULL,
date_returned DATE,
status SMALLINT NOT NULL,
FOREIGN KEY (book_id) REFERENCES books(id),
FOREIGN KEY (issued_staff_id) REFERENCES staff(id)

staff table has columns:
id varchar(15) primary key,
name text(30) not null,
address text(50),
email varchar(30) not null,
department TEXT(40) not null,
phone_number text(20) not null);

students table has columns:
id VARCHAR(15) PRIMARY KEY,
name TEXT(30) NOT NULL,
address TEXT(50) NOT NULL,
phone_number TEXT(20) NOT NULL,
email TEXT(30) NOT NULL,
major TEXT(30) NOT NULL


All of the tables are in third normal form.