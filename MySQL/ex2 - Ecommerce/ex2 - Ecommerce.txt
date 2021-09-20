create database db_ecommerce
use db_ecommerce

create table tb_produtos(
id bigint(5) auto_increment,	
Nome varchar (20) not null,
marca varchar (20) not null,
valor real,
importado boolean,
estoque boolean,
primary key (id)
);

select * from tb_produtos
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Nike", 300,true,true);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Nike", 300,true,true);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Tênis", "Adidas", 1000,true,false);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Puma", 150,false,false);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Boné", "NY", 60,true,true);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Mochila", "Oakley", 2000,false,true);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Adidas", 80,true,true);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Chuteira", "Nike", 400,true,false);


select * from tb_produtos
select * from tb_produtos where valor > 500
select * from tb_produtos where valor < 500

update tb_produtos set Nome = "Lacoste", valor = 200 where id = 2;


