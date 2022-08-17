package com.example.fastcampuspractice.dto;

import com.example.fastcampuspractice.constant.Grade;

public record StudentDto(
        String name,
        Integer age,
        Grade grade
) {
    public static StudentDto of(String name, Integer age, Grade grade) {
        return new StudentDto(name, age, grade);
    }
}
