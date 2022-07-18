package com.example.fastcampuspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastcampusPracticeApplication.class, args);
    }

}
