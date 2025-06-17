package com.globo.first_spring_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    private String helloPrefix;  // Puxando o Bean de configuração

    private String lastName = "";  // Valor padrão inicial

    public String getMessage() {
        return helloPrefix + " " + lastName;
    }

    public void saveName(String name) {
        this.lastName = name;
    }
}
