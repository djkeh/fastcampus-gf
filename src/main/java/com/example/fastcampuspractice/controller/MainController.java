package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

    private final HelloService helloServiceImpl;

    @GetMapping("/api/main")
    public String main(@RequestParam String name) {
        return helloServiceImpl.sayHello(name);
    }


}
