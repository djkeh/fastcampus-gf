package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final HelloService helloServiceImpl;

    @GetMapping("/main")
    public String main(@RequestParam String name, ModelMap modelMap) {
        String message = helloServiceImpl.sayHello(name);
        modelMap.addAttribute("message", message);

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
