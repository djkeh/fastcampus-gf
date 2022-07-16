package com.example.fastcampuspractice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;


@RequestScope
public class HelloServiceImpl implements HelloService {

    @Value("${uno.korean.hello}")
    private String hello;


    @Override
    public String sayHello(String name) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        return hello + ", " + name + " !!! I'm " + this.toString();
    }
}
