-- Tabela: impostos (com descricao)
INSERT INTO impostos (id, nome, descricao) VALUES
(1, 'ICMS', 'Imposto sobre Circulacao de Mercadorias e Servicos. Aplica-se a produtos e servicos interestaduais e intermunicipais.'),
(2, 'IPI', 'Imposto sobre Produtos Industrializados. Incide sobre produtos saidos da industria nacional ou importados.'),
(3, 'ISS', 'Imposto Sobre Servicos. Incide sobre prestacao de servicos em ambito municipal.');

-- ICMS por estado e categoria
-- ICMS
INSERT INTO aliquotas (id, imposto_id, uf_origem, uf_destino, tipo_operacao, categoria, percentual) VALUES
(1, 1, 'SP', 'SP', 'VENDA', 'alimenticio', 7.00),
(2, 1, 'SP', 'SP', 'VENDA', 'eletronico', 18.00),
(3, 1, 'SP', 'SP', 'VENDA', 'medicamento', 12.00),
(4, 1, 'SP', 'SC', 'VENDA', 'alimenticio', 12.00),
(5, 1, 'SP', 'SC', 'VENDA', 'eletronico', 17.00),
(6, 1, 'SP', 'SC', 'VENDA', 'medicamento', 8.00),
(7, 1, 'SC', 'SP', 'VENDA', 'alimenticio', 12.00),
(8, 1, 'SC', 'SP', 'VENDA', 'eletronico', 17.00),
(9, 1, 'SC', 'SP', 'VENDA', 'medicamento', 8.00),
(10, 1, 'SC', 'SC', 'VENDA', 'alimenticio', 7.00),
(11, 1, 'SC', 'SC', 'VENDA', 'eletronico', 18.00),
(12, 1, 'SC', 'SC', 'VENDA', 'medicamento', 12.00);

-- IPI
INSERT INTO aliquotas (id, imposto_id, uf_origem, uf_destino, tipo_operacao, categoria, percentual) VALUES
(13, 2, 'BR', 'BR', 'VENDA', 'alimenticio', 5.00),
(14, 2, 'BR', 'BR', 'VENDA', 'eletronico', 15.00),
(15, 2, 'BR', 'BR', 'VENDA', 'medicamento', 10.00);

-- ISS
INSERT INTO aliquotas (id, imposto_id, uf_origem, uf_destino, municipio_destino, tipo_operacao, categoria, percentual) VALUES
(16, 3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'tecnologia', 2.00),
(17, 3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'consultoria', 3.00),
(18, 3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'saude', 5.00),
(19, 3, 'SC', 'SC', 'Joinville', 'SERVICO', 'tecnologia', 2.50),
(20, 3, 'SC', 'SC', 'Joinville', 'SERVICO', 'consultoria', 3.50),
(21, 3, 'SC', 'SC', 'Joinville', 'SERVICO', 'saude', 4.00);
