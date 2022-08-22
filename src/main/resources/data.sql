insert into student (name, age, grade, created_at, created_by, modified_at, modified_by) values
('uno', 18, 'A', now(), 'uno', now(), 'uno'),
('uno2', 18, 'B', now(), 'uno', now(), 'uno'),
('uno3', 19, 'C', now(), 'uno', now(), 'uno'),
('uno4', 28, 'F', now(), 'uno', now(), 'uno'),
('uno5', 38, 'D', now(), 'uno', now(), 'uno'),
('uno6', 48, 'A', now(), 'uno', now(), 'uno')
;


insert into subject (student_id, name, created_at, created_by, modified_at, modified_by) values
(1, '수학', now(), 'uno', now(), 'uno'),
(2, '영어', now(), 'uno', now(), 'uno'),
(2, '역사', now(), 'uno', now(), 'uno'),
(3, '체육', now(), 'uno', now(), 'uno')
;
