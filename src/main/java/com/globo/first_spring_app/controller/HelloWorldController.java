package com.globo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globo.first_spring_app.entity.User;
import com.globo.first_spring_app.service.HelloWorldService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
//Permite requisições de qualquer origem (CORS)
@CrossOrigin(origins = "*")
//Indica que esta classe é um controller REST
@RestController
//Define o caminho base da API
@RequestMapping("/Hello_World")
//Documentação Swagger - Nome e descrição da API
@Tag(name = "Hello World API", description = "API para demonstração do Hello World")
public class HelloWorldController {

 // Injeta o serviço HelloWorldService
 @Autowired
 private HelloWorldService helloWorldService;

 // Endpoint GET - Retorna a mensagem Hello World (ou com nome, se tiver sido enviado antes)
 @GetMapping
 @Operation(summary = "Retorna a mensagem Hello World (se tiver nome salvo, mostra junto)")
 public String getHelloWorld() {
     return helloWorldService.getMessage();
 }

 // Endpoint POST - Recebe um nome via JSON e salva no serviço
 @PostMapping
 @Operation(summary = "Salva o nome recebido e retorna confirmação")
 public String postHelloWorld(@RequestBody User user) {
     helloWorldService.saveName(user.getName());
     return "Nome salvo com sucesso: " + user.getName();
 }
}

