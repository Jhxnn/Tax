INSERT INTO impostos (nome, descricao) VALUES
('ICMS', 'Imposto sobre Circulacao de Mercadorias e Servicos. Aplica-se a produtos e servicos interestaduais e intermunicipais.'),
('IPI', 'Imposto sobre Produtos Industrializados. Incide sobre produtos saidos da industria nacional ou importados.'),
('ISS', 'Imposto Sobre Servicos. Incide sobre prestacao de servicos em ambito municipal.');


INSERT INTO aliquotas (imposto_id, uf_origem, uf_destino, tipo_operacao, categoria, percentual) VALUES
(1, 'SP', 'SP', 'VENDA', 'alimenticio', 7.00),
(1, 'SP', 'SP', 'VENDA', 'eletronico', 18.00),
(1, 'SP', 'SP', 'VENDA', 'medicamento', 12.00),
(1, 'SP', 'SC', 'VENDA', 'alimenticio', 12.00),
(1, 'SP', 'SC', 'VENDA', 'eletronico', 17.00),
(1, 'SP', 'SC', 'VENDA', 'medicamento', 8.00),
(1, 'SC', 'SP', 'VENDA', 'alimenticio', 12.00),
(1, 'SC', 'SP', 'VENDA', 'eletronico', 17.00),
(1, 'SC', 'SP', 'VENDA', 'medicamento', 8.00),
(1, 'SC', 'SC', 'VENDA', 'alimenticio', 7.00),
(1, 'SC', 'SC', 'VENDA', 'eletronico', 18.00),
(1, 'SC', 'SC', 'VENDA', 'medicamento', 12.00);

INSERT INTO aliquotas (imposto_id, uf_origem, uf_destino, tipo_operacao, categoria, percentual) VALUES
(2, 'BR', 'BR', 'VENDA', 'alimenticio', 5.00),
(2, 'BR', 'BR', 'VENDA', 'eletronico', 15.00),
(2, 'BR', 'BR', 'VENDA', 'medicamento', 10.00);

INSERT INTO aliquotas (imposto_id, uf_origem, uf_destino, municipio_destino, tipo_operacao, categoria, percentual) VALUES
(3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'tecnologia', 2.00),
(3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'consultoria', 3.00),
(3, 'SP', 'SP', 'Sao Paulo', 'SERVICO', 'saude', 5.00),
(3, 'SC', 'SC', 'Joinville', 'SERVICO', 'tecnologia', 2.50),
(3, 'SC', 'SC', 'Joinville', 'SERVICO', 'consultoria', 3.50),
(3, 'SC', 'SC', 'Joinville', 'SERVICO', 'saude', 4.00);
