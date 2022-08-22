package com.example.fastcampuspractice.dto;

import java.io.Serializable;

public record SubjectDto(
        StudentDto student,
        String name
) implements Serializable {
    public static SubjectDto of(StudentDto student, String name) {
        return new SubjectDto(student, name);
    }
}
