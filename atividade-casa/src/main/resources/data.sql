INSERT INTO akumano_mi (nome, poder, local_de_encontro) VALUES ('Gomu Gomu no Mi', 'Permite ao usuário esticar seu corpo como borracha', 'East Blue');
INSERT INTO akumano_mi (nome, poder, local_de_encontro) VALUES ('Hie Hie no Mi', 'Permite ao usuário criar e controlar o gelo', 'Grand Line');


INSERT INTO personagem (nome, idade, akumano_mi_id) VALUES ('Monkey D. Luffy', 19, 1);
INSERT INTO personagem (nome, idade, akumano_mi_id) VALUES ('Nico Robin', 30, null);
INSERT INTO personagem (nome, idade, akumano_mi_id) VALUES ('Trafalgar D. Water Law', 26, null);
INSERT INTO personagem (nome, idade, akumano_mi_id) VALUES ('Crocodile', 46, 2);

INSERT INTO bando (nome, descricao) VALUES ('Chapéu de Palha', 'Um grupo de piratas em busca do One Piece');
INSERT INTO bando (nome, descricao) VALUES ('Baroque Works', 'Uma organização criminosa que deseja derrubar o governo');

UPDATE PERSONAGEM SET BANDO_ID = 1 WHERE ID = 1;
UPDATE PERSONAGEM SET BANDO_ID = 1 WHERE ID = 2;
UPDATE PERSONAGEM SET BANDO_ID = 2 WHERE ID = 4;

