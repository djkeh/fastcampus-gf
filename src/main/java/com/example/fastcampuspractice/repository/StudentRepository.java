package com.example.fastcampuspractice.repository;

import com.example.fastcampuspractice.domain.Student;
import com.example.fastcampuspractice.constant.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByGrade(Grade grade);
    long countByNameOrAge(String name, int age);
}
