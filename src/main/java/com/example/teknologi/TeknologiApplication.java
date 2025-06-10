package com.example.teknologi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeknologiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeknologiApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "HTTPS virker - nu også med ci/cd";
    }
}
