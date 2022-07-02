# Execute the following query

## Create Database
create database CMSDB;

use cmsdb;

## Orderfood table
create table orderfood(foodid int,foodname varchar(20) not null,foodPrice int not null,foodquantity int not null, foodTotal int,constraint ord_fid_pk primary key(foodid));

select * from orderfood;

## Menu table
create table menu(menuId int,menuName varchar(20)not null,menuPrice int not null,constraint menu_mid_pk primary key(menuId));

insert into menu values(101,"Burger",100);
insert into menu values(102,"Chapathi",50);
insert into menu values(103,"Veg roll",80);

select * from menu;

## Tables required
## CustomerProfile
## VendorProfile

