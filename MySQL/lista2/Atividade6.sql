create database adb_curso_da_minha_vida
use curso_da_minha_vida

create table tb_categoria(
id bigint auto_increment,
Área varchar(250),
Duração int,
Mensalidade int,
primary key(id)
)


insert into tb_categoria (Área,Duração,mensalidade)
			values ("Exatas", 5 , 500);
insert into tb_categoria (Área,Duração,mensalidade)
			values ("Humanas", 4 , 200);
insert into tb_categoria (Área,Duração,mensalidade)
			values ("Biológicas", 3 , 200);
insert into tb_categoria (Área,Duração,mensalidade)
			values ("Exatas", 6 , 800);
insert into tb_categoria (Área,Duração,mensalidade)
			values ("Humanas", 4 , 500);
			
select * from tb_categoria

create table tb_curso(
id bigint auto_increment,
Curso varchar(250),
duracao int,
mensalidade int,
dificil boolean,
Gosto boolean,
primary key (id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id)
);

-- Inserir/popular dados na tabela personagem
insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Sistemas para internet",5, 500, true, true, 1);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Analise de Sistemas",4, 800, true, true, 1);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("História", 4 , 800, false, false, 2);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Linguas",4, 400, false, false, 2);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Educação Fisica",5, 800, false, false, 3);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Medicina",7, 2000, false, false, 3);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("fisica",4, 800, true, true, 1);

insert into  tb_curso (curso, duracao, mensalidade, dificil, gosto, fk_id_categoria) 
values ("Artes",4, 200, false, false, 2);

select * from tb_curso;
select * from tb_categoria
