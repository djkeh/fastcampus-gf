package com.example.fastcampuspractice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;


@Slf4j
@RequestScope
public class HelloServiceImpl implements HelloService {

    @Value("${uno.korean.hello}")
    private String hello;


    @Override
    public String sayHello(String name) {
        log.warn("이게 로그다! - {}", hello);

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        return hello + ", " + name + " !!! I'm " + this.toString();
    }
}
