create database db_escola
use db_escola

create table tb_aluno(
id bigint(5) auto_increment,	
Nome varchar (20) not null,
Idade int,
Ano boolean,
Turno varchar (20) not null,
Nota real,
primary key (id)
);

select * from tb_aluno
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Leonardo",  15 , 7 ,"Manhã",10);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Ronaldo",  13 , 5 ,"Noite",4);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Júlia",  6 , 1 ,"Manhã",10);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Lurdes",  17  , 3 ,"Tarde",7);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Leandro",  15 , 8 ,"Manhã",8);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Katia",  16 , 5 ,"Tarde",2);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Erika",  7 , 7 ,"Manhã",5);
insert into tb_aluno(nome,idade,ano,turno,nota) Values ("Carlos",  18 , 6,"Manhã",3);


select * from tb_aluno where nota >= 7
select * from tb_aluno where nota < 7

update tb_aluno set Nome = "Alexandre" where id = 5;
select * from tb_aluno