create table if not exists schools(
id serial primary key,
s_name varchar(10),
address text
);

COMMENT ON TABLE schools IS 'Таблица для хранения школ';
COMMENT ON COLUMN schools.s_name IS 'Название школы';
COMMENT ON COLUMN schools.address IS 'Адресс школы';


create table if not exists classes(
id serial primary key,
school_id integer,
c_name varchar(10),
quantity smallint,
open_class date
);

alter table if exists classes add constraint class_school_id_fk1 foreign key (school_id) references  schools(id);
create index if not exists classes_idx1 on classes (school_id);

COMMENT ON TABLE classes IS 'Таблица для хранения классов школ';
COMMENT ON COLUMN classes.school_id IS 'Ссылка на школу которой принадлежит класс';
COMMENT ON COLUMN classes.c_name IS 'Название класса';
COMMENT ON COLUMN classes.quantity IS 'Количесвто учеников';
COMMENT ON COLUMN classes.open_class IS 'Дата открытия класса';


create table if not exists students(
id serial primary key,
class_id integer,
s_name varchar(100),
sex bool,
birth_day date,
created timestamp
);

alter table if exists students add constraint students_class_id_fk1 foreign key (class_id) references  classes(id);
create index if not exists class_idx1 on students (class_id);


COMMENT ON TABLE students IS 'Таблица для хранения классов школ';
COMMENT ON COLUMN students.class_id IS 'Ссылка на класс которой принадлежит класс';
COMMENT ON COLUMN students.s_name IS 'Имя студента';
COMMENT ON COLUMN students.sex IS 'Пол М - true, Ж - false';
COMMENT ON COLUMN students.birth_day IS 'День рождение';
COMMENT ON COLUMN students.created IS 'Дата создания записи';



--alter table if exists classes alter column school_id set not null;
--alter table if exists students alter column class_id set not null;




CREATE OR REPLACE FUNCTION now_utc()
    RETURNS timestamp without time zone
    LANGUAGE 'sql'
AS $BODY$
  select now() at time zone 'utc';
$BODY$;


