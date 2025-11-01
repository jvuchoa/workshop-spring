# 🧩 Workshop Spring Boot

Projeto desenvolvido como parte de um workshop de **Java com Spring Boot**, com o objetivo de praticar conceitos fundamentais do **Spring Framework** e da **persistência de dados com JPA** utilizando o banco **H2** em memória.

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3.5.3**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

## 📋 Descrição

O projeto consiste em uma aplicação simples de cadastro de usuários (**CRUD**), permitindo operações básicas de:
- Criar usuários
- Listar todos os usuários
- Buscar usuário por ID
- Atualizar dados
- Deletar usuários

O banco de dados **H2** é utilizado apenas para fins de teste e aprendizado, sendo executado em memória e resetado a cada inicialização da aplicação.

## ⚙️ Como executar o projeto

### Pré-requisitos
- Java 17 ou superior instalado  
- Maven configurado

### Passos
1. Clone este repositório:
git clone https://github.com/jvuchoa/workshop-spring.git
cd workshop-spring
mvn spring-boot:run
🗄️ Console do H2

Acesse o console do banco H2 em:

http://localhost:8080/h2-console
   ```bash
   git clone https://github.com/jvuchoa/workshop-spring.git
