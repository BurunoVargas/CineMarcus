# CineMarcus

CineMarcus é um software desktop desenvolvido como parte do projeto final da disciplina Tópicos de Programação 1 na Universidade de Brasília (UnB). O sistema foi projetado para facilitar a compra de ingressos de cinema, reduzindo filas e otimizando o gerenciamento de sessões e filmes.

## Funcionalidades

### Clientes

- Cadastro e login no sistema.
- Visualizar e pesquisar sessões disponíveis.
- Comprar ingressos e selecionar assentos.
- Gerar e baixar tickets digitais.
- Atualizar informações pessoais.

### Administradores

- Cadastro e login.
- Adicionar, editar e remover filmes.
- Criar e gerenciar sessões de cinema.
- Excluir filmes e suas sessões.

## Regras de Negócio

### Descontos:

- Clientes chamados "Marcus" recebem 10% de desconto.
- Ingressos custam metade do preço às segundas e quartas.

### Classificação indicativa:

- Menores de idade precisam de autorização para assistir filmes inadequados à sua faixa etária.

## Tecnologias Utilizadas

- Linguagem: Java
- IDE: NetBeans
- Estrutura de Dados: Arquivos JSON, utilizando a biblioteca org.json.
- Arquitetura: MVC (Model-View-Controller)

## Estrutura do Projeto

### O sistema segue o padrão MVC:

- Modelos: Representam as entidades principais, como Pessoa, Cliente, Admin, Filme e Sessao.
- Controladores: Gerenciam as regras de negócio e operações como criar, editar e excluir objetos (Login, FilmeController, SessaoController).
- Visualizações: Interfaces gráficas para interação com os usuários.

### Os dados são armazenados em arquivos JSON:

- logins.json: Armazena usuários cadastrados.
- filmes.json: Armazena informações sobre os filmes.
- sessoes.json: Contém os detalhes das sessões de cinema.
