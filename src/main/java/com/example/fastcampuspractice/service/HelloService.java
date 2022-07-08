package com.example.fastcampuspractice.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    public String sayHello(String name) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        return "hello, " + name + " !!!";
    }
}
