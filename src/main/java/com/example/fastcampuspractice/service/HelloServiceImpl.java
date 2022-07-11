package com.example.fastcampuspractice.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;


@RequestScope
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        return "hello, " + name + " !!! I'm " + this.toString();
    }
}
