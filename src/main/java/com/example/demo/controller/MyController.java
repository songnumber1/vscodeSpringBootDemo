package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.properties.YamlFooProperties;

@RestController
public class MyController {

     @Autowired
    private YamlFooProperties yamlFooProperties;
    
    @GetMapping("/")
    public String home() {

        StringBuilder str = new StringBuilder();
        str.append("Name : " + yamlFooProperties.getName()).append("\r\n");;
        
        for (String item : yamlFooProperties.getAliases()) {
            str.append("List : " + item).append("\r\n");
        }

        return str.toString();
    }
}
