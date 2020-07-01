
create table user
(
   id integer not null,
   name varchar(255) not null,
   username varchar(255) not null,
   email varchar(255) not null,
   password varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

CREATE TABLE bank (
  bank_id int(11) NOT NULL,
  name varchar(45) NOT NULL,
  country_id int(11) NOT NULL,
  PRIMARY KEY (bank_id)
);
CREATE TABLE branch
(
    branch_id int(11)     NOT NULL,
    name      varchar(45) NOT NULL,
    city_id   int(11)     NOT NULL,
    PRIMARY KEY (branch_id)
);

CREATE TABLE business_account_detail (
  business_id int(11) NOT NULL,
  business_fullname varchar(45) NOT NULL,
  account_number varchar(45) NOT NULL,
  email_address varchar(45) NOT NULL,
  status varchar(10) NOT NULL,
  bank_id int(11) NOT NULL,
  branch_id int(11) NOT NULL,
  city_id int(11) NOT NULL,
  address_line varchar(45) NOT NULL,
  address_line2 varchar(45) DEFAULT NULL,
  address_line3 varchar(45) DEFAULT NULL,
  PRIMARY KEY (business_id)
);




