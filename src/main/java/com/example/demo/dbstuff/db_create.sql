create table users
(
int id auto_increment,
user_name varchar(25),
password varchar(12)

primary key(id, user_name)
);

create table blogposts
(
int id primary key auto_increment,
title varchar(25),
user_name_author varchar(25),
creation_date date,
blog_post_text varchar(max),

foreign key (user_name_author) references users(user_name)
);

create table tag_categories
(
int id primary key auto_increment,
tag_category_name varchar(25)
);

create table tags
(
id int primary key auto_increment,
tag_name varchar(25),

foreign key(tag_name) references tag_categories(tag_category_name)
);