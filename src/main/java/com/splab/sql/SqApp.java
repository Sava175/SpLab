package com.splab.sql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqApp {
    public static void main(String[] args) {
        SpringApplication.run(SqApp.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {};

    }

}
