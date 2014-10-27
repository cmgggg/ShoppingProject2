create sequence shopTable_seq(1,1);

insert into items values(item_seq.nextval, 'a','a',20,'a');
insert into items values(item_seq.nextval, 'b','b',20,'b');
insert into items values(item_seq.nextval, 'c','c',20,'c');

insert into items values(1, 'aaa','ddd',10,'ddd')
insert into items values(1, 'aaa','ddd',10,'ddd')

delete from items where item_name='aa'; 

select * from items

create sequence item_seq;
create sequence order1_seq;


drop sequence item_seq;
drop sequence order1_seq;

drop table items
create table items (

	item_id int primary key,
	item_name varchar2(100) not null,
	description varchar2(1000) not null,
	price int not null,
	picture_url varchar2(100)	

)

drop table users1
create table users1 (

	user_id varchar2(10) primary key,
	user_pwd varchar2(10) not null,
	user_name varchar2(10) not null

)

drop table order_list

create table order_list (

	order_num int primary key,
	user_id varchar2(10) ,
	order_date date default sysdate,
	foreign key (user_id) references users(user_id)
	
)

drop table order_detail
create table order_detail (

	order_num int, 
	item_id   int, 
	count 	  int default 1,
	primary key (order_num, item_id),
	foreign key (order_num) references order_list(order_num),
	foreign key (item_id) references items(item_id)
	
)

