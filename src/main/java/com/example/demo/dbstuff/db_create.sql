drop database if exists blogapp;
create database if not exists blogapp;
use blogapp;

create table users
(
id int primary key auto_increment,
user_name varchar(25),
password varchar(12)
);

create table blogposts
(
id int primary key auto_increment,
title varchar(25),
user_name_id int,
creation_date date,
blog_post_text blob,

foreign key (user_name_id) references users(id)
);

create table tag_categories
(
id int primary key auto_increment,
tag_category_name varchar(25)
);

create table tags
(
id int primary key auto_increment,
tag_name varchar(25),

tag_category_id int,

foreign key(tag_category_id) references tag_categories(id)
);