Como rodar o projeto
1. Clone o repositório
``
git clone https://github.com/Jhxnn/seu-projeto-quarkus.git
cd tax
``

3. Rode o projeto em modo dev

   
``
mvn quarkus:dev
``

5. Rode os testes

``
mvn test
``

6.Acesse os endpoints
Exemplo de endpoint para ICMS:

``
GET http://localhost:8080/calculo/icms
Content-Type: application/json
``
``
{
  "ufOrigem": "SP",
  "ufDestino": "SC",
  "tipoOperacao": "VENDA",
  "categoria": "eletronico",
  "valorProduto": 1000
}
``

Exemplo de resposta:


``
{
  "valorImposto": 170.0,
  "percentual": 17.0
}
``
