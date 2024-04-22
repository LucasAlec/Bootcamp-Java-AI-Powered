# Desenvolvendo um Sistema para Eleição Usando Quarkus Framework

Este projeto é um sistema de eleição desenvolvido com o Quarkus Framework. Ele permite que os usuários registrem candidatos, votem em candidatos e vejam os resultados da eleição.

Este projeto é a apenas alterção de um projeto já existente!!!

## Entidades

O sistema possui duas entidades principais:

- `Candidato`: Representa um candidato na eleição. Cada candidato tem um nome e um partido.
- `Voto`: Representa um voto em um candidato.

## API

O sistema expõe uma API RESTful para interagir com as entidades. Aqui estão alguns dos endpoints disponíveis:

- `GET /candidatos`: Retorna uma lista de todos os candidatos.
- `POST /candidatos`: Registra um novo candidato.

## Como executar

Para executar este projeto localmente, você precisará ter o Quarkus e o Docker instalados. Depois de clonar o repositório, você pode iniciar o projeto com o seguinte comando:

```bash
./mvnw quarkus:dev