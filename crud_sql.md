## CRUD operations
CREATE TABLE books (
    id BIGINT PRIMARY KEY,
    title TEXT(30) NOT NULL,
    author TEXT(30) NOT NULL,
    publisher TEXT(30) NOT NULL,
    isbn TEXT(13) NOT NULL,
    publication_year INTEGER NOT NULL,
    number_of_pages INTEGER NOT NULL,
    available_copies INTEGER NOT NULL
);

CREATE TABLE students (
    id VARCHAR(15) PRIMARY KEY,
    name TEXT(30) NOT NULL,
    address TEXT(50) NOT NULL,
    phone_number TEXT(20) NOT NULL,
    email TEXT(30) NOT NULL,
    major TEXT(30) NOT NULL
);

CREATE TABLE loans (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    book_id BIGINT,
    borrower_id VARCHAR(15),
    issued_staff_id VARCHAR(15) NOT NULL,
    date_borrowed DATE NOT NULL,
    due_date DATE NOT NULL,
    date_returned DATE,
    status SMALLINT NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id),
    FOREIGN KEY (issued_staff_id) REFERENCES staff(id)
);

create table staff ( id varchar(15) primary key,
 name text(30) not null,
 address text(50),
 email varchar(30) not null,
 department TEXT(40) not null,
 phone_number text(20) not null);

update books set available_copies= available_copies-1 where id = ?

select * from loans where borrower_id= :?
