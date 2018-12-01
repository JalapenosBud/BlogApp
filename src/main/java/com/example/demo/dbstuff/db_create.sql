drop database if exists blogapp;
create database if not exists blogapp;
use blogapp;

DROP USER IF EXISTS 'groot'@'localhost';
CREATE USER 'groot'@'localhost' IDENTIFIED BY 'iamgroot';
GRANT ALL ON * TO 'groot'@'localhost';

create table users
(
id int primary key auto_increment,
user_name varchar(25) NOT NULL,
password varchar(12)
);

create table blogposts
(
id int primary key auto_increment,
title varchar(100) NOT NULL,
author varchar(25) NOT NULL,
user_name_id int NOT NULL,
creation_date date NOT NULL,
blog_post_text blob NOT NULL,

foreign key (user_name_id) references users(id)
);

create table tag_categories
(
id int primary key auto_increment,
tag_category_name varchar(25) NOT NULL
);

create table tags
(
id int primary key auto_increment,
tag_name varchar(25) NOT NULL,

tag_category_id int NOT NULL,

foreign key(tag_category_id) references tag_categories(id)
);