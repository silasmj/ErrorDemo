package com.example.errordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class ErrorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErrorDemoApplication.class, args);
    }

}
