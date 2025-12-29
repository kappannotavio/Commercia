# Sistema de Vendas de Produtos (Commercia)

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)
![JWT](https://img.shields.io/badge/Security-JWT-red)

## Descrição
Este projeto é um sistema back-end para gerenciamento de **produtos, usuários e pedidos**, ideal para lojas online ou pequenas empresas. O sistema possui autenticação de **clientes e administradores**, carrinho de compras, pedidos com status, histórico e relatórios de vendas.  
O objetivo deste projeto é demonstrar **boas práticas em Java e Spring Boot**, incluindo arquitetura em camadas, DTOs, Spring Security com JWT e integração com banco de dados relacional.

## Funcionalidades

### Usuário
- Cadastro e login (JWT)
- Perfil do usuário e histórico de pedidos

### Produtos
- CRUD completo de produtos
- Filtragem e busca por nome, categoria e faixa de preço

### Carrinho
- Adicionar, remover e atualizar produtos
- Visualizar total do carrinho

### Pedido
- Finalizar pedidos a partir do carrinho
- Status do pedido: Pendente, Processando, Enviado, Entregue
- Relatórios de vendas

### Admin
- Gerenciar produtos
- Consultar todos os pedidos
- Consultar relatórios de vendas

## Arquitetura
O projeto segue a arquitetura **MVC**:


- **Controller:** Endpoints REST
- **Service:** Lógica de negócio
- **Repository:** Spring Data JPA
- **Model/DTO:** Entidades e objetos de transferência de dados
- **Segurança:** Spring Security + JWT

## Tecnologias Utilizadas
- Java 17
- Spring Boot 4
- Spring Security + JWT
- Spring Data JPA
- MySQL
- Maven
- Lombok
- ModelMapper
- JUnit para testes

## Modelo de Dados

**User**  
- id, nome, email, senha, role (CLIENTE/ADMIN), listaDePedidos

**Produto**  
- id, nome, descrição, preço, imagemUrl, categoria, ativo

**Carrinho & CarrinhoItem**  
- Associação entre usuário e itens do carrinho

**Pedido & PedidoItem**  
- Associação entre usuário e itens de pedidos, com total e status

## Endpoints REST

### Usuário
POST /api/users/register
POST /api/users/login
GET /api/users/{id}
PUT /api/users/{id}

### Produtos
GET /api/products
GET /api/products/{id}
POST /api/products (Admin)
PUT /api/products/{id} (Admin)
DELETE /api/products/{id} (Admin)

### Carrinho
GET /api/cart
POST /api/cart/add
PUT /api/cart/update
DELETE /api/cart/remove

### Pedido
POST /api/orders/checkout
GET /api/orders
GET /api/orders/{id}
PUT /api/orders/{id}/status (Admin)
