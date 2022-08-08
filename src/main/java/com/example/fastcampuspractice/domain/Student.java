package com.example.fastcampuspractice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.event.EventListener;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String name;
    @Setter private Integer age;
    @Setter private Grade grade;

    @CreatedDate private LocalDateTime createdAt;
    @CreatedBy private String createdBy;
    @LastModifiedDate private LocalDateTime modifiedAt;
    @LastModifiedBy private String modifiedBy;

    protected Student() {}

    public Student(String name, Integer age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public enum Grade {
        A, B, C, D, F
    }
}
