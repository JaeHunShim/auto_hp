use auto_hp;

create table information(
	user_email varchar(50) not null,
	site_name varchar(50),
    site_perpose varchar(50) not null,
    primary key(site_name),
    foreign key(user_email) references user(user_email) on delete cascade
);