package com.example.fastcampuspractice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl2 implements HelloService {

    @Override
    public String sayHello(String name) {
        return "안녕, " + name + " !!!";
    }
}
