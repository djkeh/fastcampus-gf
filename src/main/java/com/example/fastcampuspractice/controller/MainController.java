package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final HelloService helloServiceImpl;

    @GetMapping("/api/main")
    public String main(@RequestParam String name) {
        String resultMessage = helloServiceImpl.sayHello(name); // TODO: resultMessage 는 타임리프 공부에서 활용하려고 함. 일단 놔둔다.
        return "main/index";
    }

    @ResponseBody
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
