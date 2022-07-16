package com.example.fastcampuspractice.service;

import com.example.fastcampuspractice.properties.UnoProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HelloServiceImpl2 implements HelloService {

    private final UnoProperties unoProperties;

    @Override
    public String sayHello(String name) {

        return unoProperties.english().hello() + ", " + name + " !!!";
    }
}
