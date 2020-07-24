drop database if exists timekeeping;
create database timekeeping;
use timekeeping;


create table role(
id int unsigned not null auto_increment,
role_name varchar(50) null,
primary key (id)
)engine=InnoDB default charset=utf8;
create table user(
	code int not null,
    name nvarchar(50) null,
    role_id int not null,
    primary key(code),
	constraint fk_user_role foreign key (role_id) references role(id) on delete restrict on update cascade
)engine=InnoDB default charset=utf8;
create table admin(
	id int not null auto_increment,
    username nvarchar(50)  null,
    password nvarchar(255)  null,
    email varchar(50) null,
    role_id int null,
	constraint fk_admin_role foreign key(role_id) references role(id)
)engine=InnoDB default charset=utf8;
create table user_log(
	id int not null auto_increment ,
    day datetime not null,
    user_code int null,
    primary key(id),
    constraint pk_user_log_user foreign key(user_code) references user(code)
)engine=InnoDB default charset=utf8;