# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:
- Singleton

## Singleton com Spring Framework

No contexto do Spring Framework, todas as classes de serviço são, por padrão, singletons. Isso significa que o Spring cria uma única instância de cada classe de serviço e a reutiliza sempre que necessário.

Neste projeto, a classe `ClienteService` é um exemplo de um Singleton. Ela é responsável por gerenciar os clientes, permitindo operações como buscar todos os clientes, buscar um cliente por ID, inserir um novo cliente, atualizar um cliente existente e deletar um cliente.

# Classe ClienteService

A classe `ClienteService` é uma implementação do padrão de projeto Singleton. Isso significa que apenas uma instância dessa classe é criada durante a execução do programa.

A classe `ClienteService` gerencia uma lista de clientes, permitindo operações como buscar todos os clientes, buscar um cliente por ID, inserir um novo cliente, atualizar um cliente existente e deletar um cliente.

## Métodos

- `getInstance()`: Este método estático retorna a única instância da classe `ClienteService`. Se a instância ainda não foi criada, ele a cria.

- `buscarTodos()`: Este método retorna uma lista de todos os clientes.

- `buscarPorId(Long id)`: Este método recebe um ID como parâmetro e retorna o cliente correspondente, se existir. Se não existir nenhum cliente com o ID fornecido, ele retorna `null`.

- `inserir(Cliente cliente)`: Este método recebe um objeto `Cliente` como parâmetro e o adiciona à lista de clientes.

- `atualizar(Long id, Cliente clienteAtualizado)`: Este método recebe um ID e um objeto `Cliente` como parâmetros. Ele encontra o cliente com o ID fornecido e atualiza seus dados com os do objeto `Cliente` fornecido.

- `deletar(Long id)`: Este método recebe um ID como parâmetro e remove o cliente correspondente da lista de clientes.