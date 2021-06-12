INSERT INTO tb_usuario (nome, nascimento, email, cpf) VALUES ('Andrey', '27/04/1994', 'andrey@gmail.com', '10838068548');
INSERT INTO tb_usuario (nome, nascimento, email, cpf) VALUES ('Mariah', '30/01/2001', 'mariah@gmail.com', '10838068408');


INSERT INTO tb_carro (marca, ano, modelo) VALUES ('Fiat', '2008', 'Siena');
INSERT INTO tb_carro (marca, ano, modelo) VALUES ('Fiat', '2020', 'Argo');
INSERT INTO tb_carro (marca, ano, modelo) VALUES ('Wolks', '2015', 'Gol');
INSERT INTO tb_carro (marca, ano, modelo) VALUES ('Fiat', '2019', 'Touro');

INSERT INTO tb_usuario_carro (usuario_id, carro_id) VALUES (1, 1);
INSERT INTO tb_usuario_carro (usuario_id, carro_id) VALUES (1, 2);
INSERT INTO tb_usuario_carro (usuario_id, carro_id) VALUES (2, 3);
INSERT INTO tb_usuario_carro (usuario_id, carro_id) VALUES (2, 4);