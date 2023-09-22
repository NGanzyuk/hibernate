CREATE TABLE Persons(
Name varchar2(255 char) NOT NULL, 
Surname varchar2(255 char) NOT NULL, 
Age int NOT NULL, 
Phone_Number varchar2(255 char), 
City_Of_Living varchar2(255 char),
CONSTRAINT PK_Person PRIMARY KEY (Name, Surname, Age));
