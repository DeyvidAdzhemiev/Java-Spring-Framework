package com.university.adressservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.university.adressservice.controller", "com.university.adressservice.service"})
@EntityScan("com.university.adressservice.entity")
@EnableJpaRepositories("com.university.adressservice.repository")
public class AddressServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(AddressServiceApplication.class, args);
    }

}
