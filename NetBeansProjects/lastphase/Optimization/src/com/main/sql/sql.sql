DROP DATABASE IF EXISTS db_notice;
CREATE DATABASE db_notice;
USE db_notice;

CREATE TABLE tbl_admin(
    txtId int(11) primary key auto_increment,
    txtUserName varchar(15),
    txtPAssword varchar(15),
    txtIdActive char(1)
);
insert into tbl_admin(`txtUserName`,`txtPAssword`,`txtIdActive`) value ('admin@gmail.com','123456','Y');

CREATE TABLE tbl_tandp(
    txtId int(11) primary key auto_increment,
    txtUserName varchar(15),
    txtPAssword varchar(15),
    txtIdActive char(1)
);
insert into tbl_tandp(`txtUserName`,`txtPAssword`,`txtIdActive`) value ('tandp@gmail.com','123456','Y');

CREATE TABLE tbl_student(
    txtId int(11) primary key auto_increment,
    txtFirstname varchar(15),
    txtLastName varchar(15),
    txtContact varchar(10),
    txtBranch varchar(10),
    txtUserName varchar(15),
    txtPAssword varchar(15),
    txtIdActive char(1)
);
insert into tbl_student(`txtFirstname`,`txtLastName`,`txtContact`,`txtBranch`,`txtUserName`,`txtPAssword`,`txtIdActive`) 
value 
('sfname','slname','9876543210','IT','tandp@gmail.com','123456','Y');

CREATE TABLE tbl_notice(
    txtId int(11) primary key auto_increment,
    txtSentBy varchar(15),
    txtTitle varchar(15),
    txtAttachment varchar(10),
    txtDetails text,
    txtEntryDate varchar(25),
    txtIdActive char(1)
);
