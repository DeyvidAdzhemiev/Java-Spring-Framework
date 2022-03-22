package com.university.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.university.demo.controller", "com.university.demo.service"})
@EntityScan("com.university.demo.entity")
@EnableJpaRepositories("com.university.demo.repository")
public class UniversityMonolithicAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityMonolithicAppApplication.class, args);
    }

}
