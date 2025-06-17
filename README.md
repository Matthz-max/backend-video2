# 🌍 HelloWorld - Backend

Este é o backend do projeto **HelloWorld**, desenvolvido com **Spring Boot** e **MySQL**. Ele fornece uma API RESTful para colocar seu nome.

---

## 🚀 Tecnologias Utilizadas

-  Java 21
-  Eclipse ide
-  Postman
-  Workbeach
-  Lombok  
-  Maven
-  Swagger

---

---

##  Dependecias

-  Spring Boot DevTools
-  Spring Web  
-  Spring Data JPA  
-  MySQL Driver  
-  Lombok
-  Swagger 

---

## ⚙️ Como rodar o projeto localmente
### Pré-requisitos

- Postman ou outra testador de Requisições
- Projeto rodando
- [Lombok](https://projectlombok.org/download)
- [Workbeach](https://dev.mysql.com/downloads/workbench/)
- IDE como **Eclipse** ou **IntelliJ**

---

## 📁 Estrutura de Pastas 

```plaintext
src
├── main
│   ├── java
│   │   └── com.globo.first_spring_app
│   │       │└─ FirstSpringAppApplication.java
│   │       │   
│   │       ├── com.globo.first_spring_app.configuration
│   │       │   └── HelloWorldConfiguration.java
│   │       │   
│   │       ├── com.globo.first_spring_app.controller
│   │       │   └── HelloWorldController.java  
│   │       │ 
│   │       ├── com.globo.first_spring_app.entity        
│   │       │   └── User.java
│   │       │ 
│   │       └── com.globo.first_spring_app.service
│   │           └── HelloWorldService.java 
│   └── resources
│       ├── application.properties
│       └── static/
└── test

```
## 🧪 Testes com Postman

<div align="center">
  <table>
    <tr>
      <td align="center"><strong>Método GET</strong></td>
      <td style="width: 20px;"></td> <!-- Espaço entre as colunas -->
      <td align="center"><strong>Método POST</strong></td>
    </tr>
    <tr>
      <td>
        <img src="https://github.com/user-attachments/assets/b452e327-25bc-4ba3-81fb-a71f5324fbb6" alt="GET" width="400"/>
      </td>
      <td></td>
      <td>
        <img src="https://github.com/user-attachments/assets/a9ce2185-ca52-4e84-8184-55c58e8d297d" alt="POST" width="400"/>
      </td>
    </tr>
  </table>
</div>
 
---

# 🛠️ Modificações Feitas
Aqui estão as principais alterações realizadas em relação ao projeto mostrado no vídeo original:

## Controller
 Foram feitas pequenas mudanças nos métodos GET e POST para melhorar a organização e o fluxo de requisições.

 ## Entity
 O atributo email foi removido, deixando a entidade mais simples e focada apenas no necessário.

## Service
 O fluxo de código foi reformulado:
Antes, o GET apenas retornava uma string estática.
Agora, o projeto conta com um método POST, que permite criar e armazenar dados (quando necessário), enquanto o GET busca e exibe as informações que o POST criou.

 ## Configuration
Foi realizada apenas a alteração do nome do método, que passou de helloWorld para helloPrefix, visando uma melhor representação da sua função.

---

## 📚 Referência
Fernanda Kipper | Dev
CURSO DE SPRING para INICIANTES | Tutorial Completo de Java Spring

[https://www.youtube.com/watch?v=lUVureR5GqI](https://www.youtube.com/watch?v=YY_hf0FOIcU)

## 👨‍💻 Desenvolvedor
Feito por Matheus Serafim da Silva
 
