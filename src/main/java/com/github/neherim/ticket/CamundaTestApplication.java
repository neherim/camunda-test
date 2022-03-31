package com.github.neherim.ticket;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableProcessApplication
@SpringBootApplication
public class CamundaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaTestApplication.class, args);
    }

}
