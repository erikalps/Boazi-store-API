# Baozi Store API

API REST desenvolvida com Java e Spring Boot para gerenciamento de clientes, produtos e pedidos de uma loja de pão chinês (baozi).

## Tecnologias

- Java 17
- Spring Boot 3.5.1
- Spring Data JPA
- MySQL
- Maven

## Como executar

### Pré-requisitos

- Java 17+
- MySQL
- Maven

### Configuração do banco

```sql
CREATE DATABASE baozi_store;
```

### Configurar application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/baozi_store
spring.datasource.username=root
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Rodar o projeto

```bash
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`

## Endpoints

### Cliente
| Método | URL | Descrição |
|---|---|---|
| POST | /clientes | Cadastrar cliente |
| GET | /clientes | Listar clientes |
| GET | /clientes/{id} | Buscar por ID |
| DELETE | /clientes/{id} | Deletar cliente |

### Produto
| Método | URL | Descrição |
|---|---|---|
| POST | /produtos | Cadastrar produto |
| GET | /produtos | Listar produtos |
| GET | /produtos/{id} | Buscar por ID |
| DELETE | /produtos/{id} | Deletar produto |

### Pedido
| Método | URL | Descrição |
|---|---|---|
| POST | /pedidos | Registrar pedido |
| GET | /pedidos | Listar pedidos |
| GET | /pedidos/{id} | Buscar por ID |
| DELETE | /pedidos/{id} | Deletar pedido |

## Estrutura do projeto
src/main/java/com/baozi/boazi_story/

├── controller/

│   ├── ClienteController.java

│   ├── ProdutoController.java

│   └── PedidoController.java

├── model/

│   ├── Cliente.java

│   ├── Produto.java

│   └── Pedido.java

└── repository/

├── ClienteRepository.java

├── ProdutoRepository.java

└── PedidoRepository.java

## Entidades

**Cliente:** id, nome, clienteDesde

**Produto:** id, nome, preco, estoque

**Pedido:** id, clienteId, produtoId, quantidade
