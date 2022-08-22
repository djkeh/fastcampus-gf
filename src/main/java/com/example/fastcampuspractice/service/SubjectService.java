package com.example.fastcampuspractice.service;

import com.example.fastcampuspractice.dto.StudentDto;
import com.example.fastcampuspractice.dto.SubjectDto;
import com.example.fastcampuspractice.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public List<SubjectDto> getSubjects() {
        return subjectRepository.findAll().stream()
                .map(subject -> SubjectDto.of(
                        StudentDto.of(
                                subject.getStudent().getName(),
                                subject.getStudent().getAge(),
                                subject.getStudent().getGrade()
                        ),
                        subject.getName()
                ))
                .toList();
    }
}
