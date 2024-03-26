package com.aula06.OlaMundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ola")
    public String getOlaMundo() {

        return "Olá Mundo !!!";
    }

    


    
    

}
