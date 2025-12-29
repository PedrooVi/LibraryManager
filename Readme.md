# LibraryManager

API REST simples para gerenciamento de **Livros e Autores**, desenvolvida com **Spring Boot**, utilizando **JPA (Hibernate)**, **DTOs**, **validações** e **MapStruct**.  
O projeto tem como foco **aprendizado e boas práticas** na construção de APIs REST em Java.

---

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (banco em memória)
- **MapStruct**
- **Lombok**
- **Bean Validation (Jakarta Validation)**

---

## 🏗 Estrutura do Projeto

O projeto segue a seguinte separação em camadas:

- **Controller** → recebe as requisições HTTP
- **Service** → contém a regra de negócio
- **Repository** → acesso ao banco de dados
- **DTO** → transporte de dados e validação
- **Mapper** → conversão entre DTOs e Entidades


---

##  Como Executar o Projeto

### Pré-requisitos
- Java 17+ (ou versão compatível com seu Spring Boot)
- Maven

### Passos
```bash
git clone https://github.com/PedrooVi/LibraryManager
cd LibraryManager
./mvnw spring-boot:run
```
A aplicação estará disponível em:
```bash
http://localhost:8080
```

## Endpoints disponiveis:

### Criar livros:

### Post ``` /api/v1/livros```

Exemplo de JSON:
````
{
  "nome": "Livro de teste",
  "autor": {
    "nome": "Pedro Vinicius",
    "idade": 20
  }
}
````
### Buscar livros:
### Get ``` /api/v1/livros/{id}```

##  Objetivo do Projeto

Este projeto foi criado com foco em:

- Praticar Spring Boot + JPA
- Entender o uso de DTOs e validações
- Aplicar MapStruct na conversão de objetos
- Construir uma API REST bem estruturada

## Autor
### Pedro Vinicius
[Linkedin](https://www.linkedin.com/in/pedrovinicius-dev/) |
[GitHub](https://github.com/PedrooVi)
