INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(1,'Joon', 'YOO', 'yooh9942@gmail.com','1235') ;
INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(2,'Joon2', 'YOO', 'yooh@gmail.com','1237') ;
INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(3,'Joon3', 'YOO3', 'yooh32@gmail.com','1233') ;
INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(4,'Joon4', 'YOO', 'yooh9942@gmail.com','1235') ;
INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(5,'Joon5', 'YOO', 'yooh@gmail.com','1237') ;
INSERT INTO User (User_id, User_Fname, User_Lname, User_Email,User_Pass_Word) VALUES(6,'Joon6', 'YOO3', 'yooh32@gmail.com','1233') ;

INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(1,1,'wine1', 'Red', 'RedRed',1997,'Boredeaux') ;
INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(2,2,'wine1', 'Red', 'RedRed',1997,'Boredeaux') ;
INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(3,1,'wine2', 'White', 'RedRed',1999,'Chile') ;
INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(4,2,'wine2', 'White', 'RedRed',2000,'Chile') ;
INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(5,1,'wine3', 'Champagne', 'Blue',2002,'France') ;
INSERT INTO Wine (wine_id, user_id, Wine_name, wine_type,wine_Color,wine_Millesime,wine_Region) VALUES(6,2,'wine3', 'Champagne', 'White',2003,'France') ;

INSERT INTO Notation (Notation_id,wine_id,user_id,Notation_date,Notation_Smell,Notation_Taste,Notation_Note) VALUES(1,1,1, '2022-4-12', 'Good', 'Not bad',7) ;
INSERT INTO Notation (Notation_id,wine_id,user_id,Notation_date,Notation_Smell,Notation_Taste,Notation_Note) VALUES(2,2,2, '2022-4-19', 'Good maybe great', 'Great',8) ;
INSERT INTO Notation (Notation_id,wine_id,user_id,Notation_date,Notation_Smell,Notation_Taste,Notation_Note) VALUES(3,3,1, '2022-4-30', 'Good', 'Really Good',9) ;


