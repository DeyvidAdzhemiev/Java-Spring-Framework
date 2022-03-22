package com.university.studentservice.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.university.studentservice.controller", "com.university.studentservice.service"})
@EntityScan("com.university.demo.entity")
@EnableJpaRepositories("com.university.studentservice.repository")
@EnableFeignClients("com.university.studentservice.feignClients")
public class StudentServiceApplication {

    @Value("${address.service.url}")
    private String addressServiceUrl;

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

    @Bean
    public WebClient webClient(){
        WebClient webClient = WebClient.builder().baseUrl(addressServiceUrl).build();

        return webClient;
    }
}
