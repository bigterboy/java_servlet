USE newservlet;


CREATE TABLE role(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR(255) not null,
    code VARCHAR(255) not null,
    createddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby VARCHAR(255) null,
    modifiedby VARCHAR(255) null
);


CREATE TABLE user(
	id bigint not null primary key auto_increment,
    name VARCHAR(255) not null,
    password VARCHAR(255) not null,
    fullname VARCHAR(255) not null,
    status int not null,
    roleid bigint not null,
    createddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby VARCHAR(255) null,
    modifiedby VARCHAR(255) null
);



ALTER TABLE user ADD CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCES role(id);


CREATE TABLE news(
	id bigint not null primary key auto_increment,
    title VARCHAR(255) null,
    thumbnail VARCHAR(255) null,
    shortdecription TEXT null,
    content TEXT null,
    categoryid bigint NOT NULL,
	createddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby VARCHAR(255) null,
    modifiedby VARCHAR(255) null
);


CREATE TABLE category(
	id bigint not null primary key auto_increment,
    name VARCHAR(255) not null,
    code VARCHAR(255) not null,
	createddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby VARCHAR(255) null,
    modifiedby VARCHAR(255) null
);


ALTER TABLE news ADD CONSTRAINT fk_news_category FOREIGN KEY (categoryid) REFERENCES category(id);



CREATE TABLE comment(
	id bigint not null primary key auto_increment,
    content TEXT  not null,
    user_id bigint not null,
    new_id bigint not null,
	createddate TIMESTAMP null,
    modifieddate TIMESTAMP null,
    createdby VARCHAR(255) null,
    modifiedby VARCHAR(255) null
);


ALTER TABLE comment ADD CONSTRAINT fk_commment_user FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE comment ADD CONSTRAINT fk_commment_news FOREIGN KEY (new_id) REFERENCES news(id);

