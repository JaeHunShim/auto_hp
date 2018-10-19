use auto_hp;

create table information(
	user_email varchar(50) not null,
	site_name varchar(50),
    site_perpose varchar(50) not null,
    primary key(site_name),
    foreign key(user_email) references user(user_email) on delete cascade
);

-- domain_name column 추가
alter table information add domain_name varchar(50) not null ;

-- site_perpose column명 변경
alter table information change site_perpose site_purpose varchar(50) not null;

-- domain_price column 추가
alter table information add domain_price varchar(10) not null;