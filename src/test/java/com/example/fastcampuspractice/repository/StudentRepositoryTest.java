package com.example.fastcampuspractice.repository;

import com.example.fastcampuspractice.constant.Grade;
import com.example.fastcampuspractice.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired private StudentRepository sut;

    @Test
    void jpaTest() {
        // Given
        String name = "uno";
        int age = 48;
        Student expected = new Student("uno", 18, Grade.A);
        ReflectionTestUtils.setField(expected, "id", 1L);

        // When
        Optional<Student> actual = sut.findById(1L);

        // Then
        assertThat(actual)
                .isPresent()
                .get().isEqualTo(expected);
    }

}