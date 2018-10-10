use auto_hp;

create table user(
	user_email varchar(50) not null,
    user_pw varchar(50) not null,
    user_nick varchar(50) not null,
    user_address varchar(50) not null,
    user_address2 varchar(50) not null,
    user_tel varchar(50) not null,
    regdate timestamp not null default now(),
    update_date timestamp not null default now(),
    primary key(user_email)
);