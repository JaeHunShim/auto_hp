use auto_hp;

create table urlprice(
	url varchar(10) not null,
    domain_price varchar(10) not null,
    primary key(url)
);

insert into urlprice values('free','무료');
insert into urlprice values('pay','유료');
