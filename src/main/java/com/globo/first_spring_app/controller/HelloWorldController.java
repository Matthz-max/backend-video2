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

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/Hello_World")
@Tag(name = "Hello World API", description = "API para demonstração do Hello World")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    @Operation(summary = "Retorna a mensagem Hello World(em caso de ter feito o Post ira mostrar o nome em frente do HelloWorld)")
    public String getHelloWorld() {
        return helloWorldService.getMessage();
    }

    @PostMapping
    @Operation(summary = "Salva o nome recebido e retorna confirmação")
    public String postHelloWorld(@RequestBody User user) {
        helloWorldService.saveName(user.getName());
        return "Nome salvo com sucesso: " + user.getName();
    }
}
