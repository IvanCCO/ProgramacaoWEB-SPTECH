-- Inserção de dados na tabela 'banda'
INSERT INTO banda (nome, genero, descricao) VALUES
    ('Foo Fighters', 3, 'Banda americana de rock alternativo formada em 1994.'),
    ('Radiohead', 1, 'Banda britânica de rock alternativo formada em 1985.'),
    ('Daft Punk', 2, 'Duo francês de música eletrônica formado em 1993.'),
    ('Anitta', 4, 'Cantora brasileira de pop e funk carioca.'),
    ('Led Zeppelin', 3, 'Banda britânica de rock formada em 1968.'),
    ('Pink Floyd', 3, 'Banda britânica de rock progressivo formada em 1965.'),
    ('Metallica', 3, 'Banda americana de heavy metal formada em 1981.'),
    ('Queen', 3, 'Banda britânica de rock formada em 1970.'),
    ('AC/DC', 3, 'Banda australiana de rock formada em 1973.'),
    ('The Beatles', 3, 'Banda britânica de rock formada em 1960.');

-- Inserção de dados na tabela 'festival'
INSERT INTO festival (data, descricao, nome, regras)
VALUES
('2023-04-16', 'Festival de rock', 'Rock in Rio', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-05-01', 'Festival de música eletrônica', 'Tomorrowland', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-06-10', 'Festival de jazz', 'Jazz Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-07-22', 'Festival de samba', 'Samba Enredo', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-08-03', 'Festival de MPB', 'Festival MPB', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-09-12', 'Festival de pop', 'Pop Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-10-21', 'Festival de metal', 'Metal Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-11-11', 'Festival de indie rock', 'Indie Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2023-12-05', 'Festival de música clássica', 'Clássica Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']),
('2024-01-01', 'Festival de funk', 'Funk Fest', ARRAY['Proibido fumar', 'Não é permitido entrar com bebidas alcoólicas', 'Uso obrigatório de máscara']);


-- Inserção de dados na tabela 'usuario'
INSERT INTO usuario (nome, idade, email) VALUES
    ('João Silva', 25, 'joao.silva@gmail.com'),
    ('Maria Santos', 30, 'maria.santos@gmail.com'),
    ('Pedro Souza', 18, 'pedro.souza@gmail.com'),
    ('Lucas Oliveira', 27, 'lucas.oliveira@gmail.com'),
    ('Ana Paula Pereira', 22, 'anapaula.pereira@gmail.com'),
    ('Fernando Ferreira', 35, 'fernando.ferreira@gmail.com'),
    ('Juliana Alves', 29, 'juliana.alves@gmail.com'),
    ('Rafael Nascimento', 31, 'rafael.nascimento@gmail.com'),
    ('Mariana Costa', 26, 'mariana.costa@gmail.com'),
    ('Carlos Eduardo', 23, 'carlos.eduardo@gmail.com');

INSERT INTO ticket (dono_id, festival_id) VALUES
    (1, 1),
    (2, 1),
    (3, 2),
    (4, 3),
    (2, 3),
    (3, 2),
    (4, 3),
    (1, 4),
    (2, 4),
    (3, 4);


INSERT INTO festival_line_up (festival_id, line_up_id) VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 2),
    (2, 1),
    (3, 3),
    (3, 7),
    (4, 4),
    (4, 3),
    (4, 7),
    (4, 5);




