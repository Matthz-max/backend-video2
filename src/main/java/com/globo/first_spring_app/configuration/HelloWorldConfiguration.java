package com.globo.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Indica que esta classe é uma configuração do Spring
@Configuration
public class HelloWorldConfiguration {

 // Cria um bean que retorna a string "Hello World"
 @Bean
 public String helloPrefix() {
     return "Hello World";
 }
}
