# DianomeEntregadores

O projeto `DianomeEntregadores` é uma API REST desenvolvida com o Spring Boot para gerenciar as operações de uma empresa de entregas. Este software permite o controle eficiente dos entregadores, facilitando a gestão de suas informações e capacidade de entrega.

## Introdução

Este projeto foi criado para resolver a necessidade de gerenciar entregadores em uma empresa de entregas. O sistema permite cadastrar, atualizar, buscar e remover entregadores, além de associá-los a pacotes para entrega, garantindo uma distribuição eficaz de tarefas.

## Pré-requisitos

Antes de iniciar, certifique-se de que você tem instalado em sua máquina:
- JDK 11 ou superior
- Maven 3.6 ou superior
- PostgreSQL 12 ou superior

## Configuração

Siga estas etapas para configurar o ambiente do projeto em sua máquina local:

1. **Clone o repositório**:

   ```sh
   git clone https://github.com/gususa/Dianome_Gustavo.git
   
Configurar o Banco de Dados:

Certifique-se de que o PostgreSQL está rodando e crie um banco de dados chamado dianome_db.

Definir Variáveis de Ambiente:

Configure as seguintes variáveis de ambiente para a conexão com o banco de dados:

SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/dianome_db
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=senha_do_postgreSQL

## Execução

Para executar a aplicação, navegue até a pasta do projeto e execute o seguinte comando: mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

## Endpoints da API 

A API define os seguintes endpoints:

POST /entregadores - Cadastrar um novo entregador
GET /entregadores - Listar todos os entregadores
GET /entregadores/{cpf} - Obter detalhes de um entregador específico
PUT /entregadores/{cpf} - Atualizar um entregador
DELETE /entregadores/{cpf} - Remover um entregador

## Problema Resolvido 

A Dianome resolve a complexidade de gerenciar entregadores em uma plataforma fácil de usar, onde a empresa pode rastrear e alocar recursos de entrega de forma eficiente.

## Licença

Este projeto está sob a licença TAKEWORLD. Veja o arquivo LICENSE para mais detalhes.

