# 🥷 Cadastro de Ninjas + Missões

Este projeto foi desenvolvido com o objetivo de aprofundar meu conhecimento em **Spring Boot** e entender como aplicar boas práticas de arquitetura, segurança e manipulação de dados — conhecimento essencial para aplicar futuramente no meu sistema **DriveGo**.

---

## 🧠 Objetivos de Aprendizado

- Aprender a estruturar uma **API RESTful** com Spring Boot.
- Utilizar o **PostgreSQL** como banco de dados relacional.
- Aplicar **DTOs**, separação de responsabilidades e segurança na manipulação de dados.
- Evitar acesso direto a entidades e proteger informações sensíveis.
- Compreender e implementar a **arquitetura em camadas (Controller, Service, Repository, Model)**.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **PostgreSQL**
- **Lombok**
- **Maven**
- **ModelMapper** (se utilizado)
- **Swagger/OpenAPI** (se for adicionar documentação futuramente)

---

## 🧩 Funcionalidades

### 🥷 Cadastro de Ninjas
- Criar novo ninja
- Atualizar informações
- Atribuir missões
- Remover ninja

### 🎯 Cadastro de Missões
- Criar missões
- Definir classificação (rank, dificuldade, etc.)
- Marcar como concluída
- Atualizar e remover missões

---

## 🔐 Segurança e Boas Práticas

- Uso de **DTOs** para proteger os dados trafegados.
- Evita exposição direta das entidades (`Model`).
- Organização em pacotes por domínio (Ninjas e Missões).
- Princípios de **Clean Code** e responsabilidade única por classe.

---

## 🗂️ Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── dev.java.CadastroDeNinjas/
│   │       ├── Ninjas/
│   │       ├── Missoes/
│   │       ├── Application.java
│   └── resources/
│       ├── application.properties
│       └── ...
└── test/
