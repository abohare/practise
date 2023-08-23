package com.practise.practise.entity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long student_Rollno;
    private String studentName;
    private String fatherName;
    private String  address;
}
