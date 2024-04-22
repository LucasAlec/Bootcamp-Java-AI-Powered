# Publicando API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

O projeto consiste na criação de uma API que lida com uma lista de jogos: Criando, atualizando e deletando o que for necessário.

## Tecnologias Utilizadas
Java
Spring Boot
JPA/Hibernate

## Etapas

**Criação e Versionamento da API
(Spring Initializr e Git Hub)**

**Abtração e Modelagem do Domínio: Figma, ChatGPT e JPA**

**Implementação do Backend (Deploy e Monitoramento)**

**Criar A própria API (Explorar um Novo Domínio de Aplicação a sua escolha)**

## Endpoints

A API de Jogos possui os seguintes endpoints:

### Listar todos os jogos

- Método: GET
- URL: /games
- Descrição: Retorna uma lista de todos os jogos.

### Criar um novo jogo

- Método: POST
- URL: /games
- Descrição: Cria um novo jogo.
- Corpo da requisição: Um objeto JSON que representa o jogo. Por exemplo:

```json
{
    "name": "Nome do Jogo",
    "platform": "Plataforma do Jogo",
    "type": "Tipo do Jogo"
}
```


### Atualizar um jogo

- Método: PUT
- URL: /games/{id}
- Descrição: Atualiza o jogo com o ID especificado.
- Parâmetros:
  - id: O ID do jogo que você deseja atualizar.
- Corpo da requisição: Um objeto JSON que representa o jogo. Por exemplo:

```json
{
    "name": "Novo Nome do Jogo",
    "platform": "Nova Plataforma do Jogo",
    "type": "Novo Tipo do Jogo"
}
```

### Deletar um jogo

- Método: DELETE
- URL: /games/{id}
- Descrição: Deleta o jogo com o ID especificado.
- Parâmetros:
  - id: O ID do jogo que você deseja deletar.