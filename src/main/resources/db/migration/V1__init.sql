create table students
(
    id bigserial primary key,
    name        varchar(255),
    age        int
);

insert into students (name , age) values
('Aleksandr', 18), ('Anton', 20), ('Anna', 19), ('Igor', 20), ('Irina', 18);

