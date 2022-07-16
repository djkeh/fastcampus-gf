package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@RequiredArgsConstructor
@RestController
public class MainController {

    private final HelloService helloServiceImpl;

    @GetMapping("/api/main")
    public String main(@RequestParam String name) {
        return helloServiceImpl.sayHello(name);
    }

    @PostMapping("/api/validation")
    public String validation(@Valid @RequestBody UnoRequest request) {
        return "good";
    }


    public record UnoRequest(
            @NotBlank String name,
            @Min(10) Integer age
    ) {
    }

}
