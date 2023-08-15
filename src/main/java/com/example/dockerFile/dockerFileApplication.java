package com.example.dockerFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

@SpringBootApplication
@RestController

public class dockerFileApplication {
    @Test
    @GetMapping("/greet")
    public String getMesage()
    {
        return ("Hello*********************");
    }
    public static void main(String[] args) {
        SpringApplication.run(dockerFileApplication.class, args);
    }

}
