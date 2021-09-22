create database db_pizzaria_legal;
use db_pizzaria_legal;



create table tb_categoria(
id bigint auto_increment,
Tipos varchar(50),
Tamanho varchar(250),
primary key(id)
);


insert into tb_categoria(Tipos,Tamanho) values ("Salgado","Pequeno");
insert into tb_categoria(Tipos,Tamanho) values ("Doce","Médio");
insert into tb_categoria(Tipos,Tamanho) values ("Salgado","Grande");
insert into tb_categoria(Tipos,Tamanho) values ("Doce","Grande");
insert into tb_categoria(Tipos,Tamanho) values ("Salgado","Pequeno");



create table tb_pizza(
id bigint auto_increment,
Sabor1 varchar(50),
Borda varchar(50),
massa varchar(50),
preco decimal(10,2),
primary key(id),
fk_id_categoria bigint,
foreign key(fk_id_categoria) references tb_categoria(id)
);

select * from tb_pizza;

insert into tb_pizza (Sabor1,Borda,Massa,preco,fk_id_categoria)
			values ("Muzzarela","Cheddar","New York", 39.90 ,1),
			 ("Feijão com arroz","Catupiry","Pan", 80.90 ,2),
             ("Strogonof","Catupiry","New York", 79.90 ,3),
             ("Banana","Beijinho","New York", 50.90 ,4),
             ("Brigadeiro","Borda Simples","New York", 80.00 ,5),
             ("Calabresa","Catupiry","New York", 65.90 ,1),
             ("Portuguesa","Gorgonzola","New York", 46.90 ,2),
             ("Sushi","Coração de galinha","New York", 39.90 ,3);

select * from tb_pizza;
select * from tb_pizza where preco >= 45.00;
select * from tb_pizza where preco between 29.00 and 60.00;
select * from tb_pizza where sabor1 like "%c%";

select * from tb_pizza inner join tb_categoria 
on tb_categoria.id = tb_pizza.fk_id_categoria;

select * from tb_pizza inner join tb_categoria 
on tb_categoria.id = tb_pizza.fk_id_categoria where Tipos = "Salgado";