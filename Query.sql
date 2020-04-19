create table user (id int auto_increment,primary key(id),active varchar(40),user_name varchar(50),password varchar(200),roles varchar(20));

insert into user(active,password,roles,user_name) values ('','pass','ROLE_USER','user');
insert into user(active,password,roles,user_name) values ('1','pass1','ROLE_USER','user1');

