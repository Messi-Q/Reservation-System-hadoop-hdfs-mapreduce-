DROP DATABASE IF EXISTS OrderDB;
CREATE DATABASE OrderDB;
USE OrderDB;

DROP TABLE IF EXISTS UserInfo;
CREATE TABLE UserInfo(
	UserId INT PRIMARY KEY AUTO_INCREMENT,
	UserName VARCHAR(30) NOT NULL,
	UserPwd VARCHAR(30) NOT NULL,
	RealName VARCHAR(30) NOT NULL,
	Sex CHAR(2),
	Age INT,
	CardId VARCHAR(18)NOT NULL UNIQUE,
	UserAddress VARCHAR(255),
	UserTel VARCHAR(11),
	Email VARCHAR(30),
	Ems VARCHAR(6)
)AUTO_INCREMENT=1,CHARSET=utf8;

ROP TABLE IF EXISTS Cart;
CREATE TABLE Cart(
	CartId INT PRIMARY KEY AUTO_INCREMENT,
	User_Id INT,
	FoodId INT,
	OrderNum INT,
	FOREIGN KEY(User_Id)REFERENCES UserInfo(UserId),
	FOREIGN KEY(FoodId)REFERENCES FoodInfo(FoodId)
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS FoodInfo;
CREATE TABLE FoodInfo(
	FoodId INT PRIMARY KEY AUTO_INCREMENT,
	FoodName VARCHAR(30) NOT NULL,
	VipPrice FLOAT NOT NULL,
	MarketPrice FLOAT NOT NULL,
	TypeId INT,
	FoodDesp  VARCHAR(255),
	ImageUrl VARCHAR(255),
	FoodIng  VARCHAR(30),
	FOREIGN KEY(TypeId)REFERENCES FoodType(TypeId)
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS FoodType;
CREATE TABLE FoodType(
	TypeId INT PRIMARY KEY AUTO_INCREMENT,
	TypeName VARCHAR(30) NOT NULL
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS NoticeInfo;
CREATE TABLE NoticeInfo(
	NoticeId  INT PRIMARY KEY AUTO_INCREMENT,
	NoticeTitle VARCHAR(30) NOT NULL,
	NoticeTime DATETIME,
	NoticeCont VARCHAR(255)
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS OrderInfo;
CREATE TABLE OrderInfo(
	OrderId  INT PRIMARY KEY AUTO_INCREMENT,
	FoodId INT,
	UserId INT,
	OrderNum INT,
	OrderTime DATETIME,
	Send SMALLINT,
	FOREIGN KEY(FoodId)REFERENCES FoodInfo(FoodId),
	FOREIGN KEY(UserId)REFERENCES UserInfo(UserId)
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS AdminInfo;
CREATE TABLE AdminInfo(
	AdminId INT PRIMARY KEY AUTO_INCREMENT,
	AdminName VARCHAR(30) NOT NULL,
	AdminPwd VARCHAR(30) 
)AUTO_INCREMENT=1,CHARSET=utf8;

DROP TABLE IF EXISTS hdfs;
CREATE TABLE hdfs(
    fileId INT AUTO_INCREMENT PRIMARY KEY,
    fileName VARCHAR(80),
    size FLOAT(2),
    uploadtime DATE,
    parentId INT,
    isDir TINYINT,
    FOREIGN KEY(parentId) REFERENCES hdfs(fileId)
)AUTO_INCREMENT=1 CHARSET=utf8; 

