package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.constant.Grade;
import com.example.fastcampuspractice.dto.StudentDto;
import com.example.fastcampuspractice.dto.SubjectDto;
import com.example.fastcampuspractice.service.HelloService;
import com.example.fastcampuspractice.service.StudentService;
import com.example.fastcampuspractice.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final HelloService helloServiceImpl;
    private final StudentService studentService;
    private final SubjectService subjectService;

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

    @ResponseBody
    @GetMapping("/students")
    public List<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @ResponseBody
    @GetMapping("/students-by-grade")
    public List<StudentDto> getStudents(@RequestParam Grade grade) {
        return studentService.getStudents(grade);
    }

    @ResponseBody
    @GetMapping("/subjects")
    public List<SubjectDto> getSubjects() {
        return subjectService.getSubjects();
    }
}
