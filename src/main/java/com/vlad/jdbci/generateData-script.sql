

INSERT INTO schools(s_name, address) VALUES ('Ш№1', 'г. Детства, ул. Азарства 1, д -1');
INSERT INTO schools(s_name, address) VALUES ('Ш№2', 'адресс несушествует');
INSERT INTO schools(s_name, address) VALUES ('S num 15', 'USA Texas');

INSERT INTO classes(school_id, c_name, quantity, open_class) VALUES ((select id from schools order by s_name limit 1), 'Зайки', 0, now());
INSERT INTO classes(school_id, c_name, quantity, open_class) VALUES ((select id from schools order by s_name limit 1), 'Flowers', 0, now());
INSERT INTO classes(school_id, c_name, quantity, open_class) VALUES ((select id from schools order by s_name limit 1), 'they', 0, now());


INSERT INTO students(class_id, s_name, sex, birth_day, created) VALUES ((select id from classes order by c_name limit 1), 'Peter в Парке', true, now(), now());
INSERT INTO students(class_id, s_name, sex, birth_day, created)
    VALUES ((select id from classes order by c_name limit 1), 'Mary джейн', false, now(), now());
INSERT INTO students(class_id, s_name, sex, birth_day, created)
    VALUES ((select id from classes c_name where c_name = 'they'), 'Что я такое?', null, now(), now());