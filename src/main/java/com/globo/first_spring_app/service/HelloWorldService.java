package com.globo.first_spring_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Indica que esta classe é um serviço do Spring
@Service
public class HelloWorldService {

 // Injeta o Bean String criado na configuração (HelloWorldConfiguration)
 @Autowired
 private String helloPrefix;  // Prefixo da mensagem ("Hello World")

 // Variável para guardar o último nome salvo
 private String lastName = "";  // Começa vazio

 // Retorna a mensagem com o prefixo + nome (se houver)
 public String getMessage() {
     return helloPrefix + " " + lastName;
 }

 // Salva o nome recebido
 public void saveName(String name) {
     this.lastName = name;
 }
}
