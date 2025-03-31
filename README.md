# 📦 Course API

API RESTful desenvolvida em **Java com Spring Boot**, simulando uma plataforma de gerenciamento de pedidos, usuários, produtos e categorias. O projeto possui uma arquitetura bem definida com camadas de entidade, repositório, serviço e controle, além de tratamento global de exceções.

---

## 🚀 Funcionalidades

- 🔍 CRUD de **Usuários**
- 📦 CRUD de **Produtos**
- 🏷️ CRUD de **Categorias**
- 🛒 CRUD de **Pedidos (Orders)** com relacionamento:
  - `User` → `Order`
  - `Order` → `OrderItem` → `Product`
- 💳 Pagamento vinculado ao Pedido (`Payment`)
- 🌐 API RESTful com endpoints mapeados por recurso
- ⚠️ Tratamento global de exceções com `@ControllerAdvice`
- ✅ Dados populados automaticamente no perfil de teste (`TestConfig`)

---


## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (modo de teste)
- Maven
- Postman (para testes)

---

## 🔗 Endpoints Principais

| Recurso    | Método | Endpoint                | Descrição                        |
|------------|--------|-------------------------|----------------------------------|
| Usuários   | GET    | `/users`                | Lista todos os usuários          |
| Usuários   | GET    | `/users/{id}`           | Busca um usuário por ID          |
| Usuários   | POST   | `/users`                | Cria um novo usuário             |
| Usuários   | DELETE | `/users/{id}`           | Deleta um usuário                |
| Produtos   | GET    | `/products`             | Lista todos os produtos          |
| Pedidos    | GET    | `/orders`               | Lista todos os pedidos           |

---

## ⚠️ Tratamento de Erros

A aplicação retorna erros personalizados no padrão:

```json
{
  "timestamp": "2025-03-31T10:21:49Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Resource not found. Id 9",
  "path": "/users/9"
}
