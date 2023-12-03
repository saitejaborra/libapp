# Insert commands
## books table
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (1,'lean','lynch','wsu','1234567891234',2002,1000,5);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (2,'Computer Science','Kevin Wayne','wsu','1234567891235',2002,1000,9);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (3,'Python Programming','John Zelle','Franklin','9781590282755',2013,1265,18);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (4,'Computer Science Principles','Kevin Hare','Pinder Van Arman','9781734554939',2022,974,23);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (5,'Industrial Engineering','M.I.Khan','S.Chand','9788122420593',2014,1543,13);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (6,'Industrial ans systems engineering','B. Badiru','Adedeji','9781466515048',2000,2016,40);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (7,'Data Analysis and Decision Making','S.Christian Albright','Wayne L. Winston','9780357109953',2019,1472,50);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (8,'Cloud Computing','Rajkumar Buyya','James Brobewrg','9784567654369',2018,768,22);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (9,'Practical Business Analytics using R and Python','Umesh .R','Hodeghatta','9786543276468',2006,854,10);
INSERT INTO `` (`id`,`title`,`author`,`publisher`,`isbn`,`publication_year`,`number_of_pages`,`available_copies`) VALUES (10,'Machine Learning for Business Analytics','Galit Shmueli','Peter C.Bruce','9784563286636',2017,764,15);

## staff table
INSERT INTO `` (`id`,`name`,`address`,`email`,`department`,`phone_number`) VALUES ('d562b168','admin ','6745 S 13th Street N Apt:1410','d562b168@wichita.edu','Industrial engineering','3164538754');
INSERT INTO `` (`id`,`name`,`address`,`email`,`department`,`phone_number`) VALUES ('d563h781','Scott','6543 W 14th Street E Apt:1515','d563h781@wichita.edu','Business Analytics','7654329771');
INSERT INTO `` (`id`,`name`,`address`,`email`,`department`,`phone_number`) VALUES ('g674j321','Michael Walter','8765 E 21st Street S Apt:1209','g674j321@wichita.edu','Computer Science','3164528962');
INSERT INTO `` (`id`,`name`,`address`,`email`,`department`,`phone_number`) VALUES ('v897n324','Lawrence','6543 E 21st Strret N Apt:2316','v897n324@wichita.edu','Computer Science','6574329832');
INSERT INTO `` (`id`,`name`,`address`,`email`,`department`,`phone_number`) VALUES ('v908f361','Stacy','4533 N 12th Street E Apt:1503','v908f361@wichita.edu','Electrical and Computer Engineering','3164538865');

## students table
INSERT INTO `` (`id`,`name`,`address`,`phone_number`,`email`,`major`) VALUES ('b822k637','Akhila Sirigireddy','7677 E 21st Street N Apt:1011','3163729000','b822k637@wichita.edu','computer science');
INSERT INTO `` (`id`,`name`,`address`,`phone_number`,`email`,`major`) VALUES ('g362b872','William Smith','3489 E 17th Street W Apt: 1204','3164579832','g36b872@wichita.edu','Business Analytics');
INSERT INTO `` (`id`,`name`,`address`,`phone_number`,`email`,`major`) VALUES ('r484r742','Brahmendra Gurram','7677 E 21st Strret N Apt :1000','6328768904','r484r742@wichita.edu','Electrical and Computer Engineering');
INSERT INTO `` (`id`,`name`,`address`,`phone_number`,`email`,`major`) VALUES ('t654b897','John','5678 W 13th Street S Apt:1234','3164728956','t654b897@wichita.edu','Industrial Engineering');
INSERT INTO `` (`id`,`name`,`address`,`phone_number`,`email`,`major`) VALUES ('v453k632','sai teja borra','7677 E 21st Street N Apt: 1012','3163221124','v453k632@wichita.edu','computer science');

## loans table
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (1,3,'d563h781','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (2,1,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (3,1,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (4,4,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (5,4,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (6,4,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (7,5,'d563h781','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (8,1,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (9,1,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (10,1,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (11,6,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (12,7,'b822k637','d562b168','2023-11-30','2023-12-30',NULL,1);
INSERT INTO `` (`id`,`book_id`,`borrower_id`,`issued_staff_id`,`date_borrowed`,`due_date`,`date_returned`,`status`) VALUES (13,6,'v453k632','d562b168','2023-11-30','2023-12-30',NULL,1);
