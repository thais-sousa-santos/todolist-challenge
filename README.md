
# ToDoList

Projeto criado para desafio de uma API que orquestrasse uma lista de tarefas via integração com ordenação de prioridades.

## Documentação da API

#### Criar um to Do

```http
  POST /todos
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O nome do to Do que você quer |
| `descricao`      | `string` | **Obrigatório**. A descrição do to Do que você quer |
| `realizado`      | `boolean` | **Obrigatório**. Se o to Do foi realizado |
| `prioridade`      | `int` | **Obrigatório**. A prioridade do to Do |


#### Retorna todos os to Dos

```http
  GET /todos
```

#### Atualiza um to Do

```http
  PUT /todos
```

| Parâmetro    | Tipo      | Descrição                                           |
|:-------------|:----------|:----------------------------------------------------|
| `id`         | `Long`    | **Obrigatório**. O ID do to Do gerado               |
| `nome`       | `string`  | **Obrigatório**. O nome do to Do que você quer      |
| `descricao`  | `string`  | **Obrigatório**. A descrição do to Do que você quer |
| `realizado`  | `boolean` | **Obrigatório**. Se o to Do foi realizado           |
| `prioridade` | `int`     | **Obrigatório**. A prioridade do to Do              |

#### Deletar um to Do

```http
  DELETE /todos/{id}
```
## Modelo de DTO para requisições

```
{
	"nome": "Estudar Observabilidade",
	"descricao": "Ver vídeo sobre Grafana",
	"realizado": false,
	"prioridade": "1"
}
```
## Stack utilizada

**Back-end:** Java 17, Spring Boot, Spring Data JPA, Spring DOC OpenAPI 3, Spring WebFlux

**Database:** Postgres


## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3




## Rodando localmente

- Clone o projeto GIT
- Construir o projeto

```bash
  $ /mvnw clean package
```
- Executar a aplicação:

```bash
  $ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080). O Swagger poderá ser visualizado em
[localhost:8080/swagger-ui.html](localhost:8080/swagger-ui.html)





