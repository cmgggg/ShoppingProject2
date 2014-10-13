create sequence shopTable_seq(1,1);

create table item
(
	item_id     int 		  primary key,
	item_name   varchar2(100) not null,
	price 	    int,
	picture_url varchar2(100),
	description varchar2(2000)

)