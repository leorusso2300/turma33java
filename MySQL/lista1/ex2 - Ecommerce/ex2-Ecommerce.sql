create database db_ecommerce
use db_ecommerce

create table tb_produtos(
id bigint(5) auto_increment,	
Nome varchar (20) not null,
Marca varchar (20) not null,
Valor decimal,
Importado boolean,
Estoque decimal,
primary key (id)
);

select * from tb_produtos
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Nike", 300,true,6);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Nike", 3000,true,40);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Tênis", "Adidas", 1000,true,2);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Puma", 150,false,18);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Boné", "NY", 60,true,30);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Mochila", "Oakley", 2000,false,12);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Camiseta", "Adidas", 80,true,9);
insert into tb_produtos(nome,marca,valor,importado,estoque) Values ("Chuteira", "Nike", 500,true,4);


select * from tb_produtos
select * from tb_produtos where valor >= 500
select * from tb_produtos where valor < 500

update tb_produtos set Nome = "Chuteira", Marca = "Puma", valor = 200 where id = 2;
select * from tb_produtos

