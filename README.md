# API de uma Biblioteca

# Tecnologias utilizadas
- Java 25
- Spring Boot 4.0.3
- Spring Data JPA
- PostgreSQL (ou H2 para testes)
- Maven


## Como rodar
Clone o repositório 
```bash
    git clone https://github.com/PietroAssis-dev/API-Biblioteca
```

  Compile e rode
   ```bash
   mvn spring-boot:run
   ```

  A aplicação estara disponivel em:
   ```bash
   http://localhost:8080

```
   ### 4. Endpoints disponíveis

   # Criar o livro 

  ```bash

POST /livros
Body:
{
  "titulo": "Clean Code",
  "autor": "Robert C. Martin"
}

```

# Listar os livros

```bash
    GET /livros

```

# Retirar o livro 

```bash
    PUT /livros/{id}/retirar
```

# Devolver o livro 
```bash
PUT /livros/{id}/devolver
```

# Deletar o livro
```bash

DELETE /livros/{id}

```
