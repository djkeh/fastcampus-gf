package com.example.fastcampuspractice.repository;

import com.example.fastcampuspractice.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
