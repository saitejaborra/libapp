## The database totally has 4 tables named books, staff, loans, and students.

### books table has columns:
id BIGINT PRIMARY KEY,
title TEXT(30) NOT NULL,
author TEXT(30) NOT NULL,
publisher TEXT(30) NOT NULL,
isbn TEXT(13) NOT NULL,
publication_year INTEGER NOT NULL,
number_of_pages INTEGER NOT NULL,
available_copies INTEGER NOT NULL

### loans table has columns:
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

### staff table has columns:
id varchar(15) primary key,
name text(30) not null,
address text(50),
email varchar(30) not null,
department TEXT(40) not null,
phone_number text(20) not null);

### students table has columns:
id VARCHAR(15) PRIMARY KEY,
name TEXT(30) NOT NULL,
address TEXT(50) NOT NULL,
phone_number TEXT(20) NOT NULL,
email TEXT(30) NOT NULL,
major TEXT(30) NOT NULL


## All of the tables are in third normal form.

# Sample Data
## Books table
### id, title, author, publisher, isbn, publication_year, number_of_pages, available_copies
'1', 'lean', 'lynch', 'wsu', '1234567891234', '2002', '1000', '5'
'2', 'Computer Science', 'Kevin Wayne', 'wsu', '1234567891235', '2002', '1000', '9'
'3', 'Python Programming', 'John Zelle', 'Franklin', '9781590282755', '2013', '1265', '18'

## loans table
### id, book_id, borrower_id, issued_staff_id, date_borrowed, due_date, date_returned, status
'1', '3', 'd563h781', 'd562b168', '2023-11-30', '2023-12-30', NULL, '1'
'2', '1', 'v453k632', 'd562b168', '2023-11-30', '2023-12-30', NULL, '1'
'3', '1', 'v453k632', 'd562b168', '2023-11-30', '2023-12-30', NULL, '1'

## staff table
### id, name, address, email, department, phone_number
'd562b168', 'admin ', '6745 S 13th Street N Apt:1410', 'd562b168@wichita.edu', 'Industrial engineering', '3164538754'
'd563h781', 'Scott', '6543 W 14th Street E Apt:1515', 'd563h781@wichita.edu', 'Business Analytics', '7654329771'
'g674j321', 'Michael Walter', '8765 E 21st Street S Apt:1209', 'g674j321@wichita.edu', 'Computer Science', '3164528962'

## students table
### id, name, address, phone_number, email, major
'g362b872', 'William Smith', '3489 E 17th Street W Apt: 1204', '3164579832', 'g36b872@wichita.edu', 'Business Analytics'
'r484r742', 'Benjamin', '7677 E 21st Strret N Apt :1000', '6328768904', 'r484r742@wichita.edu', 'Electrical and Computer Engineering'
't654b897', 'Johannas', '5678 W 13th Street S Apt:1234', '3164728956', 't654b897@wichita.edu', 'Industrial Engineering'


