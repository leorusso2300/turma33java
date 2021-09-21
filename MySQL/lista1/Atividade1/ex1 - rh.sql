create database db_rh;
use db_rh;

create table tb_funcionarios(
id bigint(5) auto_increment,	
Nome varchar (20) not null,
Idade int,
Filhos boolean,
Turno varchar (20) not null,
Salário decimal(15,3),
primary key (id)
);

select * from tb_funcionarios;
insert into tb_funcionarios(nome,idade,filhos,turno,salário) Values ("Leonardo",  22 ,false,"Manhã",5.000);
insert into tb_funcionarios(nome,idade,filhos,turno,salário) Values ("Ana", 44 ,true,"Manhã",4.000);
insert into tb_funcionarios(nome,idade,filhos,turno,salário) Values ("Fátima", 68 ,true,"Tarde",1.000);
insert into tb_funcionarios(nome,idade,filhos,turno,salário) Values ("Júlia", 18,false,"Noite",1.500);
insert into tb_funcionarios(nome,idade,filhos,turno,salário) Values ("Alexandra", 45,true,"Manhã",2.000);
select * from tb_funcionarios

select * from tb_funcionarios where salário >= 2.000
select * from tb_funcionarios where salário < 2.000


update tb_funcionarios set Nome = "Guilherme", salário = 1.200 where id = 5
select * from tb_funcionarios