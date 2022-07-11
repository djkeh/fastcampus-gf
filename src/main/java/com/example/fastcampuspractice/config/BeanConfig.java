package com.example.fastcampuspractice.config;

import com.example.fastcampuspractice.service.HelloService;
import com.example.fastcampuspractice.service.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public HelloService helloServiceImpl() {
        return new HelloServiceImpl();
    }

}
