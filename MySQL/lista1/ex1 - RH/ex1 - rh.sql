create database db_rh;
use db_rh;

create table tb_funcionarios(
id bigint(5) auto_increment,	
Nome varchar (20) not null,
idade int,
filhos boolean,
turno varchar (20) not null,
salario real,
primary key (id)
);

select * from tb_funcionarios;
insert into tb_funcionarios(nome,idade,filhos,turno,salario) Values ("Leonardo",  22 ,false,"Manhã",5000);
insert into tb_funcionarios(nome,idade,filhos,turno,salario) Values ("Ana", 44 ,true,"Manhã",4000);
insert into tb_funcionarios(nome,idade,filhos,turno,salario) Values ("Fátima", 68 ,true,"Tarde",1000);
insert into tb_funcionarios(nome,idade,filhos,turno,salario) Values ("Júlia", 18,false,"Noite",800);
insert into tb_funcionarios(nome,idade,filhos,turno,salario) Values ("Alexandra", 45,true,"Manhã",700);
select * from tb_funcionarios

select * from tb_funcionarios where salario > 2000
select * from tb_funcionarios where salario < 2000


update tb_funcionarios set Nome = "Guilherme" where id = 5
select * from tb_funcionarios