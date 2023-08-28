INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Purple', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp SpringBoot', 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2021-07-14T10:00:00Z', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-12-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2021-12-14T10:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha', 'Trilha de aulas', 1, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Tire suas dúvidas', 2, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Aula 1', 'Aula', 1, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Aula 2', 'Aula', 2, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Aula 3', 'Aula', 3, 'https://pixabay.com/photos/laptop-woman-education-study-young-3087585/', 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2020-07-14T13:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_moment, available, only_Update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2020-07-14T13:00:00Z', null, true, false);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Titulo 1 - cap 1', 1, 1);
INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (1, 'Conteudo aula 1', 'www.youtube.com');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Titulo 2 - cap 1', 2, 1);
INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (2, 'Conteudo aula 2', 'www.youtube.com');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Titulo 3 - cap 1', 3, 1);
INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (3, 'Conteudo aula 3', 'www.youtube.com');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Titulo 4 - cap 1 - tarefa', 4, 1);
INSERT INTO tb_task (id, description, question_Count, approval_Count, weight, due_Date) VALUES (4, 'Tarefa', 5, 4, 1.0, TIMESTAMP WITH TIME ZONE '2021-07-14T13:00:00Z');

INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);

INSERT INTO tb_notification (user_id, text, moment, read, route) VALUES (1, 'Rever atividade', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', false, null);
INSERT INTO tb_notification (user_id, text, moment, read, route) VALUES (2, 'Atividade concluída: parabéns!', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', false, null);

-- INSERT INTO () VALUES ();