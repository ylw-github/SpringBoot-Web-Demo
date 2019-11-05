package com.ylw.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ylw")
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
