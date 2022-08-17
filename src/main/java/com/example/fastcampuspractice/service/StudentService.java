package com.example.fastcampuspractice.service;

import com.example.fastcampuspractice.domain.Student;
import com.example.fastcampuspractice.constant.Grade;
import com.example.fastcampuspractice.dto.StudentDto;
import com.example.fastcampuspractice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentDto> getStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(x -> StudentDto.of(
                        x.getName(),
                        x.getAge(),
                        x.getGrade()
                ))
                .toList();
    }


    public List<StudentDto> getStudents(Grade grade) {
        return studentRepository.findByGrade(grade).stream()
                .map(x -> StudentDto.of(
                        x.getName(),
                        x.getAge(),
                        x.getGrade()
                ))
                .toList();
    }

}
