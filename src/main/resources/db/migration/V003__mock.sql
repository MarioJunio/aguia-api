-- Enderecos
insert into endereco(id, logradouro, numero, bairro, cidade_id, cep)
values (1, 'Rua Duarte da Costa', 1575, 'Jardim Zenite', 2061, '38500-000');

-- Clubes
insert into clube (id, nome, horario_abertura, horario_encerramento, endereco_id) 
values (1, 'Aguia', '08:00:00', '18:00:00', 1);

-- Baias
insert into baia (id, codigo, clube_id)
values 
(1, '001', 1),
(2, '002', 1),
(3, '003', 1),
(4, '004', 1),
(5, '005', 1),
(6, '006', 1),
(7, '007', 1);

-- Usuarios
insert into usuario (id, nome, telefone, senha, data_nascimento, endereco_id, instrutor, clube_id)
values 
(1, 'Mario Marques', '34987005712', 'teste', '1993-04-16', 1, false, 1), 
(2, 'Fabricio nunes', '34987005812', 'teste', '1986-04-16', 1, true, 1);

-- Agendamentos
insert into agendamento (id, usuario_id, baia_id, inicio, fim, status, instrutor_id_aprovou, observacao)
values 
(1, 1, 1, '2019-09-17 13:00:00.00', '2019-09-17 15:00:00.00', 'PENDENTE', null, null),
(2, 1, 7, '2019-09-18 14:00:00.00', '2019-09-20 17:00:00.00', 'APROVADO', 2, null),
(3, 1, 3, '2019-09-15 08:00:00.00', '2019-09-15 10:00:00.00', 'APROVADO', 2, null);

-- Solicitacoes conferencia
insert into solicitacao_conferencia (id, usuario_id, instrutor_id, baia_id, notificado, status, data_solicitacao, data_resposta)
values
(1, 1, 2, 7, true, 'CONCLUIDA', '2019-09-20 15:21:32.67', '2019-09-20 15:23:21.00'),
(2, 1, 2, 7, true, 'CONCLUIDA', '2019-09-20 15:47:00.67', '2019-09-20 15:50:23.00'),
(3, 1, 2, 3, true, 'CONCLUIDA', '2019-09-15 08:10:00.00', '2019-09-15 08:12:15.00');

-- Conferencias
insert into conferencia (id, solicitacao_conferencia_id, data_conferencia, pontuacao)
values
(1, 1, '2019-09-20 15:31:00.00', 17),
(2, 2, '2019-09-20 15:57:13.00', 11),
(3, 3, '2019-09-15 08:15:00.00', 37);