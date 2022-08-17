package com.example.fastcampuspractice.domain;

import com.example.fastcampuspractice.constant.Grade;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @Column(nullable = false) private String name;
    @Setter @Column(nullable = false) private Integer age;
    @Setter @Column(nullable = false) @Enumerated(EnumType.STRING) private Grade grade;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student that)) return false;
        return this.getId() != null && this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
