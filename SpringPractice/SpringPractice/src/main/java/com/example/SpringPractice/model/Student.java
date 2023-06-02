package com.example.SpringPractice.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{

    private Long id;

    private String name;

    private int age;

    private String department;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
        name = "STUDENT_COLUMN_TABLE",
        joinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id")
    )
}