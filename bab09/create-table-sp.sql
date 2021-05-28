CREATE TABLE CUSTOMER (
     CUST_ID int NOT NULL,
     FULL_NAME varchar(50) NOT NULL,
     ADDRESS varchar(50) NOT NULL,
     EMAIL varchar(50) NOT NULL,
     PRIMARY KEY (CUST_ID)
) 
GO
CREATE PROCEDURE findByCustomerId @custId int AS
    SELECT [CUST_ID] as custId
      ,[FULL_NAME] as fullName
      ,[ADDRESS] as address
      ,[EMAIL] as email
  FROM [CUSTOMER]
  WHERE CUST_ID = @custId

