package com.globo.first_spring_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anotação Lombok - Gera automaticamente getters, setters, toString, equals, hashCode
@Data
//Construtor vazio (sem argumentos)
@NoArgsConstructor
//Construtor com todos os argumentos
@AllArgsConstructor
public class User {
 // Atributo que representa o nome do usuário
 private String name;
}
