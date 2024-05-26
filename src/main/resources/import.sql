INSERT INTO tb_endereco (rua, numero, cep, cidade, estado, pais) VALUES ('Rua A', '123', '12345-678', 'Cidade A', 'Estado A', 'País A');
INSERT INTO tb_endereco (rua, numero, cep, cidade, estado, pais) VALUES ('Rua B', '456', '23456-789', 'Cidade B', 'Estado B', 'País B');
INSERT INTO tb_endereco (rua, numero, cep, cidade, estado, pais) VALUES ('Rua C', '789', '34567-890', 'Cidade C', 'Estado C', 'País C');

INSERT INTO tb_pessoa (nome, cpf, telefone_whatsapp, email) VALUES ('João da Silva', '123.456.789-00', '+5511999999999', 'joao.silva@example.com');
INSERT INTO tb_pessoa (nome, cpf, telefone_whatsapp, email) VALUES ('Maria Oliveira', '987.654.321-00', '+5511888888888', 'maria.oliveira@example.com');
INSERT INTO tb_pessoa (nome, cpf, telefone_whatsapp, email) VALUES ('Carlos Souza', '456.789.123-00', '+5511777777777', 'carlos.souza@example.com');

INSERT INTO tb_aluno (matricula, nome_completo, cpf, endereco_id, curso) VALUES (10, 'CREIVERSON VIEIRA', '365.456.678-30', 1, 'Computacao');
INSERT INTO tb_aluno (matricula, nome_completo, cpf, endereco_id, curso) VALUES (20, 'JAIRO SOARES', '123.654.789-00', 2, 'Computacao');
INSERT INTO tb_aluno (matricula, nome_completo, cpf, endereco_id, curso) VALUES (30, 'KALLEB DIAS RODRIGUES', '365.456.678-30', 3, 'Computacao');

INSERT INTO tb_restaurante (nome_restaurante, endereco_id, pessoa_id, capacidade_refeicao, horario_cafe_da_manha, horario_almoco, horario_jantar, dias_funcionamento) 
VALUES ('Restaurante Universitário A', 1, 1, 100, '07:00-09:00', '11:00-14:00', '18:00-20:00', 'Segunda a Sexta'),
       ('Restaurante Universitário B', 2, 2, 150, '07:30-09:30', '11:30-14:30', '18:30-20:30', 'Segunda a Sábado'),
       ('Restaurante Universitário C', 3, 3, 200, '08:00-10:00', '12:00-15:00', '19:00-21:00', 'Todos os dias');
